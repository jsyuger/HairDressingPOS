<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/json/jquery.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">  


<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#ffccee;">
	<div class="lefttop"><span></span>目录</div>
    
    <dl class="leftmenu">
    
    
    <dd>
    <div class="title">
    <span><img src="images/leftico04.png" /></span>店铺管理
    </div>
    	<ul class="menuson">
        <li  class="active"><cite></cite><a href="index.jsp" target="rightFrame">店铺信息</a><i></i></li>
        <li><cite></cite><a href="customerRecord.action" target="rightFrame">美发店仓储管理</a><i></i></li>
        <li><cite></cite><a href="customerRecord.action" target="rightFrame">美发店门店信息</a><i></i></li>
        </ul>    
    </dd>
    
    
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>消费管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="customerRecord.action" target="rightFrame">用户消费记录</a><i></i></li>
        <li><cite></cite><a href="#">会员管理</a><i></i></li>
        </ul>    
    </dd>
        
     <dd>
    <div class="title">
    <span><img src="images/leftico03.png" /></span>产品与服务
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="recommendService.action" target="rightFrame">店铺精品</a><i></i></li>
        <li><cite></cite><a href="dyeHair.action?service=染发" target="rightFrame">染发产品</a><i></i></li>
        <li><cite></cite><a href="permHair.action?service=烫发" target="rightFrame">烫发产品</a><i></i></li>
        <li><cite></cite><a href="protectHair.action?service=护发" target="rightFrame">护发产品</a><i></i></li>
        <li><cite></cite><a href="cutHair.action?service=剪发" target="rightFrame">剪发服务</a><i></i></li>
        
        </ul>    
    </dd>
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>用户分析
    </div>
        <ul class="menuson">
        <li><cite></cite><a href="test/testFreeChart.jsp" target="rightFrame">报表</a><i></i></li>
        <li><cite></cite><a href="test/testFreeChart.jsp" target="rightFrame">统计</a><i></i></li>
        </ul>     
    </dd> 

    </dl>
    
</body>
</html>
