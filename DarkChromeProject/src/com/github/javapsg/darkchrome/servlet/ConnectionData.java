package com.github.javapsg.darkchrome.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.javapsg.darkchrome.ConnectionDataManager;

@WebServlet("/ConnectionData")
public class ConnectionData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConnectionData() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		ConnectionDataManager cdm = new ConnectionDataManager();

		request.setAttribute("ip", cdm.getIp());
		request.setAttribute("country", cdm.getCountry());
		request.setAttribute("region", cdm.getRegion());
		request.setAttribute("city", cdm.getCity());
		request.setAttribute("username", request.getRemoteHost());

		ServletContext app = this.getServletContext();
		RequestDispatcher dispatcher = app.getRequestDispatcher("/SecretTabOff.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
