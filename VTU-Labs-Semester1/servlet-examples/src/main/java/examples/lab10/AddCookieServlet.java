package examples.lab10;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AddCokieServlet
 */
@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Creating the cookie
		Cookie cookie = new Cookie("EMPID", "AN2356");
		// adding the cookie
		response.addCookie(cookie);
		// request goes to another servlet
	
		RequestDispatcher rd = request.getRequestDispatcher("cookie-demo.html");
		rd.forward(request, response);
	}

}
