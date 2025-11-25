package examples.lab10;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ReadCookieServlet
 */
@WebServlet("/ReadCookieServlet")
public class ReadCookieServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getting the cookies from the request
		Cookie[] cookieArray = request.getCookies();
		// iterating the cookie to read EMPID
		String cookieName = null;
		String value = null;
		for(Cookie cookie : cookieArray) {
			cookieName = cookie.getName();
			value = cookie.getValue();
		}
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		// prints the cookie name and value in the browser
		out.println("<h2>Cookie Name: "+cookieName+"<br />");
		out.println("Cookie Value: "+value+"</h2>");
		out.print("</body></html>");
	}

}
