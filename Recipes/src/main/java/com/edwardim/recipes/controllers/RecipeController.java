package com.edwardim.recipes.controllers;

import java.util.List;

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

import com.edwardim.recipes.models.Recipe;
import com.edwardim.recipes.models.User;
import com.edwardim.recipes.services.RecipeService;
import com.edwardim.recipes.services.UserService;

@Controller
public class RecipeController {
	@Autowired
	private RecipeService recipeServ;
	
	@Autowired
	private UserService userServ;
	
	
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
	
	
	
	// ---------------- READ --------------------//
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		// CHECK TO SEE IF USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		// RETRIEVE USER
		Long user_id = (Long) session.getAttribute("user_id");
		User loggedUser = userServ.getOneUser(user_id);
		
		// RETRIEVE ALL RECIPES
		List<Recipe> allRecipes = recipeServ.getAllRecipes();
		
		model.addAttribute("user", loggedUser);
		model.addAttribute("recipes", allRecipes);
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/recipes/{id}")
	public String oneRecipe(@PathVariable("id") Long id, Model model, HttpSession session) {
		// CHECK TO SEE IF USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		
		
		// GET ONE RECIPE
		Recipe oneRecipe = recipeServ.getOneRecipe(id);
		
		model.addAttribute("recipe", oneRecipe);
		
		return "oneRecipe.jsp";
	}
	
	// ---------------- READ --------------------//
	
	// ---------------- UPDATE --------------------//
	@GetMapping("/recipes/edit/{id}")
	public String editRecipe(@PathVariable("id")Long id, Model model, HttpSession session) {
		// CHECK TO SEE IF USER IS LOGGED IN
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		
		// GET ONE RECIPE
		Recipe oneRecipe = recipeServ.getOneRecipe(id);
		
		model.addAttribute("recipeObj", oneRecipe);
		
		return "editRecipe.jsp";
	}
	
	@PutMapping("/recipes/edit/{id}")
	public String updateRecipe(
			@Valid @ModelAttribute("recipeObj") Recipe filledRecipe,
			BindingResult results
	) {
		// CHECK FOR VALIDATIONS
		if(results.hasErrors()) {
			// VALIDATIONS FAILED
			return "editRecipe.jsp";
		}
		else {
			// VALIDATIONS PASSED
			recipeServ.save(filledRecipe);
			return "redirect:/dashboard";
		}
	}
	
	
	// ---------------- UPDATE --------------------//
	
	// ---------------- DELETE --------------------//
	@GetMapping("/recipes/delete/{id}")
	public String deleteRecipe(@PathVariable("id")Long id) {
		recipeServ.deleteOneRecipe(id);
		return "redirect:/dashboard";
	}
	// ---------------- DELETE --------------------//
	
}
