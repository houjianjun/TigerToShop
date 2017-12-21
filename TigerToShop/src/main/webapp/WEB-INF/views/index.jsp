<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>泰格兔电商平台</title>

<!--轮播图样式-->
<link href="/static/AmazeUI-2.4.2/assets/css/amazeui.css"
	rel="stylesheet" type="text/css" />
<link href="/static/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet"
	type="text/css" />
<!--小导航样式-->
<link rel="stylesheet" href="/static/style/tigertostyle.css" />
<!--主样式-->
<link rel="stylesheet" href="/static/style/front.css" />
</head>

<body>
	<%@include file="header.jsp"%>
	<!--轮播区-->
	<div class="banner">
		<div class="am-slider am-slider-default scoll" data-am-flexslider
			id="demo-slider-0">
			<ul class="am-slides">
				<li class="banner1"><a href=""><img
						src="/static/images/ad1.jpg" /></a></li>
				<li class="banner2"><a><img src="/static/images/ad2.jpg" /></a>
				</li>
				<li class="banner3"><a><img src="/static/images/ad3.jpg" /></a>
				</li>
				<li class="banner4"><a><img src="/static/images/ad4.jpg" /></a>
				</li>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
	<!--小导航 -->
	<div class="am-g am-g-fixed smallnav">
		<div class="am-u-sm-3">
			<a href="javascript:void()"><img
				src="/static/images/navsmall.jpg" />
				<div class="title">商品分类</div> </a>
		</div>
		<div class="am-u-sm-3">
			<a href="javascript:void()"><img
				src="/static/images/huismall.jpg" />
				<div class="title">大聚惠</div> </a>
		</div>
		<div class="am-u-sm-3">
			<a href="#javascript:void()"><img
				src="/static/images/mansmall.jpg" />
				<div class="title">个人中心</div> </a>
		</div>
		<div class="am-u-sm-3">
			<a href="javascript:void()"><img
				src="/static/images/moneysmall.jpg" />
				<div class="title">投资理财</div> </a>
		</div>
	</div>
	<!--热门活动 -->
	<div class="am-container activity ">
		<div class="shopTitle ">
			<h4>活动</h4>
			<h3>每期活动 优惠享不停</h3>
			<span class="more "> <a href="# ">全部活动<i
					class="am-icon-angle-right" style="padding-left: 10px;"></i></a>
			</span>
		</div>
		<div class="am-g am-g-fixed ">
			<div class="am-u-sm-3 ">
				<div class="icon-sale one "></div>
				<h4>秒杀</h4>
				<div class="activityMain ">
					<img src="/static/images/activity1.jpg "></img>
				</div>
				<div class="info ">
					<h3>春节送礼优选</h3>
				</div>
			</div>

			<div class="am-u-sm-3 ">
				<div class="icon-sale two "></div>
				<h4>特惠</h4>
				<div class="activityMain ">
					<img src="/static/images/activity2.jpg "></img>
				</div>
				<div class="info ">
					<h3>春节送礼优选</h3>
				</div>
			</div>

			<div class="am-u-sm-3 ">
				<div class="icon-sale three "></div>
				<h4>团购</h4>
				<div class="activityMain ">
					<img src="/static/images/activity3.jpg "></img>
				</div>
				<div class="info ">
					<h3>春节送礼优选</h3>
				</div>
			</div>

			<div class="am-u-sm-3 last ">
				<div class="icon-sale "></div>
				<h4>超值</h4>
				<div class="activityMain ">
					<img src="/static/images/activity.jpg "></img>
				</div>
				<div class="info ">
					<h3>春节送礼优选</h3>
				</div>
			</div>
		</div>
	</div>
	<div class="clear "></div>
	<!--一楼-->
	<div id="f1">
		<!--甜点-->
		<div class="am-container ">
			<div class="shopTitle ">
				<h4>甜品</h4>
				<h3>每一道甜品都有一个故事</h3>
				<div class="today-brands ">
					<a href="# ">桂花糕</a> <a href="# ">奶皮酥</a> <a href="# ">栗子糕 </a> <a
						href="# ">马卡龙</a> <a href="# ">铜锣烧</a> <a href="# ">豌豆黄</a>
				</div>
				<span class="more "> <a href="# ">更多美味<i
						class="am-icon-angle-right" style="padding-left: 10px;"></i></a>
				</span>
			</div>
		</div>

		<div id="productList" class="am-g am-g-fixed floodFour">
			<div class="am-u-sm-5 am-u-md-4 text-one list ">
				<a href="# ">
					<div class="outer-con ">
						<div class="title ">开抢啦！</div>
						<div class="sub-title ">零食大礼包</div>
					</div> <img src="/static/images/act1.png " />
				</a>
				<div class="triangle-topright"></div>
			</div>
			<div class="am-u-sm-7 am-u-md-4 text-two sug">
				<div class="outer-con ">
					<div class="title ">雪之恋和风大福</div>
					<div class="sub-title ">¥13.8</div>
					<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
				</div>
				<a href="# "><img src="/static/images/2.jpg" /></a>
			</div>

			<div class="am-u-sm-7 am-u-md-4 text-two">
				<div class="outer-con ">
					<div class="title ">雪之恋和风大福</div>
					<div class="sub-title ">¥13.8</div>
					<i class="am-icon-shopping-basket am-icon-md  seprate"></i>
				</div>
				<a href="# "><img src="/static/images/1.jpg" /></a>
			</div>
			<!-- 产品列表 -->
			<!-- 		<div class="am-u-sm-3 am-u-md-2 text-three big">
				<div class="outer-con ">
					<div class="title ">小优布丁</div>
					<div class="sub-title ">¥4.8</div>
					<i class="glyphicon glyphicon-shopping-cart  seprate"></i>
				</div>
				<a href="# "><img src="/static/images/5.jpg" /></a>
			</div> -->
		</div>
		<div class="clear "></div>
	</div>
	<%@include file="footer.jsp"%>
	<script src="/static/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
	<script src="/static/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
	<script type="text/javascript" src="/static/js/index.js"></script>
</body>
</html>