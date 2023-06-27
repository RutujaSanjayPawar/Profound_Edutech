

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/RetSessionServlet")
public class RetSessionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session=request.getSession();
		
		String s1=(String)session.getAttribute("uid");
		String s2=(String)session.getAttribute("pwd");
		
		out.println("<h2>User Id="+s1+"</h2>");
		out.println("<h2>Password="+s2+"</h2");
	}

}
