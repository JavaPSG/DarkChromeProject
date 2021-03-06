<%@page import="java.net.URLEncoder"%>
<%@page import="org.jsoup.*"%>
<%@page import="com.google.gson.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="./resources/image/favicon-gray.svg">
<link href="./resources/css/SecretTabOn.css" rel="stylesheet"
	type="text/css">
<link href="./resources/css/common.css" rel="stylesheet" type="text/css">
<title>새 탭</title>
</head>
<body>
	<%
	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("cookieonscreen", "utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);
	%>
	<div class="content">
		<div class="icon" role="presentation" alt=""></div>
		<h1>어이쿠! 여기가 아니라고~?</h1>
		<p>
			<span>호기심도 많네. 원래대로 돌아가는건 구현하지않았다고~ 방금 화면으로 가고 싶다면 타사 쿠키 차단 버튼을 다시 눌러줘! 만약 이 웹의 정보를 보고 싶다면 아래를 봐줘!</span> <a target='_blank' class="link"
				href="https://genshin.hoyoverse.com/ko/">오늘의 추천게임</a>
		</p>
		<div id="bulletpoints-wrapper">
			<div class="bulletpoints first">
				<em>기여자 목록</em>
				<ul>
					<li>박승준</li>
					<li>김요한</li>
					<li>김승준</li>
				</ul>
			</div>
			<div class="bulletpoints">
				<em>사용된 라이브러리</em>
				<ul>
					<li><a target='_blank' class="link" href="https://github.com/realityforge/javax.annotation">Javax Annotation</a></li>
					<li><a target='_blank' class="link" href="https://github.com/jhy/jsoup">Jsoup</a></li>
					<li><a target='_blank' class="link" href="https://github.com/google/gson">Google Gson</a></li>
				</ul>
			</div>
		</div>
		<div id="cookie">
			<div id="cookie-description">
				<em>타사 쿠키 차단</em> 버튼을 다시 눌러서 원래 화면으로 돌아가도록 하자! 이 웹은 브라우저를 껐다켜도 있던 페이지 위치를 기억하고 있다고!
			</div>
			<form action="Connection" method="post">
				<input class="wrapper" type="submit" id="button"> <label
					for="button" class="button_label"> <span class="button"></span>
				</label>
			</form>

		</div>

	</div>
</body>
</html>