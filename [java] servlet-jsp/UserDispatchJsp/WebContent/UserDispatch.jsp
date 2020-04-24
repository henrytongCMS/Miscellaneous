<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
<%
	String gender = request.getParameter("gender");
	
	if(gender.equals("Male")) 
		response.sendRedirect("https://shopping.pchome.com.tw/");
	else 
		response.sendRedirect("https://tw.buy.yahoo.com/");
%>
</body>
</html>