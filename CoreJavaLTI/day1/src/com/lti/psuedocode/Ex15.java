package com.lti.psuedocode;

public class Ex15 {

	public static void main(String[] args) {
//		Integer a,b,c
//		Set a=9,b=2,c=13
//		a=(a+2)+a
//		c=10&b
//		a=(c&c)+c
//		Print a+b+c
		int a = 9, b = 2, c = 13;
		a = (a + 2) + a;
		c = 10 & b;
		a = (c & c ) + c;
		System.out.println(a + b + c);
	}
	
}
