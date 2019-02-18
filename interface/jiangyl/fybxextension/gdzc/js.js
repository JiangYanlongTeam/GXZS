<!-- script代码，如果需要引用js文件，请使用与HTML中相同的方式。 -->
<script type="text/javascript">
    // field50735 供应商名称
    // field50737 联行号

    jQuery(document).ready(function(){
        //初始化已经保存的数据，把对应字段绑定事件
        init_olds();
    });
function init_olds(){
    var indexnum = parseInt(jQuery("#indexnum0").val());
    if(indexnum > 0) {
        var numtotal = indexnum - parseInt("1");
        for(var j = 0; j <= numtotal; j++) {
            (function(){
                var p = j;
                if (jQuery("#field50737_"+p).is(":hidden")) {
                    jQuery("#field50737_"+p).text(jQuery("#field50737_"+p).val());
                } else {
                    jQuery("#field50737_"+p).attr("readonly","readonly");
                    jQuery("#field50737_"+p+"span").html("<img src='/wui/theme/ecology8/skins/default/general/browser_wev8.png' _did = '"+p+"' style='cursor:pointer;' onclick=\"getdata3(this)\" />");
                }
            })();
        }
    }
}

function getdata3(obj) {
    var did = jQuery(obj).attr("_did");
    var gysmcvalue = jQuery("#field50735_"+did).val();
    var workflowid = jQuery("#workflowid").val();
    if(gysmcvalue == '') {
        Dialog.alert("请先选择供应商在选择银行账号");
        return;
    }
    var dlg = new window.top.Dialog(); //定义Dialog对象
    dlg.currentWindow = window;
    dlg.Model = false;
    dlg.Width = 1060; //定义长度
    dlg.Height = 500;
    dlg.URL = '/interface/jiangyl/gys/gysgetforcw_yhxx_clf1.jsp?gysqc='+gysmcvalue+'&wfid='+workflowid+'&num='+did;
    dlg.Title = "银行信息" ;
    dlg.maxiumnable = true;
    dlg.show();
    window.dialog = dlg;
}
</script>
















