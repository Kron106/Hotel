<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<form action="/Hotel/RegisterServlet" method="post">
			<input type="text" name="userid" placeholder="账号">
			<br/>
			<input type="password" name="userpassword" placeholder="密码">
			<br/>
			<input type="text" name="username" placeholder="用户名">
			<br/>
			<input type="text" name="usertype" placeholder="用户类型"><br/>
			<input type="submit" placeholder="注册">
	</form>
			<div class="turn">
				<a href="login.jsp">已有账号点击登录</a>
			</div>	
	</div>
</body>
</html>