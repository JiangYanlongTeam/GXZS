package weaver.interfaces.gx.jyl.cwzj;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY;
import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY_RETURN;
import net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUTProxy;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 资金划拨占用
 */
public class ZJHBZYAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new weaver.general.BaseBean().writeLog("资金划拨占用退回操作，不执行接口.");
            return SUCCESS;
        }
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //成本中心-值
        String cbzx_value = "";
        //成本中心-字段
        String cbzx_column = "cbzx";
        //财年-值
        String cn_value = "";
        //财年-字段
        String cn_column = "cn";
        //会计期间-值
        String kjqj_value = "";
        //会计期间-字段
        String kjqj_column = "kjqj";
        //原始申请单号-值
        String yssqh_value = "";
        //原始申请单号-字段
        String yssqh_column = "sqbh";
        //申请金额-值
        String sqje_value = "";
        //申请金额-字段
        String sqje_column = "hbje";
        //预算码-值
        String ysm_value = "";
        //预算码-字段
        String ysm_column = "zjyskm";
        //摘要-值
        String zy_value = "";
        //摘要-字段
        String zy_column = "zy";
        //系统字段-值
        String xtzd_value = "";
        //系统字段-字段
        String xtzd_column = "xtzd";
        //系统字段-值
        String yslx_value = "";
        //系统字段-字段
        String yslx_column = "yslx";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(cn_column)) {
                cn_value = value;
            }
            if (name.equals(kjqj_column)) {
                kjqj_value = value;
            }
            if (name.equals(cbzx_column)) {
                cbzx_value = value;
            }
            if (name.equals(yssqh_column)) {
                yssqh_value = value;
            }
            if (name.equals(sqje_column)) {
                sqje_value = value;
            }
            if (name.equals(ysm_column)) {
                ysm_value = value;
            }
            if (name.equals(zy_column)) {
                zy_value = value;
            }
            if (name.equals(xtzd_column)) {
                xtzd_value = value;
            }
            if (name.equals(yslx_column)) {
                yslx_value = value;
            }
        }
        writeLog("公司代码：" + gsdm_value);
        writeLog("财年：" + cn_value);
        writeLog("会计期间：" + kjqj_value);
        writeLog("成本中心：" + cbzx_value);
        writeLog("原始申请单号：" + yssqh_value);
        writeLog("预算码：" + ysm_value);
        writeLog("摘要：" + zy_value);
        writeLog("申请金额：" + sqje_value);
        writeLog("预算类型："+yslx_value);
        
        String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        xmlstring = addRootHeadElement(xmlstring, "ROOT");
    	xmlstring = addElement(xmlstring, "BUKRS", gsdm_value);
    	xmlstring = addElement(xmlstring, "GJAHR", cn_value);
    	xmlstring = addElement(xmlstring, "MONAT", kjqj_value);
    	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
    	xmlstring = addElement(xmlstring, "APPLYNO_EX", yssqh_value);
    	xmlstring = addElement(xmlstring, "DMBTR", sqje_value);
    	xmlstring = addElement(xmlstring, "BUDG_CODE", ysm_value);
    	xmlstring = addElement(xmlstring, "ABSTRACT", zy_value);
    	xmlstring = addElement(xmlstring, "YS_TYPE", yslx_value);
    	xmlstring = addRootFooterElement(xmlstring, "ROOT");
    	
        writeLog("资金划拨占用传入xml参数：" + xmlstring);
        
        SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
        DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
        DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
        DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
        DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
        try {
            DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
            String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
            writeLog("资金划拨占用返回消息：" + returnmessage);
            Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
            if (null != map && !map.isEmpty()) {
                String type = (String) map.get("TYPE");
                String no = (String) map.get("ZJPZH");
                String code = (String) map.get("CODE");
                String message = (String) map.get("MESSAGE");
                if ("S".equalsIgnoreCase(type) || "W".equalsIgnoreCase(type)) {
                    publicmethod.updateZJHBZY(requestid, type, code, message,no);
                } else {
                    publicmethod.setFailMessage(request, "failed", "调用资金划拨占用失败：TYPE：" + type + " code：" + code + " zjpzh：" + no + " message：" + message);
                    return SUCCESS;
                }
            }
        } catch (RemoteException e) {
            publicmethod.setFailMessage(request, "failed", "调用资金划拨占用接口异常：" + e);
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
