<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="u1" class="mypack.UserBean"></jsp:useBean>
    <jsp:setProperty property="*" name="u1"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
UserID:<jsp:getProperty property="uid" name="u1"/><br><br>
Password:<jsp:getProperty property="pwd" name="u1"/><br><br>
UserName:<jsp:getProperty property="uname" name="u1"/><br><br>
Email:<jsp:getProperty property="email" name="u1"/><br><br>
</body>
</html>