package com.edwardim.userscrud.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edwardim.userscrud.models.User;
import com.edwardim.userscrud.services.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userServ;
	
	@RequestMapping("/")
	public String index(Model model) {
		// GET ALL USERS FROM DB
		List<User> allUsers = userServ.allUsers();
		// PASS ALL USERS TO JSP
		model.addAttribute("users", allUsers);
		
		return "index.jsp";
	}
	
	@RequestMapping("/users/{id}")
	public String oneUser(@PathVariable("id") Long id, Model model) {
		// GET ONE USER FROM DB
		User oneUser = userServ.oneUser(id);
		// PASS ONE USER TO JSP
		model.addAttribute("user", oneUser);
		
		return "oneUser.jsp";
	}
	
	// -------------------------------------------------------------------//
	// CREATE - RENDERING THE FORM
	@RequestMapping("/users/new")
	public String newUser(
			@ModelAttribute("user") User emptyUser
	) {
		return "new.jsp";
	}
	
	// CREATE - ACCEPTING FORM INFORMATION(USER OBJECT)
	@PostMapping("/users/new")
	public String processUser(
			@Valid @ModelAttribute("user") User filledUser, BindingResult results
	) {		
		// VALIDATE THE INFORMATION
		if(results.hasErrors()) {
			// VALIDATION DON'T PASS
			return "new.jsp";
		}
		else {
			// VALIDATION PASS
			userServ.create(filledUser);
			return "redirect:/";
		}
	}
	// -------------------------------------------------------------------//
	
	
	
}
