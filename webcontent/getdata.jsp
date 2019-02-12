<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="weaver.general.Util" %>
<%@ page import="weaver.conn.RecordSet" %>
<%@ page import="com.alibaba.fastjson.JSONArray" %>
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%
    String workflowid = Util.null2String(request.getParameter("workflowid"));
    RecordSet rs = new RecordSet();
    JSONArray jsonArray = new JSONArray();
    // select
    String sql = "select b.id,b.detailtable,b.viewtype,b.type from workflow_base a,workflow_billfield b where a.id = '"+workflowid+"' and a.formid = b.billid  and (b.fieldhtmltype = '3' and (b.type = '2' or b.type='19'))";
    rs.execute(sql);
    while(rs.next()) {
        String id = Util.null2String(rs.getString("id"));
        String type = Util.null2String(rs.getString("type"));
        String detailtable = Util.null2String(rs.getString("detailtable"));
        String viewtype = Util.null2String(rs.getString("viewtype"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id","field"+id);
        jsonObject.put("viewtype",viewtype);
        if(type.equals("2")) {
            jsonObject.put("fieldtype","date");
        } else {
            jsonObject.put("fieldtype","time");
        }
        if(detailtable.equals("")) {
            jsonObject.put("detailtable","0");
        } else {
            jsonObject.put("detailtable","1");
        }
        jsonArray.add(jsonObject);
    }
    out.print(jsonArray.toJSONString());
%>