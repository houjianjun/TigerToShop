/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-25 06:03:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1513857579481L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1514181724947L));
    _jspx_dependants.put("/WEB-INF/views/bottomNav.jsp", Long.valueOf(1514181728435L));
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<title>泰格兔电商平台</title>\r\n");
      out.write("\r\n");
      out.write("<!--轮播图样式-->\r\n");
      out.write("<link href=\"/static/AmazeUI-2.4.2/assets/css/amazeui.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"/static/AmazeUI-2.4.2/assets/css/admin.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<!--小导航样式-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/style/tigertostyle.css\" />\r\n");
      out.write("<!--主样式-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/style/front.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div class=\"hmtop\">\r\n");
      out.write("\t<!--顶部导航条 -->\r\n");
      out.write("\t<div class=\"am-container header\">\r\n");
      out.write("\t\t<ul class=\"message-l\">\r\n");
      out.write("\t\t\t<div class=\"topMessage\">\r\n");
      out.write("\t\t\t\t<div class=\"menu-hd\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" target=\"_top\" class=\"h\">亲，请登录</a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"_top\">免费注册</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"message-r\">\r\n");
      out.write("\t\t\t<div class=\"topMessage home\">\r\n");
      out.write("\t\t\t\t<div class=\"menu-hd\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/\" target=\"_top\" class=\"h\">商城首页</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"topMessage my-shangcheng\">\r\n");
      out.write("\t\t\t\t<div class=\"menu-hd MyShangcheng\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" target=\"_top\"><i class=\"am-icon-user am-icon-fw\"></i>个人中心</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"topMessage mini-cart\">\r\n");
      out.write("\t\t\t\t<div class=\"menu-hd\">\r\n");
      out.write("\t\t\t\t\t<a id=\"mc-menu-hd\" href=\"#\" target=\"_top\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"am-icon-shopping-cart  am-icon-fw\"></i><span>购物车</span><strong\r\n");
      out.write("\t\t\t\t\t\tid=\"J_MiniCartNum\" class=\"h\">0</strong></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"topMessage favorite\">\r\n");
      out.write("\t\t\t\t<div class=\"menu-hd\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" target=\"_top\"><i class=\"am-icon-heart am-icon-fw\"></i><span>收藏夹</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--悬浮搜索框-->\r\n");
      out.write("\t<div class=\"nav white\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<img src=\"/static/images/logo.png\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"logoBig\">\r\n");
      out.write("\t\t\t<li><img style=\"width: 48px;\" src=\"/static/images/logo.png\" /></li>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"search-bar pr\">\r\n");
      out.write("\t\t\t<a name=\"index_none_header_sysc\" href=\"#\"></a>\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<input id=\"searchInput\" name=\"index_none_header_sysc\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"搜索\" autocomplete=\"off\"> <input\r\n");
      out.write("\t\t\t\t\tid=\"ai-topsearch\" class=\"submit am-btn\" value=\"搜索\" index=\"1\"\r\n");
      out.write("\t\t\t\t\ttype=\"submit\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--轮播区-->\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"am-slider am-slider-default scoll\" data-am-flexslider\r\n");
      out.write("\t\t\tid=\"demo-slider-0\">\r\n");
      out.write("\t\t\t<ul class=\"am-slides\">\r\n");
      out.write("\t\t\t\t<li class=\"banner1\"><a href=\"\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/static/images/ad1.jpg\" /></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"banner2\"><a><img src=\"/static/images/ad2.jpg\" /></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"banner3\"><a><img src=\"/static/images/ad3.jpg\" /></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"banner4\"><a><img src=\"/static/images/ad4.jpg\" /></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--小导航 -->\r\n");
      out.write("\t<div class=\"am-g am-g-fixed smallnav\">\r\n");
      out.write("\t\t<div class=\"am-u-sm-3\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void()\"><img\r\n");
      out.write("\t\t\t\tsrc=\"/static/images/navsmall.jpg\" />\r\n");
      out.write("\t\t\t\t<div class=\"title\">商品分类</div> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-u-sm-3\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void()\"><img\r\n");
      out.write("\t\t\t\tsrc=\"/static/images/huismall.jpg\" />\r\n");
      out.write("\t\t\t\t<div class=\"title\">大聚惠</div> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-u-sm-3\">\r\n");
      out.write("\t\t\t<a href=\"#javascript:void()\"><img\r\n");
      out.write("\t\t\t\tsrc=\"/static/images/mansmall.jpg\" />\r\n");
      out.write("\t\t\t\t<div class=\"title\">个人中心</div> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-u-sm-3\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void()\"><img\r\n");
      out.write("\t\t\t\tsrc=\"/static/images/moneysmall.jpg\" />\r\n");
      out.write("\t\t\t\t<div class=\"title\">投资理财</div> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--热门活动 -->\r\n");
      out.write("\t<div class=\"am-container activity \">\r\n");
      out.write("\t\t<div class=\"shopTitle \">\r\n");
      out.write("\t\t\t<h4>活动</h4>\r\n");
      out.write("\t\t\t<h3>每期活动 优惠享不停</h3>\r\n");
      out.write("\t\t\t<span class=\"more \"> <a href=\"# \">全部活动<i\r\n");
      out.write("\t\t\t\t\tclass=\"am-icon-angle-right\" style=\"padding-left: 10px;\"></i></a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-g am-g-fixed \">\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-3 \">\r\n");
      out.write("\t\t\t\t<div class=\"icon-sale one \"></div>\r\n");
      out.write("\t\t\t\t<h4>秒杀</h4>\r\n");
      out.write("\t\t\t\t<div class=\"activityMain \">\r\n");
      out.write("\t\t\t\t\t<img src=\"/static/images/activity1.jpg \"></img>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info \">\r\n");
      out.write("\t\t\t\t\t<h3>春节送礼优选</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-3 \">\r\n");
      out.write("\t\t\t\t<div class=\"icon-sale two \"></div>\r\n");
      out.write("\t\t\t\t<h4>特惠</h4>\r\n");
      out.write("\t\t\t\t<div class=\"activityMain \">\r\n");
      out.write("\t\t\t\t\t<img src=\"/static/images/activity2.jpg \"></img>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info \">\r\n");
      out.write("\t\t\t\t\t<h3>春节送礼优选</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-3 \">\r\n");
      out.write("\t\t\t\t<div class=\"icon-sale three \"></div>\r\n");
      out.write("\t\t\t\t<h4>团购</h4>\r\n");
      out.write("\t\t\t\t<div class=\"activityMain \">\r\n");
      out.write("\t\t\t\t\t<img src=\"/static/images/activity3.jpg \"></img>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info \">\r\n");
      out.write("\t\t\t\t\t<h3>春节送礼优选</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-3 last \">\r\n");
      out.write("\t\t\t\t<div class=\"icon-sale \"></div>\r\n");
      out.write("\t\t\t\t<h4>超值</h4>\r\n");
      out.write("\t\t\t\t<div class=\"activityMain \">\r\n");
      out.write("\t\t\t\t\t<img src=\"/static/images/activity.jpg \"></img>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info \">\r\n");
      out.write("\t\t\t\t\t<h3>春节送礼优选</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear \"></div>\r\n");
      out.write("\t<!--一楼-->\r\n");
      out.write("\t<div id=\"f1\">\r\n");
      out.write("\t\t<!--甜点-->\r\n");
      out.write("\t\t<div class=\"am-container \">\r\n");
      out.write("\t\t\t<div class=\"shopTitle \">\r\n");
      out.write("\t\t\t\t<h4>甜品</h4>\r\n");
      out.write("\t\t\t\t<h3>每一道甜品都有一个故事</h3>\r\n");
      out.write("\t\t\t\t<div class=\"today-brands \">\r\n");
      out.write("\t\t\t\t\t<a href=\"# \">桂花糕</a> <a href=\"# \">奶皮酥</a> <a href=\"# \">栗子糕 </a> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"# \">马卡龙</a> <a href=\"# \">铜锣烧</a> <a href=\"# \">豌豆黄</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span class=\"more \"> <a href=\"# \">更多美味<i\r\n");
      out.write("\t\t\t\t\t\tclass=\"am-icon-angle-right\" style=\"padding-left: 10px;\"></i></a>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"productList\" class=\"am-g am-g-fixed floodFour\">\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-5 am-u-md-4 text-one list \">\r\n");
      out.write("\t\t\t\t<a href=\"# \">\r\n");
      out.write("\t\t\t\t\t<div class=\"outer-con \">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"title \">开抢啦！</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-title \">零食大礼包</div>\r\n");
      out.write("\t\t\t\t\t</div> <img src=\"/static/images/act1.png \" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"triangle-topright\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-7 am-u-md-4 text-two sug\">\r\n");
      out.write("\t\t\t\t<div class=\"outer-con \">\r\n");
      out.write("\t\t\t\t\t<div class=\"title \">雪之恋和风大福</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sub-title \">¥13.8</div>\r\n");
      out.write("\t\t\t\t\t<i class=\"am-icon-shopping-basket am-icon-md  seprate\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"# \"><img src=\"/static/images/2.jpg\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-7 am-u-md-4 text-two\">\r\n");
      out.write("\t\t\t\t<div class=\"outer-con \">\r\n");
      out.write("\t\t\t\t\t<div class=\"title \">雪之恋和风大福</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sub-title \">¥13.8</div>\r\n");
      out.write("\t\t\t\t\t<i class=\"am-icon-shopping-basket am-icon-md  seprate\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"# \"><img src=\"/static/images/1.jpg\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 产品列表 -->\r\n");
      out.write("\t\t\t<!-- \t\t<div class=\"am-u-sm-3 am-u-md-2 text-three big\">\r\n");
      out.write("\t\t\t\t<div class=\"outer-con \">\r\n");
      out.write("\t\t\t\t\t<div class=\"title \">小优布丁</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sub-title \">¥4.8</div>\r\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-shopping-cart  seprate\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"# \"><img src=\"/static/images/5.jpg\" /></a>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear \"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!--引导 -->\r\n");
      out.write("<div class=\"navCir\">\r\n");
      out.write("\t<li class=\"active\"><a href=\"javascript:void()\"><i\r\n");
      out.write("\t\t\tclass=\"am-icon-home \"></i>首页</a></li>\r\n");
      out.write("\t<li><a href=\"javascript:void()\"><i class=\"am-icon-list\"></i>分类</a></li>\r\n");
      out.write("\t<li><a href=\"javascript:void()\"><i\r\n");
      out.write("\t\t\tclass=\"am-icon-shopping-basket\"></i>购物车</a></li>\r\n");
      out.write("\t<li><a href=\"javascript:void()\"><i class=\"am-icon-user\"></i>我的</a></li>\r\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("\t<script src=\"/static/AmazeUI-2.4.2/assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"/static/AmazeUI-2.4.2/assets/js/amazeui.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/static/js/index.js\"></script>\r\n");
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
