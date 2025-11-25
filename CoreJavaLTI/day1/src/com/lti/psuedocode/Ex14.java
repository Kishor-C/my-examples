package com.lti.psuedocode;

public class Ex14 {

	public static void main(String[] args) {
//		Integer funn(Integer a, Integer b,Integer C)
//		if (a>c || (9^5)<a)
//			a=2+a
//			c=b+a
//		End if
//		return a+b+c
		System.out.println(funn(6,4,9));
		//System.out.println(9^5);
	}
	public  static int funn(int a, int b, int c) {
		if (a > c || (9^5) < a) {
			System.out.println("if executed");
			a = 2 + a;
			c = b + a;
		}
		return a + b + c;
	}
}
// 19