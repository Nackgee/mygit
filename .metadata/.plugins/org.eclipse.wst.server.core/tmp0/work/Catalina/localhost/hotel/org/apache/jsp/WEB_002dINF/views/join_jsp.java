/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2023-12-22 02:24:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/anjaehun/Desktop/spaceF/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HotelPJT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1703085759101L));
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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Host 회원 가입</title>\n");
      out.write("<style>\n");
      out.write("        h1, h2, h3, h4{\n");
      out.write("            margin-top: -5px;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto, Helvetica Neue, sans-serif;\n");
      out.write("            width: 100%;\n");
      out.write("            display: flex;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            text-align: center;\n");
      out.write("            flex-flow: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            background-color: white;\n");
      out.write("        }\n");
      out.write("        section{\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 1032px;\n");
      out.write("            height: 100%;\n");
      out.write("            text-align: left;\n");
      out.write("            padding-left: 24px;\n");
      out.write("            padding-right: 24px;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            text-decoration: underline;\n");
      out.write("            font-weight: bold;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .account{\n");
      out.write("            font-size: 32px !important;\n");
      out.write("            font-weight: 600 !important;\n");
      out.write("            line-height: 36px !important;\n");
      out.write("        }\n");
      out.write("        .title{\n");
      out.write("            margin: 8px 0 16px;\n");
      out.write("        }\n");
      out.write("        .title > span{\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        .title > span > a{\n");
      out.write("            color: black;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .info{\n");
      out.write("            width: 590px;\n");
      out.write("            height: 45px;\n");
      out.write("            padding: 23px 0;\n");
      out.write("            border-bottom: 1px solid #eee;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        .box_1{\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: flex-start;\n");
      out.write("            align-items: center;\n");
      out.write("            width: 595.33px;\n");
      out.write("        }\n");
      out.write("        .box_1 > button{\n");
      out.write("            float: right;\n");
      out.write("            color: #222;\n");
      out.write("            background-color: white;\n");
      out.write("            border: 0;\n");
      out.write("            padding: 1px;\n");
      out.write("        }\n");
      out.write("        .box_1 > button:hover{\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .box_2{\n");
      out.write("            margin-top: 4px;\n");
      out.write("            color: #717171;\n");
      out.write("            font-size: 14px;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            border: 0;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"]{\n");
      out.write("            width: 180px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]{\n");
      out.write("            background-color: black;\n");
      out.write("            color: white;\n");
      out.write("            width: 80px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            opacity: 20%;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover{\n");
      out.write("            cursor: pointer;\n");
      out.write("            opacity: 100%;\n");
      out.write("            transition-duration: 0.2s;\n");
      out.write("        }\n");
      out.write("        .hidden {\n");
      out.write("/*         	display: none; */\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        img{\n");
      out.write("        	margin: auto;\n");
      out.write("        	display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .errors{\n");
      out.write("			color: red;\n");
      out.write("			text-align: right;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		button {\n");
      out.write("		  margin: 20px;\n");
      out.write("		  outline: none;\n");
      out.write("		}\n");
      out.write("		.custom-btn {\n");
      out.write("		  width: 130px;\n");
      out.write("		  height: 40px;\n");
      out.write("		  padding: 10px 25px;\n");
      out.write("		  border: 0.5px solid gray;\n");
      out.write("		  font-family: 'Lato', sans-serif;\n");
      out.write("		  font-weight: 500;\n");
      out.write("		  background: transparent;\n");
      out.write("		  cursor: pointer;\n");
      out.write("		  transition: all 0.3s ease;\n");
      out.write("		  position: relative;\n");
      out.write("		  display: inline-block;\n");
      out.write("		}\n");
      out.write("		.btn-3 {\n");
      out.write("  line-height: 39px;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write(".btn-3:hover{\n");
      out.write("  background: transparent;\n");
      out.write("  color: #000;\n");
      out.write("}\n");
      out.write(".btn-3 span {\n");
      out.write("  position: relative;\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write(".btn-3:before,\n");
      out.write(".btn-3:after {\n");
      out.write("  position: absolute;\n");
      out.write("  content: \"\";\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  background: gray;\n");
      out.write("  transition: all 0.3s ease;\n");
      out.write("}\n");
      out.write(".btn-3:before {\n");
      out.write("  height: 0%;\n");
      out.write("  width: 2px;\n");
      out.write("}\n");
      out.write(".btn-3:after {\n");
      out.write("  width: 0%;\n");
      out.write("  height: 2px;\n");
      out.write("}\n");
      out.write(".btn-3:hover:before {\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write(".btn-3:hover:after {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write(".btn-3 span:before,\n");
      out.write(".btn-3 span:after {\n");
      out.write("  position: absolute;\n");
      out.write("  content: \"\";\n");
      out.write("  right: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  background: gray;\n");
      out.write("  transition: all 0.3s ease;\n");
      out.write("}\n");
      out.write(".btn-3 span:before {\n");
      out.write("  width: 2px;\n");
      out.write("  height: 0%;\n");
      out.write("}\n");
      out.write(".btn-3 span:after {\n");
      out.write("  width: 0%;\n");
      out.write("  height: 2px;\n");
      out.write("}\n");
      out.write(".btn-3 span:hover:before {\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write(".btn-3 span:hover:after {\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <section>\n");
      out.write("    <button class=\"custom-btn btn-3\" onclick=\"history.back()\" style=\"text-decoration-line:none;\" >\n");
      out.write("		<span> <- Go Back</span></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("  		<form id=\"authForm2\" class=\"hidden\" method=\"POST\">\n");
      out.write("\n");
      out.write("  			<img class=\"logo\" alt width=\"130\" height=\"114\"\n");
      out.write("             src=\"https://www.planit.jp/wp-content/uploads/2020/02/Transparent-Logo-300x261.png\"\n");
      out.write("              onclick=\"location.href='master'\"\n");
      out.write("              style=\"cursor: pointer;\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"info\">\n");
      out.write("                <div class=\"category_box\">\n");
      out.write("                    <div class=\"box_1\">\n");
      out.write("                        <span>Email</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box_2 lastttt\">\n");
      out.write("                        <input type=\"text\" name=\"email\" placeholder=\"メールを入力してください。\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("             <div class=\"info\">\n");
      out.write("\n");
      out.write("                <div class=\"category_box\">\n");
      out.write("                    <div class=\"box_1\">\n");
      out.write("                        <span>氏名</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box_2\">\n");
      out.write("                        <input type=\"text\" name=\"name\" placeholder=\"名前を入力してください。\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"info\">\n");
      out.write("                <div class=\"category_box\">\n");
      out.write("                    <div class=\"box_1\">\n");
      out.write("                        <span>性別</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box_2\">\n");
      out.write("                        <select name=\"gender\">\n");
      out.write("                            <option disabled selected>未定</option>\n");
      out.write("                            <option value=\"MALE\">男</option>\n");
      out.write("                            <option value=\"FEMALE\">女</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"info\">\n");
      out.write("                <div class=\"category_box\">\n");
      out.write("                    <div class=\"box_1\">\n");
      out.write("                        <span>生年月日</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box_2\">\n");
      out.write("                        <input type=\"date\" name=\"birthday\" value=\"1996-01-01\" min=\"1960-01-01\" max=\"2010-01-01\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"info\" style=\"height: 100px;\">\n");
      out.write("                <div class=\"category_box\">\n");
      out.write("                    <div class=\"box_1\">\n");
      out.write("                        <span>携帯番号</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box_2\" style=\"padding: 8px 0; width: 545px;\">\n");
      out.write("                        <input type=\"text\" id=\"telx\"  name=\"phone_num\" style=\"font-size: 15px; color:black\" placeholder=\"電話番号を入力\" required><br><br>\n");
      out.write("                        <div id=\"telCheckMessage\"></div>\n");
      out.write("                        <span>連絡先番号(予約が確定したゲストとPlan Itが連絡する番号)他の電話番号を追加し、番号別の使用目的を決めることができます。</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            <div style=\"float: right; margin-right: 220px;\">\n");
      out.write(" 	           <input type=\"submit\" value=\"登録\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"errors\">\n");
      out.write("						");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("			</div>\n");
      out.write("        </form>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/join.jsp(278,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
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
}
