

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

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;

import com.mysql.cj.xdevapi.PreparableStatement;


@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutujadb","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from user1 where User_Name=? and Password=?");
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				out.println("<h2>Welcome.....!"+" "+s1+"</h2>");
			}
			else
			{
				out.println("<h2>Login Failed....!</h2>");
			}
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
