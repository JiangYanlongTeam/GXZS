package weaver.interfaces.gx.jyl.fpjy;

import net.jsgx.www.E1D.service.DT_1104_ALL2ERP_FPJY;
import net.jsgx.www.E1D.service.DT_1104_ALL2ERP_FPJY_RETURN;
import net.jsgx.www.E1D.service.SI_1104_ALL2ERP_FPJY_OUTProxy;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        SI_1104_ALL2ERP_FPJY_OUTProxy proxy = new SI_1104_ALL2ERP_FPJY_OUTProxy();
        DT_1104_ALL2ERP_FPJY DT_1104_ALL2ERP_FPJY = new DT_1104_ALL2ERP_FPJY();
        // <?xml version="1.0" encoding="GBK" ?><INPUT><LINE><BLDAT>20181129</BLDAT><BUDAT>20181129</BUDAT><INV_TRAN>1</INV_TRAN><BUKRS>1000</BUKRS><ZFBDT>20181129</ZFBDT><BKTXT>王群雅</BKTXT><EBELN>1200000164</EBELN><EBELP></EBELP><ANLN1>102010000469</ANLN1><WRBTR>4612.07</WRBTR><MENGE>1</MENGE><WRBTR1>5350</WRBTR1><MWSKZ1>JD</MWSKZ1><WMWST>737.93</WMWST><FPJY_ID>ZCCG20181114039</FPJY_ID><FPJY_NO>2021</FPJY_NO></LINE></INPUT>
        DT_1104_ALL2ERP_FPJY.setOUTPUT("");
        DT_1104_ALL2ERP_FPJY.setSYSTEM("4");
        try {
            DT_1104_ALL2ERP_FPJY_RETURN DT_1104_ALL2ERP_FPJY_RETURN = proxy.SI_1104_ALL2ERP_FPJY_OUT(DT_1104_ALL2ERP_FPJY);
            String returnmessage = DT_1104_ALL2ERP_FPJY_RETURN.getINPUT();
            System.out.println("returnmessage:"+returnmessage);
            Map<String, String> map = readXMLForSQ(returnmessage);
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 解析资金支付申请创建返回XML结构
     *
     * @param xml
     * @return
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
}
