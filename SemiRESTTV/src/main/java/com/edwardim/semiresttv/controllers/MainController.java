package com.edwardim.semiresttv.controllers;

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

import com.edwardim.semiresttv.models.Show;
import com.edwardim.semiresttv.services.ShowService;

@Controller
public class MainController {
	
	@Autowired
	private ShowService showServ;
	
	// ----------------------- CREATE ---------------------------//
	@GetMapping("/shows")
	public String index(
		@ModelAttribute("showObj")Show emptyShow, Model model
	) {
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
		@PathVariable("id") Long id, Model model
	) {
		Show oneShow = showServ.findShow(id);
		model.addAttribute("oneShow", oneShow);
		return "show.jsp";
	}
	// ----------------------- READ(ONE) ---------------------------//
	// ----------------------- UPDATE ------------------------------//
	@GetMapping("/shows/{id}/edit")
	public String editShow(
		@PathVariable("id") Long id, Model model
	) {
		// GRAB THE SHOW FROM DB USING ID
		Show editShow = showServ.findShow(id);
		// PASS THE SHOW OBJ TO THE JSP
		model.addAttribute("showObj", editShow);
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
