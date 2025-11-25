package examples.day7.session1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class PhoneBook {
	private Map<String, String> phoneBook = new HashMap<String, String>();
	public void addContact(String name, String phoneNumber) {
		phoneBook.put(phoneNumber, name);
	}
	public void displayContacts() {
		Set<String> contactsSet = phoneBook.keySet();
		System.out.println("All Contacts:");
		Iterator<String> it = contactsSet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Name: "+phoneBook.get(key)+", Phone Number: "+key);
		}
	}
}
public class S3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PhoneBook phoneBook = new PhoneBook();
		int n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < n; i++) {
			phoneBook.addContact(scan.nextLine(), scan.nextLine());
		}
		phoneBook.displayContacts();
		scan.close();
	}
}
