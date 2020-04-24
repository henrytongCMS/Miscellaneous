<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>登入</title>
	<style type="text/css">
  		<%@include file="css/form.css" %>
	</style>
	<script type="text/javascript">
		<%@include file="js/simpleCaptcha.js" %>
	</script>
</head>
<body>
	<div class="container"> 
		<form id="contact" name="contact" method="post" onsubmit="validateCaptcha()">
			<h1>使用者管理系統</h1>
			<fieldset></fieldset>
			<fieldset></fieldset>
	        <fieldset></fieldset>
	        <h3>登入系統</h3>
	        <fieldset></fieldset>
		    <fieldset>
		      	<input placeholder="帳號" type="text" name="name" required />
		    </fieldset>
		    <fieldset>
		      	<input placeholder="密碼" type="password" name="password" required />
		    </fieldset>
		    <div id="captcha" align="center"></div>
			<input placeholder="圖形驗證碼" type="text" id="captchaTextBox" required />
			<fieldset></fieldset>
		    <fieldset>
		      	<button name="login" type="submit">登入</button>
		    </fieldset>
		    <fieldset>
		    	<a href="register.jsp">註冊帳號</a>
		    	<a href="forgot.jsp">忘記密碼</a>
		    </fieldset>
	    </form>
	</div>
	<script>createCaptcha()</script>
</body>
</html>