package com.edwardim.mtom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository catRepo;
	
	public Category create(Category newCat) {
		return catRepo.save(newCat);
	}
	
	public List<Category> getAll(){
		return catRepo.findAll();
	}
	
	public Category getOne(Long category_id) {
		return catRepo.findById(category_id).orElse(null);
	}
}
