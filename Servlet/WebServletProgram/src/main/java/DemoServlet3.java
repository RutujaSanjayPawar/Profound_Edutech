

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "DemoServlet3", urlPatterns = { "/DemoServlet3" })
public class DemoServlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		ServletContext ctx=getServletContext();
		
		String s1=ctx.getInitParameter("UserName");
		String s2=ctx.getInitParameter("Password");
		
		out.println("<h2>UserName="+s1+"</h2>");
		out.println("<h2>Password="+s2+"</h2>");
		out.close();
	}

}
