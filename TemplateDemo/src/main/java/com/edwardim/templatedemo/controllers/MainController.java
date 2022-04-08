package com.edwardim.templatedemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Edward Im");
		model.addAttribute("age", 31);
		return "index.jsp";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		ArrayList<String> userList = new ArrayList<String>();
		
		userList.add("Edward Im");
		userList.add("Jane Doe");
		userList.add("John Doe");
		
		model.addAttribute("users", userList);
		return "home.jsp";
	}
	
	
}