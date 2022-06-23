package com.edwardim.mtom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.Product;
import com.edwardim.mtom.models.ProductCategory;
import com.edwardim.mtom.services.MainService;

@Controller
public class MainController {
	@Autowired
	MainService mainServ;
	
	@GetMapping("/")
	public String index(
		@ModelAttribute("productObj") Product emptyProduct,
		@ModelAttribute("categoryObj") Category emptyCategory
	) {
		return "index.jsp";
	}
	
	@PostMapping("/prods/new")
	public String createProd(
		@ModelAttribute("productObj") Product fullProd	
	) {
		mainServ.createProd(fullProd);
		return "redirect:/";
	}
	
	@PostMapping("/cats/new")
	public String createCats(
			@ModelAttribute("categoryObj") Category fullCategory	
	) {
		mainServ.createCat(fullCategory);
		return "redirect:/";
	}
	
	@GetMapping("/join/{prodId}/{catId}")
	public String join(
		@PathVariable("prodId") Long product_id,
		@PathVariable("catId") Long category_id
	) {
		Product prod = mainServ.getOneProduct(product_id);
		Category cat = mainServ.getOneCategory(category_id);
		
		ProductCategory newRelationship = new ProductCategory();
		newRelationship.setCategory(cat);
		newRelationship.setProduct(prod);
		
		mainServ.createRelationship(newRelationship);
		
		
		return "redirect:/";
	}
	
	
	// --------------- CREATING A RELATIONSHIP (SHOW PRODUCT) -------------- //
	@GetMapping("/products/{id}")
	public String showProduct(
		@PathVariable("id") Long product_id,
		Model model,
		// DATA BINDING AN EMPTY MIDDLE MODEL
		@ModelAttribute("prodCatObj") ProductCategory emptyProdCat
	) {
		// GRAB PRODUCT FROM DB USING ID
		Product prod = mainServ.getOneProduct(product_id);
		
		// GRAB ALL CATEGORIES FROM DB
		List<Category> allCategories = mainServ.getAllCategories();
		
		// PASS THE ONE PRODUCT AND ALL CATEGORIES TO JSP
		model.addAttribute("product", prod);
		model.addAttribute("categories", allCategories);
		
		
		// TO DO - GRAB ONLY THE CATEGORIES THAT THE PRODUCT IS NOT
		// ASSOCIATED WITH YET
		
		return "showProduct.jsp";
	}
	
	@PostMapping("/join")
	public String joinDataBinding(
		@ModelAttribute("prodCatObj") ProductCategory filledProdCat
	) {
		mainServ.createRelationship(filledProdCat);
		
		return "redirect:/products/" + filledProdCat.getProduct().getId();
	}
	// --------------- CREATING A RELATIONSHIP (SHOW PRODUCT) -------------- //
	
	
}
