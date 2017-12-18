<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!--样式引入-->
		<link rel="stylesheet" href="/static/style/bootstrap.css" />
		<!--菜单效果需引入,缩放-->
		<link rel="stylesheet" href="/static/style/jquery.mmenu.css" />
		<!--主要样式-->
		<link rel="stylesheet" href="/static/style/style.min.css" />
		<link rel="stylesheet" href="/static/style/index.css" />
		<title>泰格兔电商平台</title>
	</head>

	<body>
		<!--顶部内容-->
		<div class="navbar">
			<div class="container-fluid" role="navigation">
				<!--菜单收放-->
				<ul class="nav navbar-nav navbar-actions navbar-left">
					<li class="visible-md visible-lg">
						<a href="index.html#" id="main-menu-toggle"><i class="glyphicon glyphicon-th-large"></i></a>
					</li>
					<li class="visible-xs visible-sm">
						<a href="index.html#" id="sidebar-menu"><i class="glyphicon glyphicon-th-list"></i></a>
					</li>
				</ul>
				<!--搜索-->
				<form class="navbar-form navbar-left">
					<button type="submit" class="glyphicon glyphicon-search"></button>
					<input type="text" class="form-control" placeholder="搜索..."></a>
				</form>
				<!--工具按钮-->
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown visible-md visible-lg">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">
							<i class="glyphicon glyphicon-cog"></i>
						</a>
						<ul class="dropdown-menu">
							<li>
								<a href="javascript:void()"><i class="glyphicon glyphicon-user"></i>个人信息</a>
							</li>
							<li>
								<a href="javascript:void()"><i class="glyphicon glyphicon-plane"></i> 重置密码</a>
							</li>
							<li class="divider"></li>
							<li>
								<a href="javascript:void()"><i class="glyphicon glyphicon-off"></i>注销</a>
							</li>
						</ul>
					</li>
					<li class="dropdown visible-md visible-lg">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<img class="user-avatar" src="images/avatar.jpg" alt="user-mail"> admin
						</a>
					</li>
					<li>
						<a href="javascritp:void()"><i class="glyphicon glyphicon-off"></i></a>
					</li>
				</ul>
			</div>
		</div>

		<!--侧边菜单-->
		<div class="container-fluid content">
			<div class="row">
				<!--主菜单-->
				<div class="sidebar ">
					<div class="sidebar-collapse">
						<div class="sidebar-header t-center">
							<span><img class="text-logo" src="/static/images/logo.png"></span>
						</div>
						<div class="sidebar-menu">
							<ul class="nav nav-sidebar">
								<li>
									<a id="welcome" url="welcome.html" href="javascript:void()"><i class="glyphicon glyphicon-plane"></i><span class="h4">控制台</span></a>
								</li>
								<li>
									<a href="#">
										<i class="glyphicon glyphicon-cog"></i>
										<span class="text">系统管理</span>
										<span class="glyphicon glyphicon-chevron-down pull-right"></span></a>
									<ul class="nav sub">
										<li>
											<a id="usermanager" href="javascript:void()" url="usermanager.html"><i class="glyphicon glyphicon-user"></i><span class="text">用户管理</span></a>
										</li>
										<li>
											<a id="deptmanager" href="javascript:void()" url="deptmanager.html"><i class="glyphicon glyphicon-apple"></i><span class="text">部门管理</span></a>
										</li>
									</ul>
								</li>
								<li>
									<a href="#">
										<i class="glyphicon glyphicon-shopping-cart"></i>
										<span class="text">商品管理</span>
										<span class="glyphicon glyphicon-chevron-down pull-right"></span></a>
									<ul class="nav sub">
										<li>
											<a id="goodsClassManager" href="javascript:void()"><i class="glyphicon glyphicon-tree-deciduous"></i><span class="text">分类管理</span></a>
										</li>
										<li>
											<a id="goodsTypeManager" href="javascript:void()" url="/goodsType/index"><i class="glyphicon glyphicon-tasks"></i><span class="text">类型管理</span></a>
										</li>
										<li>
											<a id="goodsManager" href="javascript:void()"><i class="glyphicon glyphicon-tree-conifer"></i><span class="text">商品管理</span></a>
										</li>
									</ul>
								</li>
							</ul>
						</div>
					</div>
					<!--菜单底部-->
					<div class="sidebar-footer mm-panel mm-hidden" id="mm-1">
						<div class="sidebar-brand">
							泰格兔电商平台
						</div>
						<ul class="sidebar-terms">
							<li>
								<a href="index.html#">团队</a>
							</li>
							<li>
								<a href="index.html#">联系</a>
							</li>
							<li>
								<a href="index.html#">说明</a>
							</li>
							<li>
								<a href="index.html#">关于</a>
							</li>
						</ul>

						<div class="copyright text-center">
							<small>泰格兔 <i class="glyphicon glyphicon-leaf"></i></small>
						</div>
					</div>
				</div>

				<!--内容区-->
				<div class="main">
					<!--内容区-->
					<div class="row">
						<div class="row col-lg-12">
							<ul class="nav nav-tabs">
							</ul>
						</div>
						<!-- Tab面板 -->
						<div class="tab-content">
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
				<!--js脚本引入 菜单折叠必须引入2.1.1版本-->
				<script src="/static/js/jquery-2.1.1.min.js"></script>
				<script type="text/javascript " src="/static/js/bootstrap.js "></script>
				<!--<script type="text/javascript" src="js/bootstrap.min.js"></script>-->
				<script type="text/javascript" src="/static/js/jquery.mmenu.min.js"></script>
				<script type="text/javascript" src="/static/js/core.min.js"></script>
				<script type="application/javascript">
					$(function() {
						addTab($("#welcome"));
					})

					$("#usermanager").click(function() {
						addTab($(this))
					});

					$("#deptmanager").click(function() {
						addTab($(this));
					})
					
					$("#goodsClassManager").click(function(){
						addTab($(this));
					})
					$("#goodsTypeManager").click(function(){
						addTab($(this));
					})
					
					$("#goodsManager").click(function(){
						addTab($(this));
					});
					
					
					
					var num = 0;

					function addTab(obj) {
						var flag = false;
						var curItem;
						//查找元素
						$("ul.nav.nav-tabs").find("a").each(function() {
							if($(this).text().trim() == obj.text().trim()) {
								curItem=$(this);
								flag = true;
								return false;
							}
						});
						
						//移除所有子元素的active样式
						$("ul.nav.nav-tabs").children().removeClass("active");
						//移除内容页的active样式
						$(".tab-content").children().removeClass("active");
						
						if(flag) {
							curItem.parent().addClass('active');
							$("div.tab-content").find('#' + curItem.attr("aria-controls")).addClass('active');
							return false;
						}
						//生成选项卡ID与名字
						var tabId = 'tab' + num++;
						var tabName = obj.text();
						var txtTitle;
						if(tabName.trim() == "控制台") {
							//添加新增的选项卡并激活
							 txtTitle = '<li role=\"presentation\" class=\"active\"><a href=\"#' + tabId + '\" aria-controls=\"' + tabId + '\" role="tab" data-toggle="tab">' + tabName + '</a></li>';
						} else {
							//添加新增的选项卡并激活
							 txtTitle = '<li role=\"presentation\" class=\"active\"><a href=\"#' + tabId + '\" aria-controls=\"' + tabId + '\" role="tab" data-toggle="tab">' + tabName + ' <i onclick=\"closeTab(this)\" class=\"glyphicon glyphicon-remove\"></i></a></li>';
						}

						$("ul.nav.nav-tabs").append(txtTitle);
						var txtContext = "<div role=\"tabpanel\" class=\"tab-pane active\" id=\"" + tabId + "\"></div>";
						$("div.tab-content").append(txtContext);
						//加载数据
						$("#" + tabId).load(obj.attr("url"));

					}

					//关闭选项卡
					function closeTab(obj) {
						//先判断当前要关闭的tab选项卡有没有active类，再判断当前选项卡是否最后一个，
						//如果是则给前一个选项卡以及内容添加active，否则给下一个添加active类
						var gParent = $(obj).parent().parent();
						//获取父类对象
						parent = $(obj).parent();
						//如果父类有active
						if(gParent.hasClass('active')) {
							//当前是否是最后一个
							if(gParent.index() == gParent.length) {
								num = 0;
								//给前一个选项卡添加active
								gParent.prev().addClass('active');
								//激活前一个内容选项卡
								$("div.tab-content").find('#' + parent.attr("aria-controls")).prev().addClass('active');
							} else {
								//激活下一个
								gParent.prev().addClass('active');
								//激活下一个内容选项卡
								$("div.tab-content").find('#' + parent.attr("aria-controls")).prev().addClass('active');
							}
							//移除选项卡
							gParent.remove();
							//删除内容页
							$("div.tab-content").find('#' + parent.attr("aria-controls")).remove();
						}
					}
				</script>
	</body>
</html>