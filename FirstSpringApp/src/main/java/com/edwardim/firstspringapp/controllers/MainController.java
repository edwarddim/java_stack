package com.edwardim.firstspringapp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "Dashboard Page";
	}
	
	@RequestMapping("/m/{stack}/{module}/{page}")
	public String test(
			@PathVariable("stack") Integer a, 
			@PathVariable("module") Integer b, 
			@PathVariable("page") Integer c
	) {
		return a+ "/" + b + "/" + c;
	}
}
