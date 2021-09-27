package com.jg.springboot.basics.springbootbasics.profile;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "profile")
public class Profile {

	@Id
	@GeneratedValue
	@Column(name = "profile_id")
	private Long id;

	@Column(name = "profile_link")
	private String profileLink;

	@Column(name = "started_date")
	private LocalDate startedDate;

	@Column(name = "last_updated")
	private LocalDate lastUpdated;

	public Profile() {
	}

	public Profile(String profileLink, LocalDate startedDate, LocalDate lastUpdated) {
		super();
		this.profileLink = profileLink;
		this.startedDate = startedDate;
		this.lastUpdated = lastUpdated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfileLink() {
		return profileLink;
	}

	public void setProfileLink(String profileLink) {
		this.profileLink = profileLink;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
