package com.examples.session2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile( "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*()+=])(?=\\S+$).{8,15}$");
//
//		Matcher m = p.matcher("abcA@1Wel");
//		if(m.matches()) {
//			System.out.println("Found");
//		} else {
//			System.out.println("Not Found");
//		}
		//Pattern p = Pattern.compile("^abc$");
		Pattern p;
		String regex;
		regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*()_+=]).{5,10}$";
		p = Pattern.compile(regex);
		Matcher m = p.matcher("xdI0ak dk@");
		System.out.println(m.matches());
	}
}
