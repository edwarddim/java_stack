package com.edwardim.mtom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.Product;
import com.edwardim.mtom.models.ProductCategory;
import com.edwardim.mtom.repositories.CategoryRepo;
import com.edwardim.mtom.repositories.ProductCategoryRepo;
import com.edwardim.mtom.repositories.ProductRepo;

@Service
public class MainService {
	@Autowired
	CategoryRepo catRepo;
	
	@Autowired
	ProductRepo prodRepo;
	
	@Autowired
	ProductCategoryRepo prodCatRepo;
	// ------------------- CREATE -----------------------//
	public Product createProd(Product newProd) {
		return prodRepo.save(newProd);
	}
	
	public Category createCat(Category newCat) {
		return catRepo.save(newCat);
	}
	
	public ProductCategory createRelationship(ProductCategory newProdCat) {
		return prodCatRepo.save(newProdCat);
	}
	// ------------------- READ -----------------------//
	public Product getOneProduct(Long product_id) {
		return prodRepo.findById(product_id).orElse(null);
	}

	public Category getOneCategory(Long category_id) {
		return catRepo.findById(category_id).orElse(null);
	}

	public List<Category> getAllCategories() {
		return catRepo.findAll();
	}
	
	
	public List<Category> findCategoriesNotContaining(Product prod){
		return catRepo.findByProductsNotContains(prod);
	}
}
