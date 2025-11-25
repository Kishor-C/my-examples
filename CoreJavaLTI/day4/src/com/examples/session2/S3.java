package com.examples.session2;
import java.util.*;

class Roots{
    public double calculateRoot(int value){
        return Math.sqrt(value);   
    }
    
    public double calculateRoot(double value){
        return Math.cbrt(value);
    }
}

class S3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Roots roots = new Roots();
    
        String num = scan.nextLine();
        
        if(!num.contains("."))
            System.out.printf("%.1f",roots.calculateRoot(Integer.parseInt(num)));
        else
            System.out.printf("%.1f",roots.calculateRoot(Double.parseDouble(num)));
        scan.close();
    }
}