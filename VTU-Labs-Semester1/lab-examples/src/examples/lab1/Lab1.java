package examples.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
	// creating an array list - available to all the methods inside this class
	// you can also use List<String> list = new ArrayList<String>(); so that you can work with strings
	private static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// Scanner to taken input
		Scanner scan = new Scanner(System.in);
		System.out.println("---- Array List is already present -----");
		// choice is the decision maker
		int choice = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Add an element 2: Remove an element 3: Sort in ascending order 4: Sort in descending order 5: Converting toArray 6: to exit");
			choice = scan.nextInt();
			switch(choice) {
			// case 1 takes an input and adds that to the list
			case 1 : System.out.println("Enter a number element");
			int element = scan.nextInt();
			boolean status = addElement(element);
			System.out.println("Element added: "+status);
			printElements();
			break;
			// case 2 takes an input and removes that element from the list
			case 2: System.out.println("Enter a number element to remove from the list");
			System.out.println("Below are the elements present in the list");
			printElements();
			element = scan.nextInt();
			int removedStatus = removeElement(element);
			if(removedStatus == 1) {
				System.out.println("Removed successfully");
			} else {
				System.out.println("Element is not removed");
			}
			printElements();
			break;
			// case 3 sorts elements in ascending order
			case 3: System.out.println("Sorting in ascending order");
			sortElements();
			printElements();
			break;
			// case 4 sorts elements in descending order
			case 4: System.out.println("Sorting in descending order");
			sortElementsDesc();
			printElements();
			break;
			case 5: System.out.println("Converting to an array - toArray");
			Integer[] arr = arrayConverter();
			for(int i : arr) {
				System.out.println(i);
			}
			printElements();
			break;
			
			}
		} while(choice != 6);
		
		System.out.println("---- Program exits ----");
		scan.close();
	}
	// print the list
	public static void printElements() {
		System.out.println("List contents: "+list);
	}
	// addElement method to add an element to the array list
	// return boolean to state element is added
	// this method always return true 
	// because element will be always added even if it exists already
	public static boolean addElement(int item) {
		boolean status = list.add(item);
		return status;
	}
	// removeElement method to remove an element from the array list
	// return 1 if element is removed and -1 if element is not present
	public static int removeElement(int item) {
		// Iterator is an interface used to iterate collection
		// Iterator has 3 methods - hasNext, next, remove
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { //hasNext checks whether next element is present
			if(it.next() == item) { // next() returns the next element & refers to that element
				it.remove();
				return 1; // element removed
			}
		}
		return -1; // element not removed
	}
	// sorts in ascending order - reflects to the existing element
	public static void sortElements() {
		// Collections is a class, Collection is an interface
		// Collections class has static methods like sort, reverseOrder, shuffle
		// Collection interface has methods like add, remove, clear, isEmpty
		Collections.sort(list); // always sorts in ascending order
	}
	// sorts in descending order - reflects to the existing element
	public static void sortElementsDesc() {
		Collections.sort(list, Collections.reverseOrder()); // sorts first in ascending order & reverses
		
	}
	// illustration of toArray
	public static Integer[] arrayConverter() {
		// allocates a new array so that you can work on this new array
		// without effecting the existing list
		Integer[] copy = list.toArray(new Integer[list.size()]);
		return copy;
	}
}
