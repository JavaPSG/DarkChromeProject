<%@page import="com.github.javapsg.darkchrome.ConnectionData"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="org.jsoup.*"%>
<%@page import="com.google.gson.*"%>
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
		Document doc1 = Jsoup.connect("https://api.ip.pe.kr/json/").ignoreContentType(true).get();
		String param1 = doc1.text();
		JsonParser parser1 = new JsonParser();
		JsonElement element1 = parser1.parse(param1);

		Document doc2 = Jsoup.connect("http://ip-api.com/json/" + element1.getAsJsonObject().get("ip").getAsString()
				+ "?fields=country,regionName,city").ignoreContentType(true).get();
		String param2 = doc2.text();
		JsonParser parser2 = new JsonParser();
		JsonElement element2 = parser2.parse(param2);

		ConnectionData cd = ConnectionData.getInstance();
		cd.setIp(element1.getAsJsonObject().get("ip").getAsString());
		cd.setCountry(element1.getAsJsonObject().get("country_name").getAsJsonObject().get("ko").getAsString());
		cd.setRegion(element2.getAsJsonObject().get("regionName").getAsString());
		cd.setCity(element2.getAsJsonObject().get("city").getAsString());
		Cookie[] cok = request.getCookies();
		if (cok != null && cok.length > 0) {
			for (int i = 0; i < cok.length; i++) {
				if (cok[i].getName().equals("DCTCookie") && cok[i].getValue() != null) {
					switch (URLDecoder.decode(cok[i].getValue(), "utf-8")) {
					case ("cookieoffscreen"): {
	%>
	<jsp:forward page="SecretTabOff.jsp" />
	<%
		break;
					}
					case ("cookieonscreen"): {
	%>
	<jsp:forward page="SecretTabOn.jsp" />
	<%
		break;
					}
					case ("cookiefirstscreen"): {
	%>
	<jsp:forward page="SecretTabFirst.jsp" />
	<%
		}
		default: {
			%>
			<jsp:forward page="SecretTabFirst.jsp" />
			<%
		}
					
					}
				}
				else{
					%>
					<jsp:forward page="SecretTabFirst.jsp" />
					<%
				}

			}
		}
	%>
</body>
</html>