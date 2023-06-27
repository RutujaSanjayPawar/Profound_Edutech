<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="s1" class="mypack.StudentBean"></jsp:useBean>
    <jsp:setProperty property="name" name="s1" value="Rutuja"/>
    <jsp:setProperty property="marks" name="s1" value="81"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Name:<jsp:getProperty property="name" name="s1"/>
Marks:<jsp:getProperty property="marks" name="s1"/>
</body>
</html>