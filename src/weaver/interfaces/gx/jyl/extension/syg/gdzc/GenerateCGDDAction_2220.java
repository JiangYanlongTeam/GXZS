package weaver.interfaces.gx.jyl.extension.syg.gdzc;

import net.jsgx.www.E1D.service.DT_1084_OA2ERP_PO;
import net.jsgx.www.E1D.service.DT_1084_OA2ERP_PO_RETURN;
import net.jsgx.www.E1D.service.SI_1084_OA2ERP_PO_OUTProxy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.CGDDListModel;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.CGDDModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GenerateCGDDAction_2220 extends BaseBean implements Action {

	@Override
	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String workflowid = request.getWorkflowid();
		String tablename = request.getRequestManager().getBillTableName();
		String number = getSysIDByWfID(workflowid);
		String system = getGsdmByWfID(workflowid);
//		String number = getPropValue("sh", "wbs_number");
//		if("10662".equals(workflowid)) {
//			number = getPropValue("jtwbs", "wbs_number");
//		} else {
//			number = getPropValue("sh", "wbs_number");
//		}
		//String system = getPropValue("sh", "wbs_system");
		//ceshi 788
		String sql = "select a.sysid,a.EKORG,b.* from "+tablename+" a,"+tablename+"_dt1 b where a.id = b.mainid and a.requestid = '"+requestid+"' and b.zt2 is null order by b.LIEFE";
		RecordSet rs = new RecordSet();
		rs.execute(sql);
		Map<String,List<CGDDModel>> map = new HashMap<String,List<CGDDModel>>();
		String mainid = "";
		while(rs.next()) {
			mainid = rs.getString("mainid");
			String iD = rs.getString("id");
			String bSART = rs.getString("BSART");
			String lIFNR = rs.getString("LIEFE");
			String bUKRS = system;
			String eKORG = rs.getString("EKORG");
			String eKGRP = rs.getString("EKGRP");
			String hTKEY = rs.getString("HTKEY");
			String hTTXT = rs.getString("HTTXT");
			String hTWRB = rs.getString("HTWRB");
			String mAKTX = rs.getString("TXT50");
			String mATKL = rs.getString("CHAR1");
			String mENGE = "1";
			String lMEIN = rs.getString("LMEIN");
			String aNLN1 = rs.getString("ANLN1");
			String pS_POSID = rs.getString("PS_PSP_PNR2");
			if("10662".equals(workflowid)) {
				pS_POSID = rs.getString("PS_PSP_PNR1");
			}
			String sAKTO = rs.getString("SAKTO");
			String kOSTL = rs.getString("KOSTL");
			String eEIND = rs.getString("EEIND");
			if(!"".equals(eEIND) && null != eEIND) {
				eEIND = eEIND.replaceAll("-", "");
			}
			String nETWR = rs.getString("NETWR");
			String mWSKZ = rs.getString("MWSKZ");
			String wERKS = rs.getString("WERKS");

			CGDDModel model = new CGDDModel(iD, bSART, lIFNR, bUKRS, eKORG, eKGRP, hTKEY, hTTXT, hTWRB, mAKTX, mATKL, mENGE, lMEIN, aNLN1, pS_POSID, sAKTO, kOSTL, eEIND, nETWR, mWSKZ, wERKS);
			
			if(map.containsKey(lIFNR)) {
				map.get(lIFNR).add(model);
			} else {
				List<CGDDModel> list = new ArrayList<CGDDModel>();
				list.add(model);
				map.put(lIFNR, list);
			}
		}
		RecordSet rs1 = new RecordSet();
		SI_1084_OA2ERP_PO_OUTProxy proxy = new SI_1084_OA2ERP_PO_OUTProxy();
		if(!map.isEmpty()) {
			CGDDListModel cGDDListModel = new CGDDListModel();
			for(Entry<String,List<CGDDModel>> entry : map.entrySet()) {
				String key = entry.getKey();
				List<CGDDModel> list = entry.getValue();
				cGDDListModel.setList(list);
				String data = "";
				try {
					data = XMLUtil.beanToXml(cGDDListModel, CGDDListModel.class);
				} catch (JAXBException e1) {
					e1.printStackTrace();
				}
				writeLog("流程【"+requestid+"】发送供应商【"+key+"】合并数据到SAP数据：" + data);
				DT_1084_OA2ERP_PO DT_1084_OA2ERP_PO = new DT_1084_OA2ERP_PO();
				DT_1084_OA2ERP_PO.setSYSTEM(number);
				DT_1084_OA2ERP_PO.setOUTPUT(data);
				try {
					DT_1084_OA2ERP_PO_RETURN res = proxy.SI_1084_OA2ERP_PO_OUT(DT_1084_OA2ERP_PO);
					String returnxml = res.getINPUT();
					writeLog("流程【"+requestid+"】发送供应商【"+key+"】合并数据到SAP返回数据：" + returnxml);
					Map<String,String> resumap = readXMLForSQ(returnxml);
					if(!resumap.isEmpty() && null != resumap) {
						String LIFNR = (String) resumap.get("LIFNR");
						String EBELN = (String) resumap.get("EBELN");
						String result = (String) resumap.get("RESULT");
						String message = (String) resumap.get("MESSAGE");
						if("S".equals(result)) {
							String updatesql = "update "+tablename+"_dt1 set xx2 = '"+message+"',zt2 = '"+result+"',EBELN = '"+EBELN+"' where mainid = '"+mainid+"' and LIEFE = '"+LIFNR+"'";
							writeLog("更新明细["+mainid+"]固定资产生成采购订单号返回信息SQL：" + updatesql);
							rs1.execute(updatesql);
						} else {
							request.getRequestManager().setMessageid("failed");
							request.getRequestManager().setMessagecontent("流程【"+requestid+"】发送供应商【"+key+"】合并数据到SAP失败：" + message);
							return SUCCESS;
						}
					} else {
						request.getRequestManager().setMessageid("failed");
						request.getRequestManager().setMessagecontent("解析SAP返回xml失败,返回数据：" + returnxml);
						return SUCCESS;
					}
				} catch (RemoteException e) {
					e.printStackTrace();
					request.getRequestManager().setMessageid("failed");
					request.getRequestManager().setMessagecontent("调用接口异常：" + e.getMessage());
				}
			}
		}
		return SUCCESS;
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
                if ("EBELN".equalsIgnoreCase(nodename)) {
                    map.put("EBELN", nodetext);
                }
                if ("RESULT".equalsIgnoreCase(nodename)) {
                    map.put("RESULT", nodetext);
                }
                if ("MESSAGE".equalsIgnoreCase(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
                if ("LIFNR".equalsIgnoreCase(nodename)) {
                    map.put("LIFNR", nodetext);
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
