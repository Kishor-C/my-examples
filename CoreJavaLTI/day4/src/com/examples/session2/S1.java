package com.examples.session2;
//You are using Java
import java.util.Scanner;

class Circle{
 public double calculateArea(int radius){
     return 3.14*radius*radius;
 }
 
 public double calculateArea(double radius){
     return 3.14*radius*radius;
 }
 
 public double calculateCircumference(int radius){
     return 2*3.14*radius;
 }
 
     public double calculateCircumference(double radius){
     return 2*3.14*radius;
 }
}

class S1{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     int radius1 = scan.nextInt();
     double radius2 = scan.nextDouble();
     
     Circle circle = new Circle();
     
     System.out.printf("%.2f  %.2f\n",circle.calculateCircumference(radius1),circle.calculateCircumference(radius2));
     System.out.printf("%.2f  %.2f",circle.calculateArea(radius1),circle.calculateArea(radius2));
     scan.close();
 }
}