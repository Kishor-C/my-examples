package examples.day8.session3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			int n = scan.nextInt();
			boolean status = isArmstrongNumber(n);
			if(status) {
				System.out.println(n+" is Armstrong number.");
			} else {
				System.out.println(n+" is not Armstrong number.");
			}
		} catch(IllegalArgumentException e) {
			System.out.println("Error: Input number must be non-negative");
		} catch(InputMismatchException e) {
			System.out.println("Error: Input must be a valid integer.");
		} finally {
			
		}
		scan.close();
	}
	public static boolean isArmstrongNumber(int num)throws IllegalArgumentException{
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        int temp = num;
        int digits = String.valueOf(num).length(); // Count number of digits in the number
        // Calculate the sum of the powers of each digit
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }
}
