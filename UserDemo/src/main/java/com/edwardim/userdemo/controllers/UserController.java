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
	
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String index(Model model) {
		// GRAB ALL USERS FROM DB - UserService userServ
		List<User> allUsers = userServ.getAllUsers();
		
		// PASS THE USERS TO THE JSP - Model model
		model.addAttribute("users", allUsers);
		
		return "index.jsp";
	}
	
	@GetMapping("/users/{id}")
	public String oneUser(
		@PathVariable("id") Long id,
		Model model
	) {
		// GRAB ONE USER FROM DB - UserService userServ
		User oneUser = userServ.getOneUser(id);
		
		// PASS THE USER TO THE JSP - Model model
		model.addAttribute("user", oneUser);
		
		return "oneUser.jsp";
	}
	
	@PostMapping("/users/new")
	public String create(
		@RequestParam("name") String name,
		@RequestParam("email") String email,
		@RequestParam("password") String password,
		@RequestParam("age") Integer age
	) {
		// INSTANTIATE A USER OBJECT
		User watermelon = new User(name, age, email, password);
		userServ.create(watermelon);
		
		
		return "redirect:/";
	}
	
}
