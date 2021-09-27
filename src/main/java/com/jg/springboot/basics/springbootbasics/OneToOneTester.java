package com.jg.springboot.basics.springbootbasics;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jg.springboot.basics.springbootbasics.author.Author;
import com.jg.springboot.basics.springbootbasics.author.AuthorService;
import com.jg.springboot.basics.springbootbasics.profile.Profile;

@SpringBootApplication
public class OneToOneTester implements CommandLineRunner {

	@Autowired
	private AuthorService authorService;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneTester.class, args);
	}

	public void run(String args[]) throws Exception {

		Profile profile = new Profile("https://example.author1.lk", LocalDate.parse( "1997-12-03"), LocalDate.parse( "2021-08-23"));

		Author author = new Author("Example Author 1", 23, profile);

		Author savedAuthor = authorService.saveAuthor(author);

		System.out.println(String.format("Saved Author: \nName: %s \nAge: %s \nProfile Link: %s\n\n",
				savedAuthor.getAuthorName(), savedAuthor.getAge(), savedAuthor.getProfile().getProfileLink()));

		Author authorReceived = authorService.getAuthorById(savedAuthor.getId());

		System.out.println(String.format("Search Results: \nName: %s \nAge: %s \nProfile Link: %s",
				authorReceived.getAuthorName(), authorReceived.getAge(), savedAuthor.getProfile().getProfileLink()));
	}
}
