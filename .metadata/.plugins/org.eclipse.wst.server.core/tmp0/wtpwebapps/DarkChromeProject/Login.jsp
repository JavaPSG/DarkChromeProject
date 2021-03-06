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
	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("loginscreen", "utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);
	%>
	<div class="box1">
		<div class="context">
			<div class="icon" role="presentation" alt=""></div>
			<h1>로그인</h1>
			<p>DarkChromeProject 계정 사용</p>
			<div class="border">
				<div class="textbox">
					<form id="form" action="Login" method="post">
						<input class="idbox" type="text" name="id" placeholder="아이디 또는 이메일">
						<input class="pwdbox" type="password" name="pwd" placeholder="비밀번호">
						<div class="warningmsg">
							<%
							String rs = ((String)request.getAttribute("warningmsg"));
							rs = rs == null ? "ㅤ" : rs;
							%>
							<%=rs%>
						</div>
						<div class="side">
							<div class="register">
								<a href="./Register.jsp">계정 만들기</a>
							</div>

							<div class="login"
								onclick="document.getElementById('form').submit();">
								<p>로그인</p>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>