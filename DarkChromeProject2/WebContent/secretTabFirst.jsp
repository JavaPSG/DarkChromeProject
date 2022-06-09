<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="/resources/image/logo.png">
<title>새 탭</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');

.wrapper {
	width: 50px;
	height: 50px;
	text-align: center;
	margin: 50px auto;
}

#button {
	position: absolute;;
	background-size: 0px;
	size: 0px;
	visibility: hidden;
}

.button_label {
	position: relative;
	cursor: pointer;
	display: inline-block;
	width: 27px;
	height: 12.9px;
	background: rgb(98, 130, 188);
	border-radius: 20px;
	transition: 0.15s;
}

.button {
	position: absolute;
	top: -1.5px;
	left: 15px;
	display: inline-block;
	width: 16px;
	height: 16px;
	border-radius: 20px;
	background: rgb(138, 180, 248);
	transition: 0.15s;
}

.icon, h1, .link {
	margin-top: 1.5rem;
}

.icon, h1, .bulletpoints, #cookie-controls {
	margin-bottom: 1.5rem;
}

body {
	-webkit-font-smoothing: antialiased;
	font-size: 100%;
	margin: 0;
	background-color: rgb(53, 54, 58);
}

.content {
	margin-top: 40px;
	min-width: 240px;
	padding: 8px 48px 24px;
	background-color: rgb(53, 54, 58);
	color: rgb(232, 234, 237); /* --google-grey-200 */
	font-size: calc(100% - 2px);
	line-height: calc(100% + 6px);
	min-width: 240px;
	margin-inline-end: auto;
	margin-inline-start: auto;
	max-width: 600px;
}

h1 {
	font-size: 22px;
	font-weight: 400;
	line-height: calc(100% + 8px);
	text-align: center;
	font-weight: 400;
	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,
		sans-serif;
}

p {
	display: block;
	margin-block-start: 1em;
	margin-block-end: 1em;
	margin-inline-start: 0px;
	margin-inline-end: 0px;
	font-size: 14px;
	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,
		sans-serif;
	margin-block-start: 1em;
	margin-block-end: 1em;
	margin-inline-start: 0px;
	margin-inline-end: 0px;
	margin-bottom: 1.5rem;
}

em {
	color: white;
	font-style: normal;
}

.link {
	color: rgb(138, 180, 248);
	text-decoration: none;
}

.icon {
	content:
		url(data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTIwIiBoZWlnaHQ9IjEyMCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48ZyBmaWxsPSJub25lIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiPjxwYXRoIGQ9Ik0wIDBoMTIwdjEyMEgweiIvPjxwYXRoIGQ9Ik02MCAwYzMzLjEzNyAwIDYwIDI2Ljg2MyA2MCA2MHMtMjYuODYzIDYwLTYwIDYwUzAgOTMuMTM3IDAgNjAgMjYuODYzIDAgNjAgMHptMTcuNSA2NC44MzdjLTYuNDU2IDAtMTEuODIyIDQuNTAyLTEzLjIyMiAxMC41MTYtMy4yNjctMS4zOTctNi4zLTEuMDA5LTguNTU2LS4wMzlDNTQuMjgzIDY5LjMgNDguOTE3IDY0LjgzNyA0Mi41IDY0LjgzN2MtNy41MDYgMC0xMy42MTEgNi4wOTItMTMuNjExIDEzLjU4MkMyOC44ODkgODUuOTA4IDM0Ljk5NCA5MiA0Mi41IDkyYzcuMTU2IDAgMTIuOTUtNS41MSAxMy40OTQtMTIuNDk1IDEuMTY3LS44MTUgNC4yNC0yLjMyOCA4LjAxMi4wNzhDNjQuNjI4IDg2LjUyOSA3MC4zODMgOTIgNzcuNSA5MmM3LjUwNiAwIDEzLjYxMS02LjA5MiAxMy42MTEtMTMuNTgxIDAtNy40OS02LjEwNS0xMy41ODItMTMuNjExLTEzLjU4MnptLTM1IDMuODhjNS4zNjcgMCA5LjcyMiA0LjM0NyA5LjcyMiA5LjcwMiAwIDUuMzU1LTQuMzU1IDkuNy05LjcyMiA5LjctNS4zNjcgMC05LjcyMi00LjM0NS05LjcyMi05LjcgMC01LjM1NSA0LjM1NS05LjcwMSA5LjcyMi05LjcwMXptMzUgMGM1LjM2NyAwIDkuNzIyIDQuMzQ3IDkuNzIyIDkuNzAyIDAgNS4zNTUtNC4zNTUgOS43LTkuNzIyIDkuNy01LjM2NyAwLTkuNzIyLTQuMzQ1LTkuNzIyLTkuNyAwLTUuMzU1IDQuMzU1LTkuNzAxIDkuNzIyLTkuNzAxek05NSA1N0gyNXY0aDcwdi00ek03Mi44NzQgMjkuMzRjLS44LTEuODItMi44NjYtMi43OC00Ljc4NS0yLjE0M0w2MCAyOS45MTRsLTguMTI4LTIuNzE3LS4xOTItLjA1OGMtMS45MjgtLjUzMy0zLjk1NC41MS00LjY2OSAyLjM4N0wzOC4xNDQgNTNoNDMuNzEyTDcyLjk1IDI5LjUyNnoiIGZpbGw9IiNEQURDRTAiLz48L2c+PC9zdmc+);
	height: 120px;
	width: 120px;
	margin-inline-end: auto;
	margin-inline-start: auto;
}


#cookie {
	align-items: center;
	background-color: rgb(60, 64, 67); /* --google-grey-800 */
	border-radius: 4px;
	box-sizing: border-box;
	display: flex;
	padding: 12px 20px;
	padding-right: 24px;
	font-size: 14px;
	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,
		sans-serif;
}

#cookie-description {
	flex: 1;
	padding-inline-end: 20px;
}

#cookie-description em {
	display: block;
}


/* Align the two columns of bulletpoints next to each other. */
#bulletpoints-wrapper {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	font-size: 14px;
	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,
		sans-serif;
}

.bulletpoints {
	flex-basis: 285px; /* (600px - 30px) / 2. */
	flex-grow: 1;
	flex-shrink: 0;
}

.bulletpoints.first {
	margin-inline-end: 30px;
}

/** Paddings and margins ---------------------------------------------------- */
.bulletpoints ul {
	margin: 4px 0 0;
	padding-inline-start: 16px;
}
</style>
</head>
<body>
<%
	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("cookiefirstscreen","utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);
%>
	<div class="content">
		<div class="icon" role="presentation" alt=""></div>
		<h1>시크릿 모드로 전환됨</h1>
		<p>
			<span>이제 비공개로 인터넷을 탐색할 수 있으며, 이 기기를 사용하는 다른 사용자가 내 활동을 볼 수
				없습니다. 하지만 다운로드, 북마크, 읽기 목록 항목은 계속해서 저장됩니다.</span> <a
				class="link"
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
			<form action="secretTabOff.jsp" method="post">
				<input class="wrapper" type="submit" id="button"> <label
					for="button" class="button_label"> <span class="button"></span>
				</label>
			</form>

		</div>

	</div>
</body>
</html>