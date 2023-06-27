

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		if(s1.equals("Admin")&& s2.equals("Admin"))
		{
			out.println("<h2>Welcome..."+s1+"</h2>");
		}
		else
		{
			out.println("<h2>Login Failed...</h2>");
		}
	}

}
