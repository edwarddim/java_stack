package com.edwardim.sessionpost.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
			HttpSession session,
			RedirectAttributes redirectAttributes
	) {
		// VALIDATIONS HAVE FAILED
		if(passParam.length() < 8 || emailParam.length() < 4) {
			// CREATE ERROR MESSAGES
			redirectAttributes.addFlashAttribute("errorKey", "INVALID CREDENTIALS");
			// REDIRECT THEM BACK TO INDEX ROUTE
			return "redirect:/";
		}
		
		// VALIDATINOS PASSED
		session.setAttribute("email", emailParam);
		session.setAttribute("password", passParam);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
	
	
}
