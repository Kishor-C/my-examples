package com.examples.session2;

import java.util.Scanner;
class S1 {
	// you can also create below variables as local variables inside main method
	// test will still pass
    static String venueName;
    static String city;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] split = input.split(",");
        venueName = split[0];
        city = split[1];
        System.out.println("Venue Details:");
        System.out.println("Venue Name: "+venueName);
        System.out.println("City Name: "+city);
        scan.close();
        
    }
}
