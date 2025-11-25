package com.lti.psuedocode;

public class Ex3 {

	public static void main(String[] args) {
//		Integer funn(Integer a, Integer b)
//		if (a>b || b<a)
//			return 1+funn(a+a-b+b+b+a, a+a-b+b+b+a)
//		End if
//		return a
				
				
		System.out.println(funn(4, 2));
	}
	
	public static int funn(int a, int b) {
		if ((a > b) || (b < a)) {
			return 1 + funn(a+a-b+b+b+a, a+a-b+b+b+a);
		}
		return a;
	}

}
//15