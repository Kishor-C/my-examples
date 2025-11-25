package com.examples.session2;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  int n1 = scan.nextInt();
	      int n2 = scan.nextInt();
		  scan.close();
		  boolean prime;
		  // for loop from n1 to n2
		  for(int i = n1; i <= n2; i++) {
			  // set prime = true always
			  prime = true;
			  // for loop that starts from 2 but ends before reaching i value
			  for(int j = 2; j <= i / 2; j++) {
				  // check if n1 % n2 is divisible 
				  if(i % j == 0) {
					  prime = false;
				  }
			  }
			  if(prime && i != 0 && i != 1) {
				  System.out.println(i);
			  }
		  }

	}
}
