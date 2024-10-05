package com.org;

public class StringTrimVsStripTest {
	public static void main(String[] args) {
        String string = '\u2001'+"String    with    space"+ '\u2001';
        String s3 = "test string\u205F";
        System.out.println("Before: \"" + string+"\"");
        System.out.println("After trim: \"" + string.trim()+"\"");
        System.out.println("After strip: \"" + string.strip()+"\"");
        System.out.println("___________________________");
        String trimmedS3 = s3.trim();
        String strippedS3 = s3.strip();
        System.out.printf("'%s'%n",trimmedS3);
        System.out.printf("'%s'%n",strippedS3);
   }
}
