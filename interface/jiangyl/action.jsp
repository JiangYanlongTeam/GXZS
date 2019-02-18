<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="weaver.general.Util" %>
<%@ page import="weaver.file.FileUploadToPath" %>
<%@ page import="weaver.servicefiles.ResetXMLFileCache" %>
<%@ page import="weaver.conn.RecordSet" %>
<jsp:useBean id="ExcelParse" class="weaver.file.ExcelParse" scope="page" />
<jsp:useBean id="rs" class="weaver.conn.RecordSet" scope="page"/>
<jsp:useBean id="rs1" class="weaver.conn.RecordSet" scope="page"/>
<jsp:useBean id="rs2" class="weaver.conn.RecordSet" scope="page"/>
<jsp:useBean id="mysmt" class="weaver.conn.RecordSet"/>
<jsp:useBean id="bb" class="weaver.general.BaseBean"></jsp:useBean>
<jsp:useBean id="ActionXML" class="weaver.servicefiles.ActionXML" scope="page" />
<jsp:useBean id="ResourceComInfo" class="weaver.hrm.resource.ResourceComInfo" scope="page"/>
<jsp:useBean id="DepartmentComInfo" class="weaver.hrm.company.DepartmentComInfo" scope="page"/>
<jsp:useBean id="SubCompanyComInfo" class="weaver.hrm.company.SubCompanyComInfo" scope="page"/>
<%
    FileUploadToPath fu = new FileUploadToPath(request) ;
    String filename = fu.uploadFiles("excelfile") ;

    RecordSet recordSet = new RecordSet();
    String[] fieldnames = request.getParameterValues("fieldname");
    String[] fieldvalues = request.getParameterValues("fieldvalue");


    if(!filename.equals("")) {
        ExcelParse.init(filename);
        int recordercount = 0;
        int count = 1;
        while (true) {
            recordercount++;
            String actionname = Util.null2String(ExcelParse.getValue("1", "" + recordercount, "2")).trim();
            String classname = Util.null2String(ExcelParse.getValue("1", "" + recordercount, "3")).trim();
            if (recordercount == 1) {
                continue;
            }
            if(actionname.equals("") || classname.equals("")) {
                continue;
            }
            bb.writeLog("actionname:"+actionname);
            bb.writeLog("classname:"+classname);
            if(actionname.equals("") && classname.equals("")) {
                break;
            }
            String sql = "select * from ACTIONSETTING where actionname = '"+actionname+"'";
            recordSet.execute(sql);
            if(recordSet.getCounts() > 0) {
                out.println("接口:"+actionname+" 已经注册,此次跳过,行数为:"+recordercount+"<br>");
                bb.writeLog("isExist:"+classname);
                continue;
            }
            ActionXML.writeToActionXMLAdd("",actionname,actionname,classname,fieldnames,fieldvalues);
            ActionXML.updateAction(actionname, "", actionname, classname, fieldnames, fieldvalues);
            ResetXMLFileCache.resetCache();
            count++;

        }
        bb.writeLog("total:"+count);

    }
%>