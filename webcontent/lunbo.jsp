<%@ page import="weaver.general.Util" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String pagesize = Util.null2String(request.getParameter("pagesize"));
    String dirid = Util.null2String(request.getParameter("dirid"));
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>unslider演示</title>
    <script src="jquery-1.11.1.min.js"></script>
    <script src="unslider.min.js"></script>
    <style>
        html, body { font-family: Segoe, "Segoe UI", "DejaVu Sans", "Trebuchet MS", Verdana, sans-serif;margin:0;padding:0}
        ul, ol { padding: 0;margin:0;}
        .banner { position: relative; overflow: auto; text-align: center;}
        .banner li { list-style: none; }
        .banner ul li { float: left; }
    </style>
</head>
<body>
<style>
    #b06 .dots { position: absolute; left: 0; right: 0; bottom: 20px;}
    #b06 .dots li {
        display: inline-block;
        width: 10px;
        height: 10px;
        margin: 0 4px;
        text-indent: -999em;
        border: 2px solid #fff;
        border-radius: 6px;
        cursor: pointer;
        opacity: .4;
        -webkit-transition: background .5s, opacity .5s;
        -moz-transition: background .5s, opacity .5s;
        transition: background .5s, opacity .5s;
    }
    #b06 .dots li.active {
        background: #fff;
        opacity: 1;
    }
    #b06 .arrow { position: absolute; top: 200px;}
    #b06 #al { left: 15px;}
    #b06 #ar { right: 15px;}
</style>
<div class="banner" id="b06">
    <ul id="lunbo">
        <!--<li><img class="sliderimg" src="01.jpg" alt="" width="100%" ></li>
        <li><img class="sliderimg" src="02.jpg" alt="" width="100%" ></li>
        <li><img class="sliderimg" src="03.jpg" alt="" width="100%" ></li>
        <li><img class="sliderimg" src="04.jpg" alt="" width="100%" ></li>
        <li><img class="sliderimg" src="05.jpg" alt="" width="100%" ></li>-->
    </ul>
</div>
<script>
    function imgReload(){
        var imgHeight = 0;
        var wtmp = jQuery("body").width();
        jQuery("#b06 ul li").each(function(){
            jQuery(this).css({width:wtmp + "px"});
        });
        jQuery(".sliderimg").each(function(){
            jQuery(this).css({width:wtmp + "px"});
            imgHeight = jQuery(this).height();
        });
    }
    jQuery(window).resize(function(){imgReload();});
    jQuery(document).ready(function(e) {
        jQuery.ajax({
            url:'/interface/jiangyl/hpinfo/getpic.jsp',
            data : {
                pagesize : "<%=pagesize%>",
                dirid:"<%=dirid%>"
            },
            type:'post',
            async: false,
            dataType:'json',
            cache:'false',
            success:function(data) {
                jQuery("#lunbo").html(data.img);
            }
        })
        imgReload();
        var unslider06 = jQuery('#b06').unslider({
            dots: true,
            fluid: false
        }),
        data06 = unslider06.data('unslider');
        jQuery('.unslider-arrow06').click(function() {
            var fn = this.className.split(' ')[1];
            data06[fn]();
        });
    });



</script>
</body>
</html>

