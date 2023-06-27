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
String s1=(String)session.getAttribute("uname");
String s2=(String)session.getAttribute("pass");

out.println("<h2>UserName="+s1+"</h2>");
out.println("<h2>Password="+s2+"</h2>");

%>
</body>
</html>