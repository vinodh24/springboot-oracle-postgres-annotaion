package com.vinodh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinodh.model.User;
import com.vinodh.repository.UserRepository;

public class UserDetailService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);	
	}

	public String deleteUser(int id) {
		userRepository.deleteById(id);
	    return "User has been deleted successfully";
	}


	public Optional<User> findByUserId(int id) {
		return userRepository.findById(id);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

}
