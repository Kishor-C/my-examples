package com.examples.session3;

import java.util.Scanner;

interface NumberInput {
	void readInput(int input);
}
interface AutomorphicChecker {
	boolean isAutomorphic();
}
class AutomorphicNumber implements NumberInput, AutomorphicChecker {

	private int input;
	@Override
	public boolean isAutomorphic() {
		int square = input * input;
		String inputString = String.valueOf(input);
		String squareString = String.valueOf(square);
		return squareString.endsWith(inputString);
	}

	@Override
	public void readInput(int input) {
		this.input = input;
	}
	
}
public class S1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AutomorphicNumber automorphic = new AutomorphicNumber();
		int n = scan.nextInt();
		automorphic.readInput(n);
		boolean status = automorphic.isAutomorphic();
		if(status) {
			System.out.println(n+" is an automorphic number");
		} else {
			System.out.println(n+" is not an automorphic number");
		}
		scan.close();
	}
}
