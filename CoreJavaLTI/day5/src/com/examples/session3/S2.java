package com.examples.session3;
//You are using Java
//You are using Java
import java.util.*;

interface Growing{
 public boolean isGrowing();
}

class GrowingNumber implements Growing{
 private int num;
 
 GrowingNumber(int num){
     this.num = num;
 }
 
 public boolean isGrowing(){
     String st = num+"";
     for(int i=0;i<st.length()-1;i++){
         if(st.charAt(i) > st.charAt(i+1))
             return false;
     }
     return true;
 }
}

class GrowingString implements Growing{
 private String num;
 
 GrowingString(String num){
     this.num = num;
 }
 
 public boolean isGrowing(){
     String st = num.toUpperCase();
     for(int i=0;i<st.length()-1;i++){
         if(st.charAt(i) > st.charAt(i+1))
             return false;
     }
     return true;
 }
}

class Main{
 public static void main(String[] args){
     Scanner scan =  new Scanner(System.in);
     int num = scan.nextInt();
     String st = scan.nextLine();
     
     Growing growing = new GrowingNumber(num);
     if(growing.isGrowing()){
         System.out.println("Growing number");
     }else{
         System.out.println("Not growing number");
     }
     
     growing = new GrowingString(st);
     if(growing.isGrowing()){
         System.out.println("Growing string");
     }else{
         System.out.println("Not growing string");
     }
     scan.close();
 }
}

