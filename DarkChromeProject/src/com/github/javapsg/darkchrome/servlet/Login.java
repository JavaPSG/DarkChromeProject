package com.github.javapsg.darkchrome.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.javapsg.darkchrome.ConnectionData;
import com.github.javapsg.darkchrome.Result;
import com.github.javapsg.darkchrome.UserManager;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		for (String object : Arrays.asList(request.getParameter("id"),request.getParameter("pwd"))) {
			if (object.isEmpty()) {
				request.setAttribute("warningmsg", "비어있는 입력 란이 있습니다.");
				ServletContext app = this.getServletContext();
				RequestDispatcher dispatcher = app.getRequestDispatcher("/Login.jsp");
				try {
					dispatcher.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				}
				return;
			}
		}
		Result result = new UserManager().getMemberPwd((String)request.getAttribute("id"), (String)request.getAttribute("pwd"));
		switch (result) {
		case TRUE:
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
			RequestDispatcher dispatcher = app.getRequestDispatcher("/Main.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
			break;
		case FALSE:
			request.setAttribute("warningmsg", "잘못된 비밀번호입니다.");
			break;

		default:
			request.setAttribute("warningmsg", "존재하지 않는 아이디입니다.");
			break;
		}
		ServletContext app = this.getServletContext();
		RequestDispatcher dispatcher = app.getRequestDispatcher("/Login.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

}
