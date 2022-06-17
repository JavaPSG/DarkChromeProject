/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2022-06-17 00:16:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.URLEncoder");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"icon\" href=\"./resources/image/favicon-red.svg\">\r\n");
      out.write("<link href=\"./resources/css/Login.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"./resources/css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>로그인 - DarkChromeProject 계정</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

		Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("registerscreen", "utf-8"));
		cok.setMaxAge(60 * 60 * 24 * 30);
		response.addCookie(cok);
	
      out.write("\r\n");
      out.write("	<div class=\"box2\">\r\n");
      out.write("		<div class=\"context\">\r\n");
      out.write("			<div class=\"icon\" role=\"presentation\" alt=\"\"></div>\r\n");
      out.write("			<h1>회원가입</h1>\r\n");
      out.write("			<p>DarkChromeProject 계정 가입</p>\r\n");
      out.write("			<div class=\"border\">\r\n");
      out.write("				<div class=\"textbox\">\r\n");
      out.write("					<form id=\"form\" action=\"Register\" method=\"post\">\r\n");
      out.write("						<input class=\"idbox\" type=\"text\" name=\"nick\" placeholder=\"닉네임\">\r\n");
      out.write("						<input class=\"pwdbox\" type=\"text\" name=\"id\" placeholder=\"아이디 또는 이메일\">\r\n");
      out.write("						<input class=\"pwdbox\" type=\"password\" name=\"pwd1\" placeholder=\"비밀번호\">\r\n");
      out.write("						<input class=\"pwdbox\" type=\"password\" name=\"pwd2\" placeholder=\"비밀번호 확인\">\r\n");
      out.write("						<div class=\"warningmsg\">\r\n");
      out.write("							");

							String rs = ((String)request.getAttribute("warningmsg"));
							rs = rs == null ? "ㅤ" : rs;
							
      out.write("\r\n");
      out.write("							");
      out.print(rs);
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"side\">\r\n");
      out.write("							<div class=\"register\" >\r\n");
      out.write("								<a href=\"./Login.jsp\">로그인하기</a>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"login\" onclick=\"document.getElementById('form').submit();\">\r\n");
      out.write("								<p>회원가입</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
