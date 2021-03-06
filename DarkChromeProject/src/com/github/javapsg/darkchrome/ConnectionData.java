package com.github.javapsg.darkchrome;

public class ConnectionData {
	
	private ConnectionData() {
	}

	private static class InnerInstanceClazz {
		private static final ConnectionData instance = new ConnectionData();
	}

	public static ConnectionData getInstance() {
		return ConnectionData.InnerInstanceClazz.instance;
	}

	private String ip;
	private String country;
	private String region;
	private String city;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
