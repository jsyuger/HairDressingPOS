<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<title>主界面</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">  
	<script src="js/js/jquery.min.js"></script>
	<script src="js/js/bootstrap.min.js"></script>
</head>

<body>
		<div id="designed-by-me" style="padding:30px;margin:10px"> 
		
		<h2>make you beautiful!</h2><br>
		
		<table>
		<tr>
		<td>
		<div id="myCarousel" class="carousel slide" style="width:400px;height:300px" align="center">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>   
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">
				<div class="item active">
				<img src="images/broadcast/1.jpg" alt="First slide" width=400px height=300px>
				</div>
				<div class="item">
				<img src="images/broadcast/2.jpg" alt="Second slide" width=400px height=300px>
				</div>
				<div class="item">
				<img src="images/broadcast/3.jpg" alt="Third slide" width=400px height=300px>
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="carousel-control left" href="#myCarousel" data-slide="prev">‹</a>
			<a class="carousel-control right" href="#myCarousel" data-slide="next">›</a>
		</div>	
		<!-- 控制按钮 -->
		<div>
			<input type="button" class="btn start-slide" value="Start">
			<input type="button" class="btn pause-slide" value="Pause">
			<input type="button" class="btn prev-slide" value="Previous Slide">
			<input type="button" class="btn next-slide" value="Next Slide">
		</div>
			
		</td>
		
		<td>
			 <div id="designed-by-me2" style="padding:20px;margin:10px"> 
			 <h3>美发店今日公告</h3>
				<jsp:include page="doc/notice.txt" flush="true"></jsp:include>
				EL表达式
				${1+2},
				${user.username}.
			 </div>
		</td>
		
		</tr>
		</table>
		
		
		
		
		
		<script>
			$(function(){
				// 初始化轮播
				$(".start-slide").click(function(){
					$("#myCarousel").carousel('cycle');
				});
				// 停止轮播
				$(".pause-slide").click(function(){
					$("#myCarousel").carousel('pause');
				});
				// 循环轮播到上一个项目
				$(".prev-slide").click(function(){
					$("#myCarousel").carousel('prev');
				});
				// 循环轮播到下一个项目
				$(".next-slide").click(function(){
					$("#myCarousel").carousel('next');
				});
				// 循环轮播到某个特定的帧 
				$(".slide-one").click(function(){
					$("#myCarousel").carousel(0);
				});
				$(".slide-two").click(function(){
					$("#myCarousel").carousel(1);
				});
				$(".slide-three").click(function(){
					$("#myCarousel").carousel(2);
				});
			});
		</script>
		</div>

</body>
</html>

 

