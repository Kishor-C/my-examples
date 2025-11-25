package com.lti.psuedocode;

public class Ex12 {

	public static void main(String[] args) {
//		Integer p,q,r
//		Set p=4, q=2, r=12
//		for(each r from 4 to 6)
//		   p= (r+7)+p
//		   q= (q&11)+p
//		End for
//		for (each r from 2 to 4)
//		   q= (4+9)+r
//		End for
//		Print p+q
		int p = 4, q = 2, r = 12;
		for( r = 4; r <= 6; r++) {
			p = (r + 7) + p;
			q = (q & 11) + p;
		}
		for(r = 2; r <= 4; r++) {
			q = (4 + 9) + 4;
		}
		System.out.println(p+q);
	}
}
