package com.examples.session1;

//You are using Java
import java.util.*;

class S3 {
 public static void main(String[] arg){
     Scanner scan = new Scanner(System.in);
     
     int arr1[] = new int[scan.nextInt()];
     for(int i=0;i<arr1.length;i++)
         arr1[i] = scan.nextInt();
         
     int arr2[] = new int[scan.nextInt()];
     for(int i=0;i<arr2.length;i++)
         arr2[i] = scan.nextInt();
         
     int[] arr3 = concatenateArrays(arr1,arr2);
     
     for(int data : arr3){
         System.out.print(data + " ");
     }
     scan.close();
 }
 
 public static int[] concatenateArrays(int[] arr1,int[] arr2){
     int[] arr3 = Arrays.copyOf(arr1,arr1.length+arr2.length);
     int i = arr1.length;
     for(int data : arr2){
         arr3[i++] = data;
     }
     return arr3;
 }
}
