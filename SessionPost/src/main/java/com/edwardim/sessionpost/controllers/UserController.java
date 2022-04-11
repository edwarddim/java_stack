package com.edwardim.sessionpost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edwardim.sessionpost.models.User;
import com.edwardim.sessionpost.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService uServ;
	
	@RequestMapping("/users")
	public String users(Model model) {
		
		// GET ALL USERS FROM DB
		List<User> allUsers = uServ.getAllUsers();
		// PASS THE USERS TO THE JSP
		model.addAttribute("users", allUsers);
		return "users.jsp";
	}
}
