

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h2>Welcome Registration Page</h2>");
		out.println("<form method='get' action='Registration'>"
				+"UserName:<input type='text' name='t1'><br><br>"
				+"Password:<input type='text' name='t2'><br><br>"
				+"First Name:<input type='text' name='t3'><br><br>"
				+"Last Name:<input type='text' name='t4'><br><br>"
				+"Contact No:<input type='text' name='t5'><br><br>"
				+"Address No:<input type='text' name='t6'><br><br>"
				+"Account No:<input type='text' name='t7'><br><br>"
				+"Balance:<input type='text' name='t8'><br><br>"
				+"<input type='submit' name='Register'>"
				+"</form>"
				);
	}

}
