/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-18 09:13:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<!--样式引入-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/static/style/bootstrap.css\" />\r\n");
      out.write("\t\t<!--菜单效果需引入,缩放-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/static/style/jquery.mmenu.css\" />\r\n");
      out.write("\t\t<!--主要样式-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/static/style/style.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/static/style/index.css\" />\r\n");
      out.write("\t\t<title>泰格兔电商平台</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!--顶部内容-->\r\n");
      out.write("\t\t<div class=\"navbar\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<!--菜单收放-->\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-actions navbar-left\">\r\n");
      out.write("\t\t\t\t\t<li class=\"visible-md visible-lg\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html#\" id=\"main-menu-toggle\"><i class=\"glyphicon glyphicon-th-large\"></i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"visible-xs visible-sm\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html#\" id=\"sidebar-menu\"><i class=\"glyphicon glyphicon-th-list\"></i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!--搜索-->\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-left\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"glyphicon glyphicon-search\"></button>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"搜索...\"></a>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<!--工具按钮-->\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown visible-md visible-lg\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-cog\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void()\"><i class=\"glyphicon glyphicon-user\"></i>个人信息</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void()\"><i class=\"glyphicon glyphicon-plane\"></i> 重置密码</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:void()\"><i class=\"glyphicon glyphicon-off\"></i>注销</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown visible-md visible-lg\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"user-avatar\" src=\"/static/images/avatar.jpg\" alt=\"user-mail\"> admin\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascritp:void()\"><i class=\"glyphicon glyphicon-off\"></i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--侧边菜单-->\r\n");
      out.write("\t\t<div class=\"container-fluid content\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<!--主菜单-->\r\n");
      out.write("\t\t\t\t<div class=\"sidebar \">\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-header t-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<span><img class=\"text-logo\" src=\"/static/images/logo.png\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a id=\"welcome\" url=\"welcome.html\" href=\"javascript:void()\"><i class=\"glyphicon glyphicon-plane\"></i><span class=\"h4\">控制台</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-cog\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text\">系统管理</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-down pull-right\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a id=\"usermanager\" href=\"javascript:void()\" url=\"usermanager.html\"><i class=\"glyphicon glyphicon-user\"></i><span class=\"text\">用户管理</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a id=\"deptmanager\" href=\"javascript:void()\" url=\"deptmanager.html\"><i class=\"glyphicon glyphicon-apple\"></i><span class=\"text\">部门管理</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"text\">商品管理</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-down pull-right\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a id=\"goodsClassManager\" href=\"javascript:void()\" url=\"/goodsClass/index\"><i class=\"glyphicon glyphicon-tree-deciduous\"></i><span class=\"text\">分类管理</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a id=\"goodsTypeManager\" href=\"javascript:void()\" url=\"/goodsType/index\"><i class=\"glyphicon glyphicon-tasks\"></i><span class=\"text\">类型管理</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a id=\"goodsManager\" href=\"javascript:void()\" url=\"/goods/index\"><i class=\"glyphicon glyphicon-tree-conifer\"></i><span class=\"text\">商品管理</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--菜单底部-->\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-footer mm-panel mm-hidden\" id=\"mm-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar-brand\">\r\n");
      out.write("\t\t\t\t\t\t\t泰格兔电商平台\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sidebar-terms\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html#\">团队</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html#\">联系</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html#\">说明</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.html#\">关于</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"copyright text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<small>泰格兔 <i class=\"glyphicon glyphicon-leaf\"></i></small>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--内容区-->\r\n");
      out.write("\t\t\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t\t\t<!--内容区-->\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- Tab面板 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t<!--js脚本引入 菜单折叠必须引入2.1.1版本-->\r\n");
      out.write("\t\t\t\t<script src=\"/static/js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript \" src=\"/static/js/bootstrap.js \"></script>\r\n");
      out.write("\t\t\t\t<!--<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>-->\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"/static/js/jquery.mmenu.min.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"/static/js/core.min.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"application/javascript\">\r\n");
      out.write("\t\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\t\taddTab($(\"#welcome\"));\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$(\"#usermanager\").click(function() {\r\n");
      out.write("\t\t\t\t\t\taddTab($(this))\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$(\"#deptmanager\").click(function() {\r\n");
      out.write("\t\t\t\t\t\taddTab($(this));\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#goodsClassManager\").click(function(){\r\n");
      out.write("\t\t\t\t\t\taddTab($(this));\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t$(\"#goodsTypeManager\").click(function(){\r\n");
      out.write("\t\t\t\t\t\taddTab($(this));\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#goodsManager\").click(function(){\r\n");
      out.write("\t\t\t\t\t\taddTab($(this));\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar num = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfunction addTab(obj) {\r\n");
      out.write("\t\t\t\t\t\tvar flag = false;\r\n");
      out.write("\t\t\t\t\t\tvar curItem;\r\n");
      out.write("\t\t\t\t\t\t//查找元素\r\n");
      out.write("\t\t\t\t\t\t$(\"ul.nav.nav-tabs\").find(\"a\").each(function() {\r\n");
      out.write("\t\t\t\t\t\t\tif($(this).text().trim() == obj.text().trim()) {\r\n");
      out.write("\t\t\t\t\t\t\t\tcurItem=$(this);\r\n");
      out.write("\t\t\t\t\t\t\t\tflag = true;\r\n");
      out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t//移除所有子元素的active样式\r\n");
      out.write("\t\t\t\t\t\t$(\"ul.nav.nav-tabs\").children().removeClass(\"active\");\r\n");
      out.write("\t\t\t\t\t\t//移除内容页的active样式\r\n");
      out.write("\t\t\t\t\t\t$(\".tab-content\").children().removeClass(\"active\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(flag) {\r\n");
      out.write("\t\t\t\t\t\t\tcurItem.parent().addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t$(\"div.tab-content\").find('#' + curItem.attr(\"aria-controls\")).addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t//生成选项卡ID与名字\r\n");
      out.write("\t\t\t\t\t\tvar tabId = 'tab' + num++;\r\n");
      out.write("\t\t\t\t\t\tvar tabName = obj.text();\r\n");
      out.write("\t\t\t\t\t\tvar txtTitle;\r\n");
      out.write("\t\t\t\t\t\tif(tabName.trim() == \"控制台\") {\r\n");
      out.write("\t\t\t\t\t\t\t//添加新增的选项卡并激活\r\n");
      out.write("\t\t\t\t\t\t\t txtTitle = '<li role=\\\"presentation\\\" class=\\\"active\\\"><a href=\\\"#' + tabId + '\\\" aria-controls=\\\"' + tabId + '\\\" role=\"tab\" data-toggle=\"tab\">' + tabName + '</a></li>';\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t//添加新增的选项卡并激活\r\n");
      out.write("\t\t\t\t\t\t\t txtTitle = '<li role=\\\"presentation\\\" class=\\\"active\\\"><a href=\\\"#' + tabId + '\\\" aria-controls=\\\"' + tabId + '\\\" role=\"tab\" data-toggle=\"tab\">' + tabName + ' <i onclick=\\\"closeTab(this)\\\" class=\\\"glyphicon glyphicon-remove\\\"></i></a></li>';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"ul.nav.nav-tabs\").append(txtTitle);\r\n");
      out.write("\t\t\t\t\t\tvar txtContext = \"<div role=\\\"tabpanel\\\" class=\\\"tab-pane active\\\" id=\\\"\" + tabId + \"\\\"></div>\";\r\n");
      out.write("\t\t\t\t\t\t$(\"div.tab-content\").append(txtContext);\r\n");
      out.write("\t\t\t\t\t\t//加载数据\r\n");
      out.write("\t\t\t\t\t\t$(\"#\" + tabId).load(obj.attr(\"url\"));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t//关闭选项卡\r\n");
      out.write("\t\t\t\t\tfunction closeTab(obj) {\r\n");
      out.write("\t\t\t\t\t\t//先判断当前要关闭的tab选项卡有没有active类，再判断当前选项卡是否最后一个，\r\n");
      out.write("\t\t\t\t\t\t//如果是则给前一个选项卡以及内容添加active，否则给下一个添加active类\r\n");
      out.write("\t\t\t\t\t\tvar gParent = $(obj).parent().parent();\r\n");
      out.write("\t\t\t\t\t\t//获取父类对象\r\n");
      out.write("\t\t\t\t\t\tparent = $(obj).parent();\r\n");
      out.write("\t\t\t\t\t\t//如果父类有active\r\n");
      out.write("\t\t\t\t\t\tif(gParent.hasClass('active')) {\r\n");
      out.write("\t\t\t\t\t\t\t//当前是否是最后一个\r\n");
      out.write("\t\t\t\t\t\t\tif(gParent.index() == gParent.length) {\r\n");
      out.write("\t\t\t\t\t\t\t\tnum = 0;\r\n");
      out.write("\t\t\t\t\t\t\t\t//给前一个选项卡添加active\r\n");
      out.write("\t\t\t\t\t\t\t\tgParent.prev().addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t\t//激活前一个内容选项卡\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"div.tab-content\").find('#' + parent.attr(\"aria-controls\")).prev().addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t//激活下一个\r\n");
      out.write("\t\t\t\t\t\t\t\tgParent.prev().addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t\t//激活下一个内容选项卡\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"div.tab-content\").find('#' + parent.attr(\"aria-controls\")).prev().addClass('active');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t//移除选项卡\r\n");
      out.write("\t\t\t\t\t\t\tgParent.remove();\r\n");
      out.write("\t\t\t\t\t\t\t//删除内容页\r\n");
      out.write("\t\t\t\t\t\t\t$(\"div.tab-content\").find('#' + parent.attr(\"aria-controls\")).remove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t</body>\r\n");
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
