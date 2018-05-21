package weaver.interfaces.gx.jyl.cw.base;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.soa.workflow.request.RequestInfo;

public class CWPublicMethod extends BaseBean {

    /**
     * 设置失败消息 
     * 
     * @param request
     * @param failedid
     * @param failedmessage
     */
    public void setFailMessage(RequestInfo request,
                               String failedid,
                               String failedmessage) {
        request.getRequestManager().setMessageid(failedid);
        request.getRequestManager().setMessagecontent(failedmessage);
    }

    /**
     * 解析资金支付申请创建返回XML结构
     * 
     * @param xml
     * @return
     */
    public Map<String, String> readXMLForSQ(String xml) {
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
                if ("TYPE".equals(nodename)) {
                    map.put("TYPE", nodetext);
                }
                if ("APPLYNO".equals(nodename)) {
                    map.put("APPLYNO", nodetext);
                }
                if ("CODE".equals(nodename)) {
                    map.put("CODE", nodetext);
                }
                if ("MESSAGE".equals(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    
    /**
     * 解析集团通用凭证接口返回参数
     * 
     * @param xml
     * @return
     */
    public Map<String, String> readXMLForCLFBXSQAA(String xml) {
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
                if ("RET_ACCNO".equals(nodename)) {
                    map.put("RET_ACCNO", nodetext);
                }
                if ("MTYPE".equals(nodename)) {
                    map.put("MTYPE", nodetext);
                }
                if ("RCODE".equals(nodename)) {
                    map.put("RCODE", nodetext);
                }
                if ("MESSAGE".equals(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
                if ("AC_DOC_NO".equals(nodename)) {
                    map.put("pzacdocno", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    
    /**
     * 解析差旅费报销创建返回XML结构
     * 
     * @param xml
     * @return
     */
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
                if ("RET_ACCNO".equals(nodename)) {
                    map.put("RET_ACCNO", nodetext);
                }
                if ("ZSTATU".equals(nodename)) {
                    map.put("ZSTATU", nodetext);
                }
                if ("ZDESC".equals(nodename)) {
                    map.put("ZDESC", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    
    /**
     * 解析资金预算占用返回XML结构
     * 
     * @param xml
     * @return
     */
    public Map<String, String> readXMLForZY(String xml) {
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
                if ("TYPE".equals(nodename)) {
                    map.put("TYPE", nodetext);
                }
                if ("ZJPZH".equals(nodename)) {
                    map.put("ZJPZH", nodetext);
                }
                if ("CODE".equals(nodename)) {
                    map.put("CODE", nodetext);
                }
                if ("MESSAGE".equals(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    
    /**
     * 解析资金预算释放返回XML结构
     * 
     * @param xml
     * @return
     */
    public Map<String, String> readXMLForSF(String xml) {
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
                if ("TYPE".equals(nodename)) {
                    map.put("TYPE", nodetext);
                }
                if ("CODE".equals(nodename)) {
                    map.put("CODE", nodetext);
                }
                if ("MESSAGE".equals(nodename)) {
                    map.put("MESSAGE", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
    
    /**
     * 更新资金支付申请创建流程信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateZJZFSQ(String requestid,
                             String type,
                             String code,
                             String message,String no) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_FYJK");
        String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新资金预算占用信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateZJYSZY(String requestid,
                             String type,
                             String code,
                             String message,String no) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_FYJK");
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    
    /**
     * 更新集团财务-费用借款-预算占用信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTZJYSZY(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新资金预算释放信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateZJYSSF(String requestid,
                             String type,
                             String code,
                             String message) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_FYJK");
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团财务费用借款释放
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCWFYJKSF(String requestid,
                             String type,
                             String code,
                             String message,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新资金划拨申请创建流程信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateZJHBSQ(String requestid,
                             String type,
                             String code,
                             String message,String no) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_YFKB");
        String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团财务创建返回信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTFYJKSQ(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团财务通用费用报销-创建资金支付单
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTYBFYBXZJZFD(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团财务差旅费用报销-创建资金支付单 对私
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCLFXBXZJZFDDS(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set capplyno = '"+no+"', ccode = '"+code+"', cmessage = '"+message+"',ctype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团财务差旅费用报销-创建资金支付单 对私
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCLFXBXZJZFDDG(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set capplyno1 = '"+no+"', ccode1 = '"+code+"', cmessage1 = '"+message+"',ctype1 = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新差旅费报销创建流程信息
     * 
     * @param requestid
     * @param RET_ACCNO
     * @param ZSTATU
     * @param ZDESC
     */
    public void updateCLFBXCJ(String requestid,
                             String RET_ACCNO,
                             String ZSTATU,
                             String ZDESC) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_CLF");
        String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团差旅费报销创建流程信息
     * 
     * @param requestid
     * @param RET_ACCNO
     * @param ZSTATU
     * @param ZDESC
     */
    public void updateJTCLFBXCJ(String requestid,
                             String RET_ACCNO,
                             String ZSTATU,
                             String ZDESC,String pzacdocno,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"',pzacdocno = '"+pzacdocno+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新一般费用报销创建流程信息
     * 
     * @param requestid
     * @param RET_ACCNO
     * @param ZSTATU
     * @param ZDESC
     */
    public void updateYBFBXCJ(String requestid,
                             String RET_ACCNO,
                             String ZSTATU,
                             String ZDESC) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_YBFY");
        String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    
    /**
     * 更新集团-一般费用报销创建流程信息
     * 
     * @param requestid
     * @param RET_ACCNO
     * @param ZSTATU
     * @param ZDESC
     */
    public void updateJTYBFBXCJ(String requestid,
                             String RET_ACCNO,
                             String ZSTATU,
                             String ZDESC,String pzacdocno,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"',pzacdocno = '"+pzacdocno+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团-还款申请创建流程信息
     * 
     * @param requestid
     * @param RET_ACCNO
     * @param ZSTATU
     * @param ZDESC
     */
    public void updateJTHKSQCJ(String requestid,
                             String RET_ACCNO,
                             String ZSTATU,
                             String ZDESC,String pzacdocno,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set pzaccno = '"+RET_ACCNO+"', pzstatus = '"+ZSTATU+"', pzmessage = '"+ZDESC+"',pzacdocno = '"+pzacdocno+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新资金划拨占用信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateZJHBZY(String requestid,
                             String type,
                             String code,
                             String message,String no) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_YFKB");
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新差旅费占用信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateCLFZY(String requestid,
                             String type,
                             String code,
                             String message,String no) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_CLF");
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新通用费用报销占用
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateTYZY(String requestid,
                             String type,
                             String code,
                             String message,String no) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_YBFY");
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团一般费用报销占用
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateHJTYBFYBXZY(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团差旅费用报销占用（对私）
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCLFFYBXZYDS(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set fzjpzh = '"+no+"', fcode = '"+code+"', fmessage = '"+message+"',ftype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团差旅费用报销占用（对公）
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCLFFYBXZYDG(String requestid,
                             String type,
                             String code,
                             String message,String no,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set fzjpzh1 = '"+no+"', fcode1 = '"+code+"', fmessage1 = '"+message+"',ftype1 = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新差旅费释放信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateCLFSF(String requestid,
                             String type,
                             String code,
                             String message) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_CLF");
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新通用报销释放
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateTYSF(String requestid,
                             String type,
                             String code,
                             String message) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_YBFY");
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团-一般报销释放
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTYBFYBXSF(String requestid,
                             String type,
                             String code,
                             String message,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团-差旅费释放对私
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCLFBXSFDS(String requestid,
                             String type,
                             String code,
                             String message,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新集团-差旅费释放对公
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateJTCLFBXSFDG(String requestid,
                             String type,
                             String code,
                             String message,String bs) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", bs);
        String sql = "update "+tablename+" set scode1 = '"+code+"', smessage1 = '"+message+"',stype1 = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
    
    /**
     * 更新资金划拨释放信息
     * 
     * @param requestid
     * @param type
     * @param code
     * @param message
     */
    public void updateZJHBSF(String requestid,
                             String type,
                             String code,
                             String message) {
        RecordSet rs = new RecordSet();
        String tablename = getPropValue("GXBX", "CW_YFKB");
        String sql = "update "+tablename+" set scode = '"+code+"', smessage = '"+message+"',stype = '"+type+"' where requestid = '"+requestid+"'";
        rs.execute(sql);
    }
}
