package com.lulu.weeklyassessment;

import java.util.Scanner;

public class SchoolRecords {

	Scanner sc = new Scanner(System.in);
	String schoolName = sc.next();
	int schoolId = sc.nextInt();
	String schoolAddress = sc.next();

	void addRecords() {

		System.out.println("Records added");

	}

	void displayRecords() {

		System.out.println("School Name:" + schoolName + "\n" + "School ID:" + schoolId + "\n" + "School Address:"
				+ schoolAddress);

	}

}
