package com.jg.springboot.basics.springbootbasics.author;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.jg.springboot.basics.springbootbasics.profile.Profile;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue
	@Column(name = "author_id")
	private Long id;

	@Column(name = "author_name")
	private String authorName;

	@Column(name = "age")
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile_id")
	private Profile profile;

	public Author() {
	}

	public Author(String authorName, int age, Profile profile) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.profile = profile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
