package com.edwardim.templatedemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	@RequestMapping("/")
	public String index(Model model) {
		int age = 30;
		
		model.addAttribute("name", "Edward Im");
		model.addAttribute("age", age);
		return "index.jsp";
	}
	
	
	
	
}
