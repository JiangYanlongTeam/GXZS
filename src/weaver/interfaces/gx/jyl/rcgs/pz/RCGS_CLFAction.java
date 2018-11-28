package weaver.interfaces.gx.jyl.rcgs.pz;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.util.XMLUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RCGS_CLFAction extends BaseBean implements Action {

    @Override
    public String execute(RequestInfo request) {

        String tableName = Util.null2String(request.getRequestManager().getBillTableName());

        String sql = "select a.xjllxm,a.zffs,a.kcxj,a.yhzf,a.accounting_period,a.fjs,a.company,a.rq,a.enter,a.fiscal_year,a.ccsy mxyt,a.bxlx,a.bmbm,a.jehj mxje from "+tableName+" a where a.requestid = '"+request.getRequestid()+"' ";

        RecordSet recordSet = new RecordSet();

        recordSet.execute(sql);

        Ufinterface ufinterface = new Ufinterface();
        Voucher voucher = new Voucher();
        Voucher_body voucher_body = new Voucher_body();
        List<Entry> list = new ArrayList<Entry>();

        while (recordSet.next()) {
            String accounting_period = Util.null2String(recordSet.getString("accounting_period"));
            String fjs = Util.null2String(recordSet.getString("fjs"));
            String company = Util.null2String(recordSet.getString("company"));
            String rq = Util.null2String(recordSet.getString("rq"));
            String enter = Util.null2String(recordSet.getString("enter"));
            String fiscal_year = Util.null2String(recordSet.getString("fiscal_year"));
            String mxyt = Util.null2String(recordSet.getString("mxyt"));
            String bxlx = Util.null2String(recordSet.getString("bxlx"));
            String bmbm = Util.null2String(recordSet.getString("bmbm"));
            String mxje = Util.null2String(recordSet.getString("mxje"));
            String zffs = Util.null2String(recordSet.getString("zffs"));
            String kcxj = Util.null2String(recordSet.getString("kcxj"));
            String yhzf = Util.null2String(recordSet.getString("yhzf"));
            String xjllxm = Util.null2String(recordSet.getString("xjllxm"));


            Voucher_head voucher_head = new Voucher_head();
            voucher_head.setCompany(company);
            voucher_head.setVoucher_type("记账凭证");
            voucher_head.setFiscal_year(fiscal_year);
            voucher_head.setAccounting_period(accounting_period);
            voucher_head.setVoucher_id("0");
            voucher_head.setAttachment_number(fjs);
            voucher_head.setPrepareddate(rq);
            voucher_head.setEnter(enter); // TODO  是否需要转换成中文名
            voucher_head.setCashier("");
            voucher_head.setSignature("N");
            voucher_head.setChecker("");
            voucher_head.setPosting_date("");
            voucher_head.setPosting_person("");
            voucher_head.setVoucher_making_system("外部系统交换平台");
            voucher_head.setMemo1("");
            voucher_head.setMemo2("");
            voucher_head.setReserve1("");
            voucher_head.setReserve2("");
            voucher_head.setDate(rq);

            voucher.setVoucher_head(voucher_head);


            Entry entry = new Entry();
            entry.setEntry_id("");
            entry.setAccount_code(bxlx);
            entry.setAbstracts(mxyt);
            entry.setSettlement("");
            entry.setDocument_id("");
            entry.setDocument_date("");
            entry.setCurrency("CNY");
            entry.setUnit_price("");
            entry.setExchange_rate1("");
            entry.setExchange_rate2("");
            entry.setDebit_quantity("");
            entry.setPrimary_debit_amount(mxje);
            entry.setSecondary_debit_amount("");
            entry.setNatural_debit_currency(mxje);
            entry.setCredit_quantity("");
            entry.setPrimary_credit_amount("");
            entry.setSecondary_credit_amount("");
            entry.setNatural_credit_currency("");
            entry.setBill_type("");
            entry.setBill_id("");
            entry.setBill_date("");

            Auxiliary_accounting auxiliary_accounting = new Auxiliary_accounting();
            Item item1 = new Item();
            item1.setName("部门档案");
            item1.setSpcecialitemvalue(bmbm);
            auxiliary_accounting.setItem(item1);

            entry.setAuxiliary_accounting(auxiliary_accounting);

            list.add(entry);



            Entry entry1 = new Entry();
            entry1.setEntry_id("");
            if(zffs.equals("0")) {
                entry1.setAccount_code(yhzf);
            } else {
                entry1.setAccount_code(kcxj);
            }
            entry1.setAbstracts(mxyt);
            entry1.setSettlement("");
            entry1.setDocument_id("");
            entry1.setDocument_date("");
            entry1.setCurrency("CNY");
            entry1.setUnit_price("");
            entry1.setExchange_rate1("");
            entry1.setExchange_rate2("");
            entry1.setDebit_quantity("");
            entry1.setPrimary_debit_amount("");
            entry1.setSecondary_debit_amount("");
            entry1.setNatural_debit_currency("");
            entry1.setCredit_quantity("");
            entry1.setPrimary_credit_amount(mxje);
            entry1.setSecondary_credit_amount("");
            entry1.setNatural_credit_currency(mxje);
            entry1.setBill_type("");
            entry1.setBill_id("");
            entry1.setBill_date("");

            Auxiliary_accounting auxiliary_accounting1 = new Auxiliary_accounting();
            Item item2 = new Item();
            item2.setName("现金流量项目");
            item2.setSpcecialitemvalue(xjllxm);
            auxiliary_accounting1.setItem(item2);

            entry1.setAuxiliary_accounting(auxiliary_accounting1);

            list.add(entry1);
        }

        voucher_body.setEntry(list);

        voucher.setVoucher_body(voucher_body);

        ufinterface.setVoucher(voucher);

        String url = getPropValue("rcgs_bx", "url");

        writeLog("人才公司调用NC发送URL:" + url);

        try {
            String xml = XMLUtil.beanToXml(ufinterface, Ufinterface.class);
            xml = xml.replaceAll("<spcecialitemvalue>", "").replaceAll("</spcecialitemvalue>", "").replaceAll("GBK", "UTF-8");
            HttpPost post = null;
            try {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                // 设置超时时间
                httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
                httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
                post = new HttpPost(url);
                // 构造消息头
                post.setHeader("Content-type", "text/xml; charset=utf-8");

                writeLog("人才公司差旅费调用NC发送数据:" + xml);
                // 构建消息实体
                StringEntity entity = new StringEntity(xml.toString(), Charset.forName("UTF-8"));
                entity.setContentEncoding("UTF-8");
                // 发送Json格式的数据请求
                entity.setContentType("application/xml");
                post.setEntity(entity);


                HttpResponse response = httpClient.execute(post);
                InputStream in = response.getEntity().getContent();
                int code = response.getStatusLine().getStatusCode();
                writeLog("状态码:"+code);
                if (code == 200) {
                    byte[] bytes = new byte[0];
                    bytes = new byte[in.available()];
                    in.read(bytes);
                    String result = new String(bytes,"UTF-8");
                    Map<String, String> map = readXMLForSQ(result);
                    if (!map.isEmpty()) {
                        if (Integer.parseInt(map.get("resultcode")) < 0) {
                            request.getRequestManager().setMessageid("Failed");
                            request.getRequestManager().setMessagecontent("接口调用失败:" + map.get("resultdescription"));
                            return SUCCESS;
                        }
                    }
                } else {
                    request.getRequestManager().setMessageid("Failed");
                    request.getRequestManager().setMessagecontent("接口异常,状态码:" + code);
                }
            } catch (Exception e) {
                e.printStackTrace();
                request.getRequestManager().setMessageid("Failed");
                request.getRequestManager().setMessagecontent("异常:" + e.getMessage());
            } finally {
                if (post != null) {
                    try {
                        post.releaseConnection();
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            request.getRequestManager().setMessageid("Failed");
            request.getRequestManager().setMessagecontent("异常:" + e.getMessage());
        }

        return SUCCESS;
    }

    /**
     * @param xml
     * @return
     * @throws DocumentException
     */
    public static Map<String, String> readXMLForSQ(String xml) {


        Map<String, String> map = new HashMap<String, String>();
        //创建一个新的字符串
        StringReader reader = new StringReader(xml);
        InputSource source = new InputSource(reader);
        SAXBuilder sax = new SAXBuilder();
        try {
            org.jdom.Document doc = sax.build(source);
            Element root = doc.getRootElement();
            List<?> node = root.getChildren();
            Element el = null;
            Element el1 = null;
            for (int i = 0; i < node.size(); i++) {
                el = (Element) node.get(i);
                List<?> nodeChildren = el.getChildren();
                for (int j = 0; j < nodeChildren.size(); j++) {
                    el1 = (Element) nodeChildren.get(j);
                    String nodename = el1.getName();
                    String nodetext = el1.getValue();
                    if ("resultcode".equalsIgnoreCase(nodename)) {
                        map.put("resultcode", nodetext);
                    }
                    if ("resultdescription".equalsIgnoreCase(nodename)) {
                        map.put("resultdescription", nodetext);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
