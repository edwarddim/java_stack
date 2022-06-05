package com.edwardim.prodcat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edwardim.prodcat.models.Category;
import com.edwardim.prodcat.models.Product;
import com.edwardim.prodcat.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
	
	@GetMapping("/")
	public String index(
			@ModelAttribute("productObj") Product emptyObj
	) {
		return "index.jsp";
	}
	
	@PostMapping("/products/new")
	public String newProd(
			@ModelAttribute("productObj") Product filledObj
	) {
		mainServ.saveProduct(filledObj);
		return "redirect:/";
	}
	
	
	@GetMapping("/categories/new")
	public String newCat(
			@ModelAttribute("categoryObj") Category emptyCategory
	) {
		return "category.jsp";
	}
	
	@PostMapping("/categories/new")
	public String newProd(
			@ModelAttribute("categoryObj") Category filledCategory
	) {
		mainServ.saveCategory(filledCategory);
		return "redirect:/";
	}
	
	// -------------------- CREATING THE RELATINOSHP --------------//
	@GetMapping("/products/{id}")
	public String oneProduct(
			@PathVariable("id") Long prod_id, Model model
	) {
		Product oneProduct = mainServ.findProduct(prod_id);
		model.addAttribute("product", oneProduct);
		model.addAttribute("categories", mainServ.categoriesExcludingProduct(oneProduct));
		
		return "product.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String addCategoryToProduct(
			@PathVariable("id") Long prod_id,
			@RequestParam("category_id") Long cat_id
	) {
		// USING THE IDS, FIND PRODUCT AND CATEGORY OBJ
		Category oneCat = mainServ.findCategory(cat_id);
		Product oneProd = mainServ.findProduct(prod_id);
		
		// ADD THE RELATIONSHIP TO THE OBJECTS
		oneCat.getProducts().add(oneProd);
//		oneProd.getCategories().add(oneCat);
		
		// SAVE THE NEW INFORMATION IN THE DB
		mainServ.saveCategory(oneCat);
//		mainServ.saveProduct(oneProd);
		
		return "redirect:/products/" + prod_id;
		
	}
	
	
	
	
	
}
