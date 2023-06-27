

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			
			HttpSession session=request.getSession();
			
			String s1=request.getParameter("t1");
			String s2=request.getParameter("t2");
			
			session.setAttribute("uid", s1);
			session.setAttribute("pwd", s2);
			
			out.println("Value Stored in Session....!");
			out.println("<a href='RetSessionServlet'>Click Here</a>");
			
			out.close();
	}

}
