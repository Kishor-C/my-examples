package examples.day7.session1;

//You are using Java
import java.util.*;

class Hall implements Comparable<Hall>{
 private String name;
 private String contactNumber;
 private double costPerDay;
 private String ownerName;

 public Hall() {
 }

 public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
     this.name = name;
     this.contactNumber = contactNumber;
     this.costPerDay = costPerDay;
     this.ownerName = ownerName;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getContactNumber() {
     return contactNumber;
 }

 public void setContactNumber(String contactNumber) {
     this.contactNumber = contactNumber;
 }

 public double getCostPerDay() {
     return costPerDay;
 }

 public void setCostPerDay(double costPerDay) {
     this.costPerDay = costPerDay;
 }

 public String getOwnerName() {
     return ownerName;
 }

 public void setOwnerName(String ownerName) {
     this.ownerName = ownerName;
 }

 @Override
 public String toString() {
     return name +" "+contactNumber+" " + costPerDay + " "+ ownerName;
 }
 
 public int compareTo(Hall h2){
     return Double.compare(this.costPerDay,h2.costPerDay);
 }
}

class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     Map<String,Hall> map = new HashMap<>();
     
     int n = scan.nextInt();
     scan.nextLine();
     
     for(int i=1;i<=n;i++){
         String name = scan.nextLine();
         String contact = scan.nextLine();
         double cost = scan.nextDouble();
         scan.nextLine();
         String owner = scan.nextLine();
         map.put(name,new Hall(name,contact,cost,owner));
     }
     
     ArrayList<Hall> collection = new ArrayList<>();
     collection.addAll(map.values());
     
     Collections.sort(collection);
     
     for(Hall hall : collection){
         System.out.println(hall);
     }
     scan.close();
 }
}

