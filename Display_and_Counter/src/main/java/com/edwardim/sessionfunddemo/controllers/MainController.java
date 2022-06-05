package com.edwardim.sessionfunddemo.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		// GET THE CURRENT DATE
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy h:mm a");
		String formattedDate = dateFormatter.format(new Date());
		// PASS OVER THE DATE INFO TO JSP
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
}
