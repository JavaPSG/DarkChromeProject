package com.github.javapsg.darkchrome.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;

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
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		for (String object : Arrays.asList(request.getParameter("nick"),request.getParameter("id"),request.getParameter("pwd1"),request.getParameter("pwd2"))) {
			if (object.isEmpty()) {
				request.setAttribute("warningmsg", "비어있는 입력 란이 있습니다.");
				ServletContext app = this.getServletContext();
				RequestDispatcher dispatcher = app.getRequestDispatcher("/Register.jsp");
				try {
					dispatcher.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				}
				return;
			}
		}
		Result result = new UserManager().getMemberPwd((String)request.getParameter("id"), (String)request.getParameter("pwd"));
		Result result2 = new UserManager().getMember((String)request.getParameter("nick"), (String)request.getParameter("id"));
		if (result2 == Result.TRUE) {
			request.setAttribute("warningmsg", "이미 존재하는 계정입니다.");
			ServletContext app = this.getServletContext();
			RequestDispatcher dispatcher = app.getRequestDispatcher("/Register.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
			return;
		}
		
		switch (result) {
		case TRUE:{
			request.setAttribute("warningmsg", "이미 존재하는 계정입니다.");
			break;
		}
		default:
			if (!request.getParameter("pwd1").equals(request.getParameter("pwd2"))) {
				request.setAttribute("warningmsg", "비밀번호를 다시 확인해주세요");
				ServletContext app = this.getServletContext();
				RequestDispatcher dispatcher = app.getRequestDispatcher("/Register.jsp");
				try {
					dispatcher.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				}
				return;
			}
		}
		new UserManager().insertMember(request.getParameter("nick"), request.getParameter("id"), request.getParameter("pwd1"));
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
		return;
	}

}
