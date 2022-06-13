package com.github.javapsg.darkchrome;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConnectionDataManager {
	public ConnectionDataManager() throws IOException {
		Document doc1 = Jsoup.connect("https://api.ip.pe.kr/json/").ignoreContentType(true).get();
		String param1 = doc1.text();
		System.out.print(param1);

		JsonParser parser1 = new JsonParser();
		JsonElement element1 = parser1.parse(param1);
		JsonElement countryJ = element1.getAsJsonObject().get("country_name").getAsJsonArray().getAsJsonObject().get("ko");

		Document doc2 = Jsoup.connect("http://ip-api.com/json/" + ipJ.getAsString() + "?fields=country,regionName,city")
				.ignoreContentType(true).get();
		String param2 = doc2.text();
		System.out.print(param2);
		
		JsonParser  parser2  = new JsonParser();
		JsonElement element2 = parser2.parse(param1);
		JsonElement regionJ = element2.getAsJsonObject().get("regionName");
		JsonElement cityJ = element2.getAsJsonObject().get("city");

		ip = element1.getAsJsonObject().get("ip").getAsString();
		country = element2.getAsJsonObject().get("regionName").getAsString();
		region = element2.getAsJsonObject().get("regionName").getAsString();
		city =  element2.getAsJsonObject().get("city").getAsString();
	}

	private static String ip;
	private static String country;
	private static String region;
	private static String city;

	public String getIp() {
		return ip;
	}

	public String string() {
		return country;
	}

	public String getRegion() {
		return region;
	}

	public String getCity() {
		return city;

	}
	
	public String getCountry() {
		return country;

	}
}
