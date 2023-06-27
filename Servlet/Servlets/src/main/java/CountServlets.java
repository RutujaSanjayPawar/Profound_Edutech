

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CountServlets")
public class CountServlets extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session=request.getSession();
		Integer obj=(Integer)session.getAttribute("count");
		if(obj==null)
			obj=1;
		else
			obj=obj+1;
		out.println("<h2> Page Accessed"+" "+obj+" "+"times");
		session.setAttribute("count", obj);
		out.close();
		
	}

}
