package com.example.demo;

import java.time.LocalDate;


public class ProfileDTO {
	
	private int id;
	private String name;
	private long phone;
	private LocalDate dob;
	public ProfileDTO(int id, String name, long phone, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dob = dob;
	}
	public ProfileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}
