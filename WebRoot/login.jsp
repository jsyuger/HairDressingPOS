<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
<link href="css/loginstyle.css" rel="stylesheet" type="text/css" />

<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" /> 
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" /> 
<script src="js/js/jquery.min.js"></script>
<script src="js/js/bootstrap.min.js"></script>
</head>

<body>
	<canvas id="canvas"></canvas>
	<script src="js/js/login_bg.js" language="JavaScript"></script>
	<!-- 登录区域 -->
	<div class="loginbody">
	<div class="logintop">
	    
	    <span>
	    <h3>美发店管理系统</h3>
	    <div id="info"><s:property value="info"/></div>
	    </span>
    </div>
	    <div class="loginbox">
	    <form action="login.action" method="post">
		    <ul>
		    <li><input name="username" id="userid" type="text" class="loginuser" value="账户" onclick="JavaScript:this.value='';$('#info').hide();"/></li>
		    <li><input name="password" id="password" type="password" class="loginpwd" value="passwd" onclick="JavaScript:this.value=''"/></li>
		    <li>
		    	<div>
					<label class="checkbox-inline">
						<input type="radio" name="type" id="optionsRadios3" value="casher" checked> 收银员
					</label>
					<label class="checkbox-inline">
						<input type="radio" name="type" id="optionsRadios4"  value="manager"> 经理
					</label>
					<label class="checkbox-inline">
						<input type="radio" name="type" id="optionsRadios5"  value="visitor"> 访客
					</label>
				</div>
		    </li>
		    <li><input type="submit" class="loginbtn" name="dl" id="dl" value="登陆" onclick="commit();">
		    <label>新员工 <a href="register.jsp">注册</a></label></li>
		    
		    </ul>
	    </form>
	    </div>
    </div>
    
</body>
<!-- 
<script type="text/javascript">
function commit(){
    $.ajax(
            {type : "post",
             data:{username:$('#username').val(),password:$('#password').val(),type:$('#type').val()},
             url : "login.action",
             dataType : "JSON",
             success : callback
                }
            );
}
function callback(data){
    //var json =  JSON.parse(data);
    alert("账号或密码错误！");
}
</script>
 -->
</html>