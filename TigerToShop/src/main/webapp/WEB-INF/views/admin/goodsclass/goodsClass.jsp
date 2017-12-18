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
<link rel="stylesheet" href="style/bootstrap-table.css" />
<title>分类管理</title>
</head>
<body>
	<table id="deptTable" class="table table-hover"></table>
	<div id="toolbar" class="btn-group pull-right"
		style="margin-right: 20px;">
		<button id="btn_edit" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
		</button>
		<button id="btn_delete" type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
		</button>
		<button href="#addUser" id="btn_add" type="button"
			class="btn btn-default" data-toggle="modal">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
		</button>
	</div>

	<div id="addGoodsClass" class="modal fade">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--对话框头部-->
					<span class="modal-title">分类添加</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<!--添加商品分类-->
						<form id="addGoodsClass">
							<div class="form-group">
								<label for="goodsClsName">商品类别：</label> <input type="text"
									class="form-control" id="goodsClsName" placeholder="请输入类别名称">
							</div>
							<div class="form-group">
								<label for="goodsClsName">商品类型：</label><select
									class="form-control">
									<option>1</option>
								</select>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/plugins/bootstrap-table.min.js"></script>
	<script type="text/javascript"
		src="js/plugins/bootstrap-table-zh-CN.min.js"></script>
	<script type="application/javascript">
		
				//根据窗口调整表格高度
				$(window).resize(function() {
					$('#userTable').bootstrapTable('resetView', {
						height: tableHeight()
					})
				})
				var data = [{
					'ID': 12,
					'LoginName': '123',
					'Name': '侯建军',
					'Tel': '13888888888',
					'Email': '123@163.com',
					'CreateTime': '2017-01-01',
					'Attribute': 1
				}];

				//生成用户数据
				$('#deptTable').bootstrapTable({
					method: 'post',
					contentType: "application/x-www-form-urlencoded", //必须要有！！！！
					//数据加载
					data: data,
					//url: "../index.php/admin/index/userManagement", //要请求数据的文件路径
					height: tableHeight(), //高度调整
					toolbar: '#toolbar', //指定工具栏
					striped: true, //是否显示行间隔色
					dataField: "res", //bootstrap table 可以前端分页也可以后端分页，这里
					//我们使用的是后端分页，后端分页时需返回含有total：总记录数,这个键值好像是固定的  
					//rows： 记录集合 键值可以修改  dataField 自己定义成自己想要的就好
					pageNumber: 1, //初始化加载第一页，默认第一页
					pagination: true, //是否分页
					queryParamsType: 'limit', //查询参数组织方式
					queryParams: queryParams, //请求服务器时所传的参数
					sidePagination: 'server', //指定服务器端分页
					pageSize: 10, //单页记录数
					pageList: [5, 10, 20, 30], //分页步进值
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
							title: 'ID',
							field: 'ID',
							visible: false
						},
						{
							title: '登录名',
							field: 'LoginName',
							sortable: true
						},
						{
							title: '姓名',
							field: 'Name',
							sortable: true
						},
						{
							title: '手机号',
							field: 'Tel',
						},
						{
							title: '邮箱',
							field: 'Email'
						},
						{
							title: '注册日期',
							field: 'CreateTime',
							sortable: true
						},
						{
							title: '状态',
							field: 'Attribute',
							align: 'center',
							//列数据格式化
							formatter: operateFormatter
						}
					],
					locale: 'zh-CN', //中文支持,
					responseHandler: function(res) {
						//在ajax获取到数据，渲染表格之前，修改数据源
						return res;
					}
				})
				//三个参数，value代表该列的值
				function operateFormatter(value, row, index) {
					if(value == 2) {
						return '<i class="glyphicon glyphicon-lock" style="color:red"></i>'
					} else if(value == 1) {
						return '<i class="glyphicon glyphicon-lock" style="color:green"></i>'
					} else {
						return '数据错误'
					}
				}

				//请求服务数据时所传参数
				function queryParams(params) {
					return {
						//每页多少条数据
						pageSize: params.limit,
						//请求第几页
						pageIndex: params.pageNumber
						//					Name: $('#search_name').val(),
						//					Tel: $('#search_tel').val()
					}
				}
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