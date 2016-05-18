<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE >
<html>
<head>
<base href="<%=basePath%>">
<title>主页</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/zui/css/zui.min.css">
</head>
<body>
	<nav class="menu" data-toggle="menu" style="width: 200px">
		<button class="btn">
			<i class="icon-edit"></i> CREATE
		</button>
		<button class="btn">
			<i class="icon-cloud-upload"></i> UPLOAD
		</button>
		<ul class="nav nav-primary">
			<li><a href="#"><i class="icon-th"></i> Dashboard</a></li>
			<li><a href="#"><i class="icon-user"></i> Me</a></li>
			<li><a href="#"><i class="icon-time"></i> Time</a>
				<ul class="nav">
					<li><a href="#"><i class="icon-code"></i>Today</a></li>
					<li><a href="#">Tomarrow</a></li>
				</ul></li>
			<li><a href="#"><i class="icon-list-ul"></i> All</a></li>
			<li class="show"><a href="#"><i class="icon-tasks"></i>
					Status</a>
				<ul class="nav">
					<li><a href="#"><i class="icon-circle-blank"></i> Ready</a></li>
					<li><a href="#"><i class="icon-play-sign"></i> Ongoing</a></li>
				</ul></li>
		</ul>
	</nav>

</body>
<script type="text/javascript" src="<%=basePath%>/static/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/angular.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/static/zui/js/zui.min.js"></script>
</html>
