package examples.day8.session1;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		try {
			if(n == 0) {
				throw new ArithmeticException("ArithmeticException");
			}
			if(n > 7) {
				throw new IllegalArgumentException("IllegalArgumentException");
			}
			System.out.println(n);
		} 
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" caught - / by zero");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage()+" caught - Number should not be greater than 7");
		}
	}
}
