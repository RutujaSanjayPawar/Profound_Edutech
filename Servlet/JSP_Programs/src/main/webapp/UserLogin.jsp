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

if(s1.equals("User1") && s2.equals("User1"))
{
	%>
	<jsp:forward page="Welcome.jsp">
	<jsp:param value="<%=s1 %>" name="uname"/>
	</jsp:forward>
<% 
}
else
{
	%>
	<h1>Login Failed....!</h1>
	<jsp:include page="UserLogin.html"></jsp:include>
<% 
}
%>
</body>
</html>