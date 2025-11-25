package com.examples.session1;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int celsius = scan.nextInt();
		double fahrenheit = 1.8 * celsius  + 32;
		System.out.println(fahrenheit);
		scan.close();
	}
}
