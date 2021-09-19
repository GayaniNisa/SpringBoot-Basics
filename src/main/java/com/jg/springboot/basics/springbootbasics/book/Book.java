package com.jg.springboot.basics.springbootbasics.book;

import java.util.List;

public class Book {

	private long id;
	private String name;
	private List<String> authors;
	private double price;
	
	public Book(long id, String name, List<String> authors, double price) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
