package com.lti.psuedocode;

public class Ex2 {

	public static void main(String[] args) {
//		Integer p, q, r
//		Set q = 13
//		for (each p from 1 to 4)
//		    r = q mod p
//		    p = p + 5
//		    q = p + r
//		end for
//		r = q / 5
//		Print q , r
		int p, q, r;
		q = 13;
		for(p = 1; p <= 4; p++) {
			r = q % p;
			p = p + 5;
			q = p + r;
		}
		r = q / 5;
		System.out.println(q + ", "+ r);
	}
}
// 6,1