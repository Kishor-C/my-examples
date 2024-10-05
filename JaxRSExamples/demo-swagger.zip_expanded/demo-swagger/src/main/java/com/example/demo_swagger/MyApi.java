package com.example.demo_swagger;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MyApi {

	@GetMapping("/fetch")
	public Map<String, Object> greet1() {
		Map<String, Object> map = new HashMap<>();
		map.put("message", "Hello World");
		return map;
	}
	@PostMapping("/create")
	public Map<String, Object> greet2() {
		Map<String, Object> map = new HashMap<>();
		map.put("message", "Hello World");
		return map;
	}
	
}
