<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>购物车</title>
<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet"
	type="text/css" />
<!--主样式-->
<link rel="stylesheet" href="/static/style/front.css" />
<link rel="stylesheet" href="/static/style/index.css" />
<link rel="stylesheet" href="/static/style/optstyle.css" />
<link rel="stylesheet" href="/static/style/style.css" />
<link rel="stylesheet" href="/static/style/cartstyle.css" />
</head>

<body>
	<%@include file="header.jsp"%>
	<!--购物车表头 -->
	<div class="concent">
		<div id="cartTable">
			<div class="cart-table-th">
				<div class="wp">
					<div class="th th-chk">
						<div id="J_SelectAll1" class="select-all J_SelectAll"></div>
					</div>
					<div class="th th-item">
						<div class="td-inner">商品信息</div>
					</div>
					<div class="th th-price">
						<div class="td-inner">单价</div>
					</div>
					<div class="th th-amount">
						<div class="td-inner">数量</div>
					</div>
					<div class="th th-sum">
						<div class="td-inner">金额</div>
					</div>
					<div class="th th-op">
						<div class="td-inner">操作</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<!--商品列表-->
			<div class="item-list">
				<div id="item-list" class="bundle bundle-last">
					<!--工具按钮-->
					<div class="bundle-hd">
						<div class="bd-promos">
							<div class="bd-has-promo">
								已享优惠:<span class="bd-has-promo-content">省￥19.50</span>&nbsp;&nbsp;
							</div>
							<div class="act-promo">
								<a href="#" target="_blank">第二支半价，第三支免费<span class="gt">&gt;&gt;</span></a>
							</div>
							<span class="list-change theme-login">编辑</span>
						</div>
					</div>
					<div class="clear"></div>
					<!--产品列表-->
<!-- 					<div class="bundle-main">
						<ul class="item-content clearfix">
							<li class="td td-chk">
								<div class="cart-checkbox ">
									<input class="check" id="cartId" name="cartId"
										value="" type="checkbox">
								</div>
							</li>
							<li class="td td-item">
								<div class="item-pic">
									<a href="#" target="_blank" class="J_MakePoint"> <img src="/static/images/1.jpg" class="itempic J_ItemImg"></a>
								</div>
								<div class="item-info">
									<div class="item-basic-info">
										<a href="#" target="_blank" class="item-title J_MakePoint">电视机</a>
									</div>
								</div>
							</li>
							<li class="td td-info">
								<div class="item-props item-props-can">
									<span class="sku-line">颜色：</span> <span class="sku-line">包装：</span>
									<span tabindex="0" class="btn-edit-sku theme-login">修改</span>
									<i class="theme-login am-icon-sort-desc"></i>
								</div>
							</li>
							<li class="td td-price">
								<div class="item-price price-promo-promo">
									<div class="price-content">
										<div class="price-line">
											<em class="price-original">78.00</em>
										</div>
										<div class="price-line">
											<em class="J_Price price-now" tabindex="0">39.00</em>
										</div>
									</div>
								</div>
							</li>
							<li class="td td-amount">
								<div class="amount-wrapper ">
									<div class="item-amount ">
										<div class="sl">
											<input class="min am-btn" name="" type="button" value="-" />
											<input class="text_box" name="" type="text" value="3"
												style="width: 30px;" /> <input class="add am-btn" name=""
												type="button" value="+" />
										</div>
									</div>
								</div>
							</li>
							<li class="td td-sum">
								<div class="td-inner">
									<em tabindex="0" class="J_ItemSum number">117.00</em>
								</div>
							</li>
						</ul>
					</div>
					 -->
					<!-- 商品列表结束 -->
				</div>
			</div>
			<div class="clear"></div>

			<!--底部工具栏-->
			<div class="float-bar-wrapper">
				<div id="J_SelectAll2" class="select-all J_SelectAll">
					<div class="cart-checkbox">
						<input class="check-all check" id="J_SelectAllCbx2"
							name="select-all" value="true" type="checkbox"> <label
							for="J_SelectAllCbx2"></label>
					</div>
					<span>全选</span>
				</div>
				<div class="operations">
					<a href="#" hidefocus="true" class="deleteAll">删除</a> <a href="#"
						hidefocus="true" class="J_BatchFav">移入收藏夹</a>
				</div>
				<!--右侧工具栏-->
				<div class="float-bar-right">
					<div class="amount-sum">
						<span class="txt">已选商品</span> <em id="J_SelectedItemsCount">0</em><span
							class="txt">件</span>
						<div class="arrow-box">
							<span class="selected-items-arrow"></span> <span class="arrow"></span>
						</div>
					</div>
					<div class="price-sum">
						<span class="txt">合计:</span> <strong class="price">¥<em
							id="total">0.00</em></strong>
					</div>
					
					<div class="btn-area">
						<a href="javascript:void()" id="settlement"
							class="submit-btn submit-btn-disabled"> <span>结&nbsp;算</span></a>
					</div>
				</div>
			</div>
			<%@include file="footer.jsp"%>
			<script type="text/javascript" src="/static/js/jquery-3.2.1.js"></script>
			<script type="text/javascript" src="/static/js/shoppingcart.js"></script>
</body>

</html>