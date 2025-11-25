package com.examples.session1;

import java.util.*;

class S2{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[5];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        // to reverse
        int[] reversed = reverseArray(arr);
        for(int x : reversed) {
            System.out.println(x);
        }
        scan.close();
    }
    public static int[] reverseArray(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[arr.length - 1 -  i]; 
        }
        return copy;
    }
}