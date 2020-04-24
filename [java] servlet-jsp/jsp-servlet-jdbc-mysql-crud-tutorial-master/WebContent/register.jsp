<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>註冊新帳號</title>
	<style type="text/css">
  		<%@include file="css/form.css" %>
	</style>
</head>
<body>
	<div class="container"> 
		<form id="contact" action="RegisterServlet" method="post">
			<h1>使用者管理系統</h1>
			<fieldset></fieldset>
			<fieldset></fieldset>
	        <fieldset></fieldset>
	        <h3>註冊新帳號</h3>
	        <fieldset></fieldset>
		    <fieldset>
		      	<input placeholder="帳號" type="text" name="name" required />
		    </fieldset>
		    <fieldset>
		      	<input placeholder="電子郵箱" type="text" name="email" required />
		    </fieldset>
		    <fieldset>
		      	<input placeholder="密碼" type="password" name="password" required />
		    </fieldset>
		    <fieldset>
		      	<input placeholder="重新輸入密碼" type="password" name="password2" required />
		    </fieldset>
		    <fieldset>
		      	<button name="login" type="submit">註冊</button>
		    </fieldset>
		    <fieldset>
		    	<a href="index.jsp">登入</a>
		    </fieldset>
	    </form>
	</div>
</body>
</html>