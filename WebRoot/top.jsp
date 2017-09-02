<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统顶部</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/json/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>


</head>

<body style="background:url(images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="index.jsp" target="_parent"><img src="images/logo.png" title="系统首页" /></a>
    </div>
        
    <ul class="nav">
    <li><a href="workspace.action" target="rightFrame"><img src="images/icon01.png" title="工作台" /><h2>控制台</h2></a></li>
    <li><a href="dyeHairList.action?service=染发" target="rightFrame"><img src="images/icon02.png" title="染发" /><h2>染发</h2></a></li>
    <li><a href="permHairList.action?service=烫发"  target="rightFrame"><img src="images/icon03.png" title="烫发" /><h2>烫发</h2></a></li>
    <li><a href="cutHairList.action?service=剪发"  target="rightFrame"><img src="images/icon04.png" title="剪发" /><h2>剪发</h2></a></li>
    <li><a href="protectHairList.action?service=护发"  target="rightFrame"><img src="images/icon04.png" title="剪发" /><h2>护发</h2></a></li>
    <li><a href="#"><img src="images/icon05.png" title="账单处理" /><h2>账单处理</h2></a></li>
    <li><a href="#"><img src="images/icon06.png" title="会员办理" /><h2>会员办理</h2></a></li>
    
    </ul>
            
    <div class="topright">    
    <ul>
    <li><span><img src="images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    <li><a href="login.jsp" target="_parent">退出</a></li>
    </ul>
     
    <div class="user">
    <span><s:property value="#session['user'].username"/>您好</span>
    <a href="http://119.29.55.25/WebSocket4/chat.jsp?manager=<s:property value="#session['user'].username"/> " target="rightFrame">消息</a></li>
    <b>5</b>
    </div>    
    
    </div>

</body>
</html>
