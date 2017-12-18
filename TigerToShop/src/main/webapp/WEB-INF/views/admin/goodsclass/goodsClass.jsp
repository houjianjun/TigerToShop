<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--样式引入-->
<link rel="stylesheet" href="/static/style/bootstrap-table.css" />
<title>分类管理</title>
</head>
<body>
	<table id="goodsClassTable" class="table table-hover"></table>
	<div id="toolbarGoodsClass" class="btn-group pull-right"
		style="margin-right: 20px;">
		<button id="editGoodsClass" type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
		</button>
		<button id="deleteGoodsClass" type="button" class="btn btn-success">
			<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
		</button>
		<button id="addGoodsClass" type="button" class="btn btn-danger"
			data-toggle="modal">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
		</button>
	</div>
	<!-- 添加商品分类 -->
	<div id="addGoodsClassModal" class="modal fade">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--对话框头部-->
					<span class="modal-title">商品分类添加</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<!--添加商品分类-->
						<form id="addGoodsClassForm">
							<div class="form-group">
								<label for="goodsClsName">商品类别：</label> <input type="text"
									class="form-control" name="goodsClsName" id="goodsClsName"
									placeholder="请输入类别名称">
							</div>
							<div class="form-group">
								<label class="control-label" for="goodsTypeId">商品类型</label>
								<div class="controls">
									<select id="goodsTypeId" name="goodsTypeId"
										class="form-control">
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="goodsClassRemark"
									class="col-lg-4 col-md-4 col-sm-8 control-label"> 备注：</label>
								<textarea class="form-control" id="goodsClassRemark"
									name="remark" rows="3"></textarea>

							</div>
							<div class="form-group">
								<div class="col-sm-offset-4 col-sm-8">
									<button type="button" id="saveGoodsClass"
										class="btn btn-success">保存</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--编辑商品 -->
	<div id="editGoodsClassModal" class="modal fade">
		<!-- 小模态框 -->
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--头部-->
					<span class="modal-title">修改商品类型</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<form id="editGoodsClassForm">
							<!-- 隐藏域 -->
							<input type="hidden" id="goodsClsId" name="goodsClsId">
							<div class="input-group">
								<label for="goodsType">类型名称</label> <input type="text"
									id="goodsClsName" placeholder="日用百货" name="goodsClsName"
									class="form-control">
							</div>
							<div class="form-group">
								<label class="control-label" for="goodsTypeId">商品类型</label>
								<div class="controls">
									<select id="goodsType" name="goodsType"
										class="form-control">
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="goodsClassRemark"
									class="col-lg-4 col-md-4 col-sm-8 control-label"> 备注：</label>
								<textarea class="form-control" id="goodsClassRemark"
									name="remark" rows="3"></textarea>

							</div>
							<div class="form-group" style="margin-top: 5px">
								<div class="col-sm-offset-4 col-sm-8">
									<button type="button" id="modfiyGoodsClass"
										class="btn btn-primary">保存</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- 信息删除确认 -->
	<div class="modal fade" id="delcfmModel">
		<div class="modal-dialog modal-sm">
			<div class="modal-content message_align">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">提示信息</h4>
				</div>
				<div class="modal-body">
					<p>您确认要删除吗？</p>
				</div>
				<div class="modal-footer">
					<input type="hidden" id="url" />
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<a id="delGoodsClass" class="btn btn-success" data-dismiss="modal">确定</a>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="/static/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.js"></script>
	<script type="text/javascript"
		src="/static/js/plugins/bootstrap-table.min.js"></script>
	<script type="text/javascript"
		src="/static/js/plugins/bootstrap-table-zh-CN.min.js"></script>
	<script type="text/javascript" src="/static/js/base.js"></script>

	<script type="application/javascript">
		

	//打开添加模式窗口
	$("#addGoodsClass").click(function(){
		$("#addGoodsClassModal").modal();
		$.ajax({
			type:'get',
			url:'../goodsType/getGoodsTypeAll',
			contentType: 'application/json;charset=utf-8',
			success: function(data) {
				var options="";
				 for (var i in data) {  
					 var obj =data[i]; 
					 options+="<option value=\""+obj.goodsTypeId+"\" >"
					 +obj.goodsType+ "</option>";
				 }
				 $("#goodsTypeId").html("<option value='请选择'>请选择...</option> "+options);  
			}
		});
		//加载商品类型数据
		$("#goodsTypeId").html();
	});
	
	//添加商品分类
 	$("#saveGoodsClass").click(function(){
 		//获取表单数据
 		 var data = $("#addGoodsClassForm").serializeObject();
		 if(data.goodsTypeId=="请选择"){
			 alert("请选择商品类型");
			 return false;
		 }else{
			 $.ajax({
				 type:'put',
				 url: '/goodsClass/add',
				 contentType: 'application/json;charset=utf-8',
				 data: JSON.stringify(data),
				 success: function(data) {
					 if(data == 1) {
						 $("#addGoodsClassModal").modal('hide');
						//重新加载数据
						$('#goodsClassTable').bootstrapTable(
							"refresh", {
								url: "../goodsClass/getGoodsClassAll"
							}
						);
					 }
				 }
			 });
		 }	
	}); 
	
 	//数据删除
	$("#deleteGoodsClass").click(function(){
		var rows= $("#goodsClassTable").bootstrapTable('getSelections');
		if(rows.length<=0){
			alert("请选择要删除的记录！");
		}else{
		//弹出删除确认框
		 $('#delcfmModel').modal();  
		}
	});
 	
	//数据删除
	$("#delGoodsClass").click(function(){
		var rows= $("#goodsClassTable").bootstrapTable('getSelections');
		//获取删除ID	
		var ids =new Array();  
		    for (var i = 0; i < rows.length; i++) {  
		    	ids[i]=rows[i]['goodsClsId'];
		    }  
		    var data=JSON.stringify(ids);
		    //转换为json数组格式
		    var ids="{keys:"+data+"}";
		    $.ajax(
		    	{
		    		type: 'delete',
					url: '/goodsClass/delete',
					contentType: 'application/json;charset=utf-8',
					data: data,
					success: function(data) {
						if(data == 1) {
						//重新加载数据
						$('#goodsClassTable').bootstrapTable(
							"refresh", {
								url: "../goodsClass/getGoodsClassAll"
							}
						);
						}
					}
		    	}		
		    );
	});

//数据修改
$("#editGoodsClass").click(function(){
	var rows= $("#goodsClassTable").bootstrapTable('getSelections');
	if(rows.length!=1){
		alert("请选择一条要个修改的记录！");
	}else{
		$("#editGoodsClassModal #goodsClsName").val(rows[0].goodsClsName);
		$("#editGoodsClassModal #goodsClsId").val(rows[0].goodsClsId);
		//设置商品类型
		//alert(rows[0].goodsType)
		//读出所有类型数据，根据ID进行选择
		var goodsTypeId=rows[0].goodsType;
		$.ajax({
			type:'get',
			url:'../goodsType/getGoodsTypeAll',
			contentType: 'application/json;charset=utf-8',
			success:function(data){
				var options="";
				 for (var i in data) {  
					 var obj =data[i]; 
					 if(goodsTypeId==obj.goodsTypeId){
						 options+="<option value=\""+obj.goodsTypeId+"\" selected>"
						 +obj.goodsType+ "</option>";
					 }else{
						 options+="<option value=\""+obj.goodsTypeId+"\" >"
						 +obj.goodsType+ "</option>"; 
					 }
				 }
				 $("#editGoodsClassForm #goodsType").html("<option value='请选择'>请选择...</option> "+options);  
			}
		});
		//设置备注
		$("#editGoodsClassModal #goodsClassRemark").val(rows[0].remark);
		$("#editGoodsClassModal").modal(); 
	}
});	

//修改保存
$("#modfiyGoodsClass").click(function(){
	var data = $("#editGoodsClassForm").serializeObject();
	$.ajax({
		type: 'post',
		url: '/goodsClass/edit',
		contentType: 'application/json;charset=utf-8',
		data: JSON.stringify(data),
		success: function(data) {
			if(data == 1) {
				//关闭模式窗口
				$("#editGoodsClassModal").modal('hide');
				//重新加载数据
				$('#goodsClassTable').bootstrapTable(
					"refresh", {
						url: "../goodsClass/getGoodsClassAll"
					}
				);
			}
		}
	});
});
				//根据窗口调整表格高度
				$(window).resize(function() {
					$('#goodsClassTable').bootstrapTable('resetView', {
						height: tableHeight()
					})
				})

				//生成用户数据
				$('#goodsClassTable').bootstrapTable({
					method: 'get',
					contentType: "application/x-www-form-urlencoded", //必须要有！！！！
					//数据加载
					url: "../goodsClass/getGoodsClassAll", //要请求数据的文件路径
					height: tableHeight(), //高度调整
					toolbar: '#toolbarGoodsClass', //指定工具栏
					striped: true, //是否显示行间隔色
					dataField: "res", //bootstrap table 可以前端分页也可以后端分页，这里
					showRefresh: true, //刷新按钮 
					showColumns: true,
					clickToSelect: true, //是否启用点击选中行
					toolbarAlign: 'right',
					//工具栏对齐方式
					buttonsAlign: 'left', //按钮对齐方式
					columns: [{
							title: '全选',
							field: 'select',
							//复选框
							checkbox: true,
							width: 25,
							align: 'center',
							valign: 'middle'
						},
						{
							title: 'goodsClsId',
							field: 'goodsClsId',
							visible: false
						},
						{
							title: '商品类型',
							field: 'goodsType',
							visible: false
						},
						{
							title: '商品类别',
							field: 'goodsClsName',
							sortable: true
						},
						{
							title: '备注',
							field: 'remark',
							sortable: true
						}
					],
					locale: 'zh-CN', //中文支持,
					responseHandler: function(res) {
						//在ajax获取到数据，渲染表格之前，修改数据源
						return res;
					}
				})

				//查询按钮事件
				$('#search_btn').click(function() {
					$('#goodsClassTable').bootstrapTable('refresh', {
						//url: '../index.php/admin/index/userManagement'
					});
				})
				//tableHeight函数
				function tableHeight() {
					//可以根据自己页面情况进行调整
					return $(window).height();
				}
	
	
	
	
	
	</script>
</body>
</html>