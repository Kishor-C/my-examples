package com.examples;

public class TestMath {
	public static void main(String[] args) {
		System.out.printf("%.4f\n",Math.PI);
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(8));
		System.out.println(Math.max(25, 30));
		System.out.println(Math.min(25, 30));
		double random = Math.random();
		System.out.println(Math.ceil(random * 100));
		
		System.out.println("--------------------------------");
		int i1 = 5;
		int i2 = 6;
		double d1 = 25.0;
		double d2 = 35.0;
		String s1 = "a";
		String s2 = "b";
		System.out.println("[i1, i2] = "+Integer.compare(i1, i2));
		System.out.println("[d1, d2] = "+Double.compare(d1, d2));
		System.out.println("[s1, s2] = "+s1.compareTo(s2));
	}
}
