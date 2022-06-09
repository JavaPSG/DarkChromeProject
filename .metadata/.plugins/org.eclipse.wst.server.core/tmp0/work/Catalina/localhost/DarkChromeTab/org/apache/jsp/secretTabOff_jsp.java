/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2022-06-08 03:24:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;

public final class secretTabOff_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"icon\" href=\"/resources/image/logo.png\">\n");
      out.write("<title>새 탭</title>\n");
      out.write("<style>\n");
      out.write("@import\n");
      out.write("	url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');\n");
      out.write("\n");
      out.write(".wrapper {\n");
      out.write("	width: 50px;\n");
      out.write("	height: 50px;\n");
      out.write("	text-align: center;\n");
      out.write("	margin: 50px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#button {\n");
      out.write("	position: absolute;;\n");
      out.write("	background-size: 0px;\n");
      out.write("	size: 0px;\n");
      out.write("	visibility: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button_label {\n");
      out.write("	position: relative;\n");
      out.write("	cursor: pointer;\n");
      out.write("	display: inline-block;\n");
      out.write("	width: 27px;\n");
      out.write("	height: 12.9px;\n");
      out.write("	background: rgb(202, 89, 70);\n");
      out.write("	border-radius: 20px;\n");
      out.write("	transition: 0.15s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("	position: absolute;\n");
      out.write("	top: -1.1px;\n");
      out.write("	left: -4px;\n");
      out.write("	display: inline-block;\n");
      out.write("	width: 16px;\n");
      out.write("	height: 16px;\n");
      out.write("	border-radius: 20px;\n");
      out.write("	background: rgb(242, 139, 130);\n");
      out.write("	transition: 0.15s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon, h1, .link {\n");
      out.write("	margin-top: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon, h1, .bulletpoints, #cookie-controls {\n");
      out.write("	margin-bottom: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("	-webkit-font-smoothing: antialiased;\n");
      out.write("	font-size: 100%;\n");
      out.write("	margin: 0;\n");
      out.write("	background-color: rgb(53, 54, 58);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content {\n");
      out.write("	margin-top: 40px;\n");
      out.write("	min-width: 240px;\n");
      out.write("	padding: 8px 48px 24px;\n");
      out.write("	background-color: rgb(53, 54, 58);\n");
      out.write("	color: rgb(234, 67, 53); /* --google-grey-200 */\n");
      out.write("	font-size: calc(100% - 2px);\n");
      out.write("	line-height: calc(100% + 6px);\n");
      out.write("	min-width: 240px;\n");
      out.write("	margin-inline-end: auto;\n");
      out.write("	margin-inline-start: auto;\n");
      out.write("	max-width: 600px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("	font-size: 22px;\n");
      out.write("	font-weight: 400;\n");
      out.write("	line-height: calc(100% + 8px);\n");
      out.write("	text-align: center;\n");
      out.write("	font-weight: 400;\n");
      out.write("	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,\n");
      out.write("		sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("	display: block;\n");
      out.write("	margin-block-start: 1em;\n");
      out.write("	margin-block-end: 1em;\n");
      out.write("	margin-inline-start: 0px;\n");
      out.write("	margin-inline-end: 0px;\n");
      out.write("	font-size: 14px;\n");
      out.write("	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,\n");
      out.write("		sans-serif;\n");
      out.write("	margin-block-start: 1em;\n");
      out.write("	margin-block-end: 1em;\n");
      out.write("	margin-inline-start: 0px;\n");
      out.write("	margin-inline-end: 0px;\n");
      out.write("	margin-bottom: 1.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("em {\n");
      out.write("	color: red;\n");
      out.write("	font-style: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".link {\n");
      out.write("	color: rgb(242, 139, 130);\n");
      out.write("	text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon {\n");
      out.write("	content:\n");
      out.write("		url(data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTIwIiBoZWlnaHQ9IjEyMCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48ZyBmaWxsPSJub25lIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiPjxwYXRoIGQ9Ik0wIDBoMTIwdjEyMEgweiIvPjxwYXRoIGQ9Ik02MCAwYzMzLjEzNyAwIDYwIDI2Ljg2MyA2MCA2MHMtMjYuODYzIDYwLTYwIDYwUzAgOTMuMTM3IDAgNjAgMjYuODYzIDAgNjAgMHptMTcuNSA2NC44MzdjLTYuNDU2IDAtMTEuODIyIDQuNTAyLTEzLjIyMiAxMC41MTYtMy4yNjctMS4zOTctNi4zLTEuMDA5LTguNTU2LS4wMzlDNTQuMjgzIDY5LjMgNDguOTE3IDY0LjgzNyA0Mi41IDY0LjgzN2MtNy41MDYgMC0xMy42MTEgNi4wOTItMTMuNjExIDEzLjU4MkMyOC44ODkgODUuOTA4IDM0Ljk5NCA5MiA0Mi41IDkyYzcuMTU2IDAgMTIuOTUtNS41MSAxMy40OTQtMTIuNDk1IDEuMTY3LS44MTUgNC4yNC0yLjMyOCA4LjAxMi4wNzhDNjQuNjI4IDg2LjUyOSA3MC4zODMgOTIgNzcuNSA5MmM3LjUwNiAwIDEzLjYxMS02LjA5MiAxMy42MTEtMTMuNTgxIDAtNy40OS02LjEwNS0xMy41ODItMTMuNjExLTEzLjU4MnptLTM1IDMuODhjNS4zNjcgMCA5LjcyMiA0LjM0NyA5LjcyMiA5LjcwMiAwIDUuMzU1LTQuMzU1IDkuNy05LjcyMiA5LjctNS4zNjcgMC05LjcyMi00LjM0NS05LjcyMi05LjcgMC01LjM1NSA0LjM1NS05LjcwMSA5LjcyMi05LjcwMXptMzUgMGM1LjM2NyAwIDkuNzIyIDQuMzQ3IDkuNzIyIDkuNzAyIDAgNS4zNTUtNC4zNTUgOS43LTkuNzIyIDkuNy01LjM2NyAwLTkuNzIyLTQuMzQ1LTkuNzIyLTkuNyAwLTUuMzU1IDQuMzU1LTkuNzAxIDkuNzIyLTkuNzAxek05NSA1N0gyNXY0aDcwdi00ek03Mi44NzQgMjkuMzRjLS44LTEuODItMi44NjYtMi43OC00Ljc4NS0yLjE0M0w2MCAyOS45MTRsLTguMTI4LTIuNzE3LS4xOTItLjA1OGMtMS45MjgtLjUzMy0zLjk1NC41MS00LjY2OSAyLjM4N0wzOC4xNDQgNTNoNDMuNzEyTDcyLjk1IDI5LjUyNnoiIGZpbGw9IiNEQURDRTAiLz48L2c+PC9zdmc+);\n");
      out.write("	height: 120px;\n");
      out.write("	width: 120px;\n");
      out.write("	margin-inline-end: auto;\n");
      out.write("	margin-inline-start: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#cookie {\n");
      out.write("	align-items: center;\n");
      out.write("	background-color: rgb(60, 64, 67); /* --google-grey-800 */\n");
      out.write("	border-radius: 4px;\n");
      out.write("	box-sizing: border-box;\n");
      out.write("	display: flex;\n");
      out.write("	padding: 12px 20px;\n");
      out.write("	padding-right: 24px;\n");
      out.write("	font-size: 14px;\n");
      out.write("	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,\n");
      out.write("		sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#cookie-description {\n");
      out.write("	flex: 1;\n");
      out.write("	padding-inline-end: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#cookie-description em {\n");
      out.write("	display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Align the two columns of bulletpoints next to each other. */\n");
      out.write("#bulletpoints-wrapper {\n");
      out.write("	display: flex;\n");
      out.write("	flex-wrap: wrap;\n");
      out.write("	justify-content: space-between;\n");
      out.write("	font-size: 14px;\n");
      out.write("	font-family: Roboto, 'Segoe UI', Arial, 'Malgun Gothic', Gulim,\n");
      out.write("		sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bulletpoints {\n");
      out.write("	flex-basis: 285px; /* (600px - 30px) / 2. */\n");
      out.write("	flex-grow: 1;\n");
      out.write("	flex-shrink: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bulletpoints.first {\n");
      out.write("	margin-inline-end: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/** Paddings and margins ---------------------------------------------------- */\n");
      out.write(".bulletpoints ul {\n");
      out.write("	margin: 4px 0 0;\n");
      out.write("	padding-inline-start: 16px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");

	Cookie cok = new Cookie("DCTCookie", URLEncoder.encode("cookieoffscreen","utf-8"));
	cok.setMaxAge(60 * 60 * 24 * 30);
	response.addCookie(cok);

      out.write("\n");
      out.write("	<div class=\"content\">\n");
      out.write("		<div class=\"icon\" role=\"presentation\" alt=\"\"></div>\n");
      out.write("		<h1>다크 모드로 전환됨</h1>\n");
      out.write("		<p>\n");
      out.write("			<span>이제 비공개로 인터넷을 탐색할 수 없으며, 이 기기를 사용하는 다른 사용자가 내 활동을 볼 수\n");
      out.write("				있습니다. 당연히 다운로드, 북마크, 읽기 목록 항목은 계속해서 유출됩니다.</span> <a\n");
      out.write("				class=\"link\"\n");
      out.write("				href=\"https://support.google.com/chrome/?p=incognito\">자세히 알아보기</a>\n");
      out.write("		</p>\n");
      out.write("		<div id=\"bulletpoints-wrapper\">\n");
      out.write("			<div class=\"bulletpoints first\">\n");
      out.write("				DarkChromeTab에서는 다음 정보를 <em>저장합니다</em>.\n");
      out.write("				<ul>\n");
      out.write("					<li>당신의 신상</li>\n");
      out.write("					<li>쿠키 및 사이트 데이터</li>\n");
      out.write("					<li>당신이 간첩이라는 사실</li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"bulletpoints\">\n");
      out.write("				다음의 관계자는 내 활동 내역을 <em>확인하고 유출합니다</em>.\n");
      out.write("				<ul>\n");
      out.write("					<li>ㅎ</li>\n");
      out.write("					<li>고용주 또는 학교</li>\n");
      out.write("					<li>인터넷 서비스 제공업체</li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"cookie\">\n");
      out.write("			<div id=\"cookie-description\">\n");
      out.write("				<em>해킹 쿠키 허용</em> 이 옵션을 사용 설정하면 사이트가 웹 전반에서 사용자를 추적하는 쿠키를 사용할 수\n");
      out.write("				있습니다. 어느 사이트에서나 사용자의 신상을 유출할 수 있습니다.\n");
      out.write("			</div>\n");
      out.write("			<form action=\"secretTabOn.jsp\" method=\"post\">\n");
      out.write("				<input class=\"wrapper\" type=\"submit\" id=\"button\"> <label\n");
      out.write("					for=\"button\" class=\"button_label\"> <span class=\"button\"></span>\n");
      out.write("				</label>\n");
      out.write("			</form>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("</body>\n");
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
