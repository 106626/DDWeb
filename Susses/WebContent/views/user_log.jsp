<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录</title>
<link rel="stylesheet" type="text/css"
	href="/Susses/css/Demo-admi-log.css">
</head>
<body>
	<div class="htmleaf-container">
		<div class="wrapper">
			<div class="container">
				<h1>Welcome</h1>

				<form class="form" action="/Susses/login" method="post">
					<input type="text" placeholder="UserName" name="name"> <input
						type="password" placeholder="Password" name="password">
					<button type="submit" id="login-button">Login</button>
					<div>
						<c:if test="${msg!=''}">
							<span style="color: red;">${msg}</span>
						</c:if>
					</div>
				</form>
			</div>

			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
	</div>

	<script src="/Susses/js/jquery-1.10.2.min.js" type="text/javascript"></script>
	<script>
		$('#login-button').click(function(event) {
			event.preventDefault();
			$('form').fadeOut(500);
			$('.wrapper').addClass('form-success');
		});
	</script>

	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei'; color: #000000">
		<h1>用户登入</h1>
	</div>
</body>
</html>