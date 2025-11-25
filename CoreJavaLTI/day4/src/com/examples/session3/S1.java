package com.examples.session3;

//You are using Java
//You are using Java
import java.util.*;




class Person {
 private String firstName;
 private String lastName;
 
 Person(){
     this("","");
 }
 
 Person(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
 }
 
 public void setFirstName(String firstName){
     this.firstName = firstName;
 }
 
 public String getFirstName(){
     return this.firstName;
 }
 
 public void setLastName(String lastName){
     this.lastName = lastName;
 }
 
 public String getLastName(){
     return this.lastName;
 }
 
}


class Employee extends Person {
 private int employeeId;
 private String jobTitle;
 
 Employee(){
     this("","",0,"");
 }
 
 Employee(String firstName,String lastName,int employeeId,String jobTitle){
     super(firstName,lastName);
     this.employeeId = employeeId;
     this.jobTitle = jobTitle;
 }   
 
 public void setEmployeeId(int employeeId){
     this.employeeId = employeeId;
 }
 
 public int getEmployeeId(){
     return this.employeeId;
 }
 
 public void setJobTitle(String jobTitle){
     this.jobTitle = jobTitle;
 }
 
 public String getJobTitle(){
     return this.jobTitle;
 }
 
 public String toString(){
     return "Name: "+getFirstName()+" "+getLastName()+", "+jobTitle+"\nEmployee ID: "+employeeId;
 }
}

class S1{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     Employee employee = new Employee();
     employee.setFirstName(scan.nextLine());
     employee.setLastName(scan.nextLine());
     employee.setEmployeeId(scan.nextInt());
     scan.nextLine();
     employee.setJobTitle(scan.nextLine());
     System.out.println("Employee details:");
     System.out.println(employee);
     scan.close();
 }
}