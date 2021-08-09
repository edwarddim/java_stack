package com.edwardim.sessionpost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edwardim.sessionpost.services.MainService;
import com.edwardim.sessionpost.services.User;

@Controller
public class TagController {
	
	@Autowired
	private MainService mainServ;
	
	
	@GetMapping("/users")
	public String index(Model model) {
		
		// CALL ON FUNCTION THAT RETRIEVES ALL USERS
		List<User> allUsers = mainServ.getAllUsers();

		// PASS THE INFORMATION TO THE TEMPLATE
		model.addAttribute("users", allUsers);
		
		return "users.jsp";
	}
}
