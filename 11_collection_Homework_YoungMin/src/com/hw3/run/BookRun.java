package com.hw3.run;

import com.hw3.model.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		
		BookService service = new BookService();
		
		service.displayMenu();
		
	}
	
}
