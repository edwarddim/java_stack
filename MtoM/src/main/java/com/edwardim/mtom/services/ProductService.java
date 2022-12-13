package com.edwardim.mtom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.Product;
import com.edwardim.mtom.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository prodRepo;
	
	@Autowired
	CategoryService catServ;
	
	public Product create(Product newProd) {
		return prodRepo.save(newProd);
	}
	
	public List<Product> getAll(){
		return prodRepo.findAll();
	}
	
	public Product getOne(Long product_id) {
		return prodRepo.findById(product_id).orElse(null);
	}

	public void addCategory(Long productId, Long categoryId) {
		Product oneProduct = this.getOne(productId);
		Category oneCategory = catServ.getOne(categoryId);
		
		oneProduct.getCategories().add(oneCategory);
		this.create(oneProduct);
	}

}
