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
		<c:if test="${user == null}"><form id="contact" action="InsertServlet" method="post"></c:if>
		<c:if test="${user != null}"><form id="contact" action="UpdateServlet" method="post"></c:if>
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
	    <c:if test="${user != null}">
	   		<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
	   	</c:if>
	    <fieldset>
	      	<input placeholder="姓名" type="text" name="name" required value="<c:out value='${user.name}' />" />
	    </fieldset>
	    <fieldset>
	      	<input placeholder="電郵地址" type="email" name="email" required value="<c:out value='${user.email}' />" />
	    </fieldset>
	    <fieldset>
	      	<input placeholder="國籍" type="text" name="country" required value="<c:out value='${user.country}' />" />
	   	</fieldset>
		<fieldset></fieldset>	
	    <fieldset>
	      	<button name="save" type="submit" id="contact-submit">下一步</button>
	    </fieldset>
	</div>
</body>
</html>