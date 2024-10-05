package com.org;

public class Test1 {
	public void print() {
		String s = " ";
		System.out.println("Java 11 isBlank: "+s.isBlank());
		System.out.println("Java 6 isEmpty: "+s.isEmpty());
		String s2 = "hello world\none more world\nonce again";
		s2.lines().forEach(x -> System.out.println(x));
		
		String s3 = " JD ";
		String s4 = "\u0020JD\u0020";
		System.out.println("Hi"+s3.strip()+"Hello");
		System.out.println("Hi"+s3.trim()+"Hello");
		System.out.println("-------------------------");
		System.out.println("Hi"+s4.strip()+"Hello");
		System.out.println("Hi"+s4.trim()+"Hello");
	}
}
