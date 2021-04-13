package com.javastack.spring.ninjaGold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping(value= "/", method=RequestMethod.GET)
	public String index() {
		
		return "index.jsp";
		
	}
	
	@RequestMapping("/{name}")
	public String getName(@PathVariable("name") String name) {
		
		return String.format("Hello %s", name);
	}
	
	@RequestMapping(value= "/results", method=RequestMethod.GET)
	public String results() {
		
		return "results.jsp";
		
	}
	
	@RequestMapping("/boxes/{color}/{num}")
	
	public String boxes(@PathVariable("color") String color, @PathVariable("num") int num, Model model) {
		
		System.out.println(color);
		System.out.println(num);
		
		model.addAttribute("color", color);
		model.addAttribute("num", num);
		
		return "index.jsp";
	}
	
	@RequestMapping(value= "/process_user", method=RequestMethod.POST)
	public String process_user(
			Model model, @RequestParam(value="user_name") String user_name
			) {
		
		System.out.println(user_name);
		
		model.addAttribute("user_name", user_name);
		
		return "results.jsp";
		
	}
}
