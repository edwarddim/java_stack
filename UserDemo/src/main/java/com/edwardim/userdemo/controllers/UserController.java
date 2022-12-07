package com.edwardim.userdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.edwardim.userdemo.models.User;
import com.edwardim.userdemo.services.UserService;

@Controller
public class UserController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	UserService userServ;
	
	// ------------------ DATA BINDING(CREATE) ------------------------ //
	// READ ALL
	@GetMapping("/")
	public String index(
		Model model, @ModelAttribute("userObj") User emptyUserObj
	) {
		// USE SERVICE TO MAKE CRUD COMMAND - RETRIEVE ALL USERS
		List<User> allUsersFromDB = userServ.getAllUsers();
		
		// PASS ALL USERS TO JSP
		model.addAttribute("allUsers", allUsersFromDB);
		
		// RENDER THE JSP
		return "index.jsp";
	}
	
	@PostMapping("/users/new")
	public String processUser(
		Model model,
		@Valid @ModelAttribute("userObj") User filledUserObj,
		BindingResult results
	) {
		if(results.hasErrors()) {
			model.addAttribute("allUsers", userServ.getAllUsers());
			return "index.jsp";
		}
		userServ.create(filledUserObj);
		return "redirect:/";
	}
	// ------------------ DATA BINDING(CREATE) ------------------------ //
	
	
	
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
	
	
	// ------------------ DATA BINDING(CREATE) ------------------------ //
//	@GetMapping("/users/new")
//	public String newUser(
//		@ModelAttribute("userObj") User emptyUserObj
//	) {
////		model.addAttribute("userObj", new User());
//		return "create.jsp";
//	}
	
	// ------------------ DATA BINDING(CREATE) ------------------------ //
	
	// ------------------ DATA BINDING(UPDATE) ------------------------ //
	@GetMapping("/users/{id}/edit")
	public String editUser(
		@PathVariable("id") Long userId, Model model
	) {
		// GRAB ONE USER FROM DB
		User oneUser = userServ.findUser(userId);
		// PASS ONE USER TO JSP
		model.addAttribute("userObj", oneUser);
		return "editUser.jsp";
	}
	@PutMapping("/users/{id}/edit")
	public String updateUser(
		@Valid @ModelAttribute("userObj") User filledUserObj,
		BindingResult results
	) {
		if(results.hasErrors()) {
			return "editUser.jsp";
		}
		userServ.create(filledUserObj);
		return "redirect:/";
	}
	// ------------------ DATA BINDING(UPDATE) ------------------------ //
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") Long userId) {
		userServ.deleteUser(userId);
		return "redirect:/";
	}
}
