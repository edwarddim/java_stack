package com.edwardim.mtom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.mtom.models.ProductCategory;

@Repository
public interface ProductCategoryRepo extends CrudRepository<ProductCategory , Long> {

}
