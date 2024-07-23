package com.example.batchprocessing;

import java.util.Objects;

public class Person {
	private String firstname;
	private String lastname;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstname, lastname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname);
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
