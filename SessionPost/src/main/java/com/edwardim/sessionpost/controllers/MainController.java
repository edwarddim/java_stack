package com.edwardim.sessionpost.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	// RENDERING THE FORM
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			int count = (int) session.getAttribute("count");
			session.setAttribute("count", ++count);
		}
		return "index.jsp";
	}
	
	// ACCEPT THE FORM INFO
//	@RequestMapping(value="/process", method=RequestMethod.POST)
	@PostMapping("/process")
	public String process(
			@RequestParam(value="email") String emailParam,
			@RequestParam(value="password") String passParam,
			HttpSession session
	) {
		session.setAttribute("email", emailParam);
		session.setAttribute("password", passParam);
//		System.out.println(emailParam);
//		System.out.println(passParam);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
	
	
}
