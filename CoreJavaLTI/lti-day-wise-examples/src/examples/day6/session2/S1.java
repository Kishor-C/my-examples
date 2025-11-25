package examples.day6.session2;

import java.util.Scanner;
import java.util.TreeSet;

public class S1 {
	public static void main(String[] args) {
		TreeSet<Integer> seats = new TreeSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			seats.add(scan.nextInt());
		}
		int key = scan.nextInt();
		if(seats.contains(key)) {
			System.out.println(key+" is present!");
		} else {
			System.out.println(key+" is not present!");
		}
		scan.close();
	}
}
