package com.examples.session1;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] items = new int[size];
		for(int index = 0; index < size; index++) {
			items[index] = scan.nextInt();
		}
		int max = findMax(items);
		System.out.println("The maximum value in the array is: "+max);
		scan.close();
		
	}
	public static int findMax(int[] items) {
		int max = items[0];
		for(int index = 1; index < items.length; index++) {
			if(items[index] > max) {
				max = items[index];
			}
		}
		return max;
	}

}
