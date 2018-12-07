<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js" lang="">

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>用户管理</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Place favicon.ico in the root directory -->
<link href="images/apple-touch-icon.png" type="images/x-icon"
	rel="shortcut icon">
<!-- All css files are included here. -->
<link rel="stylesheet" href="/Susses/css/user_index/bootstrap.min.css">
<link rel="stylesheet" href="/Susses/css/user_index/core.css">
<link rel="stylesheet" href="/Susses/css/user_index/style.css">
<link rel="stylesheet" href="/Susses/css/user_index/responsive.css">
<link rel="stylesheet" type="text/css"
	href="/Susses/plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<!-- customizer style css -->
<link rel="stylesheet"
	href="/Susses/css/user_index/style-customizer.css">
<link href="#" data-style="styles" rel="stylesheet">
<!-- Modernizr JS -->
<script src="/Susses/js/user_index/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
	<!--[if lt IE 8]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

	<!-- Pre Loader
	============================================ -->
	<div class="preloader">
		<div class="loading-center">
			<div class="loading-center-absolute">
				<div class="object object_one"></div>
				<div class="object object_two"></div>
				<div class="object object_three"></div>
			</div>
		</div>
	</div>
	<!-- Body main wrapper start -->

	<!-- Mobile menu start -->
	<!-- Mobile menu end -->
	</div>
	<!--Header section end-->
	<!--Breadcrubs start-->
	<!--Breadcrubs end-->


	<!--Contact bottom section-->
	<div class="container-fluid">
		<form action="/Susses/views/04wwysh" class="bs-example bs-example-form" role="form">
			<div class="row">
				<div class="col-md-6">
					<div class="input-group">
						<input name="uName" type="text" placeholder="根据姓名模糊查询" class="form-control"> <span
							class="input-group-btn">
							<button class="btn btn-success" type="submit">搜索</button>
						</span>
					</div>
					<!-- /input-group -->
				</div>
				<!-- /.col-lg-6 -->
			</div>
			<!-- /.row -->
		</form>
	</div>
	<div class="contact-bottom-section ptb-100">
		<div class="bg-img"></div>
		<div class="container-fluid">
			<div class="row">
			
				<div class="col-md-6 col-sm-12 col-xs-12 contact-form-div">
					<div class="contact-form">
						<div class="contact-form-title">
							<h2>My Order</h2>
						</div>
						<div class="table-responsive" style="width: 1180px;">
							<table class="table">
								<caption>用户</caption>
								<thead>
									<tr>
										<th>用户名称</th>
										<th>用户密码</th>
										<th>用户手机</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${userList}" var="user">
										<tr>
											<td>${user.uName}</td>
											<td>${user.uPassword}</td>
											<td>${user.uPhone}</td>
											<td><a href="/Susses/del?id=${user.uId}"
												class="text-danger glyphicon glyphicon-trash"></a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--Contact bottom section end-->

	</div>
	<!--contact us pages end-->

	<!--contact us pages start-->

	<!--Footer section start-->

	<!--Footer section end-->
	</div>
	<script src="js/map.js"></script>
	--->


	<!-- All js plugins included in this file. -->
	<script src="/Susses/js/user_index/vendor/jquery-1.12.0.min.js"></script>
	<script src="/Susses/js/user_index/bootstrap.min.js"></script>
	<script src="/Susses/js/user_index/jquery.nivo.slider.pack.js"></script>
	<script src="/Susses/js/user_index/isotope.pkgd.min.js"></script>
	<script src="/Susses/js/user_index/ajax-mail.js"></script>
	<script src="/Susses/js/user_index/jquery.magnific-popup.js"></script>
	<script src="/Susses/js/user_index/jquery.counterup.min.js"></script>
	<script src="/Susses/js/user_index/animated-headlines.js"></script>
	<script src="/Susses/js/user_index/waypoints.min.js"></script>
	<script src="/Susses/js/user_index/jquery.collapse.js"></script>
	<script src="/Susses/js/user_index/style-customizer.js"></script>
	<script src="/Susses/js/user_index/plugins.js"></script>
	<script src="/Susses/js/user_index/main.js"></script>

</body>

</html>
