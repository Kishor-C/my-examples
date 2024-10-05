package com.example.firstmssb3x;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class FirstController {

	private Logger LOG = LoggerFactory.getLogger(getClass());
	
	@GetMapping
	public String getMessage() {
		LOG.info("___First Controller getMessage()____");
		String message = "First MS Message";
		return message;
	}
}
