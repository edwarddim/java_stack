package com.edwardim.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	
	@RequestMapping("")
	public String index() {
		return "Register Page";
	}
	@RequestMapping("/process")
	public String process() {
		return "Register Page";
	}

}
