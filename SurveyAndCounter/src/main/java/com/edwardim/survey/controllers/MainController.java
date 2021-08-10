package com.edwardim.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/results")
	public String results(
			@RequestParam("full_name") String name,
			@RequestParam("email") String email,
			@RequestParam("fav_language") String lang,
			@RequestParam("comments") String comments,
			Model model,
			RedirectAttributes redirectAttributes
	) {
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(lang);
//		System.out.println(comments);
		
// --------------------------------------------------------------------- //
		// FUNCTIONALITY FOR RENDERING ON POST REQUEST
//		model.addAttribute("full_name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("fav_language", lang);
//		model.addAttribute("comments", comments);
//		return "results.jsp";
//	--------------------------------------------------------------------- //
//	--------------------------------------------------------------------- //
		// FUNCTIONALITY FOR REDIRECTING AND THEN DISPLAYING
		redirectAttributes.addFlashAttribute("full_name", name);
		redirectAttributes.addFlashAttribute("email", email);
		redirectAttributes.addFlashAttribute("fav_language", lang);
		redirectAttributes.addFlashAttribute("comments", comments);
		return "redirect:/new_results";
//	--------------------------------------------------------------------- //
	}
	
	@GetMapping("/new_results")
	public String newResults() {
		return "results.jsp";
	}
	
}
