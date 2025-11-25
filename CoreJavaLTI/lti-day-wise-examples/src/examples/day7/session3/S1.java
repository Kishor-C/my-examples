package examples.day7.session3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = null;
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		 
		while(scan.hasNextLine()) {
			line = scan.nextLine().trim();
			if(line == null || line.equals("")) {
				break;
			}
			else{
				String[] itemsSplit = line.split(" ");
				String name = itemsSplit[0];
				int quantity = Integer.parseInt(itemsSplit[1]);
				map.put(name, map.getOrDefault(name, 0) + quantity);
			}
			
		}
		
		System.out.println("Order Summary:");
		for(String key : map.keySet()) {
			System.out.println("Item: "+key+", Quantity: "+map.get(key));
		}
		scan.close();
	}
}
