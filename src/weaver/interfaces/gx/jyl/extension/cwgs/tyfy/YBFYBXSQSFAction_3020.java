package weaver.interfaces.gx.jyl.extension.cwgs.tyfy;

import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF;
import net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF_RETURN;
import net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JTFYBX_YBFYBXSQSFModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.Map;

public class YBFYBXSQSFAction_3020 extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String tablename = request.getRequestManager().getBillTableName();
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
        String xtzd_column = "sysid";
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
            if (name.equals(sbje_column)) {
                sbje_value = value;
            }
        }
        writeLog("系统字段：" + xtzd_value);
        writeLog("公司代码：" + gsdm_value);
        writeLog("资金凭证编号：" + zjpzbh_value);
        writeLog("实报金额：" + sbje_value);
        
        String xmlstring = "";
        JTFYBX_YBFYBXSQSFModel model = new JTFYBX_YBFYBXSQSFModel(gsdm_value, zjpzbh_value, "Y", sbje_value);
		try {
			xmlstring = XMLUtil.beanToXml(model, JTFYBX_YBFYBXSQSFModel.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
    	
        writeLog("一般费用报销释放传入xml参数：" + xmlstring);

        SI_1029_ALL2ERP_ZJYSSF_OUTProxy proxy = new SI_1029_ALL2ERP_ZJYSSF_OUTProxy();
        DT_1029_ALL2ERP_ZJYSSF DT_1029_ALL2ERP_ZJYSSF = new DT_1029_ALL2ERP_ZJYSSF();
        DT_1029_ALL2ERP_ZJYSSF.setOUTPUT(xmlstring);
        DT_1029_ALL2ERP_ZJYSSF.setSYSTEM(xtzd_value); 
        DT_1029_ALL2ERP_ZJYSSF_RETURN DT_1029_ALL2ERP_ZJYSSF_RETURN = null;
        try {
            DT_1029_ALL2ERP_ZJYSSF_RETURN = proxy.SI_1029_ALL2ERP_ZJYSSF_OUT(DT_1029_ALL2ERP_ZJYSSF);
            String returnmessage = DT_1029_ALL2ERP_ZJYSSF_RETURN.getINPUT();
            writeLog("一般费用报销释放返回消息：" + returnmessage);
            Map<String, String> map = publicmethod.readXMLForSF(returnmessage);
            if (null != map && !map.isEmpty()) {
                String type = (String) map.get("TYPE");
                String code = (String) map.get("CODE");
                String message = (String) map.get("MESSAGE");
                if (!"E".equalsIgnoreCase(type)) {
                    updateJTYBFYBXSF(tablename,requestid, type, code, message,"JTFYBX_YBFYBX");
                } else {
                    publicmethod.setFailMessage(request, "failed", "一般费用报销释放失败：TYPE：" + type + " code：" + code + " message：" + message);
                    return SUCCESS;
                }
            }
        } catch (RemoteException e) {
            publicmethod.setFailMessage(request, "failed", "一般费用报销释放接口异常：" + e);
            return SUCCESS;
        }
        return SUCCESS;
    }

    public void updateJTYBFYBXSF(String tablename, String requestid,
                                 String type,
                                 String code,
                                 String message,String bs) {
        RecordSet rs = new RecordSet();
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
}
