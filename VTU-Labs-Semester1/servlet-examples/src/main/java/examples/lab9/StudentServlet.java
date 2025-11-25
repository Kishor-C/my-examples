package examples.lab9;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		// reading the name, usn and total marks from the client
		String name = request.getParameter("name");
		String usn = request.getParameter("usn");
		String marks = request.getParameter("marks");
		// prints the output in the browser
		out.println("<h2>Student Details:-</h2>");
		out.println("<h3>");
		out.println("USN = "+usn+"<br/>");
		out.println("Name = "+name+"<br/>");
		out.println("Total Marks = "+marks+"</h3>");
		out.print("</body></html>");
	}

}
