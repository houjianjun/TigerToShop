var memberId = 1;
// 获取购物车数据
$
		.ajax({
			type : 'get',
			url : '/shoppingCart/getShoppingCart/' + memberId,
			contentType : 'application/json;charset=utf-8',
			success : function(data) {
				var itemList = $("#item-list");
				var context = "";
				for ( var index in data) {
					context += "<div class=\"bundle-main\">";
					context += "<ul class=\"item-content clearfix\">";
					context += "<li class=\"td td-chk\">";
					context += "<div class=\"cart-checkbox\">"
					context += "<input class=\"check\" id=\"cartId\" onclick=\"chk(this)\" name=\"cartId\" value=\""
							+ data[index].goodsId + "\" type=\"checkbox\">";
					context += "</div></li>";
					// 产品图与名称
					context += "<li class=\"td td-item\">";
					context += "<div class=\"item-pic\">";
					context += "<a class=\"J_MakePoint\"> <img src=\"/static/images/1.jpg\" class=\"itempic J_ItemImg\"></a>";
					context += "</div><div class=\"item-info\">";
					context += "<div class=\"item-basic-info\"><a href=\"#\" target=\"_blank\" class=\"item-title J_MakePoint\">"
							+ data[index].goods.goodsName + "</a>";
					context += "</div></div></li>";

					// 价格
					context += "<li class=\"td td-price\"><div class=\"item-price price-promo-promo\">";
					context += "<div class=\"price-content\"><div class=\"price-line\">";
					context += "<em class=\"price-original\">"
							+ data[index].goods.price
							+ "</em></div><div class=\"price-line\">";
					context += "<em class=\"J_Price price-now\" tabindex=\"0\">"
							+ data[index].goods.price + "</em></div>";
					context += "</div></div></li>";
					// 数量
					context += "<li class=\"td td-amount\"><div class=\"amount-wrapper \">";
					context += "<div class=\"item-amount \"><div class=\"sl\">";
					context += "<input class=\"min am-btn\"  onclick=\"subNum(this)\" type=\"button\" value=\"-\"/>";
					context += "<input class=\"text_box\"  type=\"text\" value=\""
							+ data[index].goodsNum + "\"";
					context += "	style=\"width: 30px;\" /> <input class=\"add am-btn\" name=\"\" onclick=\"addNum(this)\" ";
					context += "	type=\"button\" value=\"+\" />";
					context += "</div></div></div></li>";
					// 合计
					context += "<li class=\"td td-sum\">";
					context += "<div class=\"td-inner\">";
					context += "<em tabindex=\"0\" class=\"J_ItemSum number\">"
							+ (data[index].goods.price * data[index].goodsNum)
							+ "</em>";
					context += "</div></li>";
					// 结束标记
					context += "</ul></div>";
				}
				itemList.append(context);
			}
		});

// 数量减少
function subNum(obj) {
	// 获取所在父级元素
	var ul = $(obj).parents("ul");
	// 获取价格
	var price = ul.find(".price-original").text();
	if (ul.find(".text_box").val() > 1) {
		ul.find(".text_box").val(parseInt(ul.find(".text_box").val()) - 1);
		ul.find(".J_ItemSum.number").text(price * (ul.find(".text_box").val()));
	}
}
// 数量添加
function addNum(obj) {
	// 获取所在父级元素
	var ul = $(obj).parents("ul");
	// 获取价格
	var price = ul.find(".price-original").text()
	ul.find(".text_box").val(parseInt(ul.find(".text_box").val()) + 1);
	ul.find(".J_ItemSum.number").text(price * (ul.find(".text_box").val()));
}

// 全选商品
$(".cart-checkbox").click(function() {
	var chknum  = $(".cart-checkbox .check[name='cartId']");
	var num = 0;
	$(".cart-checkbox .check[name='cartId']").each(function() {
		if ($(this).prop("checked") == true){
			$(this).prop("checked", false);
		}else{
			$(this).prop("checked", true);
			num++;
		}
	});
	$("#J_SelectedItemsCount").text(num);
});
//单选商品
function chk(obj){
	var num=$("#J_SelectedItemsCount").text();
	if ($(this).prop("checked") == true){
		num--;
		$("#J_SelectedItemsCount").text(num);
	}else{
		num++;
		$("#J_SelectedItemsCount").text(num);
	}
}
// 结算
