package weaver.interfaces.gx.jyl.extension.xny.zjzf;

import net.jsgx.www.E4D.service.DT_1082_OA2ERP_ZJZFSP;
import net.jsgx.www.E4D.service.DT_1082_OA2ERP_ZJZFSP_RETURN;
import net.jsgx.www.E4D.service.SI_1082_OA2ERP_ZJZFSP_OUTProxy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.extension.tzgl.Mode.ZJZFModel;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZJZFAction_2380 extends BaseBean implements Action {

    @Override
    public String execute(RequestInfo request) {

        String gsdm = "";
        String applyno = "";
        String system = "";
        String requestid = request.getRequestid();
        String tableName = request.getRequestManager().getBillTableName();
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equalsIgnoreCase("gsdm")) {
                gsdm = value;
            }
            if (name.equalsIgnoreCase("APPLYNO")) {
                applyno = value;
            }
            if (name.equalsIgnoreCase("system")) {
                system = value;
            }
        }

        ZJZFModel model = new ZJZFModel(gsdm, applyno, "S", requestid);
        try {
            String xmlstring = XMLUtil.beanToXml(model, ZJZFModel.class);
            SI_1082_OA2ERP_ZJZFSP_OUTProxy proxy = new SI_1082_OA2ERP_ZJZFSP_OUTProxy();
            DT_1082_OA2ERP_ZJZFSP DT_1082_OA2ERP_ZJZFSP = new DT_1082_OA2ERP_ZJZFSP();

            writeLog("资金支付单传递xml：" + xmlstring);
            DT_1082_OA2ERP_ZJZFSP.setOUTPUT(xmlstring);
            DT_1082_OA2ERP_ZJZFSP.setSYSTEM(system);
            DT_1082_OA2ERP_ZJZFSP_RETURN result = proxy.SI_1082_OA2ERP_ZJZFSP_OUT(DT_1082_OA2ERP_ZJZFSP);
            String returnmessage = result.getINPUT();
            writeLog("资金支付单返回：" + returnmessage);
            Map<String, String> map = readXMLForCLFBXSQ(returnmessage);
            if (null != map && !map.isEmpty()) {
                String MTYPE = (String) map.get("MTYPE");
                String MESSAGE = (String) map.get("MESSAGE");
                String APPLYNO = (String) map.get("APPLYNO");
                String REQID = (String) map.get("REQID");
                if ("S".equalsIgnoreCase(MTYPE)) {
                    updateCLFBXCJ(requestid, MESSAGE, tableName);
                } else {
                    request.getRequestManager().setMessageid("Failed");
                    request.getRequestManager().setMessagecontent("调用SAP接口失败,返回结构为：[MTYPE:" + MTYPE + ",MESSAGE:" + MESSAGE + ",APPLYNO:" + APPLYNO + ",REQID:" + REQID + "]");
                    return SUCCESS;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            writeLog("资金支付单异常：" + e.getMessage());
            request.getRequestManager().setMessageid("Failed");
            request.getRequestManager().setMessagecontent("调用SAP接口异常：" + e.getMessage());
        }
        return SUCCESS;
    }


    public void updateCLFBXCJ(String requestid,
                              String MESSAGE,
                              String tablename) {
        RecordSet rs = new RecordSet();
        String sql = "update " + tablename + " set message = '" + MESSAGE + "' where requestid = '" + requestid + "'";
        rs.execute(sql);
    }

    public Map<String, String> readXMLForCLFBXSQ(String xml) {
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
                if ("MESSAGE".equals(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
                if ("APPLYNO".equals(nodename)) {
                    map.put("APPLYNO", nodetext);
                }
                if ("REQID".equals(nodename)) {
                    map.put("REQID", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
