<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="weaver.general.Util" %>
<jsp:useBean id="rs" class="weaver.conn.RecordSet" scope="page"/>
<jsp:useBean id="rs1" class="weaver.conn.RecordSet" scope="page"/>
<jsp:useBean id="rs2" class="weaver.conn.RecordSet" scope="page"/>
<jsp:useBean id="mysmt" class="weaver.conn.RecordSet"/>
<jsp:useBean id="bb" class="weaver.general.BaseBean"></jsp:useBean>
<jsp:useBean id="ResourceComInfo" class="weaver.hrm.resource.ResourceComInfo" scope="page"/>
<jsp:useBean id="DepartmentComInfo" class="weaver.hrm.company.DepartmentComInfo" scope="page"/>
<jsp:useBean id="SubCompanyComInfo" class="weaver.hrm.company.SubCompanyComInfo" scope="page"/>
<script language="javascript" src="/wui/theme/ecology8/jquery/js/zDialog_wev8.js"></script>

<%
    int nodeid = Util.getIntValue(request.getParameter("nodeid"), 0);//流程的节点id
    int nodetype = Util.getIntValue(request.getParameter("nodetype"), 0);//流程的节点id
    int workflowid = Util.getIntValue(request.getParameter("workflowid"), 0);//流程的节点id

    rs.execute("select formid from workflow_base where id = '" + workflowid + "'");
    rs.next();
    String formid_convert = rs.getString("formid");
    weaver.interfaces.swfa.BillFieldUtil fieldUtil = new weaver.interfaces.swfa.BillFieldUtil();
    String gysmcid = fieldUtil.getlabelId("gysmc", Integer.parseInt(formid_convert), "0", "0");//供应商名称
    String gyszhzid = fieldUtil.getlabelId("gyszhz", Integer.parseInt(formid_convert), "0", "0");//供应商名称
    String yhzhid = fieldUtil.getlabelId("gysyhzh", Integer.parseInt(formid_convert), "0", "0");//银行账户
    String lhhid = fieldUtil.getlabelId("lhh", Integer.parseInt(formid_convert), "0", "0");//联行号
    String zflbid = fieldUtil.getlabelId("zflb", Integer.parseInt(formid_convert), "0", "0");//支付类别
    String bxfsid = fieldUtil.getlabelId("bxfs", Integer.parseInt(formid_convert), "0", "0");//支付类别
    String gysbmid = fieldUtil.getlabelId("gysbm", Integer.parseInt(formid_convert), "0", "0");//供应商编码
    String sfcxjk = fieldUtil.getlabelId("sfcxjk", Integer.parseInt(formid_convert), "0", "0");//是否冲销借款
    String sbje = fieldUtil.getlabelId("sbje", Integer.parseInt(formid_convert), "0", "0");//实报金额
    String dszfje = fieldUtil.getlabelId("dszfje", Integer.parseInt(formid_convert), "0", "0");//对私支付金额
    String dgzfje = fieldUtil.getlabelId("dgzfje", Integer.parseInt(formid_convert), "0", "0");//对公支付金额
    String dgzffs = fieldUtil.getlabelId("dgzffs", Integer.parseInt(formid_convert), "0", "0");//对公支付方式
    String cph = fieldUtil.getlabelId("cph", Integer.parseInt(formid_convert), "1", "1");//车牌号
    String fysplb = fieldUtil.getlabelId("fylb", Integer.parseInt(formid_convert), "0", "0");//费用审批类别
    String khhmc_value = fieldUtil.getlabelId("khh", Integer.parseInt(formid_convert), "0", "0");//费用审批类别
    String gyskhh_value = fieldUtil.getlabelId("gyskhh", Integer.parseInt(formid_convert), "0", "0");//费用审批类别
    //For Getting Amount of Tax By Automatically ,jay
    String sl = fieldUtil.getlabelId("sl", Integer.parseInt(formid_convert), "1", "1");//Rate Of Tax
    String se = fieldUtil.getlabelId("se", Integer.parseInt(formid_convert), "1", "1");//Amount Of Tax
    String bxje = fieldUtil.getlabelId("bxje", Integer.parseInt(formid_convert), "1", "1");//Submitted Expense
    String sfzp = fieldUtil.getlabelId("sfzp", Integer.parseInt(formid_convert), "1", "1");//value-added tax
    String dzfp = fieldUtil.getlabelId("dzfp", Integer.parseInt(formid_convert), "1", "1");//value-added tax
    String yskm = fieldUtil.getlabelId("yskm", Integer.parseInt(formid_convert), "1", "1");//value-added tax
    //***
%>
<script language="javascript">

    function getdata2() {
        var dlg = new window.top.Dialog(); //定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = false;
        dlg.Width = 1060; //定义长度
        dlg.Height = 500;
        dlg.URL = '/interface/jiangyl/gys/gysgetforcw_tyfy.jsp?wfid=<%=workflowid%>';
        dlg.Title = "供应商选择";
        dlg.maxiumnable = true;
        dlg.show();
        window.dialog = dlg;
    }

    function getdata4() {
        var gysmcvalue = jQuery("#field<%=gysmcid%>").val();
        if (gysmcvalue == '') {
            Dialog.alert("请先选择供应商在选择银行账号");
            return;
        }
        var dlg = new window.top.Dialog(); //定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = false;
        dlg.Width = 1060; //定义长度
        dlg.Height = 500;
        dlg.URL = '/interface/jiangyl/gys/gysgetforcw_yhxx_tyfy.jsp?gysqc=' + gysmcvalue + '&wfid=<%=workflowid%>';
        dlg.Title = "银行信息";
        dlg.maxiumnable = true;
        dlg.show();
        window.dialog = dlg;
    }


    function openDialogForCw(url, title) {
        var dlg = new window.top.Dialog();//定义Dialog对象
        dlg.currentWindow = window;
        dlg.Model = true;
        dlg.Width = 1024;//定义长度
        dlg.Height = 280;
        dlg.URL = '/interface/jiangyl/jtfybx/' + url + '.jsp?id=<%=workflowid%>';
        dlg.Title = title;
        dlg.show();
    }

    var isNode = false;
    var js_workflowid = "<%=workflowid%>";
    var js_nodeid = "<%=nodeid%>";
    var fysqlb_val = "";
    var js_object = [
        {
            "workflowid":"12282",
            "nodeid":"29838",
            "fysplb":"21"
        },
        {
            "workflowid":"10881",
            "nodeid":"29441",
            "fysplb":"19"
        }
    ];
    for(var i = 0 ; i < js_object.length; i++) {
        var js_o = js_object[i];
        var nodeid = js_o.nodeid;
        var fysplb = js_o.fysplb;
        if(js_nodeid == nodeid) {
            isNode = true;
            fysqlb_val = fysplb;
            break;
        }
    }

    //页面加载绑定事件
    jQuery(document).ready(function () {

        if (isNode) {
            jQuery("<input type=\"button\" onclick=\"openDialogForCw('extension_tyfy','通用费用凭证预览')\" value=\"凭证预览\" class=\"e8_btn_top\">").appendTo(jQuery("#pzyl"));
        }
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

            //重新加载已经存在的明细电子发票字段验证事件
            var indexnum = parseInt(jQuery("#indexnum0").val());
            if (indexnum > 0) {
                var numtotal = indexnum - parseInt("1");
                for (var j = 0; j <= numtotal; j++) {
                    (function () {
                        var g = j;
                        jQuery("#field<%=dzfp%>" + "_" + g).bind("blur", function () {
                            var dzfp = jQuery("#field<%=dzfp%>" + "_" + g).val();
                            jQuery.post("/interface/jiangyl/jtfybx/dzfp.jsp?wfid="+js_workflowid+"&dzfp=" + dzfp + "&ts=" + new Date().getTime(), "", function (data) {
                                var ruturnstr = eval('(' + data + ')');
                                var ab = ruturnstr.success;
                                var reson = ruturnstr.reseaon;
                                if (ab == "0") {

                                } else {
                                    Dialog.alert(reson);
                                    jQuery("#field<%=dzfp%>" + "_" + g).val("");
                                }
                            });
                        })
                    })();
                }
            }

            //绑定新增明细电子发票字段验证事件
            jQuery("button[name='addbutton0']").bind("click", function () {
                var num = parseInt(jQuery("#indexnum0").val()) - parseInt("1");
                jQuery("#field<%=dzfp%>" + "_" + num).bind("blur", function () {
                    var dzfp = jQuery("#field<%=dzfp%>" + "_" + num).val();
                    jQuery.post("/interface/jiangyl/jtfybx/dzfp.jsp?wfid="+js_workflowid+"&dzfp=" + dzfp + "&ts=" + new Date().getTime(), "", function (data) {
                        var ruturnstr = eval('(' + data + ')');
                        var ab = ruturnstr.success;
                        var reson = ruturnstr.reseaon;
                        if (ab == "0") {

                        } else {
                            Dialog.alert(reson);
                            jQuery("#field<%=dzfp%>" + "_" + num).val("");
                        }
                    });
                });
            })

        }
    });
    checkCustomize = function () {
        var zflb_value = jQuery("#field<%=zflbid%>").val();
        var gysmc_value = jQuery("#field<%=gysmcid%>").val();
        var lhh_value = jQuery("#field<%=lhhid%>").val();
        var fysplb_value = jQuery("#field<%=fysplb%>").val();
        var sbje_value = jQuery("#field<%=sbje%>").val();
        var gyskhh_value = jQuery("#field<%=gyskhh_value%>").val();
        var yhzhid_value = jQuery("#field<%=yhzhid%>").val();
        if (zflb_value == "1") {
            if (gysmc_value == "") {
                Dialog.alert("当支付类别为对公非一次性供应商，供应商名称必填！");
                return false;
            }
            if (lhh_value == "") {
                Dialog.alert("当支付类别为对公非一次性供应商，联行号必填！");
                return false;
            }
            if (gyskhh_value == "") {
                Dialog.alert("当支付类别为对公非一次性供应商，供应商开户行名称必填！");
                return false;
            }
            if (yhzhid_value == "") {
                Dialog.alert("当支付类别为对公非一次性供应商，供应商银行账号必填！");
                return false;
            }
        }
        if (zflb_value == "2" && sbje_value != 0) {
            Dialog.alert("当支付类别为不需支付，实报金额必须等于0");
            return false;
        }
        if (sbje_value < 0) {
            Dialog.alert("实报金额不能小于0");
            return false;
        }
        var indexnum = parseInt(jQuery("#indexnum0").val());
        if (indexnum > 0) {
            var numtotal = indexnum - parseInt("1");
            for (var j = 0; j <= numtotal; j++) {
                var cph_value = jQuery("#field<%=cph%>" + "_" + j).val();
                if (fysplb_value == fysqlb_val && cph_value == "") {
                    Dialog.alert("请输入车牌号.");
                    return false;
                }
            }
        }
        var bxfs_value = jQuery("#field<%=bxfsid%>").val();
        if (bxfs_value == "0") {
            if (zflb_value == "1" || zflb_value == "3" || zflb_value == "4") {
                Dialog.alert("当报销方式选择“冲销借款”时，“支付类别”不能选择对公支付或者借用人员");
                return false;
            }
        }
        return true;
    };
</script>
