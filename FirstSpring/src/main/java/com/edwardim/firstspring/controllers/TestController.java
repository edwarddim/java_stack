package com.edwardim.firstspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome!!!";
	}
	
	
	@RequestMapping("/recipes/{id}")
	public String oneRecipe( @PathVariable("id") String recipeID) {
		
		return "One Recipe Page: " + recipeID;
	}
	
	
	@RequestMapping("/users/{username}/{id}")
	public String showUserProfile(
		@PathVariable("username") String username,
		@PathVariable("id") String id
	) {
		return "username: " + username + ", id: " + id;
	}
}


