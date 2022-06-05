package com.edwardim.sessionpost.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		
		session.setAttribute("count", 0);
		
		
		return "index.jsp";
	}
	
//	@RequestMapping("/display")
	@GetMapping("/display")
	public String display(Model model, HttpSession session) {
		
		if(session.getAttribute("count") == null) {
			return "redirect:/";
		}
		
		int count = (int) session.getAttribute("count");
		session.setAttribute("count", ++count);
//		model.addAttribute("countContext", count);
		return "display.jsp";
	}
	
//	@RequestMapping(value="/process", method=RequestMethod.POST)
	@PostMapping("/process")
	public String process(
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model,
			RedirectAttributes redirectAttributes
	) {
		System.out.println(email);
		System.out.println(password);
		model.addAttribute("email", email);
		
		redirectAttributes.addFlashAttribute("email", email);
		return "redirect:/";
	}
	
	
	
}
