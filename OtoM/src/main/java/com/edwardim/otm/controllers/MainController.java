package com.edwardim.otm.controllers;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edwardim.otm.models.Chef;
import com.edwardim.otm.models.Recipe;
import com.edwardim.otm.services.MainService;

@Controller
public class MainController {
	// DEPENDENCY INJECT SERVICES
	@Autowired
	MainService mainServ;
	
	// ------------- CREATE -------------------//
	@GetMapping("/")
	public String index(
		@ModelAttribute("chefObj") Chef emptyChef
	) {
		return "index.jsp";
	}
	
	@PostMapping("/chefs/new")
	public String createChef(
		@Valid @ModelAttribute("chefObj") Chef filledChef ,BindingResult results,
		RedirectAttributes redirectAttributes
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "index.jsp";
		}
		// VALIDATIONS PASS
		mainServ.createChef(filledChef);
		redirectAttributes.addFlashAttribute("success", "Chef successfully created!");
		return "redirect:/";
	}
	
	// ------------- CREATE -------------------//
	
	// ------------- READ ---------------------//
	@GetMapping("/chefs")
	public String allChefs(
		Model model
	) {
		// GET ALL THE CHEFS FROM DB
		List<Chef> allChefs = mainServ.getAllChefs();
		
		// PASS ALL CHEFS TO THE JSP
		model.addAttribute("chefs", allChefs);
		
		return "chefs.jsp";
	}
	
	@GetMapping("/chefs/{id}")
	public String oneChefs(
		@PathVariable("id") Long id, Model model
	) {
		// GET ONE CHEF FROM DB
		Chef oneChef = mainServ.getOneChef(id);
		
		// PASS THE CHEF TO THE JSP
		model.addAttribute("chef", oneChef);
		
		return "chef.jsp";
	}
	
	// ------------- READ ---------------------//
	
	// ------------- CREATE (RECIPE) -------------------//
	@GetMapping("/recipes/new")
	public String newRecipe(
		@ModelAttribute("recipeObj") Recipe emptyRecipe,
		Model model
	) {
		// GRAB ALL CHEFS FROM DB
		List<Chef> allChefs = mainServ.getAllChefs();
		// PASS THE LIST OF CHEFS TO THE JSP
		model.addAttribute("chefs", allChefs);
		
		return "recipe.jsp";
	}
	
	@PostMapping("/recipes/new")
	public String processRecipe(
			@Valid @ModelAttribute("recipeObj") Recipe filledRecipe ,BindingResult results,
			Model model
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			// GRAB ALL CHEFS FROM DB
			List<Chef> allChefs = mainServ.getAllChefs();
			// PASS THE LIST OF CHEFS TO THE JSP
			model.addAttribute("chefs", allChefs);
			return "recipe.jsp";
		}
		// VALIDATIONS PASS
		Recipe newRecipeObj = mainServ.createRecipe(filledRecipe);
		System.out.println(newRecipeObj.getName());
		System.out.println(newRecipeObj.getId());
		System.out.println(newRecipeObj.getCalories());
		System.out.println(newRecipeObj.getCreator());
		
		return "redirect:/chefs/" + newRecipeObj.getCreator().getId();
//		return "redirect:/recipes/" + newRecipeObj.getId(); REDIRECT TO RECIPES DETAILS
	}
	
	// ------------- CREATE (RECIPE) -------------------//
}
