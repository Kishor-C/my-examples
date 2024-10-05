package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Contact;

public interface ContactDao extends JpaRepository<Contact, Integer> {

}
