

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatePwd")
public class UpdatePwd extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String s1=request.getParameter("un");
		String s2=request.getParameter("npd");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutujadb","root","root");
			
			PreparedStatement ps=con.prepareStatement("update Bank_Account ser Password=? where UserID=?");
			ps.setString(1, s2);
			ps.setString(2,s1);
			ps.executeUpdate();
			
			out.println("<h2>Password Updated Sucessfully</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("UserLogin.html");
			rd.include(request, response);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
