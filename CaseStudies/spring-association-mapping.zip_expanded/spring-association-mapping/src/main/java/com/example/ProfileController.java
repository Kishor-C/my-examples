package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Profile;

@RestController
@RequestMapping("/api")
public class ProfileController {

	@Autowired
	ProfileServiceImpl service;
	
	@PostMapping(path = "/profile", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createProfile(@RequestBody Profile profile) {
		try {
			Profile p = service.save(profile);
			return ResponseEntity.status(201).body(p);
		} catch(Exception e) {
			return ResponseEntity.status(404).body(e);
		}
	}
}
