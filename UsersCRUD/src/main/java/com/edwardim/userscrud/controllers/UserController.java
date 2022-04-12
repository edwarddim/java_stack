package com.edwardim.userscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.userscrud.models.User;
import com.edwardim.userscrud.services.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userServ;
	
	
	@RequestMapping("/users")
	public List<User> users() {
		return userServ.allUsers();
	}
}
