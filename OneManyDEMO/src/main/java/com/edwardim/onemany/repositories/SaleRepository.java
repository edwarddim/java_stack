package com.edwardim.onemany.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.onemany.models.Sale;

@Repository
public interface SaleRepository extends CrudRepository<Sale,Long> {
	List<Sale> findAll();
}
