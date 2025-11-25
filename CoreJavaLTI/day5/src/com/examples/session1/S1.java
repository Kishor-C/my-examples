package com.examples.session1;

import java.util.Scanner;

class Customer {
	public int calculateLoyaltyPoints(int amount) {
		return amount/10;
	}
}
class PremiumCustomer extends Customer {
	public int calculateLoyaltyPoints(int amount) {
		return 2*(amount/10);
	}
}

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		String status = scan.next();
		int points = 0;
		if(status.equals("yes")) {
			PremiumCustomer pc = new PremiumCustomer();
			points = (int)pc.calculateLoyaltyPoints(amount);
		} else {
			Customer c = new Customer();
			points = (int)c.calculateLoyaltyPoints(amount);
		}
		System.out.println(points);
		scan.close();
	}
}
