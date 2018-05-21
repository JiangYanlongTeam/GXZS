package weaver.interfaces.gx.jyl.cwpz;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF;
import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF_RETURN;
import net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUTProxy;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 差旅费报销释放
 */
public class CLFBXSQSFAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //资金凭证编号-值
        String zjpzbh_value = "";
        //资金凭证编号-字段
        String zjpzbh_column = "fzjpzh";
        //系统字段-值
        String xtzd_value = "";
        //系统字段-字段
        String xtzd_column = "xtzd";
        //是否冲销借款-值
        String sfcxjk_value = "";
        //是否冲销借款-字段
        String sfcxjk_column = "sfcjk";
        //实报金额-值
        String sbje_value = "";
        //实报金额-字段
        String sbje_column = "sbje";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(zjpzbh_column)) {
                zjpzbh_value = value;
            }
            if (name.equals(xtzd_column)) {
                xtzd_value = value;
            }
            if(name.equals(sfcxjk_column)) {
            	sfcxjk_value = value;
            }
            if(name.equals(sbje_column)) {
            	sbje_value = value;
            }
        }
        writeLog("公司代码：" + gsdm_value);
        writeLog("资金凭证编号：" + zjpzbh_value);
        writeLog("实报金额：" + sbje_value);
        writeLog("是否冲销借款：" + sfcxjk_value);
        
        //此场景条件：是否冲销借款为“否” || 是否冲销借款为“是”，实报金额大于0
        if(("1".equals(sfcxjk_value)) || ("0".equals(sfcxjk_value) && Double.parseDouble(sbje_value)> 0)){
        	String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            xmlstring = addRootHeadElement(xmlstring, "ROOT");
        	xmlstring = addElement(xmlstring, "BUKRS", gsdm_value);
        	xmlstring = addElement(xmlstring, "ZJPZH", zjpzbh_value);
        	xmlstring = addElement(xmlstring, "ZRELEASE", "Y");
        	xmlstring = addRootFooterElement(xmlstring, "ROOT");
        	
            writeLog("差旅费报销释放传入xml参数：" + xmlstring);

            SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
            DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF = new DT_1029_ALL2ERP_ZJYSSF();
            DT_1029_ALL2ERP_ZJYSSF.setOUTPUT(xmlstring);
            DT_1029_ALL2ERP_ZJYSSF.setSYSTEM(xtzd_value); 
            DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN = null;
            try {
                DT_1029_ALL2ERP_ZJYSSF_RETURN = proxy.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF);
                String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN.getINPUT();
                writeLog("差旅费报销释放返回消息：" + returnmessage);
                Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String type = (String) map.get("TYPE");
                    String code = (String) map.get("CODE");
                    String message = (String) map.get("MESSAGE");
                    if ("S".equalsIgnoreCase(type)) {
                        publicmethod.updateCLFSF(requestid, type, code, message);
                    } else {
                        publicmethod.setFailMessage(request, "failed", "差旅费报销释放失败：TYPE：" + type + " code：" + code + " message：" + message);
                        return SUCCESS;
                    }
                }
            } catch (RemoteException e) {
                publicmethod.setFailMessage(request, "failed", "差旅费报销释放接口异常：" + e);
                return SUCCESS;
            }
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
    public static String addRootHeadElement(String xmlstring, String elementNodeName) {
		return xmlstring + "<" + elementNodeName + ">";
	}
    
    /**
     * 增加ROOT尾
     * 
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootFooterElement(String xmlstring, String elementNodeName) {
		return xmlstring +  "</" + elementNodeName + ">";
	}
    
    /**
     * 增加元素
     * 
     * @param xmlstring
     * @param elementNodeName
     * @param text
     * @return
     */
    public static String addElement(String xmlstring,
                                     String elementNodeName,
                                     String text) {
    	return xmlstring + "<" + elementNodeName + ">" + text + "</" + elementNodeName + ">";
    }
}
