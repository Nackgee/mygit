/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2023-12-27 06:03:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class master_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/Users/anjaehun/Desktop/spaceF/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HotelPJT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1703085759101L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar", Long.valueOf(1703085758236L));
    _jspx_dependants.put("jar:file:/Users/anjaehun/Desktop/spaceF/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HotelPJT/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1329370132000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>福岡なら - PlanIt</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        margin-top: 0px;\n");
      out.write("        margin-bottom: 0px;\n");
      out.write("        margin-left: 0px;\n");
      out.write("        margin-right: 0px;\n");
      out.write("    }\n");
      out.write("    header {\n");
      out.write("        position: sticky;\n");
      out.write("        top: 0px;\n");
      out.write("        height: 80px;\n");
      out.write("        background: white;\n");
      out.write("        color: black;\n");
      out.write("        padding-left: 20px;\n");
      out.write("        padding-right: 20px;\n");
      out.write("        padding-top: 5px;\n");
      out.write("        padding-bottom: 0px;\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-around;\n");
      out.write("        align-items: center;\n");
      out.write("        border-bottom: 1px solid rgb(218, 209, 209);\n");
      out.write("        padding: 0px;\n");
      out.write("        margin: 0px;\n");
      out.write("        z-index: 2;\n");
      out.write("    }\n");
      out.write("    .logo:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .bnt {\n");
      out.write("        font-family: 'Nanum Gothic';\n");
      out.write("        border-radius: 25px;\n");
      out.write("        width: 350px;\n");
      out.write("        height: 43px;\n");
      out.write("        text-align: center;\n");
      out.write("        justify-content: space-around;\n");
      out.write("        display: flex;\n");
      out.write("        border: 1.3px solid rgb(235, 232, 232);\n");
      out.write("    }\n");
      out.write("    .bnt > div:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .bnt > div {\n");
      out.write("        font-size: 13px;\n");
      out.write("    }\n");
      out.write("    .login {\n");
      out.write("        color: rgb(135, 128, 128);\n");
      out.write("        font-size: small;\n");
      out.write("    }\n");
      out.write("    .login:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .login2 {\n");
      out.write("        color: rgb(135, 128, 128);\n");
      out.write("        font-size: small;\n");
      out.write("        border-radius: 25px;\n");
      out.write("        border: 1px solid rgb(135, 128, 128);\n");
      out.write("        width: 155px;\n");
      out.write("        height: 25px;\n");
      out.write("        line-height: 25px;\n");
      out.write("        text-align: center;\n");
      out.write("        margin-left: 25px;\n");
      out.write("    }\n");
      out.write("    .login2:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .midtag > div {\n");
      out.write("        border: 1.5px solid rgb(218, 209, 209);\n");
      out.write("        align-items: center;\n");
      out.write("        margin: 0px;\n");
      out.write("    }\n");
      out.write("    .midtag > div > div > div {\n");
      out.write("        border: 1px solid rgb(118, 108, 108);\n");
      out.write("    }\n");
      out.write("    div {\n");
      out.write("        display: inline-block;\n");
      out.write("        margin-left: 16px;\n");
      out.write("        font-size: 12px;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("    nav {\n");
      out.write("        display: flex;\n");
      out.write("        align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    .category {\n");
      out.write("        position: sticky;\n");
      out.write("        top: 60px;\n");
      out.write("        background: white;\n");
      out.write("        color: black;\n");
      out.write("        padding-left: 20px;\n");
      out.write("        padding-right: 20px;\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-evenly;\n");
      out.write("        align-items: center;\n");
      out.write("        padding: 0px;\n");
      out.write("        margin: 0px;\n");
      out.write("        margin-top: -30px;\n");
      out.write("        z-index: 1;\n");
      out.write("        margin-left: 0px;\n");
      out.write("        margin-right: 0px;\n");
      out.write("        border-bottom: 1px solid rgb(218, 209, 209);\n");
      out.write("        max-height: 80px;\n");
      out.write("    }\n");
      out.write("    .category > div {\n");
      out.write("        cursor: pointer;\n");
      out.write("        padding-top: 20px;\n");
      out.write("    }\n");
      out.write("    .ca:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("        border-bottom: 2.5px solid black;\n");
      out.write("    }\n");
      out.write("    .pillter {\n");
      out.write("        padding-top: 15px ;\n");
      out.write("    }\n");
      out.write("    .pillter:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .menu {\n");
      out.write("        display: flex;\n");
      out.write("        flex-flow: column;\n");
      out.write("        margin: 0px;\n");
      out.write("        border-radius: 25px;\n");
      out.write("        position: relative;\n");
      out.write("    }\n");
      out.write("    .menu > img {\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        transition: all 0.2s linear;\n");
      out.write("    }\n");
      out.write("    .menu > img:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("        transform: scale(1.05);\n");
      out.write("    }\n");
      out.write("    .menu >  div > div:hover {\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    main {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("        justify-items: center;\n");
      out.write("    }\n");
      out.write("    .wrap {\n");
      out.write("        max-width: 1700px;\n");
      out.write("        margin: auto;\n");
      out.write("        display: flex;\n");
      out.write("        flex-flow: wrap;\n");
      out.write("        justify-content: space-around;\n");
      out.write("    }\n");
      out.write("    .itemName {\n");
      out.write("        display: flex;\n");
      out.write("        margin-left: 0px;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        padding-bottom: 8px;\n");
      out.write("    }\n");
      out.write("    .itemName > div {\n");
      out.write("        font-size: medium;\n");
      out.write("    }\n");
      out.write("    .sub {\n");
      out.write("        font-size: 15px;\n");
      out.write("        color: grey;\n");
      out.write("        font-weight: lighter;\n");
      out.write("    }\n");
      out.write("    .price {\n");
      out.write("        padding-top: 15px;\n");
      out.write("        font-size: medium;\n");
      out.write("        text-align: right;\n");
      out.write("    }\n");
      out.write("    .찜 {\n");
      out.write("        font-size: 25px;\n");
      out.write("        position: absolute;\n");
      out.write("        right: 15px;\n");
      out.write("        top: 5px;\n");
      out.write("        color: rgb(236, 109, 130);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    footer {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-around;\n");
      out.write("        background-color: white;\n");
      out.write("        border-top: 1px solid rgb(218, 209, 209);\n");
      out.write("        height: 70px;\n");
      out.write("        padding-top: 5px;\n");
      out.write("        padding-bottom: 20px;\n");
      out.write("        padding-left: 100px;\n");
      out.write("        position: fixed;\n");
      out.write("        top: 91%;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .downst > div{\n");
      out.write("        font-size: smaller;\n");
      out.write("        color: rgb(163, 162, 162);\n");
      out.write("    }\n");
      out.write("    .downner {\n");
      out.write("        width: 1650px;\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        padding-right: 10px;\n");
      out.write("        border-bottom: 1px solid rgb(218, 217, 217);\n");
      out.write("        padding-top: 5px;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function removeCheck() {\n");
      out.write("	 if (confirm(\"本当にログアウトしますか。\") == true){\n");
      out.write("		 window.location.href = 'http://localhost:8080/hotel/logout';//확인\n");
      out.write("	 }\n");
      out.write("	 else{   //취소\n");
      out.write("	     return false;\n");
      out.write("	 }\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/function.js\" ></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <img class=\"logo\" alt width=\"130\" height=\"114\" src=\"https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png\"\n");
      out.write("         onclick=\"location.href='master'\" >\n");
      out.write("        <nav class=\"midtag\">\n");
      out.write("            <div class=\"bnt\">\n");
      out.write("                <div>どこでも</div>\n");
      out.write("                <div>いつでも</div>\n");
      out.write("                <div style=\"color: grey; font-size: 13px;\">福岡で</div>\n");
      out.write("                <div><img src=\"resources/img/redglass.png\" style=\"border-radius: 25px;\"></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("         ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"remocon\">\n");
      out.write("₩₩\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"category\">\n");
      out.write("\n");
      out.write("		<div onclick=\"location.href='master'\" >SHOW ALL</div>\n");
      out.write("\n");
      out.write("		<form action=\"master\" method=\"post\">\n");
      out.write("		    <input type=\"hidden\" name=\"hotel_cat\" value=\"POOL\">\n");
      out.write("		    <input type=\"image\" name=\"submit\" class=\"ca\" src=\"resources/img/pool.png\" alt=\"POOL\" width=\"80\" height=\"80\">\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("		<form action=\"master\" method=\"post\">\n");
      out.write("		    <input type=\"hidden\" name=\"hotel_cat\" value=\"BEACH\">\n");
      out.write("		    <input type=\"image\" name=\"submit\" class=\"ca\" src=\"resources/img/beach.png\" alt=\"BEACH\" width=\"80\" height=\"80\">\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("		<form action=\"master\" method=\"post\">\n");
      out.write("		    <input type=\"hidden\" name=\"hotel_cat\" value=\"SNOW\">\n");
      out.write("		    <input type=\"image\" name=\"submit\" class=\"ca\" src=\"resources/img/snow.png\" alt=\"SNOW\" width=\"80\" height=\"80\">\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("		<form action=\"master\" method=\"post\">\n");
      out.write("		    <input type=\"hidden\" name=\"hotel_cat\" value=\"KAN\">\n");
      out.write("		    <input type=\"image\" name=\"submit\" class=\"ca\" src=\"resources/img/ryokan.png\" alt=\"KAN\" width=\"80\" height=\"80\">\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("		<form action=\"master\" method=\"post\">\n");
      out.write("		    <input type=\"hidden\" name=\"hotel_cat\" value=\"SIMA\">\n");
      out.write("		    <input type=\"image\" name=\"submit\" class=\"ca\" src=\"resources/img/dockdo.png\" alt=\"SIMA\" width=\"80\" height=\"80\">\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <img class=\"pillter\" src=\"resources/img/filter.png\" alt width=\"84\" height=\"48\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    <main class=\"wrap\">\n");
      out.write("\n");
      out.write("		");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("	</main>\n");
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("    <footer>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <div class=\"downner\">\n");
      out.write("                <div>\n");
      out.write("                    <div>@ 2022 PlanIt, lnc.</div>\n");
      out.write("\n");
      out.write("                    <div>個人情報処理方針</div>\n");
      out.write("                    <div>利用規約</div>\n");
      out.write("                    <div>サイトマップ</div>\n");
      out.write("                    <div>韓国の変更された払い戻し政策</div>\n");
      out.write("                    <div>会社の詳細情報</div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <div>@ 日本語(JP)</div>\n");
      out.write("                    <div>\\ JPY</div>\n");
      out.write("                    <div>支援および参考資料</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"downst\">\n");
      out.write("                <div>웹사이트 제공자: PanIt Ireland UC, private unlimited company, 8 Hanover Quay Dublin 2, D02 DP23 Ireland | 이사: 安材訓, イソンジュン | VAT 번호: IE9827384L | 사업자 등록 번호: IE 511825 | 연락처: nackgee01@naver.com, 웹사이트, 080-4143-3261 | 호스팅 서비스 제공업체: 아마존 웹서비스 | 플랜잇은 통신판매</div>\n");
      out.write("                <div>중개자로 플랜잇 플랫폼을 통하여 게스트와 호스트 사이에 이루어지는 통신판매의 당사자가 아닙니다. 플랜잇 플랫폼을 통하여 예약된 숙소, 체험, 호스트 서비스에 관한 의무와 책임은 해당 서비스를 제공하는 호스트에게 있습니다.</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("	window.addEventListener('load', loadHandler)\n");
      out.write("	window.addEventListener('scroll' , scrollHandler)\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/master.jsp(258,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userModel }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <nav>\n");
          out.write("            <div class=\"login\">予約者情報入力</div>\n");
          out.write("            <div class=\"login2\" onclick=\"location.href='login'\">氏名 / 携帯番号</div>\n");
          out.write("        </nav>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/master.jsp(265,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty userModel }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("         <nav>\n");
          out.write("         	<div class=\"login\" onclick=\"location.href='modify'\">\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userModel.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"様</div>\n");
          out.write("			<div id=\"tblbutton\" class=\"login2\" type=\"button\" onclick=\"removeCheck()\">ログアウト</div>\n");
          out.write("		</nav>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/master.jsp(315,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("hotel");
      // /WEB-INF/views/master.jsp(315,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/master.jsp(315,2) '${hotelList }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${hotelList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("	    	<div class=\"menu\">\n");
            out.write("	            <div class=\"menu\" >\n");
            out.write("	            	\n");
            out.write("	                <a href=\"");
            if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("?name=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("	                <img class=\"menu\" src=\"resources/img/");
            if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\" alt width=\"300.8\" height=\"285.75\">\n");
            out.write("	                </a>\n");
            out.write("	                <div class=\"찜\">♥</div>\n");
            out.write("	                <br>\n");
            out.write("	                <div class=\"itemName\">\n");
            out.write("	                    <div>");
            if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</div>\n");
            out.write("	                    <div style=\"font-size: 12px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\n");
            out.write("	                </div>\n");
            out.write("	                <div class=\"sub\" style=\"font-size: 12px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.short_com1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\n");
            out.write("	                <div class=\"sub\" style=\"font-size: 12px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.short_com2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\n");
            out.write("	                <div class=\"price\"> tell) ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.phone_num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\n");
            out.write("	                <ul><br><br></ul>\n");
            out.write("	            </div>\n");
            out.write("        	</div>\n");
            out.write("\n");
            out.write("		");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/master.jsp(320,26) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/hotelPage");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/master.jsp(321,54) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.savedfile1 }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/master.jsp(326,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hotel.name }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }
}
