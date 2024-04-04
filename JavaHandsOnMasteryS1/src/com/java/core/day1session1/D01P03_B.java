package com.java.core.day1session1;

import java.util.Scanner;

public class D01P03_B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number representing the week: ");
		int weekNumber = scanner.nextInt();

		// Check if the entered number represents a valid week day (1 to 7)
		if (weekNumber >= 1 && weekNumber <= 7) {
			String weekday = getWeekday(weekNumber);
			System.out.println(weekday);
		} else {
			System.out.println("Invalid Input");
		}

		scanner.close();
	}

	// Method to get the weekday based on the week number
	public static String getWeekday(int weekNumber) {
		if (weekNumber == 1) {
			return "Sunday";
		} else if (weekNumber == 2) {
			return "Monday";
		} else if (weekNumber == 3) {
			return "Tuesday";
		} else if (weekNumber == 4) {
			return "Wednesday";
		} else if (weekNumber == 5) {
			return "Thursday";
		} else if (weekNumber == 6) {
			return "Friday";
		} else {
			return "Saturday";
		}
	}
}
