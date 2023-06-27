

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlets")
public class LoginServlets extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutujadb","root","root");
			
			String s1=request.getParameter("t1");
			String s2=request.getParameter("t2");
			
			PreparedStatement ps=con.prepareStatement("select * from user1 where User_Name=? and Password=?");
			ps.setString(1, s1);
			ps.setString(2, s2);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				out.println("<fotm method='post' action='UpdateServlets'>");
				out.println("User_Name:<input type='text' name='t1' value='"+s1+"'><br><br>");
				out.println("Old Password:<input type='password' name='t2' value='"+s2+"'><br><br>");
				out.println("New Password:<input type='password' name='t3'>");
				out.println("<input type='submit' value='update'>");
				
				out.println("</form>");
			}
			else
			
				out.println("<h2>Login Failed....!");
			out.close();
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
