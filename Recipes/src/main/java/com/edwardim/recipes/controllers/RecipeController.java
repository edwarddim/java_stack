package com.edwardim.recipes.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.recipes.models.Recipe;
import com.edwardim.recipes.services.RecipeService;

@Controller
public class RecipeController {
	@Autowired
	private RecipeService recipeServ;
	
	
	// ---------------- CREATE ------------------//
	
	@GetMapping("/recipes/new")
	public String newRecipe(
			HttpSession session,
			@ModelAttribute("recipeObj") Recipe emptyRecipe
			
	) {
		// CHECK TO SEE IF USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		
		return "new.jsp";
	}
	
	@PostMapping("/recipes/new")
	public String createRecipe(
			@Valid @ModelAttribute("recipeObj") Recipe filledRecipe,
			BindingResult results
	) {
		// CHECK FOR VALIDATIONS
		if(results.hasErrors()) {
			// VALIDATIONS FAILED
			return "new.jsp";
		}
		else {
			// VALIDATIONS PASSED
			recipeServ.save(filledRecipe);
			return "redirect:/dashboard";
		}
	}
	
	// ---------------- CREATE ------------------//
}
