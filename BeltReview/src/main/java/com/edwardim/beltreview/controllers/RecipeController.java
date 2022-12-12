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

import com.edwardim.beltreview.models.Recipe;
import com.edwardim.beltreview.services.RecipeService;

@Controller
public class RecipeController {
	@Autowired
	RecipeService recipeServ;
	
	// ----------- READ ALL ---------------//
	@GetMapping("/recipes")
	public String index(
		HttpSession session, Model model
	) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		model.addAttribute("allRecipes", recipeServ.getAll());
		return "/recipes/index.jsp";
	}
	
	// ---------- CREATE -----------------//
	
	@GetMapping("/recipes/new")
	public String newRecipe(
		@ModelAttribute("recipeObj") Recipe emptyRecipe,
		HttpSession session
	) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		return "/recipes/new.jsp";
	}
	
	@PostMapping("/recipes/new")
	public String processRecipe(
		@Valid @ModelAttribute("recipeObj") Recipe filledRecipe,
		BindingResult results
	) {
		// VALIDATIONS FAIL
		if(results.hasErrors()) {
			return "/recipes/new.jsp";
		}
		Recipe newRecipe = recipeServ.create(filledRecipe);
		return "redirect:/recipes";
//		return "redirect:/recipes/" + newRecipe.getId();
	}
	// ---------- CREATE -----------------//
	
	// ---------- READ ONE --------------//
	@GetMapping("/recipes/{id}")
	public String oneRecipe(
		@PathVariable("id") Long id,
		Model model
	) {
		model.addAttribute("oneRecipe", recipeServ.getOne(id) );
		return "/recipes/show.jsp";
	}
	// ---------- READ ONE --------------//
	
	// ---------- UPDATE --------------//
	@GetMapping("/recipes/{id}/edit")
	public String edit(
		@PathVariable("id") Long id,
		Model model
	) {
		model.addAttribute("recipeObj", recipeServ.getOne(id));
		return "/recipes/edit.jsp";
	}
	@PutMapping("/recipes/{id}/edit")
	public String update(
		@Valid @ModelAttribute("recipeObj") Recipe filledRecipe,
		BindingResult results
	) {
		if(results.hasErrors()) {
			return "/recipes/edit.jsp";
		}
		recipeServ.create(filledRecipe);
		return "redirect:/recipes";
	}
	// ---------- UPDATE --------------//
	
	// ---------- DELETE --------------//
	@GetMapping("/recipes/{id}/delete")
	public String delete(
		@PathVariable("id") Long id
	) {
		recipeServ.deleteOne(id);
		return "redirect:/recipes";
	}
	@DeleteMapping("/recipes/{id}")
	public String deleteRecipe(
		@PathVariable("id") Long id
	) {
		recipeServ.deleteOne(id);
		return "redirect:/recipes";
	}
	// ---------- DELETE --------------//
}
