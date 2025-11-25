package examples.day6.session2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class S3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			set.add(scan.nextInt());
		}
		Iterator<Integer> it = set.iterator();
		if(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(set);
		scan.close();
		
	}
}
