package com.jg.springboot.basics.springbootbasics.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	public static List<Book> books = new ArrayList<Book>();
	public static long idCounter = 0;

	static {	
		books.add(new Book(++idCounter,
				"Cloud Native Java: Designing Resilient Systems with Spring Boot, Spring Cloud, and Cloud Foundry",
				Arrays.asList("Josh Long", "Kenny Bastani"), 45.99));
		books.add(new Book(++idCounter,
				"Spring Boot in Action",
				Arrays.asList("Craig Walls"), 25.88));
	}
	
	public List<Book> findAll(){
		return books;
	}

}
