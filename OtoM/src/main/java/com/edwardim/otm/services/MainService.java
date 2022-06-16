package com.edwardim.otm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.otm.models.Chef;
import com.edwardim.otm.models.Recipe;
import com.edwardim.otm.repositories.ChefRepository;
import com.edwardim.otm.repositories.RecipeRepository;

@Service
public class MainService {
	// DEPENDENCY INJECTION OF REPOS
	@Autowired
	ChefRepository chefRepo;
	
	@Autowired
	RecipeRepository recipeRepo;
	
	// CREATE A CHEF
	public Chef createChef(Chef newChef) {
		return chefRepo.save(newChef);
	}
	
	// GET ALL CHEFS
	public List<Chef> getAllChefs(){
		return chefRepo.findAll();
	}
	
	// GET ONE CHEF
	public Chef getOneChef(Long id) {
		return chefRepo.findById(id).orElse(null);
	}
	
	// UPDATE CHEF
	
	// DELETE CHEF
	
	// CREATE RECIPE
	public Recipe createRecipe(Recipe newRecipe) {
		return recipeRepo.save(newRecipe);
	}
	
	// GET ALL RECIPES
	public List<Recipe> getAllRecipes(){
		return recipeRepo.findAll();
	}
	
	// GET ONE RECIPE
	
	// UPDATE RECIPE
	
	// DELTE RECIPE
	
	
}
