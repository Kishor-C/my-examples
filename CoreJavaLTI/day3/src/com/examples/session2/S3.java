package com.examples.session2;

import java.util.*;

public class S3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));
            
        System.out.println(set.size());
        scan.close();
    }
}
