<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>忘記密碼</title>
	<style type="text/css">
  		<%@include file="css/form.css" %>
	</style>
	<script type="text/javascript">
		<%@include file="js/simpleCaptcha.js" %>
	</script>
</head>
<body>
	<div class="container"> 
		<form id="contact" name="contact" method="post" action="ForgotServlet">
			<h1>使用者管理系統</h1>
			<fieldset></fieldset>
			<fieldset></fieldset>
	        <fieldset></fieldset>
	        <h3>忘記密碼</h3>
	        <fieldset></fieldset>
	        <fieldset>
		      	<input placeholder="帳號" type="text" name="name" required />
		    </fieldset>
		    <fieldset>
		      	<button name="send" type="submit">送出</button>
		    </fieldset>
		    <fieldset>
		    	<a href="register.jsp">註冊帳號</a>
		    	<a href="index.jsp">登入</a>
		    </fieldset>
	    </form>
	</div>
</body>
</html>