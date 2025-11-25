package examples.day6.session1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrays = new ArrayList<Integer>();
		// ask user how many elements required to add
		int total = scan.nextInt();
		// loop to add elements that matches to the number of elements to add
		for(int i = 1; i <= total; i++) {
			arrays.add(scan.nextInt());
		}
		// key to search if element is present
		int key = scan.nextInt();
		// contains returns true if key is present else false
		boolean isPresent = arrays.contains(key);
		// condition to check the key
		if(isPresent) {
			System.out.println("Number "+key+" exists in the ArrayList");
		} else {
			System.out.println("Number "+key+" not exists in the ArrayList");
		}
		// element that needs to be removed
		int key2 = scan.nextInt();
		// passing element as an object that needs to be removed, 
		//because normal int will be considered as index
		arrays.remove(Integer.valueOf(key2));
		
		System.out.println("ArrayList after removing "+key2);
		for(int index = 0; index < arrays.size(); index++) {
			System.out.println(arrays.get(index)+" ");
		}
		
		System.out.println("ArrayList elements using normal for loop");
		for(int index = 0; index < arrays.size(); index++) {
			System.out.println(arrays.get(index)+" ");
		}
		
		System.out.println("ArrayList elements using Iterator interface");
		Iterator<Integer> it = arrays.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			System.out.println(ele+" ");
		}
		
		System.out.println("ArrayList elements using for-each loop");
		for(int ele : arrays) {
			System.out.println(ele+" ");
		}
		// sorting the elements in descending order
		Collections.sort(arrays, Collections.reverseOrder());
		System.out.println("ArrayList elements in descending order");
		for(int ele : arrays) {
			System.out.println(ele+" ");
		}
		// number of elements in the array list
		System.out.println("Number of elements in the ArrayList: "+arrays.size());
		scan.close();
	}
}
