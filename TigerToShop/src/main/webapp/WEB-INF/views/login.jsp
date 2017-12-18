<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--样式引入-->
<link rel="stylesheet" href="/static/style/bootstrap.css" />
<link rel="stylesheet" href="/static/style/login.css" />
<title>泰格兔电商平台</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<div class="row">
					<div class="login-box">
						<div class="header">泰格兔电商平台</div>
						<div class="text-center">
							<img src="images/logo.png" />
						</div>
						<div class="text-with-hr">
							<hr>
						</div>
						<form class="form-horizontal">
							<fieldset class="col-sm-12">
								<div class="form-group">
									<div class="controls">
										<div class="input-group">
											<span class="input-group-addon glyphicon glyphicon-user"></span>
											<input type="text" class="form-control" placeholder="请输入账号"
												id="username">
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="controls">
										<div class="input-group">
											<span class="input-group-addon glyphicon glyphicon-lock"></span>
											<input type="password" class="form-control"
												placeholder="请输入密码" id="password">
										</div>
									</div>
								</div>
								<div class="confirm">
									<input type="checkbox" name="remember" /> <label
										for="remember">记住密码</label>
								</div>
								<div class="row">
									<button id="btnLogin" type="button"
										class="btn btn-lg btn-primary col-xs-12">登录</button>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--js脚本引入-->
	<script type="text/javascript " src="/static/js/jquery-3.2.1.js "></script>
	<script type="text/javascript " src="/static/js/bootstrap.js "></script>

	<script type="text/javascript">
		$("#btnLogin").click(function() {
			window.location.href = "/admin/index";
		})
	</script>
</body>

</html>