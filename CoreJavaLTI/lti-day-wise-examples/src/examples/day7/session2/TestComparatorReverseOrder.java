package examples.day7.session2;

import java.util.Comparator;
import java.util.TreeMap;

public class TestComparatorReverseOrder {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>(Comparator.reverseOrder());
		map.put("abc", "1");
		map.put("ABC", "2");
		map.put("xyz", "2");
		map.put("XYZ", "2");
		System.out.println(map);
	}
}
