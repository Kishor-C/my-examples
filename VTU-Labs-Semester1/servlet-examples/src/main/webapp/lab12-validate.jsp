<!--  place where you need to import JDBC API's -->
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  scriptlet that is executed once the request comes to JSP -->
	<%
		String id = request.getParameter("userid");
		int userid = Integer.parseInt(id);
		String pass = request.getParameter("pass");
		// JDBC Code
		try {
			// import com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection with url, username & password
			final String URL = "jdbc:mysql://localhost:3306/mydb";
			final String USERNAME = "root";
			final String PASSWORD = "root";
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// select query to retrieve username and password entered from the form
			String query = "select userid, password from login where userid=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			// set the username and password to the query ?
			pstmt.setInt(1, userid);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			// boolean flag to know while is executed or not
			boolean flag = false; // initially false
			// while loop executes only if query returns result
			while(rs.next()) {
				flag = true;
			}
			if(flag) {
				out.println("<h2 style = 'color:green'>User Id and Password is validated</h2>");
			} else {
				out.println("<h2 style = 'color:red'>User Id or Password is incorrect</h2>");
			}
		} catch(SQLException e) {
			out.println(e);
		} catch(ClassNotFoundException e) {
			out.println(e);
		}
	%>
</body>
</html>