package com.edwardim.semiresttv.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.edwardim.semiresttv.models.Comment;
import com.edwardim.semiresttv.models.Show;
import com.edwardim.semiresttv.services.ShowService;

@Controller
public class MainController {
	
	@Autowired
	private ShowService showServ;
	
	@GetMapping("/test")
	public String text() {
		return "test.jsp";
	}
	
	// ----------------------- CREATE ---------------------------//
	@GetMapping("/shows")
	public String index(
		@ModelAttribute("showObj")Show emptyShow, Model model, HttpSession session
	) {
		// GRAB THE LOGGED USER ID FROM SESSION
		Long user_id = (Long) session.getAttribute("user_id");
		// BIND TO SHOW OBJ
		model.addAttribute("user_id", user_id);
		model.addAttribute("allShows", showServ.allShows());
		return "index.jsp";
	}
	
	@PostMapping("/shows/new")
	public String createShow(
		@Valid @ModelAttribute("showObj") Show filledShow, BindingResult results,
		Model model
	) {
		// IF ERRORS, DISPLAY THE SAME JSP
		if(results.hasErrors()) {
			model.addAttribute("allShows", showServ.allShows());
			return "index.jsp";
		}
		// IF NO ERRORS CREATE SHOW AND REDIRECT
		else {
			showServ.saveShow(filledShow);
			return "redirect:/shows";
		}
	}
	// ----------------------- CREATE ---------------------------//
	// ----------------------- READ(ONE) ---------------------------//
	@GetMapping("/shows/{id}")
	public String show(
		@PathVariable("id") Long id, Model model,
		@ModelAttribute("commentObj") Comment emptyComment,
		HttpSession session
	) {
		Show oneShow = showServ.findShow(id);
		model.addAttribute("oneShow", oneShow);
		
		// GRAB USER ID FROM SESSION
		Long session_user_id = (Long) session.getAttribute("user_id");
		model.addAttribute("user_id", session_user_id);
		
		return "show.jsp";
	}
	
	// ----------------------- READ(ONE) ---------------------------//
	// ----------------------- ADD COMMENT -------------------------//
	@PostMapping("/comment/create")
	public String createComment(
		@Valid @ModelAttribute("commentObj") Comment filledComment, BindingResult results,
		Model model
	) {
		if(results.hasErrors()) {
			Long show_id = filledComment.getShow().getId();
			Show oneShow = showServ.findShow(show_id);
			model.addAttribute("oneShow", oneShow);
			return "show.jsp";
		}
		else {
			showServ.saveComment(filledComment);
			return "redirect:/shows";
		}
	}
	// ----------------------- ADD COMMENT -------------------------//
	// ----------------------- DELETE COMMENT ----------------------//
	@GetMapping("/comments/{id}/delete")
	public String deleteComment(
		@PathVariable("id") Long id
	) {
		showServ.deleteComment(id);
		return "redirect:/shows";
	}
	
	
	// ----------------------- DELETE COMMENT ----------------------//
	// ----------------------- UPDATE ------------------------------//
	@GetMapping("/shows/{id}/edit")
	public String editShow(
		@PathVariable("id") Long id, Model model, HttpSession session
	) {
		// GRAB THE SHOW FROM DB USING ID
		Show editShow = showServ.findShow(id);
		// PASS THE SHOW OBJ TO THE JSP
		model.addAttribute("showObj", editShow);
		
		// GRAB THE LOGGED USER ID FROM SESSION
		Long user_id = (Long) session.getAttribute("user_id");
		// BIND TO SHOW OBJ
		model.addAttribute("user_id", user_id);
		
		
		return "editShow.jsp";
	}
	
	@PutMapping("/shows/{id}/edit")
	public String update(
		@Valid @ModelAttribute("showObj") Show filledShow, BindingResult results,
		@PathVariable("id") Long id
	) {
		// IF ERRORS SHOW JSP
		if(results.hasErrors()) {
			return "editShow.jsp";
		}
		// IF NO ERRORS, UPDATE SHOW AND REDIRECT
		else {
			showServ.saveShow(filledShow);
			return "redirect:/shows/" + id;
		}
	}
	// ----------------------- UPDATE ------------------------------//
	// ----------------------- DELETE ------------------------------//
	@GetMapping("/shows/{id}/delete")
	public String deleteShow(
		@PathVariable("id") Long id
	) {
		showServ.deleteShow(id);
		return "redirect:/shows";
	}
	// ----------------------- DELETE ------------------------------//
	
	
}
