package com.java.core.day1session1;

import java.util.Scanner;

public class D01P03_D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int numRows = scanner.nextInt();

		for (int i = 1; i <= numRows; i++) {
			// Print the repeated numbers for the current row
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			// Move to the next line for the next row
			System.out.println();
		}

		scanner.close();
	}
}