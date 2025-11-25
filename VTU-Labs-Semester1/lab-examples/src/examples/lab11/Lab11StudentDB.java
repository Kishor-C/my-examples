package examples.lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;


/*
 * Create a student table in mysql in one of the database name
 * for ex: mydb 
 * and enter below commands
 * create table student(rollno int primary key, name varchar(15), age int, grade varchar(5));
 */
public class Lab11StudentDB {

	public static void main(String[] args) {
		// this program stores student rollno, name, age and grade to the mysql database
		// we are using Student table
		try { 
			// import Driver from com.mysql.cj.jdbc
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection with url, username & password
			final String URL = "jdbc:mysql://localhost:3306/mydb";
			final String USERNAME = "root";
			final String PASSWORD = "root";
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			PreparedStatement pstmt = null; // to take the queries
			ResultSet rs = null; // to navigate the results obtained from the table
			// create all the queries - insert, update grade, delete by rollno, retrieve by rollno
			String insert = "insert into student(rollno, name, age, grade) values(?,?,?,?)"; 
			String update = "update student set grade = ? where rollno = ?";
			String retrieve = "select rollno, name, age, grade from student where rollno = ?";
			String delete = "delete from student where rollno = ?";
			// option to loop the DB operations
			int option = 0;
			// Scanner to take input
			Scanner scan = new Scanner(System.in);
			
			do {
				System.out.println("Enter any one of the below options:-");
				System.out.println("1: insert 2: update grade using rollno "
						+ "3: retrieve by rollno 4: delete by roll on 5: exit");
				option = scan.nextInt();
				switch(option) {
				case 1: 
					System.out.println("Enter rollno");
					int rollno = scan.nextInt();
					System.out.println("Enter name");
					String name = scan.next();
					System.out.println("Enter age");
					int age = scan.nextInt();
					System.out.println("Enter grade");
					String grade = scan.next();
					// create statement to insert
					pstmt = con.prepareStatement(insert);
					// set the ? with rollno, name, age & grade
					pstmt.setInt(1, rollno);
					pstmt.setString(2, name);
					pstmt.setInt(3, age);
					pstmt.setString(4, grade);
					// execute the statement
					int count = pstmt.executeUpdate();
					System.out.println("Row updated: "+count);
					break;
				case 2: 
					System.out.println("Enter grade to update followed by rollno");
					grade = scan.next();
					rollno = scan.nextInt();
					// create statement to update - 1st ? is grade & 2nd ? is rollno
					pstmt = con.prepareStatement(update);
					pstmt.setString(1, grade);
					pstmt.setInt(2, rollno);
					// execute the statement
					count = pstmt.executeUpdate();
					System.out.println("Row updated: "+count);
					break;
				case 3: 
					System.out.println("Enter rollno to retrieve");
					rollno = scan.nextInt();
					// create statement to retrieve
					pstmt = con.prepareStatement(retrieve); // 1st ? is rollno
					pstmt.setInt(1, rollno);
					// execute the statement and store in the ResultSet rs
					rs = pstmt.executeQuery();
					// navigate over the result if retrieved, else it doesn't print anything
					while(rs.next()) {
						System.out.println("Rollno = "+rs.getInt(1));
						System.out.println("Name = "+rs.getString(2));
						System.out.println("Age = "+rs.getInt(3));
						System.out.println("Grade = "+rs.getString(4));
					}
					break;
				case 4: 
					System.out.println("Enter rollno to delete");
					rollno = scan.nextInt();
					// create statement to update - 1st ? is rollno
					pstmt = con.prepareStatement(delete);
					pstmt.setInt(1, rollno);
					// execute the statement
					count = pstmt.executeUpdate();
					System.out.println("Row updated: "+count);
					break;
				default : System.out.println("Invalid option");
				}
			} while(option != 5);
			
			// close all the resources, check for null and close
			// because user may not always choose all the above options from 1 to 4
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(rs != null) {
				rs.close();
			}
			scan.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
