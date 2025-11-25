package examples.day7.session2;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] charArray = input.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(char c : charArray) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int count = map.get(c);
				map.put(c, count + 1);
			}
		}
		Set<Character> keys = map.keySet();
		for(char c : keys) {
			System.out.println("\'"+c+"\':"+map.get(c));
		}
		scan.close();
	}
}
