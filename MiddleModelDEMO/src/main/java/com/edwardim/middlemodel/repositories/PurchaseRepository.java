package com.edwardim.middlemodel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.middlemodel.models.Purchase;
import com.edwardim.middlemodel.models.User;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
	List<Purchase> findAll();
	List<Purchase> findByPurchaserNotIn(List<User> users);
}