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
	
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from employee");
	
	out.println("<table border=2>");
	out.println("<tr><th>Emp_id</th><th>F_Name</th><th>L_Name</th><th>Salary</th><th>Joining_Date</th><th>Department</th></tr>");
	
	while(rs.next())
	{
 %>

   <tr><td><%=rs.getInt(1) %></td>
       <td><%=rs.getString(2) %></td>
       <td><%=rs.getString(3) %></td>
       <td><%=rs.getFloat(4) %></td>
       <td><%=rs.getDate(5) %></td>
       <td><%=rs.getString(6) %></td>
   </tr>
   
   
      <% 
	}
	out.println("</table>");
	rs.close();
	con.close();
	
}
catch(Exception e)
{
	out.println(e);
}

%>
</body>
</html>