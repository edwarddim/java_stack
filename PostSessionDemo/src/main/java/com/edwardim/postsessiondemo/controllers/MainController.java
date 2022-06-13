package com.edwardim.postsessiondemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/login")
	public String loginProcess(
		@RequestParam(value="email") String paramEmail,
		@RequestParam(value="password") String paramPassword
	) {
		boolean loginCredentials = true;
		if(paramEmail.length() < 8) {
			loginCredentials = false;
		}
		// IS YOUR LOGIN CREDENTIALS GOOD
		if(loginCredentials == true) {
			return "redirect:/dashboard";
		}
		else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard.jsp";
	}
}
