package com.lti.psuedocode;

public class Ex13 {

	public static void main(String[] args) {
//		Integer p, q, r
//		Set p = 0, q = 3, r = 14
//		if (1<p && (q+p) >(p+q))
//		    r = q + r
//		End if
//		print p + q + r
		int p = 0, q = 3, r = 14;
		if(1 < p && (q + p) > (p+q)) {
			r = q + r;
		}
		System.out.println(p+q+r);
	}
}
