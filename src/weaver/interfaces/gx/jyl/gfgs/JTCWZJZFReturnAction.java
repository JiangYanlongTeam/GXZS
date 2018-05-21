package weaver.interfaces.gx.jyl.gfgs;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import net.jsgx.www.E4D.service.DT_1082_OA2ERP_ZJZFSP;
import net.jsgx.www.E4D.service.DT_1082_OA2ERP_ZJZFSP_RETURN;
import net.jsgx.www.E4D.service.SI_1082_OA2ERP_ZJZFSP_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.gfgs.model.JTCWZJZFReturnModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

public class JTCWZJZFReturnAction extends BaseBean implements Action{

	@Override
	public String execute(RequestInfo request) {
		String APPLYNO_COLUMN = "APPLYNO";
		String APPLYNO_VALUE = "";
		String SYSTEM_COLUMN = "system";//系统字段
		String SYSTEM_VALUE = "";
		String BUTXT_COLUMN = "BUTXT";
		String BUTXT_VALUE = "";
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		if (!"submit".equals(src)) {
			Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
			for (int i = 0; i < properties.length; i++) {
				String name = properties[i].getName();// 主字段名称
				String value = Util.null2String(properties[i].getValue());// 主字段对应的值
				if (name.equals(APPLYNO_COLUMN)) {
					APPLYNO_VALUE = value;
				}
				if (name.equals(SYSTEM_COLUMN)) {
					SYSTEM_VALUE = value;
				}
				if (name.equals(BUTXT_COLUMN)) {
					BUTXT_VALUE = value;
				}
			}
			SI_1082_OA2ERP_ZJZFSP_OUTProxy proxy = new SI_1082_OA2ERP_ZJZFSP_OUTProxy();
			DT_1082_OA2ERP_ZJZFSP DT_1082_OA2ERP_ZJZFSP = new DT_1082_OA2ERP_ZJZFSP();
			
			String xmlstring = "";
			JTCWZJZFReturnModel model = new JTCWZJZFReturnModel(BUTXT_VALUE, APPLYNO_VALUE, "R", requestid);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTCWZJZFReturnModel.class);
				System.out.println(xmlstring);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			
//			String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
//			xmlstring = addRootHeadElement(xmlstring, "ROOT");
//			xmlstring = addElement(xmlstring, "BUTXT", BUTXT_VALUE);
//			xmlstring = addElement(xmlstring, "APPLYNO", APPLYNO_VALUE);
//			xmlstring = addElement(xmlstring, "STATUS", "R");
//			xmlstring = addElement(xmlstring, "REQID", requestid);
//			xmlstring = addRootFooterElement(xmlstring, "ROOT");
			writeLog("传入SAP xml：" + xmlstring);
			DT_1082_OA2ERP_ZJZFSP.setOUTPUT(xmlstring);
			DT_1082_OA2ERP_ZJZFSP.setSYSTEM("1");
			DT_1082_OA2ERP_ZJZFSP_RETURN res = null;
			try {
				res = proxy.SI_1082_OA2ERP_ZJZFSP_OUT(DT_1082_OA2ERP_ZJZFSP);
				String xml = res.getINPUT();
				writeLog("退回返回xml：" + xml);
				Map<String,String> map = readXMLForSQ(xml);
				if(!map.isEmpty()) {
					String message = (String) map.get("MESSAGE");
					String type = (String) map.get("MTYPE");
					if(type.equals("S")) {
						String sql = "update formtable_main_767 set message = '"+message+"', mtype='"+type+"' where requestid = '"+requestid+"'";
						RecordSet rs = new RecordSet();
						rs.execute(sql);
					}
				}else {
					request.getRequestManager().setMessageid("failed");
					request.getRequestManager().setMessagecontent("调用SAP接口失败。");
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			return SUCCESS;
		}
		if ("submit".equals(src)) {
			Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
			for (int i = 0; i < properties.length; i++) {
				String name = properties[i].getName();// 主字段名称
				String value = Util.null2String(properties[i].getValue());// 主字段对应的值
				if (name.equals(APPLYNO_COLUMN)) {
					APPLYNO_VALUE = value;
				}
				if (name.equals(SYSTEM_COLUMN)) {
					SYSTEM_VALUE = value;
				}
				if (name.equals(BUTXT_COLUMN)) {
					BUTXT_VALUE = value;
				}
			}
			SI_1082_OA2ERP_ZJZFSP_OUTProxy proxy = new SI_1082_OA2ERP_ZJZFSP_OUTProxy();
			DT_1082_OA2ERP_ZJZFSP DT_1082_OA2ERP_ZJZFSP = new DT_1082_OA2ERP_ZJZFSP();
			
			String xmlstring = "";
			JTCWZJZFReturnModel model = new JTCWZJZFReturnModel(BUTXT_VALUE, APPLYNO_VALUE, "S", requestid);
			try {
				xmlstring = XMLUtil.beanToXml(model, JTCWZJZFReturnModel.class);
				System.out.println(xmlstring);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			
//			String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
//			xmlstring = addRootHeadElement(xmlstring, "ROOT");
//			xmlstring = addElement(xmlstring, "BUTXT", BUTXT_VALUE);
//			xmlstring = addElement(xmlstring, "APPLYNO", APPLYNO_VALUE);
//			xmlstring = addElement(xmlstring, "STATUS", "S");
//			xmlstring = addElement(xmlstring, "REQID", requestid);
//			xmlstring = addRootFooterElement(xmlstring, "ROOT");
			writeLog("传入SAP xml：" + xmlstring);
			DT_1082_OA2ERP_ZJZFSP.setOUTPUT(xmlstring);
			DT_1082_OA2ERP_ZJZFSP.setSYSTEM("1");
			DT_1082_OA2ERP_ZJZFSP_RETURN res = null;
			try {
				res = proxy.SI_1082_OA2ERP_ZJZFSP_OUT(DT_1082_OA2ERP_ZJZFSP);
				String xml = res.getINPUT();
				writeLog("提交返回xml：" + xml);
				Map<String,String> map = readXMLForSQ(xml);
				if(!map.isEmpty()) {
					String message = (String) map.get("MESSAGE");
					String type = (String) map.get("MTYPE");
					if(type.equals("S")) {
						String sql = "update formtable_main_767 set message = '"+message+"', mtype='"+type+"' where requestid = '"+requestid+"'";
						RecordSet rs = new RecordSet();
						rs.execute(sql);
					}
				} else {
					request.getRequestManager().setMessageid("failed");
					request.getRequestManager().setMessagecontent("调用SAP接口失败。");
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			return SUCCESS;
		}
		return SUCCESS;
	}
	
	
	/**
	 * 增加ROOT头
	 * 
	 * @param xmlstring
	 * @param elementNodeName
	 * @return
	 */
	public static String addRootHeadElement(String xmlstring,
			String elementNodeName) {
		return xmlstring + "<" + elementNodeName + ">";
	}

	/**
	 * 增加ROOT尾
	 * 
	 * @param xmlstring
	 * @param elementNodeName
	 * @return
	 */
	public static String addRootFooterElement(String xmlstring,
			String elementNodeName) {
		return xmlstring + "</" + elementNodeName + ">";
	}

	/**
	 * 增加元素
	 * 
	 * @param xmlstring
	 * @param elementNodeName
	 * @param text
	 * @return
	 */
	public static String addElement(String xmlstring, String elementNodeName,
			String text) {
		return xmlstring + "<" + elementNodeName + ">" + text + "</"
				+ elementNodeName + ">";
	}

    /**
     * 解析资金支付申请创建返回XML结构
     * 
     * @param xml
     * @return
     */
    public Map<String, String> readXMLForSQ(String xml) {
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
                if ("MTYPE".equals(nodename)) {
                    map.put("MTYPE", nodetext);
                }
                if ("APPLYNO".equals(nodename)) {
                    map.put("APPLYNO", nodetext);
                }
                if ("REQID".equals(nodename)) {
                    map.put("REQID", nodetext);
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
}
