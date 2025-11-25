package com.examples;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.examples.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int x, int y) {
		return (x + y);
	}

	@Override
	public int sub(int x, int y) {
		return (x - y);
	}
	
}
