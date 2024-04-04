package com.java.core.day1session1;

import java.util.Scanner;

public class D01P01 { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String book_title = scanner.nextLine();
		double book_price = scanner.nextDouble();
		
		BookImplementation bi=new BookImplementation();
		bi.createBooks(book_title,book_price);
		bi.showBooks();
	}
}
