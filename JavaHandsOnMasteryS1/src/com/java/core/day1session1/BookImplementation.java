package com.java.core.day1session1;

public class BookImplementation {
		Book b=new Book();
	public void createBooks(String book_title,double book_price) {
		b.setBook_price(book_price);
		b.setBook_title(book_title);	
	}
	
	public void showBooks() {
		System.out.println("Book Title: "+b.getBook_title() +" and Price: "+b.getBook_price()); 
	}
}
