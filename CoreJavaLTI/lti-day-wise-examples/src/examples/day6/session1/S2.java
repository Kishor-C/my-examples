package examples.day6.session1;

//You are using Java
import java.util.*;

class Employee{
 private String employeeName;
 private int employeeId;
 private String employeeDepartment;
 
 public String getEmployeeName(){
     return employeeName;
 }
 
 public void setEmployeeName(String employeeName){
     this.employeeName = employeeName;
 }
 
 public int getEmployeeId(){
     return employeeId;
 }
 
 public void setEmployeeId(int employeeId){
     this.employeeId = employeeId;
 }
 
 public String getEmployeeDepartment(){
     return employeeDepartment;
 }
 
 public void setEmployeeDepartment(String employeeDepartment){
     this.employeeDepartment = employeeDepartment;
 }
 
 public String toString(){
     return "Employee [employeeName="+employeeName+", employeeId="+employeeId+", employeeDepartment="+employeeDepartment+"]";
 }
}

public class S2{
 public static void main(String[] args){
     ArrayList<Employee> list = new ArrayList<Employee>();
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
     scan.nextLine();
     Employee emp = null;
     for(int i=1;i<=N;i++){
         emp = new Employee();
         emp.setEmployeeName(scan.nextLine());
         emp.setEmployeeId(scan.nextInt());
         scan.nextLine();
         emp.setEmployeeDepartment(scan.nextLine());
         list.add(emp);
     }
     
     System.out.println("List of All Employees");
     for(Employee e : list){
         System.out.println(e);
     }
     scan.close();
 }
}
