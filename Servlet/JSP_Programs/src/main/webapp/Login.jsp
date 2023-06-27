<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  try
{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutujadb","root","root");
	 
	 PreparedStatement ps=con.prepareStatement("select * from user1 where User_Name=? and Password=?");
	 ps.setString(1, request.getParameter("t1"));
	 ps.setString(2, request.getParameter("t2"));
	 
	 ResultSet rs=ps.executeQuery();
	 if(rs.next())
	 {
		 out.println("<h2>Welcome</h2>");
		 rs.close();
		 con.close();
	 }
	 else
	 {
		 out.println("<h2>Login Failed...!</h2>");
	 }
}
catch(Exception e)
{
	out.println(e);
}
%>
</body>
</html>