package com.jg.springboot.basics.springbootbasics.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {

	@Autowired
	private BookService bookService;

	@GetMapping(path = "/books")
	public List<Book> getAllBooks() {
		return bookService.findAll();
	}
}
