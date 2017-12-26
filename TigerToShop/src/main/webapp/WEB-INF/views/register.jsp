<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会员注册</title>
<link href="/static/AmazeUI-2.4.2/assets/css/amazeui.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="/static/style/loginstyle.css" />
</head>
<body>
	<div class="res-banner">
		<div class="res-main">
			<div class="login-box">
				<div class="am-tabs" id="doc-my-tabs">
					<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
						<li class="am-active"><a href="">邮箱注册</a></li>
						<li><a href="">手机号注册</a></li>
					</ul>
					<div class="am-tabs-bd">
						<div class="am-tab-panel am-active">
							<form method="post">

								<div class="user-email">
									<label for="email"><i class="am-icon-envelope-o"></i></label> <input
										type="email" name="" id="email" placeholder="请输入邮箱账号">
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"></i></label> <input
										type="password" name="" id="password" placeholder="设置密码">
								</div>
								<div class="user-pass">
									<label for="passwordRepeat"><i class="am-icon-lock"></i></label>
									<input type="password" name="" id="passwordRepeat"
										placeholder="确认密码">
								</div>
							</form>
							<div class="login-links">
								<label for="reader-me"> <input id="reader-me"
									type="checkbox"> 点击表示您同意商城《服务协议》
								</label>
							</div>
							<div class="am-cf">
								<input type="submit" name="" value="注册"
									class="am-btn am-btn-primary am-btn-sm am-fl">
							</div>
						</div>
						<div class="am-tab-panel">
							<form method="post">
								<div class="user-phone">
									<label for="phone"><i
										class="am-icon-mobile-phone am-icon-md"></i></label> <input type="tel"
										name="" id="phone" placeholder="请输入手机号">
								</div>
								<div class="verification">
									<label for="code"><i class="am-icon-code-fork"></i></label> <input
										type="tel" name="" id="code" placeholder="请输入验证码"> <a
										class="btn" href="javascript:void(0);"
										onclick="sendMobileCode();" id="sendMobileCode"> <span
										id="dyMobileButton">获取</span></a>
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"></i></label> <input
										type="password" name="" id="password" placeholder="设置密码">
								</div>
								<div class="user-pass">
									<label for="passwordRepeat"><i class="am-icon-lock"></i></label>
									<input type="password" name="" id="passwordRepeat"
										placeholder="确认密码">
								</div>
							</form>
							<div class="login-links">
								<label for="reader-me"> <input id="reader-me"
									type="checkbox"> 点击表示您同意商城《服务协议》
								</label>
							</div>
							<div class="am-cf">
								<input type="submit" name="" value="注册"
									class="am-btn am-btn-primary am-btn-sm am-fl">
							</div>
							<hr>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="/static/js/jquery-3.2.1.js"></script>
	<script src="/static/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
	<script>
		$(function() {
			$('#doc-my-tabs').tabs();
		})
	</script>

	<%@include file="footer.jsp"%>
</body>
</html>