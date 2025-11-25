package com.examples.session2;

public class TestWrappers {
	public static void main(String[] args) {
		char c = '1';
		System.out.println(Character.isDigit(c));
		char d = 'a';
		System.out.println(Character.isAlphabetic(d));
		
		String s = "Hhello java world.";
		System.out.println(s.contains("java"));
		System.out.println(s.endsWith("."));
		System.out.println(Character.isUpperCase(s.charAt(0)));;
		
		String str = "  hel2o wo3ld h5w a8e y9u";
		System.out.println(str.substring(5));
		System.out.println(str.substring(2, 5));
		String replaced = str.replaceAll("[0-9]", "D");
		System.out.println(replaced);
		
	}
}
