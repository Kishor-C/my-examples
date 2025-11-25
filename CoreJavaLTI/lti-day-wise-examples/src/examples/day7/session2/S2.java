package examples.day7.session2;
import java.util.*;
public class S2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();   //	Collections.reverseOreder() or
        TreeMap<Integer, String> studentMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            int marks = input.nextInt();
            input.nextLine(); 
            String name = input.next().trim(); // Read the name after marks
            studentMap.put(marks, name);
        }
         int rank = 1;
         System.out.println("The ranks based on their marks:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Rank "+rank + ": " + entry.getValue());
            rank++;
        }
        input.close();
    }
}

