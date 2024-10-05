package com.org2;

class Lab8 { 
	static int m1() {
		System.out.println("m1() in class Lab8");
		return 10;
	}
	static {
		System.out.println("SIB-Lab8");
	}
}

class Lab9 extends Lab8 { 
	static {
		System.out.println("SIB-Lab9");
	}
}


public class Hello {
	public static void main(String[] args) {
		// invoking m1() from sub-class
		System.out.println(Lab9.m1());	
	}
}
