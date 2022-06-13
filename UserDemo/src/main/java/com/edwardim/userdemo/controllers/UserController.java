package com.edwardim.userdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edwardim.userdemo.models.User;
import com.edwardim.userdemo.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String index(Model model) {
		
		// RUN METHOD FOR GETTING ALL USERS
		List<User> watermelons = userServ.getAllUsers();
		// PASS THE USERS TO THE JSP
		model.addAttribute("users", watermelons);
		return "index.jsp";
	}
}
