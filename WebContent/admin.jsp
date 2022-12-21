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
	<ul>
		<c:forEach var="room" items="${rooms }">
			<li>
			酒店ID：${room.roomid}<br/>
			酒店名：${room.roomname}<br/>
			酒店所在城市：${room.city}<br/>
			酒店类型：${room.type}<br/>
			酒店星级：${room.level}<br/>
			酒店地址：${room.address}<br/>
			酒店联系方式：${room.connection}<br/>
			<a href='/Hotel/GetRoomServlet?roomid=${room.roomid }'>修改</a>
			<a href='/Hotel/DelRoomServlet?roomid=${room.roomid }'>删除</a>
			</li>
		</c:forEach>
	</ul>
	<a href='/Hotel/addroom.jsp'>添加酒店</a>

</body>
</html>