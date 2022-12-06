package com.edwardim.userdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edwardim.userdemo.models.User;
import com.edwardim.userdemo.services.UserService;

@Controller
public class UserController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	UserService userServ;
	
	// READ ALL
	@GetMapping("/")
	public String index(Model model) {
		// USE SERVICE TO MAKE CRUD COMMAND - RETRIEVE ALL USERS
		List<User> allUsersFromDB = userServ.getAllUsers();
		
		// PASS ALL USERS TO JSP
		model.addAttribute("allUsers", allUsersFromDB);
		
		// RENDER THE JSP
		return "index.jsp";
	}
	
	// READ ONE USER
	@GetMapping("/users/{id}")
	public String showOne(
		@PathVariable("id") Long userId,
		Model model
	) {
		// RETRIEVE ONE USER FROM DB
		User oneUser = userServ.findUser(userId);
		
		// PASS THE INFORMATION TO THE JSP
		model.addAttribute("user", oneUser);
	
		return "oneUser.jsp";
	}
	
	// CREATE A USER
	@PostMapping("/users/new")
	public String create(
		@RequestParam("name") String name,
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		@RequestParam("age") Integer age
	) {
		User newUser = new User(email, password, age, name);
		userServ.create(newUser);
		return "redirect:/";
	}

	
	
}
