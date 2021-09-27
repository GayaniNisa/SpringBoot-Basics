package com.jg.springboot.basics.springbootbasics.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {
		return this.authorRepository.findAll();
	}

	public Author getAuthorById(Long id) {
		return this.authorRepository.findById(id).get();
	}

	public Author saveAuthor(Author author) {
		return this.authorRepository.save(author);
	}
}
