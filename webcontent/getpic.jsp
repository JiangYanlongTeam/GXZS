<%@ page import="weaver.conn.RecordSet" %>
<%@ page import="weaver.general.Util" %>
<%@ page import="weaver.hrm.User" %>
<%@ page import="weaver.hrm.HrmUserVarify" %>
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%@ page import="java.io.File" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    User user = HrmUserVarify.getUser(request,response);
    int pagesize = Util.getIntValue(request.getParameter("pagesize"),0);
    int dirid = Util.getIntValue(request.getParameter("dirid"),0);
    String sql = "select b.imagefileid,a.docid,b.imagefilename,b.filerealpath,b.filesize,b.aescode from DocImageFile a,imagefile b,docdetail c " +
            "where a.imagefileid = b.imagefileid and a.docid = c.id and seccategory = "+dirid+" and docstatus in (1,2,5) order by c.doclastmoddate desc,doclastmodtime desc";
    RecordSet recordSet = new RecordSet();
    recordSet.execute(sql);
    StringBuffer stringBuffer = new StringBuffer();
    int count = 0;
    while (recordSet.next()) {
        if(count == pagesize) {
            break;
        }
        String imagefileid = Util.null2String(recordSet.getString("imagefileid"));
        String filerealpath = Util.null2String(recordSet.getString("filerealpath"));
        File file = new File(filerealpath);
        if(file.exists()) {
            stringBuffer.append(" <li><img class=\"sliderimg\" src=\"/weaver/weaver.file.FileDownload?fileid="+imagefileid+"\" alt=\"\" width=\"100%\" ></li>");
            count++;
        }
    }
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("img",stringBuffer.toString());
    out.print(jsonObject.toJSONString());

%>