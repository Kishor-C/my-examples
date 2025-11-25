package com.examples.session3;

//You are using Java
import java.util.*;
import java.io.*;

class Main{
 public static void main(String[] args) throws IOException{
     Scanner scan = new Scanner(System.in);
     
     int n = scan.nextInt();
     scan.nextLine();
     
     String[] words = new String[n];
     for(int i=0;i<n;i++){
         words[i] = scan.nextLine();
     }
     
     char ch = scan.nextLine().charAt(0);
     int minlen = scan.nextInt();
     scan.nextLine();
     String substr = scan.nextLine();
     
     for(String data : words){
         System.out.println("Word: "+data);
         System.out.println("Starts with '"+ch+"': "+data.startsWith(ch+""));
         System.out.println("Length greater than "+minlen+": "+(data.length()>minlen));
         System.out.println("Contains '"+substr+"': "+data.contains(substr)+"\n");
     }
     scan.close();
 }
}