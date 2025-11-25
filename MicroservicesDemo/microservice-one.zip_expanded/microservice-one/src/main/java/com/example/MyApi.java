package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MyApi {

	// inject the server.port 
	@Value("${server.port}") // reads server.port of the application
	private String port;
	
	@GetMapping("/greet")
	public ResponseEntity<Object> greet() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("port", port);
		map.put("message", "Welcome to our first microservice");
		return ResponseEntity.status(200).body(map);
	}
}
