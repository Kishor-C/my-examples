package com.examples.session1;

public class ContinueBreakReturn {
	public static void main(String[] args) {
		int result = test(2);
		System.out.println(result);
	}
	
	public static int test(int x) {
		for(int i = 1; i <= 5; i++) {
			if(i == x) {
				System.out.println(x+" is found");
				break;
			}
			System.out.println("i = "+i+", for loop iterating");
		}
		return 1;
	}
}
