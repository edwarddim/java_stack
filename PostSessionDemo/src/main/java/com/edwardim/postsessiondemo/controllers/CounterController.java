package com.edwardim.postsessiondemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	@GetMapping("/counter")
	public String count(
			HttpSession session, Model model
	) {
		// CHECK TO SEE IF THIS IS YOUR FIRST TIME
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			int currentCount = (int) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		return "count.jsp";
	}
	
	@GetMapping("/clear")
	public String clear(
		HttpSession session
	) {
		session.removeAttribute("count");
		return "redirect:/counter";
	}
}
