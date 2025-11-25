package com.examples.session2;
//You are using Java
import java.util.*;

abstract class Series{
 abstract public void nextTerm(int resource, int growth, int num);
}

class GeometricSeries extends Series{
 public void nextTerm(int resource, int growth, int num){
     for(int i=1;i<=num;i++){
         System.out.print(resource+" ");
         resource *= growth;
     }
 }
}

class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     Series gs = new GeometricSeries();
     gs.nextTerm(scan.nextInt(),scan.nextInt(),scan.nextInt());
     scan.close();
 }
}