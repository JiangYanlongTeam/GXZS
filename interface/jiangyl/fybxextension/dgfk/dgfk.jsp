<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="weaver.general.Util" %>
<%@ page import="java.util.*" %>
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
    int nodetype = Util.getIntValue(request.getParameter("nodetype"),0);//流程的节点id
    int workflowid = Util.getIntValue(request.getParameter("workflowid"),0);//流程的节点id

    rs.execute("select formid from workflow_base where id = '"+workflowid+"'");
    rs.next();
    String formid_convert = rs.getString("formid");
    weaver.interfaces.swfa.BillFieldUtil fieldUtil = new weaver.interfaces.swfa.BillFieldUtil();
    String gysmcid = fieldUtil.getlabelId("gysmc",Integer.parseInt(formid_convert),"0","0");//供应商名称
    String gyszhzid = fieldUtil.getlabelId("gyszhz",Integer.parseInt(formid_convert),"0","0");//供应商名称
    String yhzhid = fieldUtil.getlabelId("gysyhzh",Integer.parseInt(formid_convert),"0","0");//银行账户
    String lhhid = fieldUtil.getlabelId("lhh",Integer.parseInt(formid_convert),"0","0");//联行号
    String zflbid = fieldUtil.getlabelId("zflb",Integer.parseInt(formid_convert),"0","0");//支付类别
    String bxfsid = fieldUtil.getlabelId("bxfs",Integer.parseInt(formid_convert),"0","0");//支付类别
    String gysbmid = fieldUtil.getlabelId("gysbm",Integer.parseInt(formid_convert),"0","0");//供应商编码
    String sfcxjk = fieldUtil.getlabelId("sfcxjk",Integer.parseInt(formid_convert),"0","0");//是否冲销借款
    String sbje = fieldUtil.getlabelId("sbje",Integer.parseInt(formid_convert),"0","0");//实报金额
    String dszfje = fieldUtil.getlabelId("dszfje",Integer.parseInt(formid_convert),"0","0");//对私支付金额
    String dgzfje = fieldUtil.getlabelId("dgzfje",Integer.parseInt(formid_convert),"0","0");//对公支付金额
    String dgzffs = fieldUtil.getlabelId("dgzffs",Integer.parseInt(formid_convert),"0","0");//对公支付方式
    String cph = fieldUtil.getlabelId("cph",Integer.parseInt(formid_convert),"1","1");//车牌号
    String fysplb = fieldUtil.getlabelId("fylb",Integer.parseInt(formid_convert),"0","0");//费用审批类别
    String khhmc_value = fieldUtil.getlabelId("khh",Integer.parseInt(formid_convert),"0","0");//费用审批类别
    String gyskhh_value = fieldUtil.getlabelId("gyskhh",Integer.parseInt(formid_convert),"0","0");//费用审批类别
    //For Getting Amount of Tax By Automatically ,jay
    String sl = fieldUtil.getlabelId("sl",Integer.parseInt(formid_convert),"1","1");//Rate Of Tax
    String se = fieldUtil.getlabelId("se",Integer.parseInt(formid_convert),"1","1");//Amount Of Tax
    String bxje = fieldUtil.getlabelId("bxje",Integer.parseInt(formid_convert),"1","1");//Submitted Expense
    String sfzp = fieldUtil.getlabelId("sfzp",Integer.parseInt(formid_convert),"1","1");//value-added tax
    String dzfp = fieldUtil.getlabelId("dzfp",Integer.parseInt(formid_convert),"1","1");//value-added tax
    String yskm = fieldUtil.getlabelId("yskm",Integer.parseInt(formid_convert),"1","1");//value-added tax
    //***
%>
<script language="javascript">
    function getdata() {
        var dlg = new window.top.Dialog(); //定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = false;
        dlg.Width = 1060; //定义长度
        dlg.Height = 500;
        dlg.URL = '/interface/jiangyl/gys/gysgetforcw_clf.jsp?wfid=<%=workflowid%>';
        dlg.Title = "供应商选择" ;
        dlg.maxiumnable = true;
        dlg.show();
        window.dialog = dlg;
    }

    function getdata3() {
        var gysmcvalue = jQuery("#field<%=gysmcid%>").val();
        if(gysmcvalue == '') {
            Dialog.alert("请先选择供应商在选择银行账号");
            return;
        }
        var dlg = new window.top.Dialog(); //定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = false;
        dlg.Width = 1060; //定义长度
        dlg.Height = 500;
        dlg.URL = '/interface/jiangyl/gys/gysgetforcw_yhxx_clf.jsp?gysqc='+gysmcvalue+'&wfid=<%=workflowid%>';
        dlg.Title = "银行信息" ;
        dlg.maxiumnable = true;
        dlg.show();
        window.dialog = dlg;
    }

    function getdata2() {
        var dlg = new window.top.Dialog(); //定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = false;
        dlg.Width = 1060; //定义长度
        dlg.Height = 500;
        dlg.URL = '/interface/jiangyl/gys/gysgetforcw_tyfy.jsp?wfid=<%=workflowid%>';
        dlg.Title = "供应商选择" ;
        dlg.maxiumnable = true;
        dlg.show();
        window.dialog = dlg;
    }

    function getdata4() {
        var gysmcvalue = jQuery("#field<%=gysmcid%>").val();
        if(gysmcvalue == '') {
            Dialog.alert("请先选择供应商在选择银行账号");
            return;
        }
        var dlg = new window.top.Dialog(); //定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = false;
        dlg.Width = 1060; //定义长度
        dlg.Height = 500;
        dlg.URL = '/interface/jiangyl/gys/gysgetforcw_yhxx_tyfy.jsp?gysqc='+gysmcvalue+'&wfid=<%=workflowid%>';
        dlg.Title = "银行信息" ;
        dlg.maxiumnable = true;
        dlg.show();
        window.dialog = dlg;
    }

    //还款凭证
    function openHKPZ() {
        window.showModalDialog("/interface/jiangyl/jtcwpzyl/pzyl.jsp?id=<%=workflowid%>",window,"dialogWidth:1328px;dialogHeight:600px;");
    }
    function openDialogForCw(url,title) {
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
        if ('<%=nodetype%>' == '0') {//for submitting common expense, apply node
            jQuery("#field<%=gysmcid%>").attr("readonly", "readonly");
            if (jQuery("#field<%=gysmcid%>").is(":hidden")) {
                jQuery("#field<%=gysmcid%>span").text(jQuery("#field<%=gysmcid%>").val());
            } else {
                jQuery("#field<%=gysmcid%>span").html("<img src='/wui/theme/ecology8/skins/default/general/browser_wev8.png' style='cursor:pointer;' onclick=\"getdata2()\" />");
            }
            jQuery("#field<%=lhhid%>").attr("readonly", "readonly");
            if (jQuery("#field<%=lhhid%>").is(":hidden")) {
                jQuery("#field<%=lhhid%>span").text(jQuery("#field<%=lhhid%>").val());
            } else {
                jQuery("#field<%=lhhid%>span").html("<img src='/wui/theme/ecology8/skins/default/general/browser_wev8.png' style='cursor:pointer;' onclick=\"getdata4()\" />");
            }
        }
    });
</script>
