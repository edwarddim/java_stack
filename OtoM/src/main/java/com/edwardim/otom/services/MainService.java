package com.edwardim.otom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.otom.models.Chef;
import com.edwardim.otom.models.Dish;
import com.edwardim.otom.repositories.ChefRepository;
import com.edwardim.otom.repositories.DishRepository;

@Service
public class MainService {
	
	@Autowired
	ChefRepository chefRepo;
	
	@Autowired
	DishRepository dishRepo;
	
	// ------------- CRUD FOR CHEF ----------------//
	// CREATE
	public Chef createChef(Chef newChef) {
		return chefRepo.save(newChef);
	}
	// READ ONE
	public Chef getOneChef(Long id) {
		return chefRepo.findById(id).orElse(null);
	}
	// READ ALL
	public List<Chef> getAllChefs(){
		return chefRepo.findAll();
	}
	// UPDATE
	public Chef updateChef(Chef updatedChef) {
		return chefRepo.save(updatedChef);
	}
	// DELETE
	public void deleteChef(Long id) {
		chefRepo.deleteById(id);
	}
	
	// ------------- CRUD FOR DISH ----------------//
	// CREATE
	public Dish createDish(Dish dish) {
		return dishRepo.save(dish);
	}
	// READ ONE
	public Dish getOneDish(Long id) {
		return dishRepo.findById(id).orElse(null);
	}
	// READ ALL
	public List<Dish> getAllDishes(){
		return dishRepo.findAll();
	}
	// UPDATE
	public Dish updateDish(Dish updatedDish) {
		return dishRepo.save(updatedDish);
	}
	// DELETE
	public void deleteDish(Long id) {
		dishRepo.deleteById(id);
	}
}
