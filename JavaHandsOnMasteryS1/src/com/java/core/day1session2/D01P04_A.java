package com.java.core.day1session2;

import java.util.Scanner;

public class D01P04_A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter two numbers in the range from 1 to 40
		System.out.println("Enter two numbers in the range from 1 to 40:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		// Initialize the array with five integer elements
		int[] arr = new int[5];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < 1 && arr[i] > 40) {
				break;
			}
		}

		// Check if both numbers are found in the array
		boolean foundNum1 = false;
		boolean foundNum2 = false;
		for (int i = 0; i < arr.length; i++) {
			if (num1 == arr[i]) {
				foundNum1 = true;
			}
			if (num2 == arr[i]) {
				foundNum2 = true;
			}
		}

		// Display the result
		if (foundNum1 && foundNum2) {
			System.out.println("It's Bingo");
		} else {
			System.out.println("Not Found");
		}

		scanner.close();
	}

}
