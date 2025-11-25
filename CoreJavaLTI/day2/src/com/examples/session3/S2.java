package com.examples.session3;
// You are using Java

import java.util.*;

public class S2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[][] arr = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        sortMatrix(arr,M);
        for(int[] row : arr){
            System.out.print("\n");
            for(int data : row){
                System.out.print(data+" ");
            }
        }
        scan.close();
    }
    
    public static void sortMatrix(int[][] arr, int M){
        for(int i=0;i<M;i++){
            arr[i] = sortArray(arr[i]);
        }
    }
    
    public static int[] sortArray(int[] arr){
        int tmp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    
}
