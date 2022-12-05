package com.edwardim.postsession.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
//		System.out.println(session.getAttribute("sessionEmail"));
//		System.out.println(session.getAttribute("sessionPassword"));
		model.addAttribute("email", session.getAttribute("sessionEmail"));
		model.addAttribute("password", session.getAttribute("sessionPassword"));
//		String myEmail = (String) session.getAttribute("sessionEmail");
//		model.addAttribute("email", myEmail);
		return "index.jsp";
	}
	
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
	@PostMapping("/login")
	public String loginProcess(
		@RequestParam("email") String email,
	    @RequestParam("password") String password,
	    HttpSession session
	) {
		session.setAttribute("sessionEmail", email);
		session.setAttribute("sessionPassword", password);
		System.out.println(email);
		System.out.println(password);
		return "redirect:/";
	}
}
