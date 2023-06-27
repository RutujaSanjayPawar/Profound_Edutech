

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String s1=request.getParameter("un");
		out.println("<form method='get' action='UpdatePwd'>");
		out.println("UserName:<input type='text' name='un' value='"+s1+"'><br><br>");
		out.println("New Password:<input type='password'>");
		out.println("<input type='submit' value='Update'>");
		out.println("</form>");
	}

}
