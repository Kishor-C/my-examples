package com.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[0-9])(?=.*[^ ]).{5,20}$");
		Matcher m = p.matcher("hello 1234");
		System.out.println(m.matches());
	}
}
