package com.lti.psuedocode;

public class Ex1 {

	public static void main(String[] args) {
//		Integer a,b,c
//		Set a=9,b=6,c=6
//		for (each c from 5 to 9)
//			if((c+a)>(a-c))
//				a=(b+c)+a
//				b=7&c
//			End if
//			a=a^c
//		End for
//		Print a+b
//		
		int a, b, c;
		a= 9; b = 6; c = 6;
		for( c = 5; c <= 9; c++) {
			if((c + a) > (a - c)) {
				a = (b + c) + a;
				b = 7 & c;
			}
			a = a ^ c;
		}
		System.out.println(a + b);
		
	}

}
// 58