package com.edwardim.otom.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.otom.models.Chef;
import com.edwardim.otom.models.Dish;
import com.edwardim.otom.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainServ;
	
	
	// ---------------- CREATING A CHEF -----------------//
	@GetMapping(value={"/", "/chef/new"})
	public String createChef(
		@ModelAttribute("chefObj")Chef emptyChef
	) {
		return "/chef/create.jsp";
	}
	
	@PostMapping("/chef/new")
	public String processChef(
		@Valid @ModelAttribute("chefObj")Chef filledChef,
		BindingResult results
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "/chef/create.jsp";
		}
		// VALIDATIONS PASS
		mainServ.createChef(filledChef);
		return "redirect:/";
	}
	
	// ---------------- CREATING A DISH -----------------//
	@GetMapping("/dish/new")
	public String createDish(
		@ModelAttribute("dishObj") Dish emptyDishObj,
		Model model
	) {
		model.addAttribute("allChefs", mainServ.getAllChefs());
		return "/dish/create.jsp";
	}
	
	@PostMapping("/dish/new")
	public String processDish(
		@Valid @ModelAttribute("dishObj")Dish filledDish,
		BindingResult results,
		Model model
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			model.addAttribute("allChefs", mainServ.getAllChefs());
			return "/dish/create.jsp";
		}
		// VALIDATIONS PASS
		mainServ.createDish(filledDish);
		return "redirect:/dish/new";
	}
	
	// ---------------- DISPLAY ONE CHEF -----------------//
	@GetMapping("/chefs/{id}")
	public String oneChef(
		@PathVariable("id") Long chefId,
		Model model
	) {
		Chef oneChef = mainServ.getOneChef(chefId);
		model.addAttribute("chef", oneChef);
		return "/chef/display.jsp";
	}
	
}
