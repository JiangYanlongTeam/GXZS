<script type="text/javascript">
    // field49448 报销方式
    // field49466 本次冲借款金额
    // field49469 剩余借款单金额
    // field49481 费用审批类别
    // field49483 预算科目
    // field49430 支付类别

    jQuery(function(){
        jQuery("#field49448").bindPropertyChange(function(){
            var selectvalue = jQuery("#field49448").val();
            //alert(selectvalue);
            clear();
            if(parseInt(selectvalue) == 2) { //直接报销，第二个明细不能填写
                jQuery("button[name=\"addbutton2\"]").attr("onclick","");
            }  else if(parseInt(selectvalue) == 0){//第二个明细填一条
                jQuery("button[name=\"addbutton2\"]").attr("onclick",addRow2(2));
                cxjk_kz();
            } else if(parseInt(selectvalue) == ""){//当为空，清空所有明细表
                clear();
            }
        });
        //清空明细表1
        function clear(){
            var detailnum2 = jQuery("#indexnum2").val();
            if(detailnum2 > 0) {
                for(var i = 0; i < parseInt(detailnum2); i++) {
                    if(jQuery("input[name=\"check_node_2\"][value=\""+i+"\"]")){
                        jQuery("input[name=\"check_node_2\"][value=\""+i+"\"]").attr("checked","checked");
                    }
                }
                deleteRow2(2);
                jQuery("#indexnum2").val("0");
            }
            jQuery("button[name=\"addbutton2\"]").attr("onclick","");
        }
        //报销方式：冲销借款 “本次冲销金额”不能大于“剩余借款单金额”，“还款金额”不能大于（剩余借款单金额-本次冲销金额)
        function cxjk_kz(){
            //本次冲销金额
            jQuery("#field49466_0").bind("blur",function(){
                var bccjkje = jQuery("#field49466_0").val();
                var cyjkdje = jQuery("#field49469_0").val();
                if(parseInt(bccjkje) != 0) {
                    if(parseFloat(bccjkje) > parseFloat(cyjkdje)) {
                        Dialog.alert("本次冲借款金额不能大于剩余借款单金额");
                        jQuery("#field49466_0").val("");
                        return false;
                    }
                }
            });
            //剩余借款单金额
            jQuery("#field49469_0").bind("blur",function(){
                var bccjkje = jQuery("#field49466_0").val();
                var cyjkdje = jQuery("#field49469_0").val();
                if(parseFloat(bccjkje) > parseFloat(cyjkdje)) {
                    Dialog.alert("本次冲借款金额不能大于剩余借款单金额");
                    jQuery("#field49466_0").val("");
                    return false;
                }
            });
        }
        //更改费用审批类别时，明细表中预算科目晴空
        jQuery("#field49481").bindPropertyChange(function(){
            var _indexnumber0 = parseInt(jQuery("#indexnum0").val());
            for(var k = 0; k < _indexnumber0; k++) {
                if(jQuery("#field49483"+"_"+k)) {
                    jQuery("#field49483"+"_"+k).val("");
                    jQuery("#field49483" + "_"+k+"span").empty();
                }
            }
        });

        //报销方式为：冲销借款，支付类别不能选为对公支付
        jQuery("#field49448").bindPropertyChange(function(){
            var value = jQuery("#field49448").val();
            var zflbvalue = jQuery("#field49430").val();
            if(value == "0") {
                if(zflbvalue == "1" || zflbvalue == "3" || zflbvalue == "4") {
                    Dialog.alert("当报销方式选择“冲销借款”时，“支付类别”不能选择对公支付或者借用人员");
                    jQuery("#field49430").val("");
                    jQuery("#field49430").trigger("onchange");
                }
            }
        });

        //报销方式为：冲销借款，支付类别不能选为对公支付
        jQuery("#field49430").bindPropertyChange(function(){
            var value = jQuery("#field49448").val();
            var zflbvalue = jQuery("#field49430").val();
            if(zflbvalue == "1" || zflbvalue == "3" || zflbvalue == "4") {
                if(value == "0") {
                    Dialog.alert("当报销方式选择“冲销借款”时，“支付类别”不能选择对公支付或者借用人员");
                    jQuery("#field49430").val("");
                    jQuery("#field49430").trigger("onchange");
                }
            }
            //当报销人部门为4684 财务部时支付类别能选择对公一次性供应商，其他的不能选择，如果选择滞空支付列别
            var bxrbmvalue = jQuery("#field33303").val();
            if(bxrbmvalue != "4684" && zflbvalue == "3") {
                jQuery("#field49430").val("");
                jQuery("#field49430").trigger("onchange");
            }
        });
    });

</script>