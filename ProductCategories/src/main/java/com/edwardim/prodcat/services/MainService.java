package com.edwardim.prodcat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.prodcat.models.Category;
import com.edwardim.prodcat.models.Product;
import com.edwardim.prodcat.repositories.CategoryRepository;
import com.edwardim.prodcat.repositories.ProductRepository;

@Service
public class MainService {
	
	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private CategoryRepository catRepo;
	
	// ------------------- CRUD PRODUCTS ---------------------//
	public List<Product> allProducts(){
		return prodRepo.findAll();
	}
	
	public Product saveProduct(Product p) {
		return prodRepo.save(p);
	}
	public Product findProduct(Long prod_id) {
		return prodRepo.findById(prod_id).orElse(null);
	}
	
	// ------------------- CRUD CATEGORIES ---------------------//
	public List<Category> allCategories(){
		return catRepo.findAll();
	}
	
	public Category saveCategory(Category c) {
		return catRepo.save(c);
	}

	public Category findCategory(Long cat_id) {
		return catRepo.findById(cat_id).orElse(null);
	}
	
	public List<Category> categoriesExcludingProduct(Product p){
		return catRepo.findByProductsNotContains(p);
	}


}
