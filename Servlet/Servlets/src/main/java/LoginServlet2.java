

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		if(s1.equals("Rutuja") && s2.equals("Rutuja123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h2>Login Failed....!</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("Login2.html");
			rd.include(request, response);
		}
		out.close();
	}

}
