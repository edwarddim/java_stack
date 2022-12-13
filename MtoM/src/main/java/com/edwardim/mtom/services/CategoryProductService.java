package com.edwardim.mtom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.CategoryProduct;
import com.edwardim.mtom.models.Product;
import com.edwardim.mtom.repositories.CategoryProductRepository;

@Service
public class CategoryProductService {
	@Autowired
	CategoryProductRepository catProdRepo;
	
	@Autowired
	CategoryService catServ;
	
	@Autowired
	ProductService prodServ;

	public void create(Long productId, Long categoryId) {
		Product oneProduct = prodServ.getOne(productId);
		Category oneCategory = catServ.getOne(categoryId);
		
		CategoryProduct middleObject = new CategoryProduct(oneProduct, oneCategory);
		catProdRepo.save(middleObject);
	}
	
	public List<CategoryProduct> filterByProductId(Long id){
		Product oneProduct = prodServ.getOne(id);
		return catProdRepo.findByProduct(oneProduct);
	}
	
	public List<CategoryProduct> filterByCategoryId(Long id){
		Category oneCategory = catServ.getOne(id);
		return catProdRepo.findByCategory(oneCategory);
	}
	
	
}
