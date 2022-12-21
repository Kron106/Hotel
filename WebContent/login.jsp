<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
	.box{
		width: 30px;
		margin: 0 auto;
		margin-left: 600px;
	}
	input{
		width: 300px;
		height: 50px;
		margin-top: 30px;
	}
	.turn{
		width: 300px;
		height: 50px;
	}
</style>
<body>
	<div class="box">
		<form action="/Hotel/LoginServlet" method="post" name="login">
			<input type="text" name="userid" placeholder="账号">
			<br/>
			<input type="password" name="userpassword" placeholder="密码">
			<br/>
			<input type="submit" value="登录">
		</form>
		<div class="turn">
			<a href="register.jsp">新用户注册</a>
		</div>
		
	
	</div>

</body>
</html>