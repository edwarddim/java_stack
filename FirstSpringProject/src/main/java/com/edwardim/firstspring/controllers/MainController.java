package com.edwardim.firstspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("")
	public String index() {
		return "Hello Worldt";
	}
	
	@RequestMapping("test")
	public String test() {
		return "TEST ROUTE";
	}
	
	@RequestMapping("/users/{user_id}/{another_one}")
	public String viewUser(
			@PathVariable("user_id") Long id, 
			@PathVariable("another_one") String text
	) {
		System.out.println(id);
		System.out.println(text);
		return "User ID: " + id + " Text: " + text;
	}
	
	
	
}
