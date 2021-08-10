package com.edwardim.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountController {
	
	@GetMapping("/count")
	public String count(HttpSession session) {
		
		if(session.getAttribute("num_visits") == null) {			
			session.setAttribute("num_visits", 0);
		}
		
		int visits = (int) session.getAttribute("num_visits");
		session.setAttribute("num_visits", ++visits);
		return "count.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/count";
	}
	
}
