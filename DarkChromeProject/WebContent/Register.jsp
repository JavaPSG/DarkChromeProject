<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="./resources/image/favicon-red.svg">
<link href="./resources/css/Login.css" rel="stylesheet" type="text/css">
<link href="./resources/css/common.css" rel="stylesheet" type="text/css">
<title>로그인 - DarkChromeProject 계정</title>
</head>
<body>
	<%
		Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("registerscreen", "utf-8"));
		cok.setMaxAge(60 * 60 * 24 * 30);
		response.addCookie(cok);
	%>
	<div class="box">
		<div class="context">
			<div class="icon" role="presentation" alt=""></div>
			<h1>회원가입</h1>
			<p>DarkChromeProject 계정 가입</p>
			<div class="border">
				<div class="textbox">
					<form id="form" action="Register" method="post">
						<input class="idbox" type="text" id="id" placeholder="아이디">
						<input class="pwdbox" type="password" id="pwd" placeholder="비밀번호">
						<div class="warningmsg">
							<%
								String rs = request.getAttribute("warningmsg") == null ? "" : (String) request.getAttribute("warningmsg");
							%>
							<%=rs%>
						</div>
						<div class="side">
							<div class="register" >
								<a href="./Login.jsp">로그인하기</a>
							</div>

							<div class="login" onclick="document.getElementById('form').submit();">
								<p>회원가입</p>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>