package examples.day6.session1;

//You are using Java
import java.util.*;

public class S3{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     LinkedList<String> list = new LinkedList<>();
     
     int n = scan.nextInt();
     scan.nextLine();
     
     for(int i=1;i<=n;i++){
         list.add(scan.nextLine());
     }
     
     System.out.println("Books in the inventory:");
     for(String data : list){
         System.out.println(data);
     }
     scan.close();
 }
}
