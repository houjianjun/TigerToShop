/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-25 06:02:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1514181724947L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>登录</title>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link href=\"/static/AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/style/loginstyle.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"login-banner\">\r\n");
      out.write("\t\t<div class=\"login-main\">\r\n");
      out.write("\t\t\t<div class=\"login-box\">\r\n");
      out.write("\t\t\t\t<h3 class=\"title\">登录商城</h3>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"login-form\">\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"user-name\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"user\"><i class=\"am-icon-user\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" name=\"\" id=\"user\" placeholder=\"邮箱/手机/用户名\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"user-pass\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\"><i class=\"am-icon-lock\"></i></label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" name=\"\" id=\"password\" placeholder=\"请输入密码\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--注册-->\r\n");
      out.write("\t\t<div class=\"login-links\">\r\n");
      out.write("\t\t\t<label for=\"remember-me\"><input id=\"remember-me\"\r\n");
      out.write("\t\t\t\ttype=\"checkbox\">记住密码</label> <a href=\"#\" class=\"am-fr\">忘记密码</a> <a\r\n");
      out.write("\t\t\t\thref=\"register.html\" class=\"zcnext am-fr am-btn-default\">注册</a> <br />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-cf\">\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"\" value=\"登 录\"\r\n");
      out.write("\t\t\t\tclass=\"am-btn am-btn-primary am-btn-sm\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"partner\">\r\n");
      out.write("\t\t\t<h3>合作账号</h3>\r\n");
      out.write("\t\t\t<div class=\"am-btn-group\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"am-icon-qq am-icon-sm\"></i><span>QQ登录</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"am-icon-weibo am-icon-sm\"></i><span>微博登录</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"am-icon-weixin am-icon-sm\"></i><span>微信登录</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!--版权区-->\r\n");
      out.write("<div class=\"footer \">\r\n");
      out.write("\t<div class=\"footer-hd \">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"# \">迅腾伟业</a> <b>|</b> <a href=\"# \">商城首页</a> <b>|</b> <a\r\n");
      out.write("\t\t\t\thref=\"# \">支付宝</a> <b>|</b> <a href=\"# \">物流</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer-bd \">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"javascript:void()\">关于迅腾</a> <a href=\"javascript:void()\">合作伙伴</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void()\">联系我们</a> <a href=\"javascript:void()\">网站地图</a>\r\n");
      out.write("\t\t\t<em>© 2015-2025 xtwy.com 版权所有. </em>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}