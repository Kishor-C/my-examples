package com.examples.session3;


//You are using Java

import java.util.*;

public class S3{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
     int[] arr = new int[N];
     for(int i=0;i<N;i++){
         arr[i] = scan.nextInt();
     }
     int sm = findUniqueElementSum(arr);
     System.out.println(sm);
     scan.close();
 }
 
 public static int findUniqueElementSum(int[] arr){
     int sm = 0;
     for(int i=0;i<arr.length;i++){
         if(isUnique(arr,arr[i])){
             sm = sm + arr[i];
         }
     }
     return sm;
 }
 
 public static boolean isUnique(int[] arr, int data){
     int count = 0;
     for(int i=0;i<arr.length;i++){
         if(arr[i] == data){
             count++;
             if(count>1)
                 return false;
         }
     }
     return true;
 }
}