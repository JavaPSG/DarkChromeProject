
<%@page import="java.net.InetAddress"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.jsoup.*"%>
<%@page import="com.google.gson.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="./resources/image/favicon-red.svg">
<link href="./resources/css/SecretTabOff.css" rel="stylesheet"
	type="text/css">
<link href="./resources/css/common.css" rel="stylesheet"
	type="text/css">
<title>새 탭</title>
</head>
<body>
	<%
	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("cookieoffscreen", "utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);
	%>
	<div class="content">
		<div class="icon" role="presentation" alt=""></div>
		<h1>다크 모드로 전환됨</h1>
		<p>
			<span>이제 비공개로 인터넷을 탐색할 수 없으며, 이 기기를 사용하는 다른 사용자가 내 활동을 볼 수
				있습니다. 당연히 다운로드, 북마크, 읽기 목록 항목은 계속해서 유출됩니다.</span> <a target='_blank' class="link"
				href="https://support.google.com/chrome/?p=incognito">자세히 알아보기</a>
		</p>
		<div id="bulletpoints-wrapper">
			<div class="bulletpoints first">
				DarkChromeProject에서는 다음 정보를 <em>저장했습니다</em>.
				<ul>
					<li>IP: <%=request.getAttribute("ip")%></li>
					<li>주소: <%=request.getAttribute("country")%> <%=request.getAttribute("region")%>
						<%=request.getAttribute("city")%></li>
					<li>디바이스: <%=request.getAttribute("username")%></li>
				</ul>
			</div>
			<div class="bulletpoints">
				다음의 관계자는 내 활동 내역을 <em>확인하고 유출합니다</em>.
				<ul>
					<li>개발자</li>
					<li>학교</li>
					<li>당신의 옆 사람</li>
				</ul>
			</div>
		</div>
		<div id="cookie">
			<div id="cookie-description">
				<em>해킹 쿠키 허용</em> 이 옵션을 사용 설정하면 사이트가 웹 전반에서 사용자를 추적하는 쿠키를 사용할 수
				있습니다. 어느 사이트에서나 사용자의 신상을 유출할 수 있습니다.
			</div>
			<form action="SecretTabOn.jsp" method="post">
				<input class="wrapper" type="submit" id="button"> <label
					for="button" class="button_label"> <span class="button"></span>
				</label>
			</form>
		</div>
		<div onclick="location.href='Login.jsp'" class="common1_button">
			<p>시작하기</p>
		</div>
	</div>
</body>
</html>