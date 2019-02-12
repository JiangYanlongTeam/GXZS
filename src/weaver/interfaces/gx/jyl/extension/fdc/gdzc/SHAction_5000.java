package weaver.interfaces.gx.jyl.extension.fdc.gdzc;

import net.jsgx.www.E1D.service.DT_1086_OA2ERP_MIGO;
import net.jsgx.www.E1D.service.DT_1086_OA2ERP_MIGO_RETURN;
import net.jsgx.www.E1D.service.SI_1086_OA2ERP_MIGO_OUTProxy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SHAction_5000 extends BaseBean implements Action {

	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String tablename = request.getRequestManager().getBillTableName();
		String workflowid = request.getWorkflowid();
		String system = getSysIDByWfID(workflowid);
		//ceshi 788
        String sql = "select a.requestid,b.EBELN,a.dhrq from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"' group by a.requestid,b.EBELN,a.dhrq";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        StringBuffer buffer = new StringBuffer();
        while(rs.next()) {
        	String EBELN = rs.getString("EBELN");
        	String dhrq = rs.getString("dhrq");
        	writeLog("采购订单号："+EBELN);
        	writeLog("订货日期："+dhrq);
        	if(null == EBELN || EBELN.equals("")) {
        		request.getRequestManager().setMessageid("Failed");
        		request.getRequestManager().setMessagecontent("采购订单号不能为空");
        		return SUCCESS;
        	}
        	if(null == dhrq || dhrq.equals("")) {
        		request.getRequestManager().setMessageid("Failed");
        		request.getRequestManager().setMessagecontent("到货日期字段不能为空");
        		return SUCCESS;
        	}
        	dhrq = dhrq.replaceAll("-", "");
        	StringBuffer sb = new StringBuffer();
        	sb.append("<ROOT><ID>1</ID>");
        	sb.append("<EBELN>"+EBELN+"</EBELN>");
        	sb.append("<BUDAT>"+dhrq+"</BUDAT></ROOT>");
        	writeLog("发送SAP收货XML："+sb.toString());
        	Map<String,String> map = sendToSAP(sb.toString(),system);
        	if(null == map || map.isEmpty()) {
        		request.getRequestManager().setMessageid("Failed");
        		request.getRequestManager().setMessagecontent("调用SAP接口失败");
        		return SUCCESS;
        	}
        	String RESULT = (String) map.get("RESULT");
        	String MESSAGE = (String) map.get("MESSAGE");
        	if(!"S".equals(RESULT)) {
        		request.getRequestManager().setMessageid("Failed");
        		request.getRequestManager().setMessagecontent("调用SAP接口失败:"+MESSAGE);
        		return SUCCESS;
        	}
        	buffer.append("采购订单号："+EBELN+"收货成功<br>");
        }
        String sql2 = "update "+tablename+" set shzt = '"+buffer.toString()+"' where requestid = '"+requestid+"'";
        writeLog("更新收货状态SQL："+sql2);
        rs.execute(sql2);
		return SUCCESS;
	}

	public Map<String,String> sendToSAP(String xml,String system){
		Map<String,String> map = new HashMap<String,String>();
		SI_1086_OA2ERP_MIGO_OUTProxy proxy = new SI_1086_OA2ERP_MIGO_OUTProxy();
		DT_1086_OA2ERP_MIGO DT_1086_OA2ERP_MIGO = new DT_1086_OA2ERP_MIGO();
		DT_1086_OA2ERP_MIGO.setOUTPUT(xml);
		BaseBean bean = new BaseBean();
//		String system = bean.getPropValue("sh", "wbs_system");
		DT_1086_OA2ERP_MIGO.setSYSTEM(system);
		try {
			DT_1086_OA2ERP_MIGO_RETURN result = proxy.SI_1086_OA2ERP_MIGO_OUT(DT_1086_OA2ERP_MIGO);
			String output = result.getINPUT();
			bean.writeLog("SAP返回信息："+output);
			map = readXML(output);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	
    /**
     * 解析收货返回的xml结构
     * 
     * @param xml
     * @return
     */
    public Map<String, String> readXML(String xml) {
        Map<String, String> map = new HashMap<String, String>();
        //创建一个新的字符串  
        StringReader reader = new StringReader(xml);
        InputSource source = new InputSource(reader);
        SAXBuilder sax = new SAXBuilder();
        try {
            Document doc = sax.build(source);
            Element root = doc.getRootElement();
            List<?> node = root.getChildren();
            Element el = null;
            for (int i = 0; i < node.size(); i++) {
                el = (Element) node.get(i);
                String nodename = el.getName();
                String nodetext = el.getValue();
                if ("ID".equals(nodename)) {
                    map.put("ID", nodetext);
                }
                if ("EBELN".equals(nodename)) {
                    map.put("EBELN", nodetext);
                }
                if ("RESULT".equals(nodename)) {
                    map.put("RESULT", nodetext);
                }
                if ("MESSAGE".equals(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

	public String getSysIDByWfID(String workflowid) {
		RecordSet recordSet = new RecordSet();
		recordSet.execute("select * from uf_gdzcwbs where lcid = '"+workflowid+"'");
		recordSet.next();
		String sysid = Util.null2String(recordSet.getString("sysid"));
		return sysid;
	}

	public String getGsdmByWfID(String workflowid) {
		RecordSet recordSet = new RecordSet();
		recordSet.execute("select * from uf_gdzcwbs where lcid = '"+workflowid+"'");
		recordSet.next();
		String gsdm = Util.null2String(recordSet.getString("gsdm"));
		return gsdm;
	}
    
}
