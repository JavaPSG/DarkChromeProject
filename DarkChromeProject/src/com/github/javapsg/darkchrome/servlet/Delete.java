package com.github.javapsg.darkchrome.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.javapsg.darkchrome.UserManager;

@WebServlet("/DarkChromeTab/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Delete() {
		super();
	}

	protected void doGet1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();
		UserManager dao = new UserManager();
		int n = 0;
		String id = request.getParameter("id");

		n = dao.deleteMember(id);

		if (n > 0)
			response.sendRedirect("/member/memberList.jsp");
	else
			out.print("<script> alert('회원 정보 삭제를 실패 했습니다.'); </script>");
	}

}
