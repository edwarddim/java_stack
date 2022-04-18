package com.edwardim.recipes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.recipes.models.Recipe;
import com.edwardim.recipes.repositories.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepo;
	
	
	// CREATE / UPDATE A RECIPE
	public Recipe save(Recipe recipeObj) {
		return recipeRepo.save(recipeObj);
	}
	
	// GET ALL RECIPE
	public List<Recipe> getAllRecipes(){
		return recipeRepo.findAll();
	}
	
	// GET ONE RECIPE
	public Recipe getOneRecipe(Long id) {
		return recipeRepo.findById(id).orElse(null);
	}
	
	// DELETE ONE RECIPE
	public void deleteOneRecipe(Long id) {
		recipeRepo.deleteById(id);
	}
}
