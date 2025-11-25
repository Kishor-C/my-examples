package com.examples.session3.ex3;
//You are using Java
//You are using Java
import java.util.*;

class Employee {
 private int empId;
 private float salary;
 
 public void setEmpId(int empId){
     this.empId = empId;
 }
 
 public int getEmpId(){
     return this.empId;
 }
 
 public void setSalary(float salary){
     this.salary = salary;
 }
 
 public float getSalary(){
     return this.salary;
 }
}

class EmployeeLevel extends Employee {
 private int level;
 
 public int getLevel(){
     return level;
 }
 
 EmployeeLevel(String data){
     String[] val = data.split(" ");
     super.setEmpId(Integer.parseInt(val[0]));
     super.setSalary(Float.parseFloat(val[1]));
     if(getSalary() > 100)
         level = 1;
     else
         level = 2;
 }
}

class S3{
 
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     EmployeeLevel emp = new EmployeeLevel(scan.nextLine());
     System.out.println(emp.getEmpId());
     System.out.println(emp.getSalary());
     System.out.println(emp.getLevel());
     scan.close();
 }
}