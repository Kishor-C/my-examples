package com.examples.session3;

import java.util.Scanner;

class TextAnalyzer {

   public static String isValidSentence(String sentence) {       
       if (!Character.isUpperCase(sentence.charAt(0))) {
           return "Invalid";
       }      
       if (!(sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!"))) {
           return "Invalid";
       } 
       
       if(!sentence.contains("a") && !sentence.contains("e") && !sentence.contains("i") && !sentence.contains("o") && !sentence.contains("u")){
           return "Invalid";
       }

       boolean hasDigit = false;        
       for (int i=0;i<sentence.length();i++) {
           if (Character.isDigit(sentence.charAt(i))) {
               hasDigit = true;
               break;
           }
       }
       if(hasDigit){
           return "Invalid";
       }
       return "Valid";
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);    
       int n = Integer.parseInt(scanner.nextLine()); 
       
       String[] strArr = new String[n];
       
       for (int i = 0; i < n; i++) {          
           strArr[i] = scanner.nextLine();            
       }        
       
       for(int i=0;i<n;i++){
           String validity = isValidSentence(strArr[i]);
           System.out.println("Sentence: " + strArr[i] + " - " + validity);
       }
       scanner.close();
   }
}