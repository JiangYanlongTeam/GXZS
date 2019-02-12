package weaver.interfaces.gx.jyl.extension.nyxs.fyjk;

import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY;
import net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY_RETURN;
import net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.JSTZGL_FYJKZYModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.rmi.RemoteException;
import java.util.Map;

public class FYJKZYAction_2040 extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        String tableName = request.getRequestManager().getBillTableName();
        if (!"submit".equals(src)) {
            writeLog("投资管理公司-费用借款-预算占用退回操作，不执行接口.");
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
        String sqje_column = "jkje";
        //预算码-值
        String ysm_value = "";
        //预算码-字段
        String ysm_column = "ysm";
        //系统字段-值
        String xtzd_value = "";
        //系统字段-字段
        String xtzd_column = "xtzd";
        //借款用途-值
        String jkyt_value = "";
        //借款用途-字段
        String jkyt_column = "zy";
        
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
            if (name.equals(xtzd_column)) {
                xtzd_value = value;
            }
            if (name.equals(jkyt_column)) {
                jkyt_value = value;
            }
        }
        writeLog("公司代码：" + gsdm_value);
        writeLog("财年：" + cn_value);
        writeLog("会计期间：" + kjqj_value);
        writeLog("成本中心：" + cbzx_value);
        writeLog("原始申请单号：" + yssqh_value);
        writeLog("预算码：" + ysm_value);
        writeLog("申请金额：" + sqje_value);
        writeLog("借款用途：" + jkyt_value);
        writeLog("系统字段：" + xtzd_value);
        
        String xmlstring = "";
        JSTZGL_FYJKZYModel model = new JSTZGL_FYJKZYModel(gsdm_value, cn_value, kjqj_value, cbzx_value, yssqh_value, sqje_value, ysm_value, jkyt_value);
		try {
			xmlstring = XMLUtil.beanToXml(model, JSTZGL_FYJKZYModel.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
        writeLog("投资管理公司-费用借款-预算占用传入xml参数：" + xmlstring);
        
        SI_1030_ALL2ERP_ZJYSZY_OUTProxy proxy = new SI_1030_ALL2ERP_ZJYSZY_OUTProxy();
        DT_1030_ALL2ERP_ZJYSZY DT_1030_ALL2ERP_ZJYSZY = new DT_1030_ALL2ERP_ZJYSZY();
        DT_1030_ALL2ERP_ZJYSZY.setOUTPUT(xmlstring);
        DT_1030_ALL2ERP_ZJYSZY.setSYSTEM(xtzd_value);
        DT_1030_ALL2ERP_ZJYSZY_RETURN DT_1030_ALL2ERP_ZJYSZY_RETURN = null;
        try {
            DT_1030_ALL2ERP_ZJYSZY_RETURN = proxy.SI_1030_ALL2ERP_ZJYSZY_OUT(DT_1030_ALL2ERP_ZJYSZY);
            String returnmessage = DT_1030_ALL2ERP_ZJYSZY_RETURN.getINPUT();
            writeLog("投资管理公司-费用借款-预算占用返回消息：" + returnmessage);
            Map<String, String> map = publicmethod.readXMLForZY(returnmessage);
            if (null != map && !map.isEmpty()) {
                String type = (String) map.get("TYPE");
                String no = (String) map.get("ZJPZH");
                String code = (String) map.get("CODE");
                String message = (String) map.get("MESSAGE");
                if (!"E".equalsIgnoreCase(type)) {
                    updateJTZJYSZY(tableName,requestid, type, code, message,no,"");
                } else {
                    publicmethod.setFailMessage(request, "failed", "投资管理公司-费用借款-预算占用失败：TYPE：" + type + " code：" + code + " zjpzh：" + no + " message：" + message);
                    return SUCCESS;
                }
            }
        } catch (RemoteException e) {
            publicmethod.setFailMessage(request, "failed", "投资管理公司-费用借款-预算占用接口异常：" + e);
            return SUCCESS;
        }
        return SUCCESS;
    }

    /**
     * 更新集团财务-费用借款-预算占用信息
     *
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTZJYSZY(String tableName, String requestid,
                               String type,
                               String code,
                               String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String sql = "update "+tableName+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
}
