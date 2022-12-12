package com.edwardim.beltreview.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.beltreview.models.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	List<Recipe> findAll();
}
