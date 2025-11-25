package examples.day7.session1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		String[] lineOneArray = line1.split(" ");
		String[] lineTwoArray = line2.split(" ");
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		
		for(String s : lineOneArray) {
			map1.put(s, "");
		}
		for(String s : lineTwoArray) {
			map2.put(s, "");
		}
		ArrayList<String> commonWords = new ArrayList<String>();
		Set<String> keys = map1.keySet();
		for(String key : keys) {
			if(map2.containsKey(key)) {
				commonWords.add(key);
			}
		}
		Collections.sort(commonWords);
		System.out.println(commonWords);
		scan.close();
	}
}
