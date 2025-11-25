package com.examples.session2;
import java.util.*;

class Travel{
    public double calculateTime(double distance,double speed){
        return distance/speed;
    }
    
    public double calculateTime(int stops,double averageStop){
        return stops * (averageStop / 60.0);
    }
}

class S2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextDouble();
        double speed = scan.nextDouble();
        
        int stops = scan.nextInt();
        double averageStops = scan.nextDouble();
        
        Travel travel = new Travel();
        
        System.out.printf("%.1f\n",travel.calculateTime(distance,speed));
        System.out.printf("%.1f",travel.calculateTime(stops,averageStops));
        scan.close();
    }
}