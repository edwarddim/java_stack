package com.edwardim.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.mvc.models.User;
import com.edwardim.mvc.services.MainService;

@RestController
public class MainController {
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return mainServ.allUsers();
	}
	
}
