<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加酒店</title>
</head>
	<style>
		input{
			
		}
		button{
			
		}
	</style>
	
<body>
	<form action="/Hotel/AddRoomServlet" method="post" name="update" >
		<input type="text" name="roomid" placeholder="酒店ID"><br/>
		<input type="text" name="roomname" placeholder="酒店名"><br/>
		<input type="text" name="city" placeholder="酒店城市"><br/>
		<input type="text" name="type" placeholder="酒店类型"><br/>
		<input type="text" name="level" placeholder="酒店星级"><br/>
		<input type="text" name="status" placeholder="酒店状态"><br/>
		<input type="text" name="address" placeholder="酒店地址"><br/>
		<input type="text" name="connection" placeholder="酒店联系方式"><br/>
		<button >提交</button>
	</form>
	
	

</body>
</html>