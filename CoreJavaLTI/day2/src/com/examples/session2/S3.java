package com.examples.session2;

import java.util.Scanner;

public class S3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        int f=1;
        int n = scan.nextInt();
        for(int i = n; i>=1; i--) {
        	f = f * i;
        }
        System.out.println(f);
        scan.close();

	}
}
