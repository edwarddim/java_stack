package com.edwardim.manydemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.manydemo.models.Purchase;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long>  {
	List<Purchase> findAll();
}
