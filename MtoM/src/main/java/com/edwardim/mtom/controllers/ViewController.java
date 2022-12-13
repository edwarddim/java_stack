package com.edwardim.mtom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edwardim.mtom.services.CategoryProductService;
import com.edwardim.mtom.services.CategoryService;
import com.edwardim.mtom.services.ProductService;

@Controller
public class ViewController {
	@Autowired
	ProductService prodServ;
	
	@Autowired
	CategoryService catServ;
	
	@Autowired
	CategoryProductService catProdServ;
	
	// ----------- GET ONE PRODUCT --------- //
	@GetMapping("/products/{id}")
	public String getOneProduct(
		@PathVariable("id") Long productId,
		Model model
	) {
		model.addAttribute("product", prodServ.getOne(productId));
		model.addAttribute("productCategories", catProdServ.filterByProductId(productId));
		return "oneProduct.jsp";
	}
}
