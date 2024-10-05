package com.example.secondmssb3x;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("http://first-ms-sb3x")
public interface Client {

	@GetMapping("/api")
	public String getMessage();
}
