package com.edwardim.mtom.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.Product;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
	List<Category> findAll();
	
	List<Category> findByProductsNotContains(Product prod);
}
