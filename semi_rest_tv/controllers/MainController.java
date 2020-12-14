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
import com.edwardim.semiresttv.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
//	-------------- CREATE A SHOW --------------------- //
	@GetMapping("/shows/new")
	public String index(@ModelAttribute("showObj") Show emptyShow) {
		return "index.jsp";
	}
	@PostMapping("/shows/new")
	public String createShow(@Valid @ModelAttribute("showObj")Show filledShow, BindingResult results) {
		// NEED TO CHECK FOR VALIDATION ERRORS
		if(results.hasErrors()) {
			// IF VALIDATIONS FAILED, RENDER THE PAGE
			return "index.jsp";
		}
		// IF VALIDATIONS PASS, CREATE A SHOW
		Show newShow = mainServ.createShow(filledShow);
		String id = Long.toString(newShow.getId());
		return "redirect:/shows/" + id;
	}
//	-------------- EDIT A SHOW ----------------------- //
	@GetMapping("/shows/{id}/edit")
	public String editShow(@PathVariable("id") Long id, Model model) {
		// RETRIEVE THE SHOW FROM MY DB
		Show editShow = mainServ.findShowById(id);
		// PASS THE SHOW FROM DB TO JSP
		model.addAttribute("editShow", editShow);
		return "edit.jsp";
	}
	@PutMapping("/shows/{id}/edit")
	public String processEdit(
			@Valid @ModelAttribute("editShow")Show editedShow, BindingResult results,
			@PathVariable("id") Long id,
			Model model
	) {
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		// IF VALIDATIONS PASS, UDPATE THE SHOW
		mainServ.createShow(editedShow);
		String redirect_id = Long.toString(id);
		return "redirect:/shows/" + redirect_id;
	}
//	-------------- SHOW DETAILS  --------------------- //
	@GetMapping("/shows/{id}")
	public String showDetail(@PathVariable("id") Long id, Model model) {
		// RETRIEVE THE SHOW FROM MY DB
		Show oneShow = mainServ.findShowById(id);
		// PASS ONE SHOW TO JSP
		model.addAttribute("show", oneShow);
		return "show.jsp";
	}
//	-------------- CREATE A SHOW --------------------- //
}
