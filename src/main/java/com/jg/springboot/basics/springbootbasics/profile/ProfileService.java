package com.jg.springboot.basics.springbootbasics.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	public List<Profile> getAllAuthors() {
		return this.profileRepository.findAll();
	}

	public Profile getAuthorById(Long id) {
		return this.profileRepository.findById(id).get();
	}
}
