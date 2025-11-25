package examples.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

public class Lab3StudentList {
	// creating an array list - this array list available to all the methods inside this class
	private static List<Student> list = new ArrayList<Student>();
	public static void main(String[] args) {
		// Scanner to taken input
		Scanner scan = new Scanner(System.in);
		System.out.println("---- Array List is already present -----");
		// choice is the decision maker
		int choice = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Add an element 2: Remove an element 3: Display all the elements 4: to exit");
			choice = scan.nextInt();
			switch(choice) {
			// case 1 takes an input and adds that to the list
			case 1 : System.out.println("Enter student details");
			System.out.println("Enter rollNo");
			int rollNo = scan.nextInt();
			System.out.println("Enter name");
			String name = scan.next();
			Student element = new Student(rollNo, name);
			boolean status = addElement(element);
			System.out.println("Element added: "+status);
			
			break;
			// case 2 takes an input and removes that element from the list
			case 2: System.out.println("Enter rollNo of the student to remove from the list");
			
			rollNo = scan.nextInt();
			int removedStatus = removeElement(rollNo);
			if(removedStatus == 1) {
				System.out.println("Removed successfully");
			} else {
				System.out.println("Element is not removed");
			}
			
			break;
			case 3: 
				printElements();
			
			}
		} while(choice != 4);
		
		System.out.println("---- Program exits ----");
		scan.close();
	}
	// print the list
	public static void printElements() {
		System.out.println("----- Below are the elements present in the list ----");
		for(Student student : list) {
			System.out.println(student);
		}
	}
	// addElement method to add an element to the array list
	// return boolean to state element is added
	// this method returns false if rollNo already exists or if value is < 0 
	// because element will be always added even if it exists already
	public static boolean addElement(Student item) {
		for (Student student : list) {
			int rollNo = student.getRollNo();
			if(rollNo == item.getRollNo() || item.getRollNo() <= 0) {
				return false;
			}
		}
		boolean status = list.add(item);
		return status;
	}
	// removeElement method to remove an element from the array list
	// return 1 if element is removed and -1 if element is not present
	public static int removeElement(int rollNo) {
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			if(s.getRollNo() == rollNo) {
				it.remove();
				return 1;
			}
		}
		return -1;
	}
	// sorts in ascending order - reflects to the existing element
	public static void sortElements() {
		Collections.sort(list, (s1, s2) -> Integer.compare(s1.getRollNo(), s2.getRollNo()));
	}
	// sorts in descending order - reflects to the existing element
	public static void sortElementsDesc() {
		Collections.sort(list, (s1, s2) -> Integer.compare(s2.getRollNo(), s1.getRollNo())); 
		
	}
	// illustration of toArray
	public static Student[] arrayConverter() {
		// allocates a new array so that you can work on this new array
		// without effecting the existing list
		Student[] copy = list.toArray(new Student[list.size()]);
		return copy;
	}
}
