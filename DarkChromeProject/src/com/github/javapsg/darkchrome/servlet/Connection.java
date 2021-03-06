package com.github.javapsg.darkchrome.servlet;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.github.javapsg.darkchrome.ConnectionData;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Connection() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		ConnectionData cd = ConnectionData.getInstance();
		request.setAttribute("ip", cd.getIp());
		request.setAttribute("country", cd.getCountry());
		request.setAttribute("region", cd.getRegion());
		request.setAttribute("city", cd.getCity());
		request.setAttribute("username", InetAddress.getLocalHost().getHostName());

		ServletContext app = this.getServletContext();
		RequestDispatcher dispatcher = app.getRequestDispatcher("/SecretTabOff.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
