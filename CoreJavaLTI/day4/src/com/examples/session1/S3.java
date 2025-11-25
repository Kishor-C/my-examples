package com.examples.session1;

import java.util.*;

class S3{
    private int num;
    
    S3(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }
    
    public boolean isNeonNumber(){
        int N = num * num;
        int sm = 0;
        while(N!=0){
            sm = sm + (N%10);
            N = N /10;
        }
        return sm == num;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        if(data>20){
            System.out.println("Invalid");
        }else{
            S3 m = new S3(data);
            if(m.isNeonNumber())
                System.out.println(m.getNum()+" is a Neon Number");
            else 
                System.out.println(m.getNum()+" is not a Neon Number");
        }
         scan.close();   
        }
}