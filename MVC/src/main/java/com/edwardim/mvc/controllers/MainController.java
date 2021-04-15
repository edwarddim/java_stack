package com.edwardim.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.mvc.models.User;
import com.edwardim.mvc.services.MainService;

@RestController
public class MainController {
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	// RETRIEVE ALL USERS
	@GetMapping("/api/users")
	public List<User> getAllUsers() {
		return mainServ.allUsers();
	}
	
	// RETRIEVE A USER BY ID
	@GetMapping("/api/users/{id}")
	public User findUser(
			@PathVariable("id") Long user_id
	) {
		return mainServ.findUser(user_id);
	}
	// CREATE A USER
	@PostMapping("/api/users/new")
	public User createUser(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password
	) {
		User newUser = new User(name, email, password);
		User newObj = mainServ.createUser(newUser);
		return newObj;
	}
	
}
