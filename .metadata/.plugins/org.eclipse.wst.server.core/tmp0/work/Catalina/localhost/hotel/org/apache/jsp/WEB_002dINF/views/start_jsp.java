/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2023-12-22 02:26:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>PlanIt Trip</title>\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      border: none;\r\n");
      out.write("      margin: auto;\r\n");
      out.write("      font-family: 'Arial', sans-serif;\r\n");
      out.write("      background: white;\r\n");
      out.write(";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header {\r\n");
      out.write("      background: url('background_image.jpg') center/cover no-repeat;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      padding: 0px;\r\n");
      out.write("      height: 100vh; /* Set the height of the banner to 100% of the viewport height */\r\n");
      out.write("      display: flex;\r\n");
      out.write("      flex-direction: column;\r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #logo {\r\n");
      out.write("      width: 100px; /* Adjust as needed */\r\n");
      out.write("      height: auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    h1, p {\r\n");
      out.write("      margin: 10px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #search-bar {\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      margin: 20px;\r\n");
      out.write("      width: 60%;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #featured-destinations {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: space-around;\r\n");
      out.write("      margin: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .destination {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      border: 1px solid #ccc;\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      width: 30%;\r\n");
      out.write("      background: rgba(255, 255, 255, 0.8);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #book-now-btn {\r\n");
      out.write("      background: #1EDDFF;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      padding: 15px 30px;\r\n");
      out.write("      font-size: 18px;\r\n");
      out.write("      border: none;\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #social-icons {\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .social-icon {\r\n");
      out.write("      margin: 0 10px;\r\n");
      out.write("      width: 30px;\r\n");
      out.write("      height: 30px;\r\n");
      out.write("      object-fit: cover;\r\n");
      out.write("      border-radius: 50%;\r\n");
      out.write("    }\r\n");
      out.write("     .main_image {\r\n");
      out.write("    position: relative;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("  	.main_image:hover {\r\n");
      out.write("  		cursor: pointer;\r\n");
      out.write("  	}\r\n");
      out.write("  .main_image_text {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 40%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    transform: translate( -50%, -50% );\r\n");
      out.write("    color: white;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <header>\r\n");
      out.write("    <img class=\"logo\" alt width=\"260\" height=\"228\"\r\n");
      out.write("             src=\"https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png\"\r\n");
      out.write("              onclick=\"location.href='start'\"\r\n");
      out.write("              style=\"cursor: pointer;\" >\r\n");
      out.write("    <h1>Explore the World with Us!</h1>\r\n");
      out.write("    <p>Discover Amazing Destinations and Adventures</p>\r\n");
      out.write("\r\n");
      out.write("    <input type=\"text\" id=\"search-bar\" placeholder=\"調べたい場所を入力してください。\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"featured-destinations\">\r\n");
      out.write("\r\n");
      out.write("		<p>Details</p>\r\n");
      out.write("		<div class=\"main_image\">\r\n");
      out.write("        	<img src=\"https://a.cdn-hotels.com/gdcs/production9/d1110/4de47580-21c8-445f-ad4d-f9d767f46a52.jpg?impolicy=fcrop&w=1600&h=1066&q=medium\"\r\n");
      out.write("        	 style=\"width: 160px; height: auto; border-radius: 10%;\" alt=\"Destination 1\">\r\n");
      out.write("			<h1 class=\"main_image_text\" style=\"font-size:35px\">TOKYO</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p>Details</p>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"main_image\">\r\n");
      out.write("        <img src=\"https://rimage.gnst.jp/livejapan.com/public/article/detail/a/20/00/a2000366/img/basic/a2000366_main.jpg\"\r\n");
      out.write("        	 style=\"width: 160px; height: auto; border-radius: 10%;\" alt=\"Destination 1\">\r\n");
      out.write("        	 <h1 class=\"main_image_text\" style=\"font-size:35px\">OSAKA</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("        <p>Details</p>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"main_image\" onclick=\"location.href='master'\">\r\n");
      out.write("         <img src=\"https://www.crossroadfukuoka.jp/storage/tourism_attractions/12343/responsive_images/Xe2DsFgtzeQmkTADNBhziwV6MfGNB2Ck99CIEP8g__1690_1125.jpg\"\r\n");
      out.write("        	 style=\"width: 160px; height: auto; border-radius: 10%;\" alt=\"Destination 1\">\r\n");
      out.write("        	 <h1 class=\"main_image_text\" style=\"font-size:35px\">FUKU</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p>Details</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <button id=\"book-now-btn\">Go To Japan</button>\r\n");
      out.write("\r\n");
      out.write("    <!-- <div id=\"social-icons\">\r\n");
      out.write("      <img class=\"social-icon\" src=\"facebook_icon.png\" alt=\"Facebook\">\r\n");
      out.write("      <img class=\"social-icon\" src=\"twitter_icon.png\" alt=\"Twitter\">\r\n");
      out.write("      <img class=\"social-icon\" src=\"instagram_icon.png\" alt=\"Instagram\">\r\n");
      out.write("    </div> -->\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
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
