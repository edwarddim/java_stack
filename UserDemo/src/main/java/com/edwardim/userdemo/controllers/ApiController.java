package com.edwardim.userdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.userdemo.models.User;
import com.edwardim.userdemo.services.UserService;

@RestController
public class ApiController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	UserService userServ;
	
	
	// CREATE USER
	@PostMapping("/api/users/new")
	public String create(
		@RequestParam("name") String name,
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		@RequestParam("age") Integer age
	) {
		User newUser = new User(email, password, age, name);
		return userServ.create(newUser).toString();
	}
	
	// READ ALL USER
	
	// READ ONE USER
	
	
	// UPDATE USER
	
	
	// DELETE USER
	
}
