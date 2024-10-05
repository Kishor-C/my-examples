package com.example.servicediscoverysb3x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoverySb3xApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoverySb3xApplication.class, args);
	}

}
