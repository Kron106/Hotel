<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/Hotel/UpdateServlet?oldroomid=${oldroomid }"  name="update" method="post">
		你所更改的酒店ID：${oldroomid}<br/>
		已存在的酒店ID：<br/>
		新的酒店ID：<input type="text" name="roomid" value="${newroom.roomid }"><br/>
		新的酒店名：<input type="text" name="roomname" value="${newroom.roomname }"><br/>
		新的酒店所在城市：<input type="text" name="city" value="${newroom.city }"><br/>
		新的酒店类型：<input type="text" name="type" value="${newroom.type }"><br/>
		新的酒店星级：<input type="text" name="level" value="${newroom.level }"><br/>
		新的酒店地址：<input type="text" name="address" value="${newroom.address }"><br/>
		新的酒店联系方式：<input type="text" name="connection" value="${newroom.connection }"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>