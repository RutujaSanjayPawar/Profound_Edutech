<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="s1" value="${'Welcome' }"/>
<c:out value="${s1 }"/>

${fn:toLowerCase(s1) }
${fn:toUpperCase(s1) }
Length=${fn:length(s1) }


</body>
</html>