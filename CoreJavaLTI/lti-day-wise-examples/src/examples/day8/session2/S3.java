package examples.day8.session2;

//You are using Java
//You are using Java
import java.util.*;

class InvalidAgeForDrivingLicenseException extends Exception{
 private String message;
 
 InvalidAgeForDrivingLicenseException(String message){
     this.message = message;
 }
 
 public String toString(){
     return "InvalidAgeForDrivingLicenseException: "+message;
 }
 
 
}

class InvalidMarkForDrivingLicenseException extends Exception{
 private String message;
 
 InvalidMarkForDrivingLicenseException(String message){
     this.message = message;
 }
 
 public String toString(){
     return "InvalidMarkForDrivingLicenseException: "+message;
 }
}

class Main{
 private String name;
 private int userAge;
 private int mark;
 
 public void setName(String name){
     this.name = name;
 }
 
 public void setUserAge(int userAge) throws InvalidAgeForDrivingLicenseException{
     if(userAge<=0)
         throw new InvalidAgeForDrivingLicenseException("Invalid age");
     if(userAge<18)
         throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
     this.userAge = userAge;
 }
 
 public void setMark(int mark) throws InvalidMarkForDrivingLicenseException{
     if(mark<=0 || mark>100)
         throw new InvalidMarkForDrivingLicenseException("Invalid mark");
     if(mark<80)
         throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
     this.mark = mark;
 }
 
 public static void main(String[] args){
     Main obj = new Main();
     Scanner scan =  new Scanner(System.in);
     String name;
     int age;
     int mark;
     try{
         name = scan.next();
         age = scan.nextInt();
         mark = scan.nextInt();
         obj.setName(name);
         obj.setUserAge(age);
         obj.setMark(mark);
         System.out.println("Approved");
     }catch(Exception e){
         System.out.println(e);
     }
     
     
 }
}