package com.edwardim.mtom.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.mtom.models.Category;
import com.edwardim.mtom.models.CategoryProduct;
import com.edwardim.mtom.models.Product;

@Repository
public interface CategoryProductRepository extends CrudRepository<CategoryProduct, Long> {
	List<CategoryProduct> findAll();
	
	List<CategoryProduct> findByCategory(Category category);
	List<CategoryProduct> findByProduct(Product product);
}
