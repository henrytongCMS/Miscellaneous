<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>使用者管理系統</title>
	<style type="text/css">
  		<%@include file="css/form.css" %>
	</style>
</head>
<body>
	<div class="container"> 
		<form id="contact" action="UploadServlet" enctype="multipart/form-data" method="post">
			<h1>使用者管理系統</h1>
			<fieldset></fieldset>
			<fieldset></fieldset>
			<fieldset></fieldset>
	        <c:if test="${user == null}">
		        <h3>新增使用者
		        	<a href="LogoutServlet">
		        		<img class="ico" title="登出" src="https://img.icons8.com/nolan/64/000000/exit.png">
		        	</a>
		        	<a href="ListServlet">
		        		<img class="ico" title="顯示資料" src="https://img.icons8.com/nolan/64/000000/list.png">
		        	</a>
		        </h3>
	        </c:if>
	        <c:if test="${user != null}">
	        	<h3>編輯使用者
	        		<a href="LogoutServlet">
	        			<img class="ico" title="登出" src="https://img.icons8.com/nolan/64/000000/exit.png">
	        		</a>
	        		<a href="ListServlet">
	        			<img class="ico" title="顯示資料" src="https://img.icons8.com/nolan/64/000000/list.png">
	        		</a>
	        	</h3>
	        </c:if>
	        <fieldset></fieldset>
			<input type="file" name="<%= request.getParameter("name") %>" id="images" accept=".jpg, .jpeg" />
			<p>請上傳個人照片</p>
			<fieldset></fieldset>
			<fieldset></fieldset>	
		    <fieldset>
		      	<button name="save" type="submit" id="contact-submit">儲存</button>
		    </fieldset>
	    </form>
	</div>
</body>
</html>