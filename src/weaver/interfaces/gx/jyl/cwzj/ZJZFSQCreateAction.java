package weaver.interfaces.gx.jyl.cwzj;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 资金支付申请创建
 */
public class ZJZFSQCreateAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new weaver.general.BaseBean().writeLog("资金支付申请单退回操作，不执行接口.");
            return SUCCESS;
        }
        //单据类型-值
        String djlx_value = "";
        //单据类型-字段
        String djlx_column = "djlx";
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //财年-值
        String cn_value = "";
        //财年-字段
        String cn_column = "cn";
        //会计期间-值
        String kjqj_value = "";
        //会计期间-字段
        String kjqj_column = "kjqj";
        //成本中心-值
        String cbzx_value = "";
        //成本中心-字段
        String cbzx_column = "cbzx";
        //资金占用凭证编号-值
        String zjzypzbh_value = "";
        //资金占用凭证编号-字段
        String zjzypzbh_column = "";
        //原始申请单号-值
        String yssqh_value = "";
        //原始申请单号-字段
        String yssqh_column = "sqbh";
        //付款类型-值
        String fklx_value = "";
        //付款类型-字段
        String fklx_column = "fklx";
        //供应商编码-值
        String gysbm_value = "";
        //供应商编码-字段
        String gysbm_column = "skrbm";
        //合同编号-值
        String htbh_value = "";
        //合同编号-字段
        String htbh_column = "";
        //采购凭证号-值
        String cgpzh_value = "";
        //采购凭证号-字段
        String cgpzh_column = "";
        //项目定义-值
        String xmdy_value = "";
        //项目定义-字段
        String xmdy_column = "";
        //备选总帐科目-值
        String bxzzkm_value = "";
        //备选总帐科目-字段
        String bxzzkm_column = "";
        //申请日期-值
        String sqrq_value = "";
        //申请日期-字段
        String sqrq_column = "sqrq";
        //经办人-值
        String jbr_value = "";
        //经办人-字段
        String jbr_column = "jkr";
        //申请金额-值
        String sqje_value = "";
        //申请金额-字段
        String sqje_column = "jkje";
        //货币码-值
        String hbm_value = "";
        //货币码-字段
        String hbm_column = "hbm";
        //汇率-值
        String hl_value = "";
        //汇率-字段
        String hl_column = "";
        //按本位币计的金额-值
        String abwbjje_value = "";
        //按本位币计的金额-字段
        String abwbjje_column = "";
        //对公对私-值
        String dgds_value = "";
        //对公对私-字段
        String dgds_column = "";
        //付款方开户行CNAPS号-值
        String fkfkh_value = "";
        //付款方开户行CNAPS号-字段
        String fkfkh_column = "";
        //付款方银行账号-值
        String fkfyhzh_value = "";
        //付款方银行账号-字段
        String fkfyhzh_column = "";
        //付款日期-值
        String fkrq_value = "";
        //付款日期-字段
        String fkrq_column = "qwfkrq";
        //加急标识-值
        String jjbs_value = "";
        //加急标识-字段
        String jjbs_column = "";
        //结算方式-值
        String jsfs_value = "";
        //结算方式-字段
        String jsfs_column = "";
        //标题-值
        String bt_value = "";
        //标题-字段
        String bt_column = "";
        //收款方户名-值
        String skfhm_value = "";
        //收款方户名-字段
        String skfhm_column = "skr";
        //收款方开户行CNAPS号-值
        String skfkhh_value = "";
        //收款方开户行CNAPS号-字段
        String skfkhh_column = "khh";
        //收款方账号-值
        String skfzh_value = "";
        //收款方账号-字段
        String skfzh_column = "yhzh";
        //预算码-值
        String ysm_value = "";
        //预算码-字段
        String ysm_column = "ysm";
        //摘要-值
        String zy_value = "";
        //摘要-字段
        String zy_column = "zy";
        //应付转其它类型-值
        String yfzqtlx_value = "";
        //应付转其它类型-字段
        String yfzqtlx_column = "";
        //应付转其它金额-值
        String yfzqtje_value = "";
        //应付转其它金额-字段
        String yfzqtje_column = "";
        //系统字段-值
        String xtzd_value = "";
        //系统字段-字段
        String xtzd_column = "xtzd";
        //支付方式-值
        String zffs_value = "";
        //支付方式-字段
        String zffs_column = "zffs";
        

        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(djlx_column)) {
                djlx_value = value;
            }
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
            if (name.equals(zjzypzbh_column)) {
                zjzypzbh_value = value;
            }
            if (name.equals(yssqh_column)) {
                yssqh_value = value;
            }
            if (name.equals(fklx_column)) {
                fklx_value = value;
            }
            if (name.equals(gysbm_column)) {
                gysbm_value = value;
            }
            if (name.equals(fklx_column)) {
                fklx_value = value;
            }
            if (name.equals(gysbm_column)) {
                gysbm_value = value;
            }
            if (name.equals(htbh_column)) {
                htbh_value = value;
            }
            if (name.equals(cgpzh_column)) {
                cgpzh_value = value;
            }
            if (name.equals(xmdy_column)) {
                xmdy_value = value;
            }
            if (name.equals(bxzzkm_column)) {
                bxzzkm_value = value;
            }
            if (name.equals(sqrq_column)) {
                sqrq_value = value;
                if(!"".equals(sqrq_value)){
                    sqrq_value = sqrq_value.replaceAll("-", "");
                }
            }
            if (name.equals(jbr_column)) {
                try {
                    jbr_value = new ResourceComInfo().getLastname(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (name.equals(sqje_column)) {
                sqje_value = value;
            }
            if (name.equals(hbm_column)) {
                hbm_value = value;
            }
            if (name.equals(hl_column)) {
                hl_value = value;
            }
            if (name.equals(abwbjje_column)) {
                abwbjje_value = value;
            }
            if (name.equals(dgds_column)) {
                dgds_value = value;
            }
            if (name.equals(fkfkh_column)) {
                fkfkh_value = value;
            }
            if (name.equals(fkfyhzh_column)) {
                fkfyhzh_value = value;
            }
            if (name.equals(fkrq_column)) {
                fkrq_value = value;
                if(!"".equals(fkrq_value)){
                    fkrq_value = fkrq_value.replaceAll("-", "");
                }
            }
            if (name.equals(jjbs_column)) {
                jjbs_value = value;
            }
            if (name.equals(jsfs_column)) {
                jsfs_value = value;
            }
            if (name.equals(bt_column)) {
                bt_value = value;
            }
            if (name.equals(skfhm_column)) {
                 try {
					skfhm_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
            if (name.equals(skfkhh_column)) {
                skfkhh_value = value;
            }
            if (name.equals(skfzh_column)) {
                skfzh_value = value;
            }
            if (name.equals(ysm_column)) {
                ysm_value = value;
            }
            if (name.equals(zy_column)) {
                zy_value = value;
            }
            if (name.equals(yfzqtlx_column)) {
                yfzqtlx_value = value;
            }
            if (name.equals(yfzqtje_column)) {
                yfzqtje_value = value;
            }
            if (name.equals(xtzd_column)) {
                xtzd_value = value;
            }
            if (name.equals(zffs_column)) {
            	if("0".equals(value)) {
            		zffs_value = "E";
            	}
            	if("1".equals(value)) {
            		zffs_value = "T";
            	}
            }
        }
        writeLog("单据类型：" + djlx_value);
        writeLog("公司代码：" + gsdm_value);
        writeLog("财年：" + cn_value);
        writeLog("会计期间：" + kjqj_value);
        writeLog("成本中心：" + cbzx_value);
        writeLog("资金占用凭证编号：" + zjzypzbh_value);
        writeLog("原始申请单号：" + yssqh_value);
        writeLog("付款类型：" + fklx_value);
        writeLog("供应商编码：" + gysbm_value);
        writeLog("合同编号：" + htbh_value);
        writeLog("采购凭证号：" + cgpzh_value);
        writeLog("项目定义：" + xmdy_value);
        writeLog("备选总帐科目：" + bxzzkm_value);
        writeLog("申请日期：" + sqrq_value);
        writeLog("经办人：" + jbr_value);
        writeLog("申请金额：" + sqje_value);
        writeLog("货币码：" + hbm_value);
        writeLog("汇率：" + hl_value);
        writeLog("按本位币计的金额：" + abwbjje_value);
        writeLog("对公对私：" + dgds_value);
        writeLog("付款方开户行CNAPS号：" + fkfkh_value);
        writeLog("付款方银行账号：" + fkfyhzh_value);
        writeLog("付款日期：" + fkrq_value);
        writeLog("加急标识：" + jjbs_value);
        writeLog("结算方式：" + jsfs_value);
        writeLog("标题：" + bt_value);
        writeLog("收款方户名：" + skfhm_value);
        writeLog("收款方开户行CNAPS号：" + skfkhh_value);
        writeLog("收款方账号：" + skfzh_value);
        writeLog("预算码：" + ysm_value);
        writeLog("摘要：" + zy_value);
        writeLog("应付转其它类型：" + yfzqtlx_value);
        writeLog("应付转其它金额：" + yfzqtje_value);
        writeLog("支付方式：" + zffs_value);
        
        //创建根节点ROOT
        String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        xmlstring = addRootHeadElement(xmlstring, "ROOT");
    	xmlstring = addRootHeadElement(xmlstring, "HEAD");
    	xmlstring = addElement(xmlstring, "ZDJLX", djlx_value);
    	xmlstring = addElement(xmlstring, "BUKRS", gsdm_value);
    	xmlstring = addElement(xmlstring, "GJAHR", cn_value);
    	xmlstring = addElement(xmlstring, "MONAT", kjqj_value);
    	xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
    	xmlstring = addElement(xmlstring, "ZJPZH_ZY", zjzypzbh_value);
    	xmlstring = addElement(xmlstring, "APPLYNO_EX", yssqh_value);
    	xmlstring = addElement(xmlstring, "ZFKLX", fklx_value);
    	xmlstring = addElement(xmlstring, "LIFNR", gysbm_value);
    	xmlstring = addElement(xmlstring, "HTNO", htbh_value);
    	xmlstring = addElement(xmlstring, "EBELN", cgpzh_value);
    	xmlstring = addElement(xmlstring, "PSPID", xmdy_value);
    	xmlstring = addElement(xmlstring, "ABWHK", bxzzkm_value);
    	xmlstring = addElement(xmlstring, "BRPDT", sqrq_value);
    	xmlstring = addElement(xmlstring, "ZJBR", jbr_value);
    	xmlstring = addElement(xmlstring, "SQJE_HSB", sqje_value);
    	xmlstring = addElement(xmlstring, "WAERS", hbm_value);
    	xmlstring = addElement(xmlstring, "KURSF", hl_value);
    	xmlstring = addElement(xmlstring, "SQJE_BWB", abwbjje_value);
    	xmlstring = addElement(xmlstring, "PERSONALFLAG", dgds_value);
    	xmlstring = addElement(xmlstring, "PAYER_CNAPS", fkfkh_value);
    	xmlstring = addElement(xmlstring, "PAYBANK_NO", fkfyhzh_value);
    	xmlstring = addElement(xmlstring, "PAY_DATE", fkrq_value);
    	xmlstring = addElement(xmlstring, "URGENT_FLAG", jjbs_value);
    	xmlstring = addElement(xmlstring, "TR_TYPE", jsfs_value);
    	xmlstring = addElement(xmlstring, "ANRED", bt_value);
    	xmlstring = addElement(xmlstring, "RECE_ACC_NAME", skfhm_value);
    	xmlstring = addElement(xmlstring, "RECE_CNAPS", skfkhh_value);
    	xmlstring = addElement(xmlstring, "RECE_ACC_NO", skfzh_value);
    	xmlstring = addElement(xmlstring, "BUDG_CODE", ysm_value);
    	xmlstring = addElement(xmlstring, "ABSTRACT", zy_value);
    	xmlstring = addElement(xmlstring, "ZYFJZLX", yfzqtlx_value);
    	xmlstring = addElement(xmlstring, "ZYFJZJE", yfzqtje_value);
    	xmlstring = addElement(xmlstring, "TR_TYPE", zffs_value);
    	
    	xmlstring = addRootFooterElement(xmlstring, "HEAD");
    	xmlstring = addRootFooterElement(xmlstring, "ROOT");
    	
    	writeLog("资金支付申请单创建传入xml参数：" + xmlstring);

        SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
        DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
        DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
        DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
        DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
        try {
            DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
            String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
            writeLog("资金支付申请单创建返回消息：" + returnmessage);
            Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
            if (null != map && !map.isEmpty()) {
                String type = (String) map.get("TYPE");
                String no = (String) map.get("APPLYNO");
                String code = (String) map.get("CODE");
                String message = (String) map.get("MESSAGE");
                if ("S".equalsIgnoreCase(type)) {
                    publicmethod.updateZJZFSQ(requestid, type, code, message,no);
                } else {
                    publicmethod.setFailMessage(request, "failed", "调用资金支付申请单创建失败：TYPE：" + type + " code：" + code + " applyno：" + no + " message：" + message);
                    return SUCCESS;
                }
            }
        } catch (RemoteException e) {
            publicmethod.setFailMessage(request, "failed", "调用资金支付申请单创建接口异常：" + e);
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
