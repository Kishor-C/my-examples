package com.example.secondmssb3x;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class SecondController {

	private Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Client client;
	
	@GetMapping
	public String getMessage() {
		LOG.info("___Second Controller getMessage()____");
		String message = client.getMessage().concat(" ").concat("Second MS Message");
		return message;
	}
}
