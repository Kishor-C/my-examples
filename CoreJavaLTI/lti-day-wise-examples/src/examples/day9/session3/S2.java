package examples.day9.session3;

import java.sql.*;
import java.util.*;

public class S2 {
	public static void main(String[] args) {
		 	Connection con = null;
	        PreparedStatement stmt = null;
	        ResultSet rs = null;
	        String DB_URL = "jdbc:mysql://localhost/ri_db";
	        String DB_USER = "test";
	        String DB_PWD = "test123";
	        Scanner scan = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
			System.out.println("Database connected successfully.");
			int criteria = Integer.parseInt(scan.nextLine());
			int counter = 0;
			stmt = con.prepareStatement("select * from employee where salary >=?");
			
			stmt.setInt(1, criteria);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				double salary = rs.getInt("SALARY");
				counter++;
				System.out.println(id+" "+name+" "+salary);
			}
			if(counter == 0) {
				System.out.println("No records found for the given salary threshold.");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
			scan.close();
			rs.close();
			stmt.close();
			con.close();
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Connection closed successfully.");
		}
	}
}
