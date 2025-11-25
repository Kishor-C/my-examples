package com.examples.session1;

//You are using Java
//You are using Java
import java.util.*;

class Delivery{
 private long over;
 private long ball;
 private long runs;
 private String batsman;
 private String bowler;
 private String nonStriker;
 
 Delivery(){
     this(0,0,0,"","","");
 }
 
 Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker){
     this.over = over;
     this.ball = ball;
     this.runs = runs;
     this.batsman = batsman;
     this.bowler = bowler;
     this.nonStriker = nonStriker;
 }
 
 public void setOver(long over){
     this.over = over;
 }
 
 public long getOver(){
     return this.over;
 }
 
 public void setBall(long ball){
     this.ball = ball;
 }
 
 public long getBall(){
     return this.ball;
 }
 
 public void setRuns(long runs){
     this.runs = runs;
 }
 
 public long getRuns(){
     return this.runs;
 }
 
 public void setBatsman(String batsman){
     this.batsman = batsman;
 }
 
 public String getBatsman(){
     return this.batsman;
 }
 
 public void setBowler(String bowler){
     this.bowler = bowler;
 }
 
 public String getBowler(){
     return this.bowler;
 }
 
 public void setNonStriker(String nonStriker){
     this.nonStriker = nonStriker;
 }
 
 public String getNonStriker(){
     return this.nonStriker;
 }
 
}

class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     Delivery delivery = new Delivery();
     delivery.setOver(scan.nextLong());
     delivery.setBall(scan.nextLong());
     delivery.setRuns(scan.nextLong());
     scan.nextLine();
     delivery.setBatsman(scan.nextLine());
     delivery.setBowler(scan.nextLine());
     delivery.setNonStriker(scan.nextLine());
 
     System.out.println("Over: "+delivery.getOver());
     System.out.println("Ball: "+delivery.getBall());
     System.out.println("Runs: "+delivery.getRuns());
     System.out.println("Batsman: "+delivery.getBatsman());
     System.out.println("Bowler: "+delivery.getBowler());
     System.out.println("Non Striker: "+delivery.getNonStriker());
     scan.close();
 }
}