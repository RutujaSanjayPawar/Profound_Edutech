<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="obj" class="mypack.Calculator"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int s=obj.sqr(2);
out.println("<h2>Square="+s+"</h2>");

int c=obj.cube(2);
out.println("<h2>Cube="+c+"</h2>");
%>
</body>
</html>