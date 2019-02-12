<!-- script代码，如果需要引用js文件，请使用与HTML中相同的方式。 -->
<script type="text/javascript">
    // field50250 发票金额
    // field50240 冲销金额
    // field50241 是否有退款
    // field50242 退款金额
    // field50226 支付金额
    // field_lable36753 同支付金额 更改为 field_lable50226
    // field50257 本次冲预付款金额
    // field50256 剩余预付款金额
    jQuery(function(){
        // 发票金额变化
        jQuery("#field50250").bindPropertyChange(function(){
            var fpjevalue = jQuery("#field50250").val();
            var cxjevalue = jQuery("#field50240").val();
            if(parseFloat(cxjevalue) > parseFloat(fpjevalue)) {
                jQuery("#field50241").val("");
                jQuery("#field50241").trigger("change");
                jQuery("#field50242").val(parseFloat(cxjevalue) - parseFloat(fpjevalue));
                jQuery("#field50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").val("");
                jQuery("#field_lable50226").trigger("onblur");
            }else  if(parseFloat(fpjevalue) == parseFloat(cxjevalue)) {
                jQuery("#field50242").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").val("");
                jQuery("#field_lable50226").trigger("onblur");
            }else if (parseFloat(cxjevalue) < parseFloat(fpjevalue)){
                jQuery("#field50242").val("0");
                jQuery("#field50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").trigger("onblur");
            }
        })
        // 冲销金额变化
        jQuery("#field50240").bindPropertyChange(function(){
            var fpjevalue = jQuery("#field50250").val();
            var cxjevalue = jQuery("#field50240").val();
            if(parseFloat(cxjevalue) > parseFloat(fpjevalue)) {
                jQuery("#field50241").val("");
                jQuery("#field50241").trigger("change");
                jQuery("#field50242").val(parseFloat(cxjevalue) - parseFloat(fpjevalue));
                jQuery("#field50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").val("");
                jQuery("#field_lable50226").trigger("onblur");
            }else  if(parseFloat(fpjevalue) == parseFloat(cxjevalue)) {
                jQuery("#field50242").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").val("");
                jQuery("#field_lable50226").trigger("onblur");
            }else if (parseFloat(cxjevalue) < parseFloat(fpjevalue)){
                jQuery("#field50242").val("0");
                jQuery("#field50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").val(parseFloat(fpjevalue) - parseFloat(cxjevalue));
                jQuery("#field_lable50226").trigger("onblur");
            }
        })
        // 是否退款变化
        jQuery("#field50241").bindPropertyChange(function(){
            var fpjevalue = jQuery("#field50250").val();
            var cxjevalue = jQuery("#field50240").val();
            var sftkvalue = jQuery("#field50241").val();
            if(parseFloat(cxjevalue) > parseFloat(fpjevalue) && sftkvalue == "1") {
                jQuery("#field50241").val("");
                jQuery("#field50241").trigger("change");
                Dialog.alert("冲销金额大于发票金额，“是否有退款”请选择“是”");
            }
            if(parseFloat(cxjevalue) == parseFloat(fpjevalue) && sftkvalue == "0") {
                jQuery("#field50241").val("");
                jQuery("#field50241").trigger("change");
                Dialog.alert("冲销金额等于发票金额，“是否有退款”请选择“否”");
            }
            if(parseFloat(cxjevalue) < parseFloat(fpjevalue) && sftkvalue == "0") {
                jQuery("#field50241").val("");
                jQuery("#field50241").trigger("change");
                Dialog.alert("冲销金额小于发票金额，“是否有退款”请选择“否”");
            }
        })
        jQuery("button[name=\"addbutton1\"]").attr("style","display:none");
        jQuery("button[name=\"delbutton1\"]").attr("style","display:none");
        jQuery("#field50242").attr("readonly","readonly");
        //本次冲销金额
        setTimeout(dodetail,1000);
    })

function dodetail(){
    jQuery("#field50257_0").bind("blur",function(){
        var bccxje = jQuery("#field50257_0").val();
        var sjcxxje = jQuery("#field50256_0").val();
        if(sjcxxje == "") {
            sjcxxje = "0";
        }
        if(parseFloat(bccxje) > parseFloat(sjcxxje)) {
            Dialog.alert("本次冲预付款金额不能大于剩余预付款金额");
            jQuery("#field50257_0").val("");
        }
    })
}
function dodetail2(){
    // 剩余预付款金额值变化控制
    jQuery("#field50256_0").bind("blur",function(){
        var bccxje = jQuery("#field50257_0").val();
        var sjcxxje = jQuery("#field50256_0").val();
        if(sjcxxje == "") {
            sjcxxje = "0";
        }
        if(parseFloat(bccxje) > parseFloat(sjcxxje)) {
            Dialog.alert("本次冲预付款金额不能大于剩余预付款金额");
            jQuery("#field50257_0").val("");
        }
    })
}
</script>