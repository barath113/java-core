package com.java.core.day1session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D01P04_D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the input array
		System.out.print("Enter the array of numbers (without spaces): ");
		String input = scanner.nextLine();

		// Read the value of k
		System.out.print("Enter the value of k: ");
		int k = scanner.nextInt();

		// Find distinct combinations of numbers according to the value of k
		List<String> combinations = findCombinations(input, k);

		// Print the distinct combinations
		System.out.println("Distinct combinations of numbers according to k:");
		for (String combination : combinations) {
			System.out.println(combination);
		}

		scanner.close();
	}

	// Method to find distinct combinations of numbers according to the value of k
	public static List<String> findCombinations(String input, int k) {
		List<String> combinations = new ArrayList<>();

		generateCombinations(input, k, 0, "", combinations);

		return combinations;
	}

	// Recursive method to generate combinations
	private static void generateCombinations(String input, int k, int index, String currentCombination,
			List<String> combinations) {
		if (k == 0) {
			combinations.add(currentCombination);
			return;
		}

		for (int i = index; i < input.length(); i++) {
			generateCombinations(input, k - 1, i + 1, currentCombination + input.charAt(i), combinations);
		}
	}
}
