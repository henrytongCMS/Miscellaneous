<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>使用者管理系統</title>
	<style type="text/css"><%@ include file="css/table.css" %></style>
	<script type="text/javascript"><%@ include file="js/confirm.js" %></script>
</head>
<body>
    <div align="center" class="table-users">
    	<div class="header">
    		<h1>使用者管理系統</h1>
    		<div></div>
    		<h3>
    			使用者列表
    			<a href="LogoutServlet"><img class="ico" title="登出" src="https://img.icons8.com/nolan/64/000000/exit.png"></a>
    			<a href="NewServlet"><img class="ico" title="新增資料" src="https://img.icons8.com/nolan/64/000000/add.png"></a>
    		</h3> 
    	</div>
        <table cellspacing="0">
            <tr>
                <th>編號</th>
                <th>照片</th>
                <th>姓名</th>
                <th>電郵地址</th>
                <th>國籍</th>
                <th>動作</th>
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}"/></td>
                    <td><img src="/file/<c:out value='${user.name}'/>.jpg "/></td>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.email}"/></td>
                    <td><c:out value="${user.country}"/></td>
                    <td>
                    	<a href="EditServlet?id=<c:out value='${user.id}'/>"><img class="ico2" title="修改資料" src="https://img.icons8.com/nolan/64/000000/edit--v1.png"></a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a onclick="confirmDelete(${user.id})" ><img class="ico2" title="刪除資料" src="https://img.icons8.com/nolan/64/000000/delete-sign.png"></a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	  
</body>
</html>
