<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String s =(String)request.getAttribute("name");
LocalDateTime ld =(LocalDateTime)request.getAttribute("time");
%>
<%= s

%>
<h1><%=ld %></h1>
</body>
</html>