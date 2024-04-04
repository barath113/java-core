package com.java.core.day1session2;

import java.util.HashMap;
import java.util.Scanner;

public class D01P04_C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the size of the array
		System.out.print("Enter the size of the array: ");
		int N = scanner.nextInt();

		// Read the elements of the array
		int[] arr = new int[N];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		// Create a HashMap to store the first occurrence index of each element
		HashMap<Integer, Integer> map = new HashMap<>();

		// Initialize the index of the first repeating element as -1
		int firstRepeatingIndex = -1;

		// Iterate through the array to find the first repeating element
		for (int i = 0; i < N; i++) {
			if (map.containsKey(arr[i])) {
				firstRepeatingIndex = map.get(arr[i]);
				break; // Found the first repeating element, exit the loop
			} else {
				// Store the index of the first occurrence of the element
				map.put(arr[i], i);
			}
		}

		// Print the index of the first repeating element
		System.out.println("Index of the first repeating element: " + firstRepeatingIndex);

		scanner.close();
	}
}