package examples.day8.session1;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		try {
			 int z = x/y;
			 System.out.println(z);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		scan.close();
	}
}
