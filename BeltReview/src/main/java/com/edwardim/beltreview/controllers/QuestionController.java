package com.edwardim.beltreview.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.beltreview.models.Question;
import com.edwardim.beltreview.models.User;
import com.edwardim.beltreview.services.QuestionService;
import com.edwardim.beltreview.services.UserService;

@Controller
public class QuestionController {
	@Autowired
	QuestionService qServ;
	
	@Autowired
	UserService uServ;
	
	@GetMapping("/questions")
	public String dashboard(
		Model model
	) {
		model.addAttribute("allQuestions", qServ.getAllQuestions());
		return "dashboard.jsp";
	}
	
	@GetMapping("/profile")
	public String profile(
		Model model, HttpSession session
	) {
		Long user_id = (Long) session.getAttribute("user_id");
		User user = uServ.getOneUser(user_id);
		
		model.addAttribute("watermelon", user);
		return "profile.jsp";
	}
	
	
	// -------------------- CREATE ------------------------//
	@GetMapping("/questions/new")
	public String newQuestion(
		@ModelAttribute("questionObj") Question emptyQuestion
	) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/questions/new")
	public String createQuestion(
		@Valid @ModelAttribute("questionObj") Question filledQuestion,
		BindingResult results
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "newQuestion.jsp";
		}
		// VALIDATIONS PASS
		qServ.create(filledQuestion);
		return "redirect:/questions";
	}
	// -------------------- CREATE ------------------------//
	
	
}
