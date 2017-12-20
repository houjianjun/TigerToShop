//打开添加模式窗口
$("#addGoods").click(
		function() {
			$("#addGoodsModal").modal();
			// 商品类别
			$.ajax({
				type : 'get',
				url : '../goodsClass/getGoodsClassAll',
				contentType : 'application/json;charset=utf-8',
				success : function(data) {
					var options = "";
					for ( var i in data) {
						var obj = data[i];
						options += "<option value=\"" + obj.goodsClsId + "\" >"
								+ obj.goodsClsName + "</option>";
					}
					$("#goodsClsId").html(
							"<option value='请选择'>请选择...</option> " + options);
				}
			});
			// 商品类型
			$.ajax({
				type : 'get',
				url : '../goodsType/getGoodsTypeAll',
				contentType : 'application/json;charset=utf-8',
				success : function(data) {
					var options = "";
					for ( var i in data) {
						var obj = data[i];
						options += "<option value=\"" + obj.goodsTypeId
								+ "\" >" + obj.goodsType + "</option>";
					}
					$("#goodsTypeId").html(
							"<option value='请选择'>请选择...</option> " + options);
				}
			});
		});

// 添加商品分类
$("#saveGoods").click(function() {
	// 获取表单数据
	var data = $("#addGoodsForm").serializeObject();

	if (data.goodsClsId == "请选择") {
		alert("请选择商品类型分类");
		return false;
	}
	if (data.goodsTypeId == "请选择") {
		alert("请选择商品类型");
		return false;
	} else {
		$.ajax({
			type : 'put',
			url : '/goods/add',
			contentType : 'application/json;charset=utf-8',
			data : JSON.stringify(data),
			success : function(data) {
				if (data == 1) {
					$("#addGoodsModal").modal('hide');
					// 重新加载数据
					$('#goodsTable').bootstrapTable("refresh", {
						url : "../goods/getGoodsAll"
					});
				}
			}
		});
	}
});

// 数据删除
$("#deleteGoods").click(function() {
	var rows = $("#goodsTable").bootstrapTable('getSelections');
	if (rows.length <= 0) {
		alert("请选择要删除的记录！");
	} else {
		// 弹出删除确认框
		$('#delcfmModel').modal();
	}
});

// 数据删除
$("#delGoods").click(function() {
	var rows = $("#goodsTable").bootstrapTable('getSelections');
	// 获取删除ID
	var ids = new Array();
	for (var i = 0; i < rows.length; i++) {
		ids[i] = rows[i]['goodsId'];
	}
	var data = JSON.stringify(ids);
	// 转换为json数组格式
	var ids = "{keys:" + data + "}";
	$.ajax({
		type : 'delete',
		url : '/goods/delete',
		contentType : 'application/json;charset=utf-8',
		data : data,
		success : function(data) {
			if (data == 1) {
				// 重新加载数据
				$('#goodsTable').bootstrapTable("refresh", {
					url : "../goods/getGoodsAll"
				});
			}
		}
	});
});

// 数据修改
$("#editGoods").click(
		function() {
			var rows = $("#goodsTable").bootstrapTable('getSelections');
			if (rows.length != 1) {
				alert("请选择一条要修改的商品！");
			} else {
				$("#editGoodsModal #goodsClsName").val(rows[0].goodsClsName);
				$("#editGoodsModal #goodsClsId").val(rows[0].goodsClsId);
				// 设置商品类型
				// alert(rows[0].goodsType)
				// 读出所有类型数据，根据ID进行选择
				var goodsTypeId = rows[0].goodsType;
				$.ajax({
					type : 'get',
					url : '../goodsType/getGoodsTypeAll',
					contentType : 'application/json;charset=utf-8',
					success : function(data) {
						var options = "";
						for ( var i in data) {
							var obj = data[i];
							if (goodsTypeId == obj.goodsTypeId) {
								options += "<option value=\"" + obj.goodsTypeId
										+ "\" selected>" + obj.goodsType
										+ "</option>";
							} else {
								options += "<option value=\"" + obj.goodsTypeId
										+ "\" >" + obj.goodsType + "</option>";
							}
						}
						$("#editGoodsForm #goodsType").html(
								"<option value='请选择'>请选择...</option> "
										+ options);
					}
				});
				// 设置备注
				$("#editGoodsModal #goodsRemark").val(rows[0].remark);
				$("#editGoodsModal").modal();
			}
		});

// 修改保存
$("#modfiyGoods").click(function() {
	var data = $("#editGoodsForm").serializeObject();
	$.ajax({
		type : 'post',
		url : '/goodsClass/edit',
		contentType : 'application/json;charset=utf-8',
		data : JSON.stringify(data),
		success : function(data) {
			if (data == 1) {
				// 关闭模式窗口
				$("#editGoodsModal").modal('hide');
				// 重新加载数据
				$('#goodsClassTable').bootstrapTable("refresh", {
					url : "../goods/getGoodsAll"
				});
			}
		}
	});
});
// 根据窗口调整表格高度
$(window).resize(function() {
	$('#goodsTable').bootstrapTable('resetView', {
		height : tableHeight()
	})
})

// 添加商品数据
$('#goodsTable').bootstrapTable({
	method : 'get',
	contentType : "application/x-www-form-urlencoded", // 必须要有！！！！
	// 数据加载
	url : "../goods/getGoodsAll", // 要请求数据的文件路径
	height : tableHeight(), // 高度调整
	toolbar : '#toolbarGoods', // 指定工具栏
	striped : true, // 是否显示行间隔色
	dataField : "res", // bootstrap table 可以前端分页也可以后端分页，这里
	showRefresh : true, // 刷新按钮
	showColumns : true,
	clickToSelect : true, // 是否启用点击选中行
	toolbarAlign : 'right',
	// 工具栏对齐方式
	buttonsAlign : 'left', // 按钮对齐方式
	pageNumber : 1,
	pagination : true, // 是否分页
	queryParamsType : 'limit', // 查询参数组织方式
	pageSize : 2, // 单页记录数
	columns : [ {
		title : '全选',
		field : 'select',
		// 复选框
		checkbox : true,
		width : 25,
		align : 'center',
		valign : 'middle'
	}, {
		title : 'goodsId',
		field : 'goodsId',
		visible : false
	}, {
		title : '商品名称',
		field : 'goodsName',
		visible : true
	}, {
		title : '商品类别',
		field : 'goodsClass.goodsClsName',
		sortable : false
	}, {
		title : '商品类型',
		field : 'goodsType.goodsType',
		sortable : false
	}, {
		title : '商品价格',
		field : 'price',
		sortable : true
	}, {
		title : '库存',
		field : 'stock',
		sortable : true
	}, {
		title : '重量',
		field : 'weight',
		sortable : true
	}, {
		title : '品牌',
		field : 'brandId',
		sortable : true
	}, {
		title : '上架',
		field : 'grounding',
		sortable : true,
		formatter : groundingFormatter
	}, {
		title : '创建日期',
		field : 'createDate',
		sortable : true,
		// 列数据格式化
		formatter : createDateFormatter
	} ],
	locale : 'zh-CN', // 中文支持,
	responseHandler : function(res) {
		// 在ajax获取到数据，渲染表格之前，修改数据源
		return res;
	}
})
// 三个参数，value代表该列的值
function createDateFormatter(value, row, index) {
	return new Date(value).Format("yyyy年MM月dd日");
}
function groundingFormatter(value, row, index) {
	if (value == 0) {
		return '<i class="glyphicon glyphicon-tags" style="color:green"></i>'
	} else if (value == 1) {
		return '<i class="glyphicon glyphicon-tag" style="color:#39AFEA;"></i>'
	} else {
		return '数据错误'
	}
}

// tableHeight函数
function tableHeight() {
	// 可以根据自己页面情况进行调整
	return $(window).height() - 120;
}

// 商品图片
$("#detailGoods").click(function() {
	// 加载图片
	var rows = $("#goodsTable").bootstrapTable('getSelections');
	if (rows.length != 1) {
		alert("请选择一条要查看的商品！");
		return false;
	}
	$("#picGoodsModal").modal();
	var goodsId = rows[0].goodsId;
	// 设置goodsId的值
	$("#uploadForm #goodsId").val(goodsId);
	$.ajax({
		type : 'get',
		url : '/goodsPic/getGoodsPic/' + goodsId,
		contentType : 'application/json;charset=utf-8',
		success : function(data) {
			if (data.length > 0) {
				// 删除所有子元素
				var picList = $("#uploadPicList");
				picList.empty();
				var subpic = "";

				for ( var index in data) {
					subpic += "<li class=\"list-group-item\">";
					subpic += "<img src=" + data[index].goodsPath + ">";
					subpic += "</li>";
				}
				picList.append(subpic);
			}
		}
	});
});

// 上传文件
$("#saveUploadPic").click(function() {
	var goodsId = $("#uploadForm #goodsId").val();
	// 获取文件对象
	var file = document.getElementById("goodsPath").files[0];
	var isFirst=$("#uploadForm #isFirst").val();
	if(isFirst==null){
		isFirst=0;
	}
	// 创建文件对象
	var reader = new FileReader();

	// 加载文件对象
	reader.onload = function() {
		var goodsPath = this.result;
		alert(goodsPath)
		$.ajax({
			type : 'post',
			url : '/goodsPic/add',
			// contentType: 'application/json;charset=utf-8',
			data : {
				'goodsPath' : goodsPath,
				'goodsId' : goodsId,
				'isFirst' : isFirst
			},
			success : function(data) {
				alert(1);
			}
		});
	};
	reader.readAsDataURL(file);
});
