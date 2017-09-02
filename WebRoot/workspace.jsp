<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%int i=0;int index=0; %>
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
	<!-- json -->
	<script type="text/javascript" src="js/json/jquery.js"></script>
	<script type="text/javascript" src="js/json/json2.js"></script>
</head>

<body>

	 <div class="container"> 
    <h3>店铺服务推荐!</h3>
    <div class="row" >
        <div class="col-xs-10 col-md-offset-1" 
        style="background-color: #ffccff;box-shadow: 
        inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
		<%--内容 --%>
       <table class="table">
		  <caption>店铺精品</caption>
		  <thead>
		    <tr>
		        <th>产品名</th>
				<th>类型</th>
				<th>颜色</th>
				<th>耗时</th>
				<th>原价</th>
				<th>现价</th>
				<th>服务</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
		  </thead>
		  <tbody>
		  	<s:iterator value="#request['recommend']" id="recommend">
						<tr>
							<td>
								<s:property value="#recommend.name"/>
							</td>
							<td>
								<s:property value="#recommend.type"/>
							</td>
							<td>
								<s:property value="#recommend.color"/>
							</td>
							<td>		
								<s:property value="#recommend.timeConsuming"/>
							</td>
							<td><s>
								<s:property value="#recommend.prePrice"/>
							</s></td>
							<td>		
								<s:property value="#recommend.price"/>
							</td>
							<td>
								<s:property value="#recommend.service"/>
							</td>
							<td>		
								<s:property value="#recommend.remark"/>
							</td>
							<td>		
								<button type="button" class="btn btn-success btn-sm" 
								onClick="addPreOrder('<s:property value="#recommend.name"/>','<s:property value="#recommend.type"/>','<s:property value="#recommend.color"/>','<s:property value="#recommend.timeConsuming"/>',<s:property value="#recommend.price"/>,'<s:property value="#recommend.service"/>','<s:property value="#recommend.remark"/>',<%=i++ %>);">下单</button>	
							</td>
						</tr>
					</s:iterator>		
		  
		  </tbody>
		</table> 
	  </div>
    </div>
    
			  <h3>开单</h3>
			  <table class="table table-striped" id="showPreItems"> 
			  <!-- <table id="showPreItems" class="table table-condensed"> -->
			  <!-- <table id="showPreItems" class="table table-bordered" border=0> -->
			  <caption>预选详情</caption>
			  <thead>
			    <tr>
			      <th>产品名</th>
					<th>类型</th>
					<th>颜色</th>
					<th>耗时</th>
					<th>价格</th>
					<th>服务</th>
					<th>备注</th>
					<th>操作</th>
			    </tr>
			  </thead>
			  <tbody id="tbody">
			    	<s:iterator value="#request['prelist']" id="prelist">
			    	<tr><td>
			    	<s:property value="#prelist.name"/></td>
					<td><s:property value="#prelist.type"/></td>
					<td><s:property value="#prelist.color"/></td>
					<td><s:property value="#prelist.timeConsuming"/></td>
					<td><s:property value="#prelist.price"/></td>
					<td><s:property value="#prelist.service"/></td>
					<td><s:property value="#prelist.remark"/></td>
					<td>
					<%-- <a href="removePreOrder.action?name=<s:property value="#prelist.name"/>&type=<s:property value="#prelist.type"/>&color=<s:property value="#prelist.color"/>&timeConsuming=<s:property value="#prelist.timeConsuming"/>&price=<s:property value="#prelist.price"/>&service=<s:property value="#prelist.service"/>&remark=<s:property value="#prelist.remark"/>">删除</a>| --%>
					<a href="removePreOrder.action?index=<%=index++ %>">删除</a>&nbsp;|&nbsp;
					<a href="order.action">去买单</a>
					</td></tr>
					</s:iterator>	
			  </tbody>
			</table>
			
			<div id="test"></div>
			
			
			<div id="sum" align="right">
				<big>¥<span id="money">0</span></big>&nbsp;
 			<form action="payment/pay.jsp" name="myform">
				<input type="hidden" id="hidemoney" value="" name="money"></input>
				<input class="btn btn-warning" type="submit" value="一起结算">
			</form>
			</div>
    
 </div>
  
  <input type="text" id="observe" value='<%=index %>' />
  
  <script type="text/javascript">
  	var obs=parseInt($("#observe").val());
	 function addPreOrder(name,type,color,timeConsuming,price,service,remark,v){
		 //alert(name+type+color+timeCosuming+price+service+remark);
		 $.ajax(
            {type : "post",
             data:{name:name,type:type,color:color,timeConsuming:timeConsuming,price:price,service:service,remark:remark},
             url : "addPreOrder.action",
             dataType : "JSON",
             success : callback(v)
                }
            );
	}
	
	function callback(v){
	    alert("已添加到下面的购物车中");
        var s = document.getElementsByTagName("table")[0]; //获取第一个表格   
        var t=document.getElementById("tbody");
        $("#tbody").append("<tr>");
		for(var j=0;j<s.rows[v+1].cells.length-1;j++){
				if(j!=4)
				 {$("#tbody").append("<td>&nbsp;"+s.rows[v+1].cells[j].innerHTML+ "</td>");}
		} 
		$("#tbody").append("<td>&nbsp;"+"<a href='removePreOrder.action?index="+obs+"'>"+ "删除" + "</a>"+"&nbsp|&nbsp"
								+"<a href='order.action?barber="+s.rows[v+1].cells[1].innerHTML+
								"&service="+s.rows[v+1].cells[0].innerHTML+
								"&price="+s.rows[v+1].cells[4].innerHTML+
								"&phone="+s.rows[v+1].cells[2].innerHTML+
								"&amount=1"+
								"&remark="+s.rows[v+1].cells[3].innerHTML+"'>"
								+ "去买单" + "</a></td>"
								);
		$("#tbody").append("</tr>");
		$("#tbody").append("<hr style="+"#185598;"+"/>"); 
		/* $("#tbody").append("<hr style='dotted #185598;' />"); */
		obs++;

	}
  </script>


</body>
</html>

 

