package examples.day8.session3;


import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = "";
		
		try {
			String name = scan.nextLine();
			x = scan.next();
			int grade = Integer.parseInt(x);
			validateGrade(grade);
			System.out.println("Grade for "+name+": "+grade);
		} catch(NumberFormatException e) {
			System.out.println("Invalid input: For input string: \""+x+"\"");
		} catch(IllegalArgumentException e) {
			System.out.println("Invalid grade: "+e.getMessage());
		}
		scan.close();
	}
	public static void validateGrade(int grade) throws IllegalArgumentException {
		if(grade < 0 || grade > 100) {
			throw new IllegalArgumentException("Invalid grade: "+grade);
		} 
	}
}
