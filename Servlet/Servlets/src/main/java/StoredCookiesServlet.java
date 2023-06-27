

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StoredCookiesServlet")
public class StoredCookiesServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		Cookie c1=new Cookie("desc", s1);
		Cookie c2=new Cookie("qua", s2);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		out.println("<h2>Value stored in cookie</h2>");
		out.println("<form method='post' action='RetCookieServlet'>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
		out.close();
	}

}
