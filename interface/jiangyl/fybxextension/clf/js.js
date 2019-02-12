<script type = "text/javascript" >

    // field49173 是否冲销借款
    // field49237 支付类别
    // field49193 本次冲借款金额
    // field49197 剩余借款单金额
    // field49182 开始日期
    // field49183 结束日期
    // field49186 天数
    // 49260 报销事由

    jQuery(function () {
        //当已经存在明细表3多条数据，如果更改	是否冲销借款 为 是 ，则删除所有明细表3明细数据
        jQuery("#field49173").bindPropertyChange(function () {
            var selectvalue = jQuery("#field49173").val();
            var detailnum3 = jQuery("#indexnum3").val();
            if (detailnum3 > 0) {
                for (var i = 0; i < parseInt(detailnum3); i++) {
                    if (jQuery("input[name=\"check_node_3\"][value=\"" + i + "\"]")) {
                        jQuery("input[name=\"check_node_3\"][value=\"" + i + "\"]").attr("checked", "checked");
                    }
                }
                deleteRow3(3);
                jQuery("#indexnum3").val("0");
            }
            if (parseInt(selectvalue) == 0) {
                jQuery("button[name=\"addbutton3\"]").attr("onclick", "");
                jQuery("button[name=\"addbutton3\"]").attr("onclick", addRow3(3));
                cxjk_kz();
                jQuery("#field49237").val("");
                jQuery("#field49237").trigger("onchange");
            } else {
                var detailnum31 = jQuery("#indexnum3").val();
                if (detailnum31 > 0) {
                    for (var i = 0; i < parseInt(detailnum31); i++) {
                        if (jQuery("input[name=\"check_node_3\"][value=\"" + i + "\"]")) {
                            jQuery("input[name=\"check_node_3\"][value=\"" + i + "\"]").attr("checked", "checked");
                        }
                    }
                    deleteRow3(3);
                    jQuery("#indexnum3").val("0");
                }
                jQuery("button[name=\"addbutton3\"]").attr("onclick", "");
            }
        });

        //报销方式：冲销借款 “本次冲销金额”不能大于“剩余借款单金额”，“还款金额”不能大于（剩余借款单金额-本次冲销金额)
        function cxjk_kz() {
            //本次冲销金额
            jQuery("#field49193_0").bind("blur", function () {
                var bccjkje = jQuery("#field49193_0").val();
                var cyjkdje = jQuery("#field49197_0").val();
                if (parseInt(bccjkje) != 0) {
                    if (parseFloat(bccjkje) > parseFloat(cyjkdje)) {
                        Dialog.alert("本次冲借款金额不能大于剩余借款单金额");
                        jQuery("#field49193_0").val("");
                        return false;
                    }
                }
            });
            //剩余借款单金额
            jQuery("#field49197_0").bind("blur", function () {
                var bccjkje = jQuery("#field49193_0").val();
                var cyjkdje = jQuery("#field49197_0").val();
                if (parseFloat(bccjkje) > parseFloat(cyjkdje)) {
                    Dialog.alert("本次冲借款金额不能大于剩余借款单金额");
                    jQuery("#field49193_0").val("");
                    return false;
                }
            });
        }

        jQuery("#field49237").bindPropertyChange(function () {
            var zflb_value = jQuery("#field49237").val();
            var sfcjk_value = jQuery("#field49173").val();
            if (sfcjk_value == "0" && (zflb_value == "2" || zflb_value == "0" || zflb_value == "4")) {
                Dialog.alert("冲销借款不允许对公或者借用人员");
                jQuery("#field49237").val("");
                jQuery("#field49237").trigger("onchange");
            }

        });

        /*
         *控制明细表日期的输入，并计算天数；
         */
        var strStartDate = "#field49182" + "_";//开始日期
        var strEndDate = "#field49183" + "_";//结束日期
        var strDays = "#field49186" + "_";//天数

        //处理已经存在的数据
        var totalNum = parseInt(jQuery("#indexnum1").val());//已存在数据的条数
        if (totalNum > 0) {
            for (var i = 0; i < totalNum; i++) {
                (function () {
                    var p = i;
                    jQuery(strStartDate + p).bindPropertyChange(function () {
                        calculatePeriod(p, 0);
                    });
                    //绑定当前行开始日期事件（当属性改变时）
                    jQuery(strEndDate + p).bindPropertyChange(function () {
                        calculatePeriod(p, 1);
                    });
                })();
            }
        }
        //处理未来新增的数据
        var _sysFunction = addRow1;
        addRow1 = function (btnobject) {
            _sysFunction(btnobject);
            var currentNum = 0;
            if (document.getElementById("indexnum1")) {
                currentNum = document.getElementById("indexnum1").value * 1.0 - 1;
            }
            calculatePeriod(currentNum, null);
            jQuery(strStartDate + currentNum).bindPropertyChange(function () {
                calculatePeriod(currentNum, 0);
            });
            jQuery(strEndDate + currentNum).bindPropertyChange(function () {
                calculatePeriod(currentNum, 1);
            });


        };

        function calculatePeriod(indexNumer, obj) {
            //计算传递的行，开始时间与结束时间之间的的天数
            var startDate = jQuery(strStartDate + indexNumer).val();
            var endDate = jQuery(strEndDate + indexNumer).val();
            var sd = parseISO8601(startDate);
            var ed = parseISO8601(endDate);
            if (typeof(jQuery(strStartDate + indexNumer).val()) != 'undefined') {
                if (sd != "" && ed != "") {
                    if (sd > ed && obj == 0) {
                        Dialog.alert("开始日期不能大于结束日期，请重新选择！");
                        jQuery(strStartDate + indexNumer).val("");
                        jQuery(strStartDate + indexNumer + "span").empty();
                        jQuery(strStartDate + indexNumer).html("");// it works.
                        jQuery(strDays + indexNumer).val("");
                        jQuery(strDays + indexNumer + "span").empty();
                    }
                    if (sd > ed && obj == 1) {
                        Dialog.alert("结束日期不能小于开始日期，请重新选择！");
                        jQuery(strEndDate + indexNumer).val("");
                        jQuery(strEndDate + indexNumer + "span").empty();
                        jQuery(strEndDate + indexNumer).html("");// it works.
                        jQuery(strDays + indexNumer).val("");
                        jQuery(strDays + indexNumer + "span").empty();
                    }
                    if (sd <= ed) {
                        var elapsedDays = parseInt((ed.getTime() - sd.getTime()) / (1000 * 60 * 60 * 24) + 1);
                        jQuery(strDays + indexNumer).val(elapsedDays);
                        jQuery(strDays + indexNumer).trigger("onchange");
                        //jQuery(strDays + indexNumer).text(elapsedDays);
//                jQuery(strDays + indexNumer + "span").text(elapsedDays);

                    }
                }
            }
        }

//生成日期parseISO8601("2016-9-5")
        function parseISO8601(dateStringInRange) {
            var isoExp = /^\s*(\d{4})-(\d\d)-(\d\d)\s*$/,
                date = new Date(NaN), month,
                parts = isoExp.exec(dateStringInRange);

            if (parts) {
                month = +parts[2];
                date.setFullYear(parts[1], month - 1, parts[3]);
                if (month != date.getMonth() + 1) {
                    date.setTime(NaN);
                }
            }
            return date;
        }
    });
//报销事由fieldid
var _fieldId_shiyou = "49260";//字段ID
var _shiyouObj = jQuery("#field" + _fieldId_shiyou);
if (_shiyouObj.length) {
    var _shiyouTipStr = "报销事由书写格式：所有出差人姓名+出差事由+差旅费报销!";
    var _shiyouLabel = "<label id=\"fnaOverlabel_field" + _fieldId_shiyou + "\" for=\"field" + _fieldId_shiyou + "\" class=\"fnaOverlabel\">" + _shiyouTipStr + "</label>";
    _shiyouObj.before(_shiyouLabel);
    _fnaCheckShiyou();
    _shiyouObj.bind("focus", function () {
        jQuery("#fnaOverlabel_field" + _fieldId_shiyou).hide();
    });
    _shiyouObj.bind("blur", function () {
        _fnaCheckShiyou();
    });
}

//处理：报销事由默认提示文字需要在流程打开界面就提示，鼠标点击自动消失，输入报销事由
function _fnaCheckShiyou() {
    var _shiyouObj = jQuery("#field" + _fieldId_shiyou);
    if (_shiyouObj.length) {
        var _shiyou = _shiyouObj.val();
        if (_shiyou == "") {
            jQuery("#fnaOverlabel_field" + _fieldId_shiyou).show();
        } else {
            jQuery("#fnaOverlabel_field" + _fieldId_shiyou).hide();
        }
    }
}
</script>
<style>
.fnaOverlabel{
    position:absolute;
    z-index:1;
    font-size:12px;
    font-weight:normal;
    color:#A5A5A5!important;
    line-height: 22px!important;
    text-indent: 0px;
    cursor: text;
}
</style>



























