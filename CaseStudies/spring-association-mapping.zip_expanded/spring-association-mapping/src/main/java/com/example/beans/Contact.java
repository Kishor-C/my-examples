package com.example.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id")
	private int contactId;
	@Column(name = "profile_id_ref")
	private int profileIdRef;
	@Column(name = "contact_id_ref")
	private int contactIdRef;
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public int getProfileIdRef() {
		return profileIdRef;
	}
	public void setProfileIdRef(int profileIdRef) {
		this.profileIdRef = profileIdRef;
	}
	public int getContactIdRef() {
		return contactIdRef;
	}
	public void setContactIdRef(int contactIdRef) {
		this.contactIdRef = contactIdRef;
	}
	
	
}
