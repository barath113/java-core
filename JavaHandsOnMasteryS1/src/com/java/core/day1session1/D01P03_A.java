package com.java.core.day1session1;

import java.util.Scanner;

public class D01P03_A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Enter a number between 1 to 12
		int monthNumber = scanner.nextInt();

		// Check if the number is within the range of 1 to 12
		if (monthNumber >= 1 && monthNumber <= 12) {
			// Display the name of the month
			String monthName = getMonthName(monthNumber);
			System.out.println(monthName);
		} else {
			System.out.println("Invalid Input");
		}

		scanner.close();
	}

	// Get the name of the month based on the user input
	public static String getMonthName(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid month number";
		}
	}
}
