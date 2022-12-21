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
			酒店名：${room.roomname}<br/>
			酒店所在城市：${room.city}<br/>
			酒店类型：${room.type}<br/>
			酒店星级：${room.level}<br/>
			酒店地址：${room.address}<br/>
			酒店联系方式：${room.connection}<br/>
			<a href="/Hotel/OrderRoomServlet?orderroomname=${room.roomname }">预定</a>
			<a href="/Hotel/RemoveRoomServlet?removeroomname=${room.roomname }">取消预定</a>
		</li>
	</c:forEach>
	</ul>
	<h5>您已预定的房间：</h5><br/>
	<c:forEach var="ordroom" items="${ordroom }">
		${ordroom }
	</c:forEach>

</body>
</html>