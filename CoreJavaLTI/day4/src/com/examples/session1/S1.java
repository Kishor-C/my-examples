package com.examples.session1;
import java.util.*;

class Venue{
    private String name;
    private String city;
    private String address;
    private int pincode;
    
    Venue(){
        
    }
    
    Venue(String name,String city,String address,int pincode){
        this.name = name;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
    }
    
    public String toString(){
        String output = "Venue Name: "+name+"\nCity Name : "+city+"\nCity Address : "+address+"\nCity Pincode : "+pincode;
        return output;
    }
}

public class S1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Venue venue = new Venue(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextInt());
        System.out.println("Venue Details");
        System.out.println(venue);
        scan.close();
    }
}