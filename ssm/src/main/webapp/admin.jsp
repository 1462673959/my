<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/admin.css"/>
</head>
<body>
<div>
	<nav style="">
		<a href="">用户</a>
		<a href="">英雄</a>
		<a href="">装备</a>
		<button id="exit">退出</button>
	</nav>
</div>
</body>
</html>