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
String s2=request.getParameter("t2");

session.setAttribute("uname", s1);
session.setAttribute("pass", s2);

out.println("<h2>Value Stored in the session</h2>");
%>

<a href="retSession.jsp">Next Page</a>
</body>
</html>