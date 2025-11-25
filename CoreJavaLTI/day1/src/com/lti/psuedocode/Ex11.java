package com.lti.psuedocode;

public class Ex11 {

	public static void main(String[] args) {
//		Integer a,b,c
//		Set a=0,b=4,c=8
//		if ((c+a+b)>(b-c))
//			b=(c+c)+a
//			c=(c+c)+a
//		End if
//		if ((c^a^b)<(b^c))
//			a= 3 & a
//		End if
//		Print a+b+c
		int a = 0, b = 4, c = 8;
		if((c + a + b) > (b - c)) {
			b = (c+c)+a;
			c = (c+c)+a;
		}
		if((c^a^b)<(b^c)) {
			a = 3 & a;
		}
		System.out.println(a+b+c);
	}
}
