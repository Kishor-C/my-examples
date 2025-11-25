package examples.day9.session2;
//You are using Java
//You are using Java
import java.sql.*;

public class S1 {
 public static void main(String[] args) {
     Connection con = null;
     Statement stmt = null;
     ResultSet rs = null;
     String DB_URL = "jdbc:mysql://localhost/ri_db";
     String DB_USER = "test";
     String DB_PWD = "test123";
     try { 
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD); 
         stmt = con.createStatement();
         String query = "select * from contacts";
         rs = stmt.executeQuery(query);
         while(rs.next()) {
             int id = rs.getInt("ID");
             String name = rs.getString("NAME");
             String email = rs.getString("EMAIL");
             String phone = rs.getString("PHONE_NUMBER");
             String city = rs.getString("CITY");
             System.out.println("ID: "+id+", Name: "+name+", Email: "+email+
             ", Phone Number: "+phone+", City: "+city);
         }
         rs.close(); stmt.close(); con.close();
     } catch(SQLException | ClassNotFoundException e) { 
         System.out.println(e);
     }
 }
}