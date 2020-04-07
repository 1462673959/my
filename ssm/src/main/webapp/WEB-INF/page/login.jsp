<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<html>
	<head>
		<meta charset="utf-8" />
		<title>LOL小助手</title>
		<style>
			@import url("css/login.css");
		</style>
		<script src="js/jquery/2.0.0/jquery.min.js"></script>
		<script src="js/vue/vue.min.js" type="text/javascript" charset="UTF-8"></script>
	</head>
	<body>
		<div id="head">
			<div style="width: 30%;">
				
			</div>
			<div style="width: 40%; text-align: center;">
				欢迎来到德莱联盟
			</div>
			<div style="width: 30%; position:relative;">
				
				<div style="position:absolute;left;0;bottom:0; display: flex; width: 100%;">
					<a id="a1" href="">注册</a>
					<a id="a1">[游客登录]</a>
					<a id="a1">问题反馈</a>
				</div>
			</div>
		</div>
		<div id="body">
				<div id="body-login">
					<img src="img/me.png" style="width: 50%; height:6.25rem"/>
					<form action="login" id="form">
						<ul>
							<li>
								<span>账号名</span>
								<input v-model="uno" name="uNo" type="text" /> <br />
							</li>
							<li> 
								<span>密码</span>
								<input v-model="upassword" name="uPassword" type="password" /> <br />
								
							</li>
							<li>
								<input id="sBtn" type="submit" value="登录"/>
							</li>
						</ul>
					</form>
				</div>
		</div>
	</body>
</html>
