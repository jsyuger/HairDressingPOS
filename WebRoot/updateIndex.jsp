<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateIndex.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="designed-by-me" style="padding:30px;margin:10px"> 
		
		<h2>make you beautiful!</h2><br>
		
		<table>
		<tr>
		<td>
			上传图片
			<s:file name="pic" />
		</td>
		
		<td>
			 <div id="designed-by-me2" style="padding:20px;margin:10px"> 
			 <h3>美发店今日公告</h3>
				<jsp:include page="doc/notice.txt" flush="true"></jsp:include>
			 </div>
		</td>
		
		</tr>
		</table>
		
  </body>
</html>
