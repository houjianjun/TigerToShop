$.ajax({
	type : 'get',
	url : '/goodsList',
	contentType : "application/json;charset=utf-8",
	success : function(data) {
		var floor = $("#productList");
		var goods="";
		for ( var index in data) {
			
			goods+="<div class=\"am-u-sm-3 am-u-md-2 text-three big\">";
			goods+="<div class=\"outer-con \">";
			goods+="<div class=\"title \">"+data[index].goodsName+"</div>";
			goods+="<div class=\"sub-title \">"+data[index].price+"¥</div>";
			//goods+="<i class=\"glyphicon glyphicon-shopping-cart  seprate\"></i>";
			goods+="</div>";
			goods+="<a href=\"/getGoodsDetail/"+data[index].goodsId+"\"><img src="+data[index].goodsPic[0].goodsPath+" /></a>";
			goods+="</div>";
		}
		floor.append(goods);
		//alert(goods);
	}
});