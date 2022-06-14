<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="./resources/image/favicon-red.svg">
<link href="./resources/css/Login.css" rel="stylesheet"
	type="text/css">
<link href="./resources/css/common.css" rel="stylesheet"
	type="text/css">
<title>로그인 - DarkChromeProject 계정</title>
</head>
<body>
	<%
	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("loginscreen", "utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);
	%>
	<div class="box">
	<div class="context">
	<div class="icon" role="presentation" alt=""></div>
	<h1>로그인</h1>
		<p>DarkChromeProject 계정 사용</p>
		<div class="border">
			<div class="textbox">
			<form action="Login" method="post">
			<input class="idbox" type="text" id="id" placeholder="아이디">
			<input class="pwdbox" type="password" id="pwd" placeholder="비밀번호" >
			<div class="warningmsg">
			<%
				String rs = request.getAttribute("warningmsg") == null ? "" : (String)request.getAttribute("warningmsg");
			%>
			<%= rs %>
			</div>
			<a class="registerlogin" href="">계정 만들기<input class="login" type="submit" value="로그인"></a>
			</form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>