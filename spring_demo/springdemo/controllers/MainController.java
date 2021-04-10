package com.edwardim.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	// LISTEN FOR URLS AND SEND BACK RESPONSES
	@RequestMapping("")  //urls.py
	public String index() { // views.py method
		return "Hello World";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "You've reached the hello route";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Welcome to the world";
	}
	
	
}
