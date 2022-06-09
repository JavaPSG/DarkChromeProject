<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 탭</title>
</head>
<body>
	<%
		%>
		<jsp:forward page="secretTabFirst.jsp" />
		<%
	%>
	<%
		Cookie[] cok = request.getCookies();
		if (cok != null && cok.length > 0) {
			for (int i = 0; i < cok.length; i++) {
				if (cok[i].getName().equals("DCTCookie") && cok[i].getValue() != null) {
					switch (URLDecoder.decode(cok[i].getValue(), "utf-8")) {
					case ("cookieoffscreen"): {
	%>
	<jsp:forward page="secretTabOff.jsp" />
	<%
		break;
					}
					case ("cookieonscreen"): {
	%>
	<jsp:forward page="secretTabOn.jsp" />
	<%
		break;
					}
					}
				}

			}
	%>
	<jsp:forward page="secretTabFirst.jsp" />
	<%
		}
	%>
</body>
</html>