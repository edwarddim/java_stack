package com.edwardim.beltreview.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	
	// --------------------- READ ------------------------------//
	@GetMapping("/questions")
	public String dashboard(
		Model model, HttpSession session
	) {
		// MAKE SURE THE USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		// GRAB THE LOGGED IN USER'S ID
		Long user_id = (Long) session.getAttribute("user_id");
		
		// GRAB THE USER OBJECT FROM DB AND PASS TO JSP
		model.addAttribute("user", uServ.getOneUser(user_id));
		
		// GRAB THE USER OBJECT FROM DB AND PASS TO JSP
		model.addAttribute("allQuestions", qServ.getAllQuestions());
		return "dashboard.jsp";
	}
	
	@GetMapping("/profile")
	public String profile(
		Model model, HttpSession session
	) {
		// MAKE SURE THE USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		Long user_id = (Long) session.getAttribute("user_id");
		User user = uServ.getOneUser(user_id);
		
		model.addAttribute("watermelon", user);
		return "profile.jsp";
	}
	
	// --------------------- READ ------------------------------//
	// -------------------- CREATE ------------------------//
	@GetMapping("/questions/new")
	public String newQuestion(
		@ModelAttribute("questionObj") Question emptyQuestion,
		HttpSession session
	) {
		// MAKE SURE THE USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
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
	
	// -------------------- UPDATE ------------------------//
	@GetMapping("/questions/{id}/edit")
	public String editQuestion(
		@PathVariable("id") Long id, Model model,
		HttpSession session
	) {
		// MAKE SURE THE USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		// GET THE QUESTION FROM DB
		Question editQuestion = qServ.getOneQuestion(id);
		model.addAttribute("questionObj", editQuestion);
		return "editQuestion.jsp";
	}
	
	@PutMapping("/questions/{id}/edit")
	public String updateQuestion(
		@Valid @ModelAttribute("questionObj") Question updatedQuestion,
		BindingResult results
	) {
		if(results.hasErrors()) {
			return "editQuestion.jsp";
		}
		qServ.create(updatedQuestion);
		return "redirect:/questions";
	}
	
	
	// -------------------- UPDATE ------------------------//
	
	// -------------------- DELETE ------------------------//
	@DeleteMapping("/questions/{id}")
	public String deleteQuestion(
		@PathVariable("id") Long id
	) {
		qServ.deleteQuestion(id);
		return "redirect:/questions";
	}
	
	@GetMapping("/questions/{id}")
	public String deleteQuestionGET(
			@PathVariable("id") Long id
		) {
			qServ.deleteQuestion(id);
			return "redirect:/questions";
		}
	
	// -------------------- DELETE ------------------------//
	
	
	
	
	
}
