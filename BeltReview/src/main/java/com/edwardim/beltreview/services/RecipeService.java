package com.edwardim.beltreview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.beltreview.models.Recipe;
import com.edwardim.beltreview.repositories.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	RecipeRepository recipeRepo;
	
	// CREATE
	public Recipe create(Recipe newRecipe) {
		return recipeRepo.save(newRecipe);
	}
	
	// READ ONE
	
	// READ ALL
	public List<Recipe> getAll(){
		return recipeRepo.findAll();
	}
	
	// UPDATE
	
	// DELETE
	
}
