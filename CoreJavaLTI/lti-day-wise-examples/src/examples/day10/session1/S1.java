package examples.day10.session1;

//You are using Java

import java.sql.*;
import java.util.*;

class S1 {
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     Connection con = null;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
     
     String url = "jdbc:mysql://localhost/ri_db";
     String username = "test";
     String password = "test123";
     
     try{
         con = DriverManager.getConnection(url,username,password);
         int choice = Integer.parseInt(scan.nextLine());
         switch(choice) {
         case 1: 
         	String insertQuery = "insert into election_committee values(?,?,?,?,?)";
         	pstmt = con.prepareStatement(insertQuery);
         	pstmt.setInt(1, Integer.parseInt(scan.nextLine()));
         	pstmt.setString(2, scan.nextLine());
         	pstmt.setString(3, scan.nextLine());
         	pstmt.setString(4, scan.nextLine());
         	pstmt.setString(5, scan.nextLine());
         	pstmt.executeUpdate();
         	System.out.println("Committee member added successfully.");
         	break;
         case 2: 
         	String updateQuery = "update election_committee set role=? where committee_id=?";
         	pstmt = con.prepareStatement(updateQuery);
         	pstmt.setInt(2, Integer.parseInt(scan.nextLine()));
         	pstmt.setString(1, scan.nextLine());
         	
         	pstmt.executeUpdate();
         	System.out.println("Committee member updated successfully.");
         	break;
         case 3: 
         	String deleteQuery = "delete from election_committee where committee_id=?";
         	pstmt = con.prepareStatement(deleteQuery);
         	pstmt.setInt(1, Integer.parseInt(scan.nextLine()));
         	pstmt.executeUpdate();
         	System.out.println("Committee member deleted successfully.");
         	break;
         case 4: 
         	break;
         }
     }catch(SQLException e){
         e.printStackTrace();
     }finally{
         try{
         	pstmt = con.prepareStatement("select * from election_committee");
         	rs = pstmt.executeQuery();
         	while(rs.next()) {
         		System.out.println("ID: "+rs.getInt("committee_id")+
         				", Role: "+rs.getString("role")+
         				", Member Name: "+rs.getString("member_name")+
         				", Committee Type: "+rs.getString("committee_type")+
         				", Term Period: "+rs.getString("term_period"));
         	}
         	rs.close();
         	pstmt.close();
             con.close();
             scan.close();
         }catch(SQLException e){
             e.printStackTrace();
         }
     }
 }
}
