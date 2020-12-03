package com.edwardim.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
//	URLS.PY
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
//	VIEWS.PY
	
	@RequestMapping("/thursday")
	public String thursday() {
		System.out.println("You are on Thursday router");
		return "Today is Thursday";
	}
}
