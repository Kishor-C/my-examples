package com.examples.session3;

public class FindingSumOfLeaders {
	public static void main(String[] args) {
		int arr[] = {52, 66, 64, 36, 45, 24, 32};
		//int arr[] = {33, 7, 21, 14};
		//int sum = sumOfLeader(arr);
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isLeader(arr, i)) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
	public static int sumOfLeader(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isLeader(arr, i)) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}
	public static boolean isLeader(int[] arr, int i) {
		for(int j = i + 1; j < arr.length; j++) {
			if(arr[i] < arr[j]) {
				return false;
			}
		}
		return true;
	}
}
