package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping
	public ResponseEntity<Object> getProfiles() {
		
		return ResponseEntity.status(200).body(profileService.getProfiles());
	}
}
