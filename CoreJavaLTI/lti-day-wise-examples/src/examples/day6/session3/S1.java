package examples.day6.session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Hall implements Comparable<Hall> {
	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;
	
	public Hall() {
		super();
	}
	public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	@Override
	public int compareTo(Hall o) {
		return Double.compare(costPerDay, o.costPerDay);
	}
	@Override
	public String toString() {
		return name+"\t"+contactNumber+"\t"+costPerDay+"\t"+ownerName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
		
}
public class S1 {
	public static void main(String[] args) {
		ArrayList<Hall> list = new ArrayList<Hall>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < n; i++) {
			String name = scan.nextLine();
			String contactNumber = scan.nextLine();
			double costPerDay = scan.nextDouble();
			scan.nextLine();
			String ownerName = scan.nextLine();
			Hall hall = new Hall(name, contactNumber, costPerDay, ownerName);
			list.add(hall);
		}
		Collections.sort(list);
		for(Hall h : list) {
			System.out.println(h);
		}
		scan.close();
	}
}
