package com.examples.session2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pattern p = Pattern.compile( "^(?=.*[0-9])"
                + "(?=.*[a-z])"
                + "(?=.*[A-Z])"
                + "(?=.*[~!@#$%^&*()+=])"
                + "(?=\\S+$).{8,15}$");
		String text = scan.nextLine();
		Matcher m = p.matcher(text);
		if(m.matches()) {
			System.out.println(text+" is a valid password");
		} else {
			System.out.println(text+" is a invalid password");
		}
		scan.close();
	}
}
