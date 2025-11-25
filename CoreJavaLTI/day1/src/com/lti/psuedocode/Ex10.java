package com.lti.psuedocode;

public class Ex10 {

	public static void main(String[] args) {
//		Integer a,b, c
//		Set a = 3, b = 4, c = 5
//		if ((b - c + a)< ( a - b ))
//		   a = ( a + 9 ) & a
//		   b = ( c & c) + a
//		   if (( a + 6) >(c-a))
//		    c = ( c +c) + c
//		   End if
//		   c = b + a
//		   c = 8 + a
//		End if
//		Print a + b+c 
		int a = 3, b = 4, c = 5;
		if((b - c + a) < (a - b)) {
			a = (a + 9) &a;
			b = (c & c) + a;
			if((a + 6) > (c - a)) {
				c = (c + c ) +c;
			}
			c = b + a;
			c = 8 + a;
		}
		System.out.println(a + b + c);
	}
}
