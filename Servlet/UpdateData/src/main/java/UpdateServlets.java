

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateServlets")
public class UpdateServlets extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutujadb","root","root");
			
		    PreparedStatement ps=con.prepareStatement("update user1 set Password=? where User_Name=?");
		    ps.setString(1, request.getParameter("t3"));
		    ps.setString(2, request.getParameter("t1"));
		    
		    ps.executeUpdate();
		    out.println("<h2>Password updated Scessfully.....</h2>");
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.close();
	}

}
