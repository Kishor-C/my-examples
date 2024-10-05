package com.example.secondmssb3x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SecondMsSb3xApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMsSb3xApplication.class, args);
	}

}
