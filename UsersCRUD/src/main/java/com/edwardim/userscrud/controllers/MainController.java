package com.edwardim.userscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
}
