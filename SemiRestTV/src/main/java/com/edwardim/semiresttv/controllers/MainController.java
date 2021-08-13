package com.edwardim.semiresttv.controllers;

import java.util.List;

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

//	private final ShowService showServ;
//	
//	public MainController(ShowService showServ) {
//		this.showServ = showServ;
//	}

	@Autowired
	private ShowService showServ;

	// -------------------- CREATE -------------------------------//
	@GetMapping("/")
	public String index(@ModelAttribute("showObj") Show emptyShow, Model model) {

		// GRAB ALL SHOWS FROM DB
		List<Show> allShows = showServ.allShows();
		// PASS ALL SHOWS TO JSP
		model.addAttribute("shows", allShows);
		return "index.jsp";
	}

	@PostMapping("/shows/new")
	public String create(@Valid @ModelAttribute("showObj") Show filledShow, BindingResult results, Model model) {
		// VALIDATIONS FAIL, RERENDER THE JSP
		if (results.hasErrors()) {
			// GRAB ALL SHOWS FROM DB
			List<Show> allShows = showServ.allShows();
			// PASS ALL SHOWS TO JSP
			model.addAttribute("shows", allShows);
			return "index.jsp";
		}
		// VALIDATIONS PASS, CREATE THE SHOW
		else {
			showServ.saveShow(filledShow);
			return "redirect:/";
		}
	}
	// -------------------- CREATE -------------------------------//

	// -------------------- UPDATE -------------------------------//
	@GetMapping("/shows/{id}/edit")
	public String edit(@PathVariable("id") Long show_id, Model model) {
		Show oneShow = showServ.findOneShow(show_id);
		model.addAttribute("showObj", oneShow);
		return "edit.jsp";
	}

	@PutMapping("/shows/{id}/edit")
	public String update(@Valid @ModelAttribute("showObj") Show filledShow, BindingResult results) {
		// VALIDATIONS FAIL, RERENDER THE JSP
		if (results.hasErrors()) {
			return "edit.jsp";
		}
		// VALIDATIONS PASS, CREATE THE SHOW
		else {
			showServ.saveShow(filledShow);
			return "redirect:/";
		}
	}
	// -------------------- UPDATE -------------------------------//

	// -------------------- READ ONE -------------------------------//
	@GetMapping("/shows/{id}")
	public String oneShow(@PathVariable("id") Long show_id, Model model) {
		Show oneShow = showServ.findOneShow(show_id);
		model.addAttribute("show", oneShow);
		return "show.jsp";
	}
	// -------------------- READ ONE -------------------------------//

	// -------------------- DELETE -------------------------------//
	@GetMapping("/shows/{id}/delete")
	public String delete(@PathVariable("id") Long show_id) {
		showServ.deleteShow(show_id);
		return "redirect:/";
	}
	// -------------------- DELETE -------------------------------//

}
