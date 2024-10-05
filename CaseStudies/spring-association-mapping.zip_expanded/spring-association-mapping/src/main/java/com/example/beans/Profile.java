package com.example.beans;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_id")
	private int profileId;
	
	private String name;
	
	private LocalDate dob;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "wallet_id_ref")
	private Wallet walletIdRef;
	
	@OneToMany
	@JoinTable(name = "contact", 
	joinColumns = @JoinColumn(name = "profile_id_ref"), 
	inverseJoinColumns = @JoinColumn(name = "wallet_id_ref"))
	private List<Contact> contacts;

	public Profile(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Wallet getWalletIdRef() {
		return walletIdRef;
	}

	public void setWalletIdRef(Wallet walletIdRef) {
		this.walletIdRef = walletIdRef;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
