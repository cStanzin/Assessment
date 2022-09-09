package com.lulu.weeklyassessment;

public class Tester {

	public static void main(String[] args) {
		/*
		 * WAP to create Class "SchoolRecords" create 3 data members as school name
		 * ,School ID ,School Address to create records of schools in Chennai. Create
		 * Method to add all records[ddRecords()] and display all records[dispRecords()]
		 */
		System.out.println("Please enter records!");
		SchoolRecords sr = new SchoolRecords();
	
		sr.addRecords();
		sr.displayRecords();
		System.out.println("Thank you!");

	}

}
