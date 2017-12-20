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
<title>商品管理</title>
</head>
<body>
	<table id="goodsTable" class="table table-hover"></table>
	<div id="toolbarGoods" class="btn-group pull-right"
		style="margin-right: 20px;">
		<button id="editGoodsClass" type="button" class="btn btn-primary">
			<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
		</button>
		<button id="deleteGoods" type="button" class="btn btn-success">
			<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
		</button>
		<button id="addGoods" type="button" class="btn btn-danger"
			data-toggle="modal">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
		</button>
		<button id="detailGoods" type="button" class="btn btn-warning"
			data-toggle="modal">
			<span class="glyphicon glyphicon-gift" aria-hidden="true"></span>图片
		</button>
	</div>

	<!-- 添加商品 -->
	<div id="addGoodsModal" class="modal fade">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--对话框头部-->
					<span class="modal-title">商品添加</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<!--添加商品分类-->
						<form id="addGoodsForm">
							<div class="form-group">
								<label for="goodsName">商品名称：</label> <input type="text"
									class="form-control" name="goodsName" id="goodsName"
									placeholder="请输入商品名称">
							</div>
							<div class="form-group">
								<label class="control-label" for="goodsClsId">商品类别</label>
								<div class="controls">
									<select id="goodsClsId" name="goodsClsId" class="form-control">
									</select>
								</div>
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
								<label class="control-label" for="price">商品价格</label>
								<div class="controls">
									<input type="number" id="price" name="price" min="0.00"
										step="0.01" class="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label" for="stock">库存</label>
								<div class="controls">
									<input type="number" id="stock" name="stock"
										class="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label class="checkbox-inline" for="grounding"> <input
									type="checkbox" id="grounding" value="1" name="grounding">上架(是/否)
								</label>
							</div>
							<div class="form-group">
								<label for="goodsClassRemark"
									class="col-lg-4 col-md-4 col-sm-8 control-label">备注：</label>
								<textarea class="form-control" id="goodsClassRemark"
									name="remark" rows="3"></textarea>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-4 col-sm-8">
									<button type="button" id="saveGoods" class="btn btn-success">保存</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--编辑商品 -->
	<div id="editGoodsModal" class="modal fade">
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
									<select id="goodsType" name="goodsType" class="form-control">
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

	<!--商品图片 -->
	<div id="picGoodsModal" class="modal fade">
		<!-- 小模态框 -->
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<!--头部-->
					<span class="modal-title">商品图片</span><span class="close"
						data-dismiss="modal"><i class="glyphicon glyphicon-remove"></i></span>
					<div class="modal-body">
						<ul id="uploadPicList" class="list-group">
							<li class="list-group-item">
							<img alt="暂无图片" src="/static/images/wutu.png">
							</li>
						</ul>
						<form id="uploadForm">
							<!-- 隐藏域 -->
							<input type="hidden" id="goodsId" name="goodsId">
							<div class="form-group">
								<label class="control-label" for="goodsPath">商品图片</label>
								<div class="controls">
									<input type="file" id="goodsPath" name="goodsPath"
										class="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label class="checkbox-inline" for="isFirst"> <input
									type="checkbox" id="isFirst" value="1" name="isFirst">首页显示(是/否)
								</label>
							</div>
							<div class="form-group" style="margin-top: 5px">
								<div class="col-sm-offset-4 col-sm-8">
									<button type="button" id="saveUploadPic"
										class="btn btn-primary">上传</button>
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
					<a id="delGoods" class="btn btn-success" data-dismiss="modal">确定</a>
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
	<script type="text/javascript" src="/static/js/goods.js"></script>
</body>
</html>