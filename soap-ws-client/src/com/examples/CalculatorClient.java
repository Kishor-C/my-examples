package com.examples;

public class CalculatorClient {
	public static void main(String[] args) {
		CalculatorImplService service = new CalculatorImplService();
		Calculator calculator = service.getCalculatorImplPort();
		int resultAdd = calculator.add(20, 30);
		int resultSub = calculator.sub(30, 20);
		System.out.println("Add: "+resultAdd);
		System.out.println("Sub: "+resultSub);
		
	}
}
