package com.examples.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.service.GreetingService;

public class GreetingServiceTest {

	private GreetingService service;
	private static ApplicationContext context;
	
	@BeforeAll
	public static void load() {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	@AfterAll
	public static void unload() {
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
	@BeforeEach
	public void set() {
		service = (GreetingService)context.getBean("b1");
	}
	
	@Test
	public void testWelcomeMessage() {
		String result = service.greet("Kishor");
		assertEquals("Welcome Kishor", result);
	}
	
}
