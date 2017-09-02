<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testJson.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/json/jquery.js"></script>
	<script type="text/javascript" src="js/json/json2.js"></script>
  </head>
  
  <body>
    <form action="">
<table>
<tr>
<td>名字</td>
<td><input type="text" id="name" name="name"/></td>
</tr>
<tr>
<td>年龄</td>
<td><input type="text" id="age" name="age"/></td>
</tr>
<tr>
<td><input type="button" value="提交" onclick="commit();"/> </td>
</tr>
</table>
<table id="ulist" border="2">
</table>
</form>
</body>
<script type="text/javascript">
function commit(){
    $.ajax(
            {type : "post",
             data:{name:$('#name').val(),age:$('#age').val()},
             url : "testJson.action",
             dataType : "JSON",
             success : callback
                }
            );
}
function callback(data){
    var json =  JSON.parse(data);
    alert("fdf");
    var ulist =  $("#ulist");
    $.each(json, function(i,item){
         ulist.append(
        "<tr><td>"+item.name+"</td><td>"+item.age+"</td></tr>"
                 );
        });
}
</script>
  
</html>
