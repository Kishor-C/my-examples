package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v2")
public class ClientController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping
	public ResponseEntity<Object> remoteCalls() {
		// calling the first microservice using the instance id
		String url = "http://MY-MS-ONE/v1/greet";
		ResponseModel response = template.getForObject(url, ResponseModel.class);
		return ResponseEntity.status(200).body(response);
	}
}
