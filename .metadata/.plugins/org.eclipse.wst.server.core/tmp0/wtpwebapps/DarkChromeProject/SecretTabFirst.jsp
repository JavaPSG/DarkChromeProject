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
<link href="./resources/css/SecretTabFirst.css" rel="stylesheet"
	type="text/css">
<link href="./resources/css/common.css" rel="stylesheet" type="text/css">
<title>새 탭</title>
</head>
<body>
	<%
	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("cookiefirstscreen", "utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);
	%>
	<div class="content">
		<div class="icon" role="presentation" alt=""></div>
		<h1>시크릿 모드로 전환됨</h1>
		<p>
			<span>이제 비공개로 인터넷을 탐색할 수 있으며, 이 기기를 사용하는 다른 사용자가 내 활동을 볼 수
				없습니다. 하지만 다운로드, 북마크, 읽기 목록 항목은 계속해서 저장됩니다.</span> <a target='_blank' class="link"
				href="https://support.google.com/chrome/?p=incognito">자세히 알아보기</a>
		</p>
		<div id="bulletpoints-wrapper">
			<div class="bulletpoints first">
				Chrome에서는 다음 정보를 <em>저장하지 않습니다</em>.
				<ul>
					<li>방문 기록</li>
					<li>쿠키 및 사이트 데이터</li>
					<li>양식에 입력된 정보</li>
				</ul>
			</div>
			<div class="bulletpoints">
				다음의 관계자는 내 활동 내역을 <em>확인할 수도 있습니다</em>.
				<ul>
					<li>방문한 웹사이트</li>
					<li>고용주 또는 학교</li>
					<li>인터넷 서비스 제공업체</li>
				</ul>
			</div>
		</div>
		<div id="cookie">
			<div id="cookie-description">
				<em>타사 쿠키 차단</em> 이 옵션을 사용 설정하면 사이트가 웹 전반에서 사용자를 추적하는 쿠키를 사용할 수
				없습니다. 일부 사이트에서는 기능이 작동하지 않을 수 있습니다.
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