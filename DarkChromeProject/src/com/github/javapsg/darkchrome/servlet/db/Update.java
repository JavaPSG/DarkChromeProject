package com.github.javapsg.darkchrome.servlet.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.javapsg.darkchrome.UserManager;

@WebServlet("/DarkChromeProject/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Update() {
		super();
	}

	protected void doPost1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String id, pwd;
		UserManager dao = new UserManager();
		int n = 0;

		id = request.getParameter("id");
		pwd = request.getParameter("pwd");

		n = dao.updateMember(id, pwd);

		if (n > 0)
			response.sendRedirect("/member/memberList.jsp");
	else
			out.print("<script> history.back(); </script>");
	}

}
