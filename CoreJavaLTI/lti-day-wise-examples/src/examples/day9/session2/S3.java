package examples.day9.session2;
import java.sql.*;
import java.util.*;

public class S3 {
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
			stmt = con.prepareStatement("insert into office values(?,?,?)");
			int size = Integer.parseInt(scan.nextLine());
			for(int i = 0; i < size; i++) {
				stmt.setInt(1, Integer.parseInt(scan.nextLine()));
				stmt.setString(2, scan.nextLine());
				stmt.setInt(3, Integer.parseInt(scan.nextLine()));
				stmt.executeUpdate();
			}
			stmt.close();
			stmt = con.prepareStatement("select * from office");
			rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("EID");
				String name = rs.getString("ENAME");
				int salary = rs.getInt("ESALARY");
				System.out.println(id+" "+name+" "+salary);
			}
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
