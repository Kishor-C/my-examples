package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAssociationMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAssociationMappingApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(ApplicationContext context) {
		return (args) -> {
			
		};
	}

}
