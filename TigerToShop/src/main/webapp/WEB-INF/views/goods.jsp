<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!--主样式-->
<link href="/static/AmazeUI-2.4.2/assets/css/amazeui.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="/static/style/goods.css" />
<link rel="stylesheet" href="/static/style/optstyle.css" />
<link rel="stylesheet" href="/static/style/style.css" />
<title>商品详情</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<!--导航内容-->
	<ol class="am-breadcrumb am-breadcrumb-slash">
		<li><a href="#">首页</a></li>
		<li><a id="className" href="#">分类</a></li>
		<li class="am-active">${goods.goodsName}</li>
	</ol>
	<!--商品图片-->
	<div class="scoll">
		<section class="slider">
			<div class="">
				<ul class="slides">
					<li><img src="/static/images/1.jpg" title="pic" /></li>
				</ul>
			</div>
		</section>
	</div>
	<!--商品区-->
	<div class="item-inform">
		<div class="clearfixLeft" id="clearcontent">
			<div class="clear"></div>
		</div>
		<!--右部商品区-->
		<div class="clearfixRight">
			<!--规格属性-->
			<!--名称-->
			<div class="tb-detail-hd">
				<h1>${goods.goodsName}</h1>
			</div>
			<div class="tb-detail-list">
				<!--价格-->
				<div class="tb-detail-price">
					<li class="price iteminfo_price">
						<dt>促销价</dt>
						<dd>
							<em>¥</em><b class="sys_item_price">${goods.price}</b>
						</dd>

					</li>
					<li class="price iteminfo_mktprice">
						<dt>原价</dt>
						<dd>
							<em>¥</em><b class="sys_item_mktprice">${goods.price}</b>
						</dd>
					</li>
					<div class="clear"></div>
				</div>
				<dl>
					<li>
						数量：<input id="num" type="number" style="width:50px" min="1" value="1">
					</li>
				</dl>
				<dl>
					<li>
						库存：${goods.stock}
					</li>
				</dl>
				<!--地址-->
				<dl class="freight">
					<dt>配送至</dt>
					<div class="iteminfo_freprice">
						<div class="am-form-content address">
							<select data-am-selected>
								<option value="a">浙江省</option>
							</select>
							<br>
							<select data-am-selected>
								<option value="a">温州市</option>
							</select> 
							<br>
							<select data-am-selected>
								<option value="a">瑞安区</option>
							</select>
						</div>
						<div class="pay-logis">
							快递<b class="sys_item_freprice">10</b>元
						</div>
					</div>
				</dl>
				<div class="clear"></div>
				<!--销量-->
				<ul class="tm-ind-panel">
					<li class="tm-ind-item tm-ind-sellCount canClick">
						<div class="tm-indcon">
							<span class="tm-label">月销量</span><span class="tm-count">0</span>
						</div>
					</li>
					<li class="tm-ind-item tm-ind-sumCount canClick">
						<div class="tm-indcon">
							<span class="tm-label">累计销量</span><span class="tm-count">0</span>
						</div>
					</li>
					<li class="tm-ind-item tm-ind-reviewCount canClick tm-line3">
						<div class="tm-indcon">
							<span class="tm-label">累计评价</span><span class="tm-count">0</span>
						</div>
					</li>
				</ul>
				<div class="clear"></div>
				<div class="pay">
					<div class="pay-opt">
						<a href="home.html"><span class="am-icon-home am-icon-fw">首页</span></a>
						<a><span class="am-icon-heart am-icon-fw">收藏</span></a>

					</div>
					<li>
						<div class="clearfix tb-btn tb-btn-buy theme-login">
							<a id="likBuy" title="点此按钮到下一步确认购买信息">立即购买</a>
						</div>
					</li>
					<li>
						<div class="clearfix tb-btn tb-btn-basket theme-login">
							<a id="likBasket" title="加入购物车" >加入购物车</a>
						</div>
					</li>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<!--产品介绍-->
	<div class="introduce">
		<div class="introduceMain">
			<div class="am-tabs" data-am-tabs>
				<ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
					<li class="am-active"><a href="#"> <span
							class="index-needs-dt-txt">宝贝详情</span></a></li>
					<li><a href="#"> <span class="index-needs-dt-txt">全部评价</span></a>
					</li>
					<li><a href="#"> <span class="index-needs-dt-txt">猜你喜欢</span></a>
					</li>
				</ul>
				<!--宝贝详情-->
				<div class="am-tabs-bd">
					<div class="am-tab-panel am-fade am-in am-active">
						<div class="J_Brand">
							<div class="attr-list-hd tm-clear">
								<h4>产品参数：</h4>
							</div>
							<div class="clear"></div>
							<ul id="J_AttrUL">
								<li title="">产品类型:&nbsp;</li>
								<li title="">原料产地:&nbsp;</li>
								<li title="">产地:&nbsp;</li>
								<li title="">配料表:&nbsp;</li>
								<li title="">产品规格:&nbsp;</li>
								<li title="">保质期:&nbsp;</li>
								<li title="">产品标准号:&nbsp;</li>
								<li title="">生产许可证编号：&nbsp;</li>
								<li title="">储存方法：&nbsp;</li>
								<li title="">食用方法：&nbsp;</li>
							</ul>
							<div class="clear"></div>
						</div>
						<div class="details">
							<div class="attr-list-hd after-market-hd">
								<h4>商品细节</h4>
							</div>
							<div class="twlistNews">
								<img src="images/1.jpg" />
							</div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<!--宝贝详情结束-->
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
	<script type="text/javascript" src="/static/js/jquery-3.2.1.js"></script>
	<script type="text/javascript">
		$.get("/goodsClass/getGoodsClass/"+${goods.goodsClsId},function(data){
			$("#className").text(data.goodsClsName);
		});
		//立刻购买
		$("#likBuy").click(function(){
			window.loaction.href="";
		});
		
		$("#likBasket").click(function(){
			var num=$("#num").val();
			var data={"goodsId":${goods.goodsId},"goodsNum":num,"memberId":1};
			//向购物车添加一条记录
			$.ajax({
				type:"put",
				url:"/shoppingCart/add",
				contentType : "application/json;charset=utf-8",
				data:JSON.stringify(data),
				success:function(data){
					if(data==1){
						alert('商品已成功添加到购物车！');
					}
				}
			}); 
		});
		
	</script>
</body>
</html>