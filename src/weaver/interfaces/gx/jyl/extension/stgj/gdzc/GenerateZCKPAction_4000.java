package weaver.interfaces.gx.jyl.extension.stgj.gdzc;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import net.jsgx.www.E1D.service.DT_1083_OA2ERP_ASSET;
import net.jsgx.www.E1D.service.DT_1083_OA2ERP_ASSET_RETURN;
import net.jsgx.www.E1D.service.SI_1083_OA2ERP_ASSET_OUTProxy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.GDZCModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 固定资产生成卡片信息
 * 
 * @author jiangyanlong
 *
 */
public class GenerateZCKPAction_4000 extends BaseBean implements Action {

	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String workflowid = request.getWorkflowid();
		String tablename = request.getRequestManager().getBillTableName();
		String number = getSysIDByWfID(workflowid);
		String system = getGsdmByWfID(workflowid);
		//String system = getPropValue("sh", "wbs_system");
		//ceshiji 788
		String sql = "select a.sysid,b.* from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"' and b.zt1 is null order by b.id";
		RecordSet rs = new RecordSet();
		RecordSet rs1 = new RecordSet();
		rs.execute(sql);
		int i = 1;
		while(rs.next()) {
			String ID = Util.null2String(rs.getString("ID"));
			String BUKRS = system;
			String ANLKL = Util.null2String(rs.getString("ANLKL"));
			String TXT50 = Util.null2String(rs.getString("TXT50"));
			String ANLHTXT = Util.null2String(rs.getString("ANLHTXT"));
			String INVZU = Util.null2String(rs.getString("INVZU"));
			String KOSTL = Util.null2String(rs.getString("KOSTL"));
			String KOSTLV = Util.null2String(rs.getString("KOSTLV"));
			String PS_PSP_PNR2 = Util.null2String(rs.getString("PS_PSP_PNR2"));
			if("10662".equals(workflowid)) {
				PS_PSP_PNR2 = rs.getString("PS_PSP_PNR1");
			}
			String RAUMN = Util.null2String(rs.getString("RAUMN"));
			String KFZKZ = Util.null2String(rs.getString("KFZKZ"));
			String ORD41 = Util.null2String(rs.getString("ORD41"));
			String ORD43 = Util.null2String(rs.getString("ORD43"));
			String LIFNR = Util.null2String(rs.getString("LIEFE"));
			GDZCModel model = new GDZCModel(ID, BUKRS, ANLKL, TXT50, ANLHTXT, INVZU, KOSTL, KOSTLV, PS_PSP_PNR2, RAUMN, KFZKZ, ORD41, ORD43, LIFNR, "");
			//String data = transferDataToSAP(model);
			String data = "";
			try {
				data = XMLUtil.beanToXml(model, GDZCModel.class);
			} catch (JAXBException e1) {
				e1.printStackTrace();
			}
			writeLog("明细["+ID+"]固定资产生成资产卡片传入xml：" + data);
			SI_1083_OA2ERP_ASSET_OUTProxy proxy = new SI_1083_OA2ERP_ASSET_OUTProxy();
			DT_1083_OA2ERP_ASSET DT_1083_OA2ERP_ASSET = new DT_1083_OA2ERP_ASSET();
			DT_1083_OA2ERP_ASSET.setSYSTEM(number);
			DT_1083_OA2ERP_ASSET.setOUTPUT(data);
			DT_1083_OA2ERP_ASSET_RETURN res = null;
			try {
				res = proxy.SI_1083_OA2ERP_ASSET_OUT(DT_1083_OA2ERP_ASSET);
				String input = res.getINPUT();
				writeLog("明细["+ID+"]固定资产生成资产卡片返回xml：" + input);
				Map<String,String> map = readXMLForSQ(input);
				if(!map.isEmpty() && null != map) {
					String mainid = (String) map.get("ID");
					String anln1 = (String) map.get("ANLN1");
					String result = (String) map.get("RESULT");
					String message = (String) map.get("MESSAGE");
					if("S".equals(result)) {
						String updatesql = "update "+tablename+"_dt1 set xx1 = '"+message+"',zt1 = '"+result+"',ANLN1 = '"+anln1+"' where id = '"+mainid+"'";
						writeLog("更新明细["+ID+"]固定资产生成资产卡片返回信息SQL：" + updatesql);
						rs1.execute(updatesql);
					} else {
						request.getRequestManager().setMessageid("failed");
						request.getRequestManager().setMessagecontent("明细" + i + "调用SAP生成资产卡片失败，返回消息：" + message);
						return SUCCESS;
					}
				} else {
					request.getRequestManager().setMessageid("failed");
					request.getRequestManager().setMessagecontent("解析SAP生成资产卡片返回信息失败，返回消息：" + input);
					return SUCCESS;
				}
			} catch (RemoteException e) {
				e.printStackTrace();
				request.getRequestManager().setMessageid("failed");
				request.getRequestManager().setMessagecontent("明细" + i + "调用SAP生成资产卡片异常，异常消息：" + e.getMessage());
			}
			i++;
		}
		return SUCCESS;
	}
	
	/**
	 * 转换对象为xml格式
	 * 
	 * @param model
	 * @return
	 */
	public static String transferDataToSAP(GDZCModel model) {
		XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
        xstream.alias("ROOT", GDZCModel.class); 
        String xml = xstream.toXML(model);
        return xml;
	}
	
	/**
	 * 读取webservice返回xml格式数据
	 * 
     * @param xml
     * @return
     */
    public static Map<String, String> readXMLForSQ(String xml) {
        Map<String, String> map = new HashMap<String, String>();
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
                if ("ANLN1".equalsIgnoreCase(nodename)) {
                    map.put("ANLN1", nodetext);
                }
                if ("RESULT".equalsIgnoreCase(nodename)) {
                    map.put("RESULT", nodetext);
                }
                if ("MESSAGE".equalsIgnoreCase(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
                if ("ID".equalsIgnoreCase(nodename)) {
                    map.put("ID", nodetext);
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
