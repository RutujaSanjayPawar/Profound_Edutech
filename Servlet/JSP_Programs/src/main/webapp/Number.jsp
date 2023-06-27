<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="Test.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int n1=Integer.parseInt(request.getParameter("t1"));
int n2=Integer.parseInt(request.getParameter("t2"));
int ans=n1/n2;
out.println("<h2>Division="+ans);
%>
</body>
</html>