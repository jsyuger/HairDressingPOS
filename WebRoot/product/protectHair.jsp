<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>perm hair page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="css/bootstrap.min.css">   
	<script src="js/js/jquery.min.js"></script>
	<script src="js/js/bootstrap.min.js"></script>
	
  </head>
  
  <body>
  <div id="by-self-defined" style="padding:20px;margin:5px">
    <table class="table table-striped">
  		<caption>护发产品</caption>
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
		<s:iterator value="#request['items']" id="recommend">
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
								<button type="button" class="btn btn-default btn-sm" data-toggle="modal" 
									data-target="#editModal<s:property value="#recommend.id"/>">编辑</button>
								<button type="button" class="btn btn-default btn-sm" data-toggle="modal" 
									data-target="#delModal<s:property value="#recommend.id"/>">删除</button>
								<%-- <s:property value="#recommend.id"/> --%>
							</td>
						</tr>
			</s:iterator>	
	</tbody>
	</table>
	
	<!-- ================模态框 =========================-->
			<!-- 模态框 1 添加产品  -->
		<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
		 <span class="glyphicon glyphicon-plus"></span> 添加产品
		</button>
		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">添加护发产品</h4>
		      </div>
		      
		      <form class="form-horizontal"  method="post" action="addProtectHair.action"> 
		      <div class="modal-body">
		      <!-- 内容 -->
			   <table class="table table-striped" align="center">
						  <thead>
						    <tr>
						      <th>明细</th>
						    </tr>
						  </thead>
				<tr><td> 产品服务 &nbsp;&nbsp;&nbsp;护发 <input type="hidden" readonly="true" name="service" value="护发" /> </td></tr> 
				<tr><td> 产品名 &nbsp;&nbsp;&nbsp;<input type="text" name="name" placeholder="请输入名称"></td></tr>
				<tr><td>
						<div style="position:relative;">
						类型 &nbsp;&nbsp;&nbsp;
						<span style="margin-left:100px;width:18px;overflow:hidden;">
						<select style="width:118px;margin-left:-100px" onchange="this.parentNode.nextSibling.value=this.value">
						<option value="植物护发素">植物护发素</option>
						<option value="动物护发素">动物护发素</option>
						</select></span><input name="type" style="width:100px;margin-left:50px;position:absolute;left:0px;">
						</div>
				     </td></tr>
	
				<tr><td>
				    <label class="control-label">颜色&nbsp;&nbsp;&nbsp;</label>        
				    <input type="text" value="不限" name="color" readonly="true" />
				</td></tr>
				<tr><td> 耗时 &nbsp;&nbsp;&nbsp;<input type="text" id="timeConsuming" name="timeConsuming" placeholder="输入整数" /> mins</td></tr> 
				<tr><td> 现价 &nbsp;&nbsp;&nbsp;<input type="text" name="price" placeholder="输入整数" onblur="mention6();"/> RMB </td></tr> 
				<tr><td> 备注 &nbsp;&nbsp;&nbsp;<textarea name="remark"> </textarea></td></tr> 
				     
				 </table>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="submit" class="btn btn-primary">保存</button>
		      </div>
		      </form> 
		    </div>
		  </div>
		</div>
		
		<!-- 模态框2 编辑产品  -->
		<!-- Modal -->
		<s:iterator value="#request['items']" id="recommend">
		<div class="modal fade" id="editModal<s:property value="#recommend.id"/>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">编辑护发产品</h4>
		      </div>
		      
		      <form class="form-horizontal" name="myForm2" id="myForm2" method="post" action="editProtectHair.action">
		      <div class="modal-body">
		      <!-- 内容 -->
			   <table class="table table-striped" align="center">
						  <thead> <tr><th>明细</th></tr> </thead>
				<tr><td> 产品名 &nbsp;&nbsp;&nbsp;<input type="text" id="name" name="name" value=<s:property value="#recommend.name"/> /></td></tr>
				<tr><td> 类型 &nbsp;&nbsp;&nbsp;<input type="text" name="type" value=<s:property value="#recommend.type"/> /></td></tr>
			    <tr><td> 颜色 &nbsp;&nbsp;&nbsp;<input type="text" name="color" value=<s:property value="#recommend.color"/> /></td></tr>
				<tr><td> 耗时 &nbsp;&nbsp;&nbsp;<input type="text" name="timeConsuming" value=<s:property value="#recommend.timeConsuming"/> /> mins</td></tr> 
				<tr><td> 现价 &nbsp;&nbsp;&nbsp;<input type="text" name="price" value=<s:property value="#recommend.price"/> /> RMB </td></tr> 
				<tr><td> 服务 &nbsp;&nbsp;&nbsp;<input type="text" name="service" value=<s:property value="#recommend.service"/> /> </td></tr> 
				<tr><td> 备注 &nbsp;&nbsp;&nbsp;<textarea rows="3" name="remark" ><s:property value="#recommend.remark"/> </textarea></td></tr> 
				 </table>
				 <input type="hidden" readOnly="true" border=0 name="id" value=<s:property value="#recommend.id"/> />
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="submit" class="btn btn-primary">保存</button>
		      </div>
		      </form> 
		    </div>
		  </div>
		</div>
		</s:iterator>
		
		
		<!-- 模态框3删除产品  -->
		<!-- Modal -->
		<s:iterator value="#request['items']" id="recommend">
		<div class="modal fade" id="delModal<s:property value="#recommend.id"/>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">删除护发</h4>
		      </div>
		      
		      <form class="form-horizontal" name="myForm3" id="myForm3" method="post" action="deleteProtectHair.action">
		      <div class="modal-body">
		      <!-- 内容 -->
			   <table class="table table-striped" align="center">
				<tr><td> 产品名 &nbsp;&nbsp;&nbsp;<input type="text" readOnly="true" border=0 name="name" value=<s:property value="#recommend.name"/> /></td></tr>
				<tr><td> 类型 &nbsp;&nbsp;&nbsp;<input type="text" readOnly="true" border=0 name="type" value=<s:property value="#recommend.type"/> /></td></tr>
			    <tr><td> 颜色 &nbsp;&nbsp;&nbsp;<input type="text" readOnly="true" border=0 name="color" value=<s:property value="#recommend.color"/> /></td></tr>
				<tr><td> 耗时 &nbsp;&nbsp;&nbsp;<input type="text" readOnly="true" border=0 name="timeConsuming" value=<s:property value="#recommend.timeConsuming"/> /> mins</td></tr> 
				<tr><td> 现价 &nbsp;&nbsp;&nbsp;<input type="text" readOnly="true" border=0 name="price" value=<s:property value="#recommend.price"/> /> RMB </td></tr> 
				<tr><td> 服务 &nbsp;&nbsp;&nbsp;<input type="text" readOnly="true" border=0 name="service" value=<s:property value="#recommend.service"/> /> </td></tr> 
				<%-- <tr><td> 备注 &nbsp;&nbsp;&nbsp;<textarea rows="3" name="remark" ><s:property value="#recommend.remark"/> </textarea></td></tr>  --%>
				 </table>
				 <input type="hidden" readOnly="true" border=0 name="id" value=<s:property value="#recommend.id"/> />
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="submit" class="btn btn-primary">确认删除</button>
		      </div>
		      </form> 
		    </div>
		  </div>
		</div>
		</s:iterator>
		
		
		
		</div>
  </body>
</html>

