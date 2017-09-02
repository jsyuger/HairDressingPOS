<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>染发产品</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">  
	<script src="js/js/jquery.min.js"></script>
	<script src="js/js/bootstrap.min.js"></script>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/json/json2.js"></script>
  </head>
  
  <body>
  <nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid"> 
	<div class="navbar-header">
		<a class="navbar-brand" href="#">染发产品</a>
	</div>
	<div id="myexample">
		<ul class="nav navbar-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">颜色 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a id="action-1" href="dyeHairColor.action?service=染发&color=黑色">黑色</a></li>
					<li><a href="dyeHairColor.action?service=染发&color=红色">红色</a></li>
					<li><a href="dyeHairColor.action?service=染发&color=不限">不限</a></li>
				</ul>
			</li>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">类型 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a id="action-1" href="dyeHairType.action?service=染发&type=植物精粹">植物精粹</a></li>
					<li><a href="dyeHairType.action?service=染发&type=海洋精粹">海洋精粹</a></li>
					<li><a href="dyeHairType.action?service=染发&type=化工合成">化工合成</a></li>
				</ul>
			</li>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">耗时 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a id="action-1" href="dyeHairTimeConsuming.action?service=染发&timeConsuming=40">40分钟</a></li>
					<li><a href="dyeHairTimeConsuming.action?service=染发&timeConsuming=60">60分钟</a></li>
					<li><a href="dyeHairTimeConsuming.action?service=染发&timeConsuming=30">30分钟</a></li>
				</ul>
			</li>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">价格 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a id="action-1" href="dyeHairPrice.action?service=染发&price=60">60元</a></li>
					<li><a href="dyeHairPrice.action?service=染发&price=80">80元</a></li>
					<li><a href="dyeHairPrice.action?service=染发&price=50">50元</a></li>				
				</ul>
			</li>
			
		</ul>
	</div>
	</div>	
</nav>

<script>
$(function(){
	// 默认显示
	//$(".dropdown-toggle").dropdown('toggle');
}); 
</script>

<div id="designed-by-me" style="padding:10px;margin:5px">
    <br>
    <table class="table table-hover">
	<caption>产品类表</caption>
	<thead>
		<tr>
			<th>产品名</th>
			<th>类型</th>
			<th>颜色</th>
			<th>耗时</th>
			<th>现价</th>
			<th>服务</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="#request['items']" id="items">
     	 <tr>
		<td><s:property value="#items.name"/></td>
		<td><s:property value="#items.type"/></td>
		<td><s:property value="#items.color"/></td>
		<td><s:property value="#items.timeConsuming"/></td>
		<td><s:property value="#items.price"/></td>
		<td><s:property value="#items.service"/></td>
		<td><s:property value="#items.remark"/></td>
         <td> <a href="javascript:showInfo('<s:property value="#items.name"/>')" target=_self class="btn btn-default">查看信息</a>
         <a href="javascript:addPreOrder('<s:property value="#items.name"/>','<s:property value="#items.type"/>','<s:property value="#items.color"/>','<s:property value="#items.timeConsuming"/>',<s:property value="#items.price"/>,'<s:property value="#items.service"/>','<s:property value="#items.remark"/>');" target=_self class="btn btn-default">下单</a>
         </td>
      </tr>
      </s:iterator> 
	</tbody>
</table>
</div>

<div id="myAlert" class="alert alert-success" style="display:none">
	<a href="#" class="close" data-dismiss="alert">&times;</a>
	<strong>此产品的销量为：</strong><span id="number"></span>&nbsp;&nbsp;&nbsp;&nbsp;
	<strong>此产品的热度为：</strong><span id="star"></span>
</div>
    <!-- ajax -->
    <script type="text/javascript">
	 function addPreOrder(name,type,color,timeConsuming,price,service,remark){
		 //alert(name+type+color+timeCosuming+price+service+remark);
		 $.ajax(
            {type : "post",
             data:{name:name,type:type,color:color,timeConsuming:timeConsuming,price:price,service:service,remark:remark},
             url : "addPreOrder.action",
             dataType : "JSON",
             success : callback()
                }
            );
	}
	function callback(){
	    alert("已添加到控制台中");
        
	}
	
	
	function showInfo(name){
		 $.ajax(
            {type : "post",
             data:{itemname:name},
             url : "showInfo.action",
             dataType : "JSON",
             success : show
                }
            );
	}
	function show(data){
	    var json =  JSON.parse(data);
	    console.log(json.toString());
	    $('#myAlert').alert();
	    $('#myAlert').show();
	    $("#number").empty();
	    $("#number").append(json.toString());
	    $("#star").empty();
	    $("#star").append("*****");
	    
	    //alert(json.toString());
        
	}
  </script>
  
    
  </body>
</html>
