package com.edwardim.userdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.edwardim.userdemo.models.User;
import com.edwardim.userdemo.services.UserService;

@Controller
public class UserController {
	
	// IMPORT SERVICES
	@Autowired
	private UserService userServ;
	
	// ----------------- READ -------------------//
	@GetMapping("/")
	public String index(
		Model model,
		@ModelAttribute("userObj") User emptyUser
	) {
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
	// ----------------- READ -------------------//
	
	// ----------------- CREATE -----------------------//
	@PostMapping("/users/data")
	public String createUser(
		@Valid @ModelAttribute("userObj") User filledUser, 
		BindingResult results, Model model
	) {
		// CHECK TO SEE IF VALIDATIONS FAIL
		if(results.hasErrors()) {
			// GRAB ALL USERS FROM DB - UserService userServ
			List<User> allUsers = userServ.getAllUsers();
			
			// PASS THE USERS TO THE JSP - Model model
			model.addAttribute("users", allUsers);
			return "index.jsp";
		}
		// VALIDATIONNS HAVE PASSED, CREATE USER AND REDIRECT
		else {
			userServ.create(filledUser);
			return "redirect:/";
		}
	}
	// ----------------- CREATE -----------------------//
	
	// ----------------- UPDATE -----------------------//
	@GetMapping("/users/{id}/edit")
	public String edit(
		@PathVariable("id")Long id, Model model
	) {
		// FIND THE USER OBJ FROM DB
		User editUser = userServ.getOneUser(id);
		
		// PASS THE USER OBJ TO JSP
		model.addAttribute("userObj", editUser);
		
		return "edit.jsp";
	}
	
	@PutMapping("/users/{id}/edit")
	public String update(
		@Valid @ModelAttribute("userObj") User updatedUser,
		BindingResult results
	) {
		// VALIDATIONS FAILED
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		else {
			userServ.updateUser(updatedUser);
			return "redirect:/";
		}
	}
	// ----------------- UPDATE -----------------------//
	
	
	// ----------------- DELETE -----------------------//
	@GetMapping("/users/{id}/delete")
	public String delete(
		@PathVariable("id") Long id
	) {
		userServ.deleteUser(id);
		return "redirect:/";
	}
	// ----------------- DELETE -----------------------//
	
	
	
	
	
	
//	@GetMapping("/users/new")
//	public String newUser(
//		@ModelAttribute("userObj") User emptyUser
//	) {
//		return "new.jsp";
//	}
//	@PostMapping("/users/new")
//	public String create(
//		@RequestParam("name") String name,
//		@RequestParam("email") String email,
//		@RequestParam("password") String password,
//		@RequestParam("age") Integer age
//	) {
//		// INSTANTIATE A USER OBJECT
//		User watermelon = new User(name, age, email, password);
//		userServ.create(watermelon);
//		
//		
//		return "redirect:/";
//	}
}
