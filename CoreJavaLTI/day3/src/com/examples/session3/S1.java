package com.examples.session3;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String strippedText = text.trim().replaceAll("\\s+", " ");
		String[] splitText = strippedText.split(" ");
		String reversedString = "";
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < splitText.length; i++) {
			StringBuffer sb = new StringBuffer(splitText[i]);
			buffer.append(sb.reverse() + " ");
			
		}
		reversedString = "\""+buffer.toString().trim()+"\"";
		strippedText = "\""+strippedText+"\"";
		System.out.println("Message after removing extra spaces: "+strippedText);
		System.out.println("Message with each word reversed: "+reversedString);
		System.out.println("Word count: "+splitText.length);
		scan.close();
	}
}
