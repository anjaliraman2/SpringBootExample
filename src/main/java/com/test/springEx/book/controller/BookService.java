package com.test.springEx.book.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	private List<Book> books = Arrays.asList(
			new Book("Head First Java", "Katty Perry", 50.00),
			new Book("Tale of two cities", "Charles Dickens", 90.00),
			new Book("Client","Jeffery Archer",89.00)
			);
	
	public List getAllBooks() {
		return books;
	}

	public Book getBookByName(String name) {
	
		return books.stream().filter(t -> t.getName().equals(name))
				.findFirst().get();
	}
}
