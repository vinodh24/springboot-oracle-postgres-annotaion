package com.vinodh.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.model.User;
import com.vinodh.service.UserDetailService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDetailService userDetailService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public User addUser( @RequestBody User user)
	{
		return userDetailService.saveUser(user);
	}
	
	@PutMapping(path= "/updateUser", consumes = "application/json", produces = "application/json")
	public User updateUser(@RequestBody User user)
	{
		return userDetailService.updateUser(user);
	}
	
	@GetMapping(path= "/findByUserId/{id}", produces = "application/json")
	public Optional<User> findByUserId(@PathVariable int id )
	{
		return userDetailService.findByUserId(id);
	}
	
	@DeleteMapping(path= "/deleteByUserId/{id}", produces = "application/json")
	public String deleteUser(@PathVariable int id )
	{
		return userDetailService.deleteUser(id);
	}


}
