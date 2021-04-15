package com.edwardim.mvc.controllers;

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

import com.edwardim.mvc.models.User;
import com.edwardim.mvc.services.MainService;

@Controller
public class UserController {
	
//	private final MainService mainServ;
//	
//	public MainController(MainService mainServ) {
//		this.mainServ = mainServ;
//	}
	@Autowired
	private MainService mainServ;
	
	@GetMapping("")
	public String index(@ModelAttribute("userObj") User emptyUser, Model model) {
		List<User> usersFromDB = mainServ.allUsers();
		model.addAttribute("allUsers", usersFromDB);
		return "index.jsp";
	}
	
//	@GetMapping("/users/{id}")
//	public String details(@PathVariable("id")Long id) {
//		// GRAB USER FROM DB USING ID
//		// PASS USER OVER TO JSP USING MODEL
//		// RENDER THE JSP
//	}
	
	@PostMapping("/users/new")
	public String newUser(@Valid @ModelAttribute("userObj") User filledUser, BindingResult results) {
		// CHECK TO SEE IF ERRORS
		// IF THERE ARE ERRORS, SEND THEM BACK TO FORM AND DISPLAY MESSAGES
		if(results.hasErrors()) {
			return "index.jsp";
		}
		// IF THERE ARE NO ERRORS, CREATE THE USER
		else {
			mainServ.createUser(filledUser);
			return "redirect:/";
		}
	}
	
	// UPDATE
	@GetMapping("/users/{id}/edit")
	public String edit(@PathVariable("id")Long id, Model model) {
		// USING THE ID, FIND THE USER FROM DB AND STORE INSIDE VARIABLE
		User editUser = mainServ.findUser(id);
		// PASSING OVER THE USER OBJECT TO JSP
		model.addAttribute("userObj", editUser);
		return "edit.jsp";
	}
	
}
