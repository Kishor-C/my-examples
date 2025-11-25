package com.examples.session3;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }
        int sm = sumOfLeader(arr);
        System.out.println(sm);
        scan.close();
    }
    	
    public static int sumOfLeader(int[] arr){
        int sm = 0;
        for(int i=0;i<arr.length;i++){
            if(isLeader(arr,i)){
                sm = sm + arr[i];
            }
        }
        return sm;
    }
    
    public static boolean isLeader(int[] arr, int i){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j] > arr[i])
                return false;
        }
        return true;
    }

}
