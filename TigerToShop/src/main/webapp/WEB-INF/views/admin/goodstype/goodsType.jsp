<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--样式引入-->
<link rel="stylesheet" href="/static/style/bootstrap-table.css" />
<title>商品类型管理</title>
</head>

<body>
	<table id="goodsTypeTable" class="table table-hover"></table>
	<div id="toolbar" class="btn-group pull-right"
		style="margin-right: 20px;">
		<button id="btn_edit" type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
		</button>
		<button id="deleteGoodsType" type="button" class="btn btn-success">
			<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
		</button>
		<button href="#addGoodsType" id="btn_add" type="button"
			class="btn btn-danger" data-toggle="modal">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
		</button>
	</div>
	<!--添加商品 -->
	<div id="addGoodsType" class="modal fade">
		<div class="modal-dialog  modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--头部-->
					<span class="modal-title">添加商品类型</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<form id="addform">
							<div class="input-group">
								<label for="goodsType">类型名称</label> <input type="text"
									id="goodsType" placeholder="日用百货" name="goodsType"
									class="form-control">
							</div>
							<div class="form-group" style="margin-top: 5px">
								<div class="col-sm-offset-4 col-sm-8">
									<button type="button" id="save" class="btn btn-primary">保存</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--编辑商品 -->
	<div id="editGoodsType" class="modal fade">
		<!-- 小模态框 -->
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--头部-->
					<span class="modal-title">修改商品类型</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<form id="editform">
							<!-- 隐藏域 -->
							<input type="hidden" id="goodsTypeId" name="goodsTypeId">
							<div class="input-group">
								<label for="goodsType">类型名称</label> <input type="text"
									id="goodsType" placeholder="日用百货" name="goodsType"
									class="form-control">
							</div>
							<div class="form-group" style="margin-top: 5px">
								<div class="col-sm-offset-4 col-sm-8">
									<button type="button" id="edit" class="btn btn-primary">保存</button>
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
					<a id="delete" class="btn btn-success" data-dismiss="modal">确定</a>
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
		
			//数据保存
			$("#save").click(function() {
				var data = $("#addform").serializeObject();
				$.ajax({
					type: 'put',
					url: '/goodsType/add',
					contentType: 'application/json;charset=utf-8',
					data: JSON.stringify(data),
					success: function(data) {
						if(data == 1) {
							//重新加载数据
							$('#goodsTypeTable').bootstrapTable(
								"refresh", {
									url: "../goodsType/getGoodsTypeAll"
								}
							);
						}
					}
				});
			});
			//数据删除
			$("#deleteGoodsType").click(function(){
				//弹出删除确认框
				 $('#delcfmModel').modal();  
			});
			
			$("#delete").click(function(){
				var rows= $("#goodsTypeTable").bootstrapTable('getSelections');
				if(rows.length<=0){
					alert("请选择要删除的记录！");
				}else{
					
					var ids =new Array();  
				    for (var i = 0; i < rows.length; i++) {  
				    	ids[i]=rows[i]['goodsTypeId'];
				    }  
				    var data=JSON.stringify(ids);
				    //转换为json数组格式
				    var ids="{keys:"+data+"}"
				    $.ajax(
				    	{
				    		type: 'delete',
							url: '/goodsType/delete',
							contentType: 'application/json;charset=utf-8',
							data: data,
							success: function(data) {
								if(data == 1) {
								//重新加载数据
								$('#goodsTypeTable').bootstrapTable(
									"refresh", {
										url: "../goodsType/getGoodsTypeAll"
									}
								);
								}
							}
				    	}		
				    );
				}
			});
			
			//数据修改
			$("#btn_edit").click(function(){
				var rows= $("#goodsTypeTable").bootstrapTable('getSelections');
				if(rows.length!=1){
					alert("请选择一条要个修改的记录！");
				}else{
					$("#editGoodsType #goodsType").val(rows[0].goodsType);
					$("#editGoodsType #goodsTypeId").val(rows[0].goodsTypeId);
					$("#editGoodsType").modal(); 
				}
			});
			//修改保存
			$("#edit").click(function(){
				var data = $("#editform").serializeObject();
				$.ajax({
					type: 'post',
					url: '/goodsType/edit',
					contentType: 'application/json;charset=utf-8',
					data: JSON.stringify(data),
					success: function(data) {
						if(data == 1) {
							//关闭模式窗口
							$("#editGoodsType").modal('hide');
							//重新加载数据
							$('#goodsTypeTable').bootstrapTable(
								"refresh", {
									url: "../goodsType/getGoodsTypeAll"
								}
							);
						}
					}
				});
			
			});
			//根据窗口调整表格高度
			$(window).resize(function() {
				$('#goodsTypeTable').bootstrapTable('resetView', {
					height: tableHeight()
				})
			})
			//生成用户数据
			$('#goodsTypeTable').bootstrapTable({
				method: 'get',
				url: "../goodsType/getGoodsTypeAll", //要请求数据的文件路径
				height: tableHeight(), //高度调整
				toolbar: '#toolbar', //指定工具栏
				striped: true, //是否显示行间隔色
				sortable: false, //是否启用排序
				sortOrder: "asc", //排序方式
				dataField: "res", //bootstrap table 可以前端分页也可以后端分页，这里
				//我们使用的是后端分页，后端分页时需返回含有total：总记录数,这个键值好像是固定的  
				//rows： 记录集合 键值可以修改  dataField 自己定义成自己想要的就好
				//pageNumber: 1, //初始化加载第一页，默认第一页
				//pagination: true, //是否分页
				//queryParamsType: 'limit', //查询参数组织方式
				//queryParams: queryParams, //请求服务器时所传的参数
				//sidePagination: 'server', //指定服务器端分页
				//pageSize: 10, //单页记录数
				//pageList: [5, 10, 20, 30], //分页步进值
				showRefresh: true, //刷新按钮
				showColumns: true,
				clickToSelect: true, //是否启用点击选中行
				toolbarAlign: 'right',
				//工具栏对齐方式
				buttonsAlign: 'right', //按钮对齐方式
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
						title: 'goodsTypeId',
						field: 'goodsTypeId',
						visible: false
					},
					{
						title: '类型名',
						field: 'goodsType',
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
				$('#deptTable').bootstrapTable('refresh', {
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