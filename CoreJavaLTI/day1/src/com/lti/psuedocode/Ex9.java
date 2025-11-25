package com.lti.psuedocode;

public class Ex9 {

	public static void main(String[] args) {
//		Integer p,q,r
//		Set p=3, q=8, r=4
//		q=(r+10)+p
//		p=(4+6)+q
//		if((8&q)<(p&8))
//		   p=(p^1)+r
//		End if
//		Print p+q+r
		int p = 3, q = 8, r = 4;
		q = (r + 10) + p;
		p = (4 + 6) + q;
		if((8&q) < (p&8)) {
			p=(p^1)+r;
		}
		System.out.println(p+q+r);
	}
}
