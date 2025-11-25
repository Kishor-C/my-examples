package com.examples.session3;

import java.util.Scanner;

interface Principal {
	double getPrincipal();
}
interface InterestRate {
	double getInterestRate();
}
class Loan implements Principal, InterestRate {
	private double principal;
	private double interestRate;
	private int loanDuration;
	private double totalInterest;
	public Loan(double principal, double interestRate, int loanDuration) {
		super();
		if(principal <= 0 || interestRate <= 0) {
			System.out.println("Invalid input values!");
		} else {
			this.principal = principal;
			this.interestRate = interestRate;
			this.loanDuration = loanDuration;
			this.totalInterest = this.principal * this.interestRate * this.loanDuration;
		}
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	@Override
	public double getPrincipal() {
		return principal;
	}
}
public class S3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Loan loan = new Loan(scan.nextDouble(), scan.nextDouble(), scan.nextInt());
		double total = loan.getTotalInterest();
		if(total != 0) {
			System.out.printf("Total interest paid: Rs.%.2f", total);
		} 
		scan.close();
	}
}
