package com.vinodh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinodh.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);

}
