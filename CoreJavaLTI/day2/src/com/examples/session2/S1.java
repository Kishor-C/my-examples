package com.examples.session2;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        int count=0;
	        for(int i=1;i<=n;i++){
	            if(n%i == 0) {
	            	count++;
	            }
	                
	        }
	        System.out.println(count);

	}
}
