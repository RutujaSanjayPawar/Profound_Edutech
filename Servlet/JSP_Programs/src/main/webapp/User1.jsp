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
   String s1=request.getParameter("t1");
%>
<h1>Welcome<%=s1 %></h1>     
<h2>By using Expression Tag</h2>
</body>
</html>