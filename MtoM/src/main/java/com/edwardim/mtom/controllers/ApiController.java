package com.edwardim.mtom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.Product;
import com.edwardim.mtom.services.CategoryProductService;
import com.edwardim.mtom.services.CategoryService;
import com.edwardim.mtom.services.ProductService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	ProductService prodServ;
	
	@Autowired
	CategoryService catServ;
	
	@Autowired
	CategoryProductService catProdServ;
	
	@PostMapping("/products/new")
	public Product newProduct(
		@RequestParam("name") String name,
		@RequestParam("description") String desc,
		@RequestParam("price") Double price
	) {
		Product newProd = new Product(name, desc, price);
		return prodServ.create(newProd);
	}
	
	@PostMapping("/categories/new")
	public Category newCategory(
		@RequestParam("name") String name
	) {
		Category newCat = new Category(name);
		return catServ.create(newCat);
	}
	
	// CREATE THE RELATIONSHIP
	@PostMapping("/create")
	public void create(
		@RequestParam("categoryId") Long categoryId,
		@RequestParam("productId") Long productId
	) {
		// ADDING RELATIONSHIP WITH MIDDLE MODEL
		catProdServ.create(productId, categoryId);

		
		// GRAB PRODUCT / CATEGORY
		// ADDING RELATIONSHIP WITH NO MIDDLE MODEL
//		prodServ.addCategory(productId, categoryId);
//		oneCategory.getProducts().add(oneProduct);
//		catServ.create(oneCategory);
	}
	
}
