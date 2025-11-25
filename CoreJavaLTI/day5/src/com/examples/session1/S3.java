package com.examples.session1;

//You are using Java
import java.util.*;

class PalindromeChecker{
 private int value;
 
 PalindromeChecker(){
     value = 0;
 }
 
 PalindromeChecker(int value){
     this.value = value;
 }
 
 public boolean isPalindrome(){
     String st = ""+value;
     StringBuffer sb = new StringBuffer(st);
     sb.reverse();
     if(st.equals(new String(sb)))
         return true;
     else
         return false;
 }
 
 public void displayResult(){
     if(isPalindrome())
         System.out.println("The number is a palindrome.");
     else
         System.out.println("The number is not a palindrome.");
 }
}

class WordPalindromeChecker extends PalindromeChecker{
 private String value;
 
 WordPalindromeChecker(){
     value = "";
 }
 
 WordPalindromeChecker(String value){
     this.value = value;
 }
 
 public boolean isPalindrome(){
     String st = value.toLowerCase();
     StringBuffer sb = new StringBuffer(st);
     sb.reverse();
     if(st.equals(new String(sb)))
         return true;
     else
         return false;
 }
 
 public void displayResult(){
     if(isPalindrome())
         System.out.println("The word is a palindrome.");
     else
         System.out.println("The word is not a palindrome.");
 }
}

public class S3{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     scan.nextLine();
     String word = scan.nextLine();
     
     PalindromeChecker checker = new PalindromeChecker(num);
     checker.displayResult();
     
     checker = new WordPalindromeChecker(word);
     checker.displayResult();
     scan.close();
 }
}