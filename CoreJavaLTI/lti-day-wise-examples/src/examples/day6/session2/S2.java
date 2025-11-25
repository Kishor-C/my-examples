package examples.day6.session2;

//You are using Java
import java.util.*;

public class S2{
 public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     TreeSet<String> set = new TreeSet<>();
     
     int n = scan.nextInt();
     scan.nextLine();
     for(int i = 0; i < n; i++) {
    	 set.add(scan.nextLine());
     }
     String longestWord = null;
     String word = null;
     for(String fruit : set) {
    	 word = fruit;
    	 if(longestWord == null) {
    		 longestWord = word;
    	 }
    	 if(word.length() > longestWord.length()) {
    		 longestWord = word;
    	 }
     }
     System.out.println("Longest word: "+longestWord);
     scan.close();   
 }
}