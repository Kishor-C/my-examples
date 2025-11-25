package com.lti.psuedocode;

public class Ex7 {

	public static void main(String[] args) {
//		Integer p,q,r
//		Set p=2, q=9, r=12
//		if((r&q)<p)
//		   r=q+p
//		   r=p+r
//		End if
//		Print p+q+r
		int p = 2, q = 9,  r = 12;
		if((r & q) < p) {
			r = q + p;
			r = p + r;
		}
		System.out.println(p + q + r);
		
	}
	
	

}
//23