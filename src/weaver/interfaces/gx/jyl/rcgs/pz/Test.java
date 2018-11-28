package weaver.interfaces.gx.jyl.rcgs.pz;

import com.alibaba.druid.util.HttpClientUtils;
import com.alibaba.fastjson.JSON;
import org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.SSLProtocolSocketFactory;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import weaver.interfaces.gx.jyl.util.XMLUtil;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Ufinterface ufinterface = new Ufinterface();
        Voucher voucher = new Voucher();

        Voucher_head voucher_head = new Voucher_head();
        voucher_head.setCompany("1176");
        voucher_head.setVoucher_type("记账凭证");
        voucher_head.setFiscal_year("2018");
        voucher_head.setAccounting_period("11");
        voucher_head.setVoucher_id("11");
        voucher_head.setAttachment_number("2");
        voucher_head.setPrepareddate("2018-11-09");
        voucher_head.setEnter("guanliyuan");
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
        voucher_head.setDate("2018-11-09");

        voucher.setVoucher_head(voucher_head);

        Voucher_body voucher_body = new Voucher_body();
        List<Entry> list = new ArrayList<Entry>();
        Entry entry = new Entry();
        entry.setEntry_id("1");
        entry.setAccount_code("660299");
        entry.setAbstracts("测试");
        entry.setSettlement("");
        entry.setDocument_id("");
        entry.setDocument_date("");
        entry.setCurrency("CNY");
        entry.setUnit_price("");
        entry.setExchange_rate1("");
        entry.setExchange_rate2("");
        entry.setDebit_quantity("");
        entry.setPrimary_debit_amount("100");
        entry.setSecondary_debit_amount("");
        entry.setNatural_debit_currency("100");
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
        item1.setSpcecialitemvalue("001");
        auxiliary_accounting.setItem(item1);

        entry.setAuxiliary_accounting(auxiliary_accounting);

        list.add(entry);


        Entry entry1 = new Entry();
        entry1.setEntry_id("1");
        entry1.setAccount_code("1011");
        entry1.setAbstracts("测试");
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
        entry1.setPrimary_credit_amount("100");
        entry1.setSecondary_credit_amount("");
        entry1.setNatural_credit_currency("100");
        entry1.setBill_type("");
        entry1.setBill_id("");
        entry1.setBill_date("");

        list.add(entry1);

        voucher_body.setEntry(list);

        voucher.setVoucher_body(voucher_body);

        ufinterface.setVoucher(voucher);


//        try {
//            String url = "http://10.254.44.33:8098/service/XChangeServlet?account=01&receiver=1176";
//            URL realURL = new URL(url);
//            HttpURLConnection connection = (HttpURLConnection) realURL.openConnection();
//            connection.setDoOutput(true);
//            connection.setRequestProperty("Contect-type", "text/xml");
//            connection.setRequestMethod("Post");
//            File file = new File("C:/samples/psndoc.xml");
//            InputStream input = new FileInputStream(file);
//            Writer writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        XMLUtil.printDOMTree(writer, doc, 1);   // 按照XML文件格式输出
//        InputStream inputStream = connection.getInputStream();
//        Document resDoc = XMLUtil.getDocumentBuilder().parse(inputStream);  // 解析为Doc对象




        try {
//            String xml = XMLUtil.beanToXml(ufinterface,Ufinterface.class);
//            xml = xml.replaceAll("<spcecialitemvalue>","").replaceAll("</spcecialitemvalue>","").replaceAll("GBK","UTF-8");
            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><ufinterface sender=\"003\" roottag=\"voucher\" replace=\"Y\" receiver=\"1176\" proc=\"add\" operation=\"req\" isexchange=\"Y\" filename=\"voucher.xml\" billtype=\"gl\"><voucher><voucher_body><entry><abstract>测试</abstract><account_code>660219</account_code><auxiliary_accounting><item name=\"部门档案\"></item></auxiliary_accounting><bill_date></bill_date><bill_id></bill_id><bill_type></bill_type><credit_quantity></credit_quantity><currency>CNY</currency><debit_quantity></debit_quantity><document_date></document_date><document_id></document_id><entry_id></entry_id><exchange_rate1></exchange_rate1><exchange_rate2></exchange_rate2><natural_credit_currency></natural_credit_currency><natural_debit_currency>4954</natural_debit_currency><primary_credit_amount></primary_credit_amount><primary_debit_amount>4954</primary_debit_amount><secondary_credit_amount></secondary_credit_amount><secondary_debit_amount></secondary_debit_amount><settlement></settlement><unit_price></unit_price></entry><entry><abstract>测试</abstract><account_code>100218</account_code><bill_date></bill_date><bill_id></bill_id><bill_type></bill_type><credit_quantity></credit_quantity><currency>CNY</currency><debit_quantity></debit_quantity><document_date></document_date><document_id></document_id><entry_id></entry_id><exchange_rate1></exchange_rate1><exchange_rate2></exchange_rate2><natural_credit_currency>4954</natural_credit_currency><natural_debit_currency></natural_debit_currency><primary_credit_amount>4954</primary_credit_amount><primary_debit_amount></primary_debit_amount><secondary_credit_amount></secondary_credit_amount><secondary_debit_amount></secondary_debit_amount><settlement></settlement><unit_price></unit_price></entry></voucher_body><voucher_head><accounting_period>11</accounting_period><attachment_number>2</attachment_number><cashier></cashier><checker></checker><company>1176</company><date>2018-11-28</date><enter>xutianyue</enter><fiscal_year>2018</fiscal_year><memo1></memo1><memo2></memo2><posting_date></posting_date><posting_person></posting_person><prepareddate>2018-11-28</prepareddate><reserve1></reserve1><reserve2></reserve2><signature>N</signature><voucher_id></voucher_id><voucher_making_system>外部系统交换平台</voucher_making_system><voucher_type>记账凭证</voucher_type></voucher_head></voucher></ufinterface>";
            HttpPost post = null;
            try {
//                HttpClient httpClient = new SSLClient();
                Protocol easyhttps = new Protocol("https", new SSLProtocolSocketFactory(), 443);
//                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpClient httpClient = new DefaultHttpClient();
                // 设置超时时间
                httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
                httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
                post = new HttpPost("https://nc.jsgx.net:443/service/XChangeServlet?account=003&receiver=1176");
                // 构造消息头
                post.setHeader("Content-type", "text/xml; charset=utf-8");

                System.out.println("send:"+xml);


                // 构建消息实体
                StringEntity entity = new StringEntity(xml.toString(), Charset.forName("UTF-8"));
                entity.setContentEncoding("UTF-8");
                // 发送Json格式的数据请求
                entity.setContentType("application/xml");
                post.setEntity(entity);

                HttpResponse response = httpClient.execute(post);
                InputStream in = response.getEntity().getContent();
                int code = response.getStatusLine().getStatusCode();
                if (code == 200) {
                    String result = new BufferedReader(new InputStreamReader(in))
                            .lines().collect(Collectors.joining(System.lineSeparator()));
//                    String result = IOUtils.toString(in, StandardCharsets.UTF_8);
                    System.out.println("result:"+result);
                    System.out.println(readXMLForSQ(result));


                }
            } catch (Exception e) {
                e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String test() {
        Ufinterface ufinterface = new Ufinterface();
        Voucher voucher = new Voucher();

        Voucher_head voucher_head = new Voucher_head();
        voucher_head.setCompany("1176");
        voucher_head.setVoucher_type("记账凭证");
        voucher_head.setFiscal_year("2018");
        voucher_head.setAccounting_period("11");
        voucher_head.setVoucher_id("11");
        voucher_head.setAttachment_number("2");
        voucher_head.setPrepareddate("2018-11-09");
        voucher_head.setEnter("guanliyuan");
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
        voucher_head.setDate("2018-11-09");

        voucher.setVoucher_head(voucher_head);

        Voucher_body voucher_body = new Voucher_body();
        List<Entry> list = new ArrayList<Entry>();
        Entry entry = new Entry();
        entry.setEntry_id("1");
        entry.setAccount_code("660299");
        entry.setAbstracts("测试");
        entry.setSettlement("");
        entry.setDocument_id("");
        entry.setDocument_date("");
        entry.setCurrency("CNY");
        entry.setUnit_price("");
        entry.setExchange_rate1("");
        entry.setExchange_rate2("");
        entry.setDebit_quantity("");
        entry.setPrimary_debit_amount("100");
        entry.setSecondary_debit_amount("");
        entry.setNatural_debit_currency("100");
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
        item1.setSpcecialitemvalue("001");
        auxiliary_accounting.setItem(item1);

        entry.setAuxiliary_accounting(auxiliary_accounting);

        list.add(entry);


        Entry entry1 = new Entry();
        entry1.setEntry_id("1");
        entry1.setAccount_code("1011");
        entry1.setAbstracts("测试");
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
        entry1.setPrimary_credit_amount("100");
        entry1.setSecondary_credit_amount("");
        entry1.setNatural_credit_currency("100");
        entry1.setBill_type("");
        entry1.setBill_id("");
        entry1.setBill_date("");

        list.add(entry1);

        voucher_body.setEntry(list);

        voucher.setVoucher_body(voucher_body);

        ufinterface.setVoucher(voucher);


//        try {
//            String url = "http://10.254.44.33:8098/service/XChangeServlet?account=01&receiver=1176";
//            URL realURL = new URL(url);
//            HttpURLConnection connection = (HttpURLConnection) realURL.openConnection();
//            connection.setDoOutput(true);
//            connection.setRequestProperty("Contect-type", "text/xml");
//            connection.setRequestMethod("Post");
//            File file = new File("C:/samples/psndoc.xml");
//            InputStream input = new FileInputStream(file);
//            Writer writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        XMLUtil.printDOMTree(writer, doc, 1);   // 按照XML文件格式输出
//        InputStream inputStream = connection.getInputStream();
//        Document resDoc = XMLUtil.getDocumentBuilder().parse(inputStream);  // 解析为Doc对象




        try {
            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><ufinterface sender=\"003\" roottag=\"voucher\" replace=\"Y\" receiver=\"1176\" proc=\"add\" operation=\"req\" isexchange=\"Y\" filename=\"voucher.xml\" billtype=\"gl\"><voucher><voucher_body><entry><abstract>测试</abstract><account_code>660219</account_code><auxiliary_accounting><item name=\"部门档案\"></item></auxiliary_accounting><bill_date></bill_date><bill_id></bill_id><bill_type></bill_type><credit_quantity></credit_quantity><currency>CNY</currency><debit_quantity></debit_quantity><document_date></document_date><document_id></document_id><entry_id></entry_id><exchange_rate1></exchange_rate1><exchange_rate2></exchange_rate2><natural_credit_currency></natural_credit_currency><natural_debit_currency>4954</natural_debit_currency><primary_credit_amount></primary_credit_amount><primary_debit_amount>4954</primary_debit_amount><secondary_credit_amount></secondary_credit_amount><secondary_debit_amount></secondary_debit_amount><settlement></settlement><unit_price></unit_price></entry><entry><abstract>测试</abstract><account_code>100218</account_code><bill_date></bill_date><bill_id></bill_id><bill_type></bill_type><credit_quantity></credit_quantity><currency>CNY</currency><debit_quantity></debit_quantity><document_date></document_date><document_id></document_id><entry_id></entry_id><exchange_rate1></exchange_rate1><exchange_rate2></exchange_rate2><natural_credit_currency>4954</natural_credit_currency><natural_debit_currency></natural_debit_currency><primary_credit_amount>4954</primary_credit_amount><primary_debit_amount></primary_debit_amount><secondary_credit_amount></secondary_credit_amount><secondary_debit_amount></secondary_debit_amount><settlement></settlement><unit_price></unit_price></entry></voucher_body><voucher_head><accounting_period>11</accounting_period><attachment_number>2</attachment_number><cashier></cashier><checker></checker><company>1176</company><date>2018-11-28</date><enter>xutianyue</enter><fiscal_year>2018</fiscal_year><memo1></memo1><memo2></memo2><posting_date></posting_date><posting_person></posting_person><prepareddate>2018-11-28</prepareddate><reserve1></reserve1><reserve2></reserve2><signature>N</signature><voucher_id></voucher_id><voucher_making_system>外部系统交换平台</voucher_making_system><voucher_type>记账凭证</voucher_type></voucher_head></voucher></ufinterface>";
            HttpPost post = null;
            try {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                // 设置超时时间
                httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
                httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
                post = new HttpPost("https://nc.jsgx.net:443/service/XChangeServlet?account=003&receiver=1176");
                // 构造消息头
                post.setHeader("Content-type", "text/xml; charset=utf-8");

                System.out.println("send:"+xml);
                // 构建消息实体
                StringEntity entity = new StringEntity(xml.toString(), Charset.forName("UTF-8"));
                entity.setContentEncoding("UTF-8");
                // 发送Json格式的数据请求
                entity.setContentType("application/xml");
                post.setEntity(entity);


                HttpResponse response = httpClient.execute(post);
                InputStream in = response.getEntity().getContent();
                int code = response.getStatusLine().getStatusCode();
                if (code == 200) {
                    String result = new BufferedReader(new InputStreamReader(in))
                            .lines().collect(Collectors.joining(System.lineSeparator()));
//                    String result = IOUtils.toString(in, StandardCharsets.UTF_8);
                    return result;
                }
            } catch (Exception e) {
                e.printStackTrace();
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  "";
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
            org.jdom.Document doc = sax.build(source);
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
