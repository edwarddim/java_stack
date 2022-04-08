package com.edwardim.firstspringapp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@RequestMapping("/")
    public String hello() {
		return "Hello World!";
    }
	
	@RequestMapping("/home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/users/{userId}")
	public String user(@PathVariable("userId") Long id) {
		return "User ID: " + id;
	}
	
    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(
    		@PathVariable("track") String track, 
    		@PathVariable("module") String module, 
    		@PathVariable("lesson") String lesson
    ){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
	
	
}