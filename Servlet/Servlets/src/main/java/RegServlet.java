

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

import com.mysql.cj.xdevapi.PreparableStatement;

@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		PreparedStatement ps;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutujadb","root","root");
			
			ps=con.prepareStatement("select * from userreg where UId=?");
			ps.setString(1,request.getParameter("t1"));
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				out.println("User with this ID is already Exist");
			}
			else
			
				ps=con.prepareStatement("insert into userreg value(?,?,?,?,?)");
				
				ps.setString(1, request.getParameter("t1"));
				ps.setString(2, request.getParameter("t2"));
				ps.setString(3, request.getParameter("t3"));
				ps.setString(4, request.getParameter("t4"));
				ps.setString(5, request.getParameter("t5"));
				
				ps.executeQuery();
				
			out.println("Record inserted Secessfully..............!");
			rs.close();
			con.close();
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
