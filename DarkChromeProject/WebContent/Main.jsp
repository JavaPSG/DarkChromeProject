<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul>
			<li>IP: <%=request.getAttribute("ip")%></li>
			<li>주소: <%=request.getAttribute("country")%> <%=request.getAttribute("region")%>
				<%=request.getAttribute("city")%></li>
			<li>디바이스: <%=request.getAttribute("username")%></li>
		</ul>
	</div>
</body>
</html>