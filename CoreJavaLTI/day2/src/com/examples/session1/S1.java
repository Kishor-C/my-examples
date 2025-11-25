package com.examples.session1;

import java.util.*;
class S1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float p = scan.nextFloat();
        float n = scan.nextFloat();
        float r = scan.nextFloat();
        float si = (p*n*r)/100;
        System.out.println(si);
        scan.close();
    }
}