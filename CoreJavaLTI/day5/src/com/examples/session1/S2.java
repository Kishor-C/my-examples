package com.examples.session1;

//You are using Java
import java.util.*;

class Pizza{
 protected  double basePrice;
 protected double toppingCost;
 protected int numberOfToppings;
 
 Pizza(){
     
 }
 
 Pizza(double basePrice, double toppingCost,int numberOfToppings){
     this.basePrice = basePrice;
     this.toppingCost = toppingCost;
     this.numberOfToppings = numberOfToppings;
 }
 
 public double calculatePrice(){
     return basePrice + (toppingCost * numberOfToppings);
 }
}

class DiscountedPizza extends Pizza{
 
 DiscountedPizza(){
     
 }
 
 DiscountedPizza(double basePrice, double toppingCost,int numberOfToppings){
     super(basePrice,toppingCost,numberOfToppings);
 }
 
 public double calculatePrice(){
     if(numberOfToppings <= 3)
         return super.calculatePrice();
     else
         return (basePrice + (toppingCost*numberOfToppings)) * 0.9;
 }
}

class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     double basePrice = scan.nextDouble();
     double toppingCost = scan.nextDouble();
     int not = scan.nextInt();
     
     Pizza p1,p2;
     p1 = new Pizza(basePrice,toppingCost,not);
     p2 = new DiscountedPizza(basePrice,toppingCost,not);
     
     System.out.printf("Price without discount: Rs. %.2f\n",p1.calculatePrice());
     System.out.printf("Price with discount: Rs. %.2f",p2.calculatePrice());
     scan.close();
 }
}