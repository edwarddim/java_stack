package com.edwardim.sessionfunddemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		// IS THIS YOUR FIRST TIME VISITNG US
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		else {
			// INCREMENT THE COUNTER
			Integer sessionCounter = (Integer) session.getAttribute("counter");
			sessionCounter++;
			session.setAttribute("counter", sessionCounter);
		}
		return "counter.jsp";
	}
	
	@GetMapping("/view_counter")
	public String view(Model model, HttpSession session) {
		Integer counter = (Integer) session.getAttribute("counter");
		model.addAttribute("visits", counter);
		return "display.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}
	
	
}
