package weaver.interfaces.gx.jyl.extension.xny.gdzc;

import net.jsgx.www.E1D.service.DT_1104_ALL2ERP_FPJY;
import net.jsgx.www.E1D.service.DT_1104_ALL2ERP_FPJY_RETURN;
import net.jsgx.www.E1D.service.SI_1104_ALL2ERP_FPJY_OUTProxy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.FPJY_Body;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.FPJY_Head;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 发票校验
 */
public class FPJYAction_2380 extends BaseBean implements Action {

    DecimalFormat df = new DecimalFormat("######0.00");

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new BaseBean().writeLog("发票校验接口，不执行接口操作");
            return SUCCESS;
        }

        // 纸质发票的日期（当前日期）
        String BLDAT_value = "";
        String BLDAT_column = "BLDAT";
        // 过账日期
        String BUDAT_value = "";
        // 过账日期
        String BUDAT_column = "BUDAT";
        // 发票类型：
        //1 发票、2 贷方凭证 （固定值1）
        String INV_TRAN_column = "INV_TRAN";
        String INV_TRAN_value = "";
        // 公司代码
        String BUKRS_value = "";
        // 公司代码
        String BUKRS_column = "gsdm";
        // 发票的基线日期（当前日期）
        String ZFBDT_value = "";
        String ZFBDT_column = "ZFBDT";
        // 制单人#信息描述
        String BKTXT_value = "";
        // 制单人#信息描述
        String BKTXT_column = "BKTXT";

        String SQDH_column = "SQDH";
        String SQDH_value = "";

        String sysid_column = "fpyzdm";
        String sysid_value = "";

        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(BLDAT_column)) {
                BLDAT_value = value;
                if (!"".equals(BLDAT_value)) {
                    BLDAT_value = BLDAT_value.replaceAll("-", "");
                }
            }
            if (name.equals(BUDAT_column)) {
                BUDAT_value = value;
                if (!"".equals(BUDAT_value)) {
                    BUDAT_value = BUDAT_value.replaceAll("-", "");
                }
            }
            if (name.equals(SQDH_column)) {
                SQDH_value = value;
            }
            if (name.equals(INV_TRAN_column)) {
                INV_TRAN_value = value;
            }
            if (name.equals(BUKRS_column)) {
                BUKRS_value = value;
            }
            if (name.equals(ZFBDT_column)) {
                ZFBDT_value = value;
                if (!"".equals(ZFBDT_value)) {
                    ZFBDT_value = ZFBDT_value.replaceAll("-", "");
                }
            }
            if (name.equals(BKTXT_column)) {
                BKTXT_value = value;
                if(!BKTXT_value.equals("")) {
                    try {
                        BKTXT_value = new ResourceComInfo().getLastname(BKTXT_value);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (name.equals(sysid_column)) {
                sysid_value = value;
            }
        }
        writeLog("sysid:" + sysid_value);
        writeLog("申请单号:" + SQDH_value);
        writeLog("发票类型:" + INV_TRAN_value);
        writeLog("公司代码:" + BUDAT_value);
        writeLog("纸质发票的日期:" + BLDAT_value);
        writeLog("过账日期：" + BUDAT_value);
        writeLog("发票的基线日期：" + ZFBDT_value);
        writeLog("制单人#信息描述：" + BKTXT_value);

        String tableName = request.getRequestManager().getBillTableName();

        String sql = "select b.* from " + tableName + " a, " + tableName + "_dt1 b where a.id = b.mainid and a.requestid = '" + requestid + "' ";
        writeLog("获取明细表SQL:" + sql);
        RecordSet recordSet = new RecordSet();
        recordSet.execute(sql);
        while (recordSet.next()) {
            // 采购订单号
            String EBELN_value = Util.null2String(recordSet.getString("EBELN"));
            // 资产编号
            String ANLN1_value = Util.null2String(recordSet.getString("ANLN1"));
            // 采购单行项目 （空）
            String EBELP_value = "";
            // 发票校验行项目数量
            String MENGE_value = Util.null2String(recordSet.getString("MENGE"));
            // 总金额 含税价
            String WRBTR1_value = Util.null2String(recordSet.getString("NETWR"));
            if ("".equals(WRBTR1_value)) {
                WRBTR1_value = "0";
            }
            // 税额
            String WMWST_value = Util.null2String(recordSet.getString("SE"));
            if ("".equals(WMWST_value)) {
                WMWST_value = "0";
            }
            String WRBTR = df.format(Double.parseDouble(WRBTR1_value) - Double.parseDouble(WMWST_value));
            // 税码
            String MWSKZ1_value = Util.null2String(recordSet.getString("MWSKZ"));
            // OA发票单据编号
            String FPJY_ID_value = SQDH_value;
            // OA发票单据行编号  OAID
            String FPJY_NO_value = Util.null2String(recordSet.getString("id"));

            writeLog("采购订单号:"+EBELN_value);
            writeLog("资产编号:"+ANLN1_value);
            writeLog("采购单行项目 （空）:"+EBELP_value);
            writeLog("发票校验行项目数量:"+MENGE_value);
            writeLog("总金额 含税价:"+WRBTR1_value);
            writeLog("税额:"+WMWST_value);
            writeLog("发票校验行项目净价（含税价-税额）:"+WRBTR);
            writeLog("税码:"+MWSKZ1_value);
            writeLog("OA发票单据编号:"+FPJY_ID_value);
            writeLog("OA发票单据行编号  OAID:"+FPJY_NO_value);

            List<FPJY_Body> list = new ArrayList<FPJY_Body>();
            FPJY_Body fpjy_body = new FPJY_Body();
            //TODO  添加元素
            fpjy_body.setBLDAT(BLDAT_value);
            fpjy_body.setBUDAT(BUDAT_value);
            fpjy_body.setINV_TRAN(INV_TRAN_value);
            fpjy_body.setBUKRS(BUKRS_value);
            fpjy_body.setZFBDT(ZFBDT_value);
            fpjy_body.setBKTXT(BKTXT_value);
            fpjy_body.setEBELN(EBELN_value);
            fpjy_body.setANLN1(ANLN1_value);
            fpjy_body.setEBELP(EBELP_value);
            fpjy_body.setWRBTR(WRBTR);
            fpjy_body.setMENGE(MENGE_value);
            fpjy_body.setWRBTR1(WRBTR1_value);
            fpjy_body.setMWSKZ1(MWSKZ1_value);
            fpjy_body.setWMWST(WMWST_value);
            fpjy_body.setFPJY_ID(FPJY_ID_value);
            fpjy_body.setFPJY_NO(FPJY_NO_value);
            list.add(fpjy_body);
            FPJY_Head hEAD = new FPJY_Head();
            hEAD.setHEAD(list);
            String xmlstring = "";
            try {
                xmlstring = XMLUtil.beanToXml(hEAD, FPJY_Head.class);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            writeLog("发票校验传入参数：" + xmlstring);

            SI_1104_ALL2ERP_FPJY_OUTProxy proxy = new SI_1104_ALL2ERP_FPJY_OUTProxy();
            DT_1104_ALL2ERP_FPJY DT_1104_ALL2ERP_FPJY = new DT_1104_ALL2ERP_FPJY();
            DT_1104_ALL2ERP_FPJY.setOUTPUT(xmlstring);
            DT_1104_ALL2ERP_FPJY.setSYSTEM(sysid_value);
            try {
                DT_1104_ALL2ERP_FPJY_RETURN DT_1104_ALL2ERP_FPJY_RETURN = proxy.SI_1104_ALL2ERP_FPJY_OUT(DT_1104_ALL2ERP_FPJY);
                String returnmessage = DT_1104_ALL2ERP_FPJY_RETURN.getINPUT();
                writeLog("发票校验返回：" + returnmessage);
                Map<String, String> map = readXMLForSQ(returnmessage);
                writeLog("解析返回MAP接口：" + map.toString());
                if (null != map && !map.isEmpty()) {
                    String BELNR = (String) map.get("BELNR");
                    String BUZEI = (String) map.get("BUZEI");
                    String GJAHR = (String) map.get("GJAHR");
                    String Result = (String) map.get("Result");
                    String Message = (String) map.get("Message");
                    String FPJY_ID = (String) map.get("FPJY_ID");
                    String FPJY_NO = (String) map.get("FPJY_NO");
                    if ("S".equalsIgnoreCase(Result)) {
                        updateFPYJReturnInfo(BELNR, BUZEI, GJAHR, Result, Message, FPJY_NO, tableName + "_dt1");
                    } else {
                        request.getRequestManager().setMessageid("failed");
                        request.getRequestManager().setMessagecontent("发票校验失败,BELNR:" + BELNR + ",BUZEI:" + BUZEI + ",GJAHR:" + GJAHR + ",Result:" + Result + ",Message:" + Message + "");
                        return SUCCESS;
                    }
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                request.getRequestManager().setMessageid("failed");
                request.getRequestManager().setMessagecontent("发票校验失败,接口异常：" + e);
                return SUCCESS;
            }
        }
        return SUCCESS;
    }

    /**
     * 解析资金支付申请创建返回XML结构
     *
     * @param xml
     * @return
     * @throws DocumentException
     */
    public static Map<String,String> readXMLForSQ(String xml) {


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
            Element el1 = null;
            for (int i = 0; i < node.size(); i++) {
                el = (Element) node.get(i);
                List<?> nodeChildren = el.getChildren();
                for(int j = 0 ; j < nodeChildren.size(); j++) {
                    el1 = (Element) nodeChildren.get(j);
                    String nodename = el1.getName();
                    String nodetext = el1.getValue();
                    if ("BELNR".equalsIgnoreCase(nodename)) {
                        map.put("BELNR", nodetext);
                    }
                    if ("BUZEI".equalsIgnoreCase(nodename)) {
                        map.put("BUZEI", nodetext);
                    }
                    if ("GJAHR".equalsIgnoreCase(nodename)) {
                        map.put("GJAHR", nodetext);
                    }
                    if ("Result".equalsIgnoreCase(nodename)) {
                        map.put("Result", nodetext);
                    }
                    if ("Message".equalsIgnoreCase(nodename)) {
                        map.put("Message", nodetext);
                    }
                    if ("FPJY_ID".equalsIgnoreCase(nodename)) {
                        map.put("FPJY_ID", nodetext);
                    }
                    if ("FPJY_NO".equalsIgnoreCase(nodename)) {
                        map.put("FPJY_NO", nodetext);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 更新发票校验返回信息
     *
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateFPYJReturnInfo(String BELNR, String BUZEI, String GJAHR, String Result, String Message, String FPJY_NO, String tablename) {
        RecordSet rs = new RecordSet();
        String sql = "update " + tablename + " set BELNR = '" + BELNR + "', BUZEI = '" + BUZEI + "', GJAHR = '" + GJAHR + "',Result = '" + Result + "',Message = '" + Message + "' where id = '" + FPJY_NO + "'";
        rs.execute(sql);
    }
}
