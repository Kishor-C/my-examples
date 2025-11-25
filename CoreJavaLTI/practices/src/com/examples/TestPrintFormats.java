package com.examples;

public class TestPrintFormats {
	public static void main(String[] args) {
		String x = "Kishor";
		double y = 1000/3;
		int z = 25;
		char c = 'x';
		System.out.printf("%s\t%S\t%1.3f\t%d\t%c", x,x,y,z,c);
	}
}
