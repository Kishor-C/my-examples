package com.examples.session3;

import java.util.Scanner;

public class Test2DArraySort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int arr2D[][] = new int[r][c];
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j < arr2D[i].length; j++) {
				arr2D[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j]+ " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

	public static void sort2DArray(int[][] arr) {
		
	}
}
