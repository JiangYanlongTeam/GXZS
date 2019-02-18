<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="weaver.general.Util" %>
<jsp:useBean id="rs" class="weaver.conn.RecordSet" scope="page" />
<jsp:useBean id="rs1" class="weaver.conn.RecordSet" scope="page" />
<jsp:useBean id="rs2" class="weaver.conn.RecordSet" scope="page" />
<jsp:useBean id="mysmt" class="weaver.conn.RecordSet"/>
<jsp:useBean id="bb" class="weaver.general.BaseBean"></jsp:useBean>
<jsp:useBean id="ResourceComInfo" class="weaver.hrm.resource.ResourceComInfo" scope="page" />
<jsp:useBean id="DepartmentComInfo" class="weaver.hrm.company.DepartmentComInfo" scope="page"/>
<jsp:useBean id="SubCompanyComInfo" class="weaver.hrm.company.SubCompanyComInfo" scope="page" />
<script language="javascript" src="/wui/theme/ecology8/jquery/js/zDialog_wev8.js"></script>

<%
    int nodeid = Util.getIntValue(request.getParameter("nodeid"),0);//流程的节点id
    int workflowid = Util.getIntValue(request.getParameter("workflowid"),0);//流程的节点id

    // 判断节点是否 会计节点
    String showPreView = "0";
    int[] nodeids = new int[]{29771,30072,30373,30524,29779,28115,29775}; // TODO 填写所有 还款申请流程 会计节点 nodeid
    for(int no : nodeids) {
        if(nodeid == no) {
            showPreView = "1";
            break;
        }
    }

%>
<script language="javascript">
    function HKPreView(url,title) {
        var dlg=new window.top.Dialog();//定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model=true;
        dlg.Width=1024;//定义长度
        dlg.Height=280;
        dlg.URL='/interface/jiangyl/jtfybx/'+url+'.jsp?id=<%=workflowid%>';
        dlg.Title=title;
        dlg.show();
    }
    //页面加载绑定事件
    jQuery(document).ready(function() {
        if ('<%=showPreView%>' == '1') {
            jQuery("<input type=\"button\" onclick=\"HKPreView('hk_pzyl','还款凭证预览')\" value=\"凭证预览\" class=\"e8_btn_top\">").appendTo(jQuery("#pzyl"));
        }
    });
</script>