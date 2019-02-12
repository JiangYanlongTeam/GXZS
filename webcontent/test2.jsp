<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="weaver.interfaces.gx.jyl.rcgs.pz.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.http.client.methods.HttpPost" %>
<%@ page import="org.apache.http.impl.client.DefaultHttpClient" %>
<%@ page import="org.apache.http.params.CoreConnectionPNames" %>
<%@ page import="org.apache.http.entity.StringEntity" %>
<%@ page import="java.nio.charset.Charset" %>
<%@ page import="org.apache.http.HttpResponse" %>
<%@ page import="org.xml.sax.InputSource" %>
<%@ page import="org.jdom.input.SAXBuilder" %>
<%@ page import="org.jdom.Element" %>
<%@ page import="weaver.general.BaseBean" %>
<%@ page import="weaver.interfaces.gx.jyl.ceb2pdf.FTPUtil" %>
<%@ page import="org.apache.commons.codec.digest.DigestUtils" %>
<%@ page import="java.io.*" %>
<%@ page import="java.security.MessageDigest" %>
<%@ page import="org.apache.commons.codec.binary.Hex" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    long beginTime = System.currentTimeMillis();
    File file = new File("/app/ecology/filesystem/201812/A/1005785480.pdf");
    String md5 = getMD5(file);
    long endTime = System.currentTimeMillis();
    new BaseBean().writeLog("MD5:" + md5 + "\n 耗时:" + ((endTime - beginTime) / 1000) + "s");
%>
<%!
    public static String getMD5(File file) {
        FileInputStream fileInputStream = null;
        try {
            MessageDigest MD5 = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                MD5.update(buffer, 0, length);
            }
            return new String(Hex.encodeHex(MD5.digest()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
%>