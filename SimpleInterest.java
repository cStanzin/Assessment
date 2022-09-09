package com.lulu.weeklyassessment;

public class SimpleInterest {

	public static void main(String[] args) {

		/* WAP to find SI also display total amount to be paid after Loan duration ends.
		   (Take Static Initialization of various Variables) */

		float p = 10000.00f;
		float t = 2.0f;
		float r = 5.20f;

		float SI = (p * t * r) / 100;
		float totalAmount = SI + p;
		
		System.out.println("Simple Interest:" + SI);
		System.out.println("Total amount to be paid:" + totalAmount);

	}

}
