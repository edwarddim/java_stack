package com.edwardim.sessionpost.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

//	@RequestMapping("")
	@GetMapping("")
	public String index(HttpSession session, Model model) {
		String email = (String) session.getAttribute("email");
		String pw = (String) session.getAttribute("password");
		
		model.addAttribute("email", email);
		model.addAttribute("password", pw);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String date = formatter.format(new Date());
		System.out.println(date);
		
		return "index.jsp";
	}

//	@RequestMapping(value = "/process", method = RequestMethod.POST)
	@PostMapping("/process")
	public String process(
		@RequestParam(value = "email") String e,
		@RequestParam(value = "password") String p,
		HttpSession session
	) {
		System.out.println(e);
		System.out.println(p);
		
		session.setAttribute("email", e);
		session.setAttribute("password", p);
		
		return "redirect:/";
	}

}
