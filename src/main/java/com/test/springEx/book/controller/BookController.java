package com.test.springEx.book.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/store")
public class BookController {
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public @ResponseBody List<Book> getAllBooks(){
		return bookService.getAllBooks();				
	}
	
	@RequestMapping(value="/books/{name}")
	public @ResponseBody Book getBookByName(@PathVariable String name){
		return bookService.getBookByName(name);
	}

}
