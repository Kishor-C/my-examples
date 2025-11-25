package examples.day6.session3;
//You are using Java
//You are using Java
import java.util.*;

class Employee implements Comparable<Employee>{
 private String name;
 private double score;
 
 Employee(){
     this("",0.0);
 }
 
 Employee(String name,double score){
     this.name = name;
     this.score = score;
 }
 
 public void setName(String name){
     this.name = name;
 }
 
 public String getName(){
     return this.name;
 }
 
 public void setScore(double score){
     this.score = score;
 }
 
 public double getScore(){
     return this.score;
 }
 
 public String toString(){
     return name+" "+score;
 }
 
 public int compareTo(Employee e2){
     return Double.compare(e2.score,score);
 }
}

public class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     ArrayList<Employee> list = new ArrayList<>();
     Employee emp;
     String nm;
     int N = scan.nextInt();
     
     
     for(int i=1;i<=N;i++){
         emp = new Employee();
         nm = scan.next();
         if(nm.length() > 100)
           nm = nm.substring(0,99);
         emp.setName(nm);
         emp.setScore(scan.nextDouble());
         list.add(emp);
     }
     
     Collections.sort(list);
     
     list.forEach(System.out::println);
     scan.close();
 }
}