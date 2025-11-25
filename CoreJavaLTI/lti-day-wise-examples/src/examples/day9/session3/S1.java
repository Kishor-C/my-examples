package examples.day9.session3;

import java.sql.*;
import java.util.*;

public class S1 {
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
			stmt = con.prepareStatement("insert into student values(?,?,?,?,?)");
			int size = Integer.parseInt(scan.nextLine());
			int affectedRows = 0;
			for(int i = 0; i < size; i++) {
				stmt.setInt(1, Integer.parseInt(scan.nextLine()));
				stmt.setString(2, scan.nextLine());
				stmt.setInt(3, Integer.parseInt(scan.nextLine()));
				stmt.setInt(4, Integer.parseInt(scan.nextLine()));
				stmt.setInt(5, Integer.parseInt(scan.nextLine()));
				affectedRows = affectedRows + stmt.executeUpdate();
			}
			
			stmt.close();
			stmt = con.prepareStatement("select * from student");
			rs = stmt.executeQuery();
			while(rs.next()) {
				int rollNo = rs.getInt("ROLLNO");
				String name = rs.getString("SNAME");
				int marks1 = rs.getInt("MARK1");
				int marks2 = rs.getInt("MARK2");
				int marks3 = rs.getInt("MARK3");
				System.out.println("Roll No: "+rollNo);
				System.out.println("Name: "+name);
				System.out.println("Marks1: "+marks1);
				System.out.println("Marks2: "+marks2);
				System.out.println("Marks3: "+marks3);
			}
			System.out.println(affectedRows);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
			scan.close();
			rs.close();
			stmt.close();
			con.close();
			} catch(SQLException e) {
				System.out.println(e);
			}
			System.out.println("Connection closed successfully.");
		}
	}
}
