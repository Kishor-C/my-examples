package com.example.webfluxdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyApi {

	@Autowired
	private MyService service;
	
	@GetMapping(path = "/v1")
	public ResponseEntity<Object> getUsers1() {
		return ResponseEntity.status(200).body(service.getUsers1());
	}
	@GetMapping(path = "/v2", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Object> getUsers2() {
		return ResponseEntity.status(200).body(service.getUsers2());
	}
}
