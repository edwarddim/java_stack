package com.edwardim.middlemodel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.middlemodel.models.Item;
import com.edwardim.middlemodel.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	List<User> findByname(String name);
	
	List<User> findByIdNotIn(List<Long> ids);
	
	@Query("SELECT u FROM User u JOIN u.orders_purchased p "
			+ "WHERE p.purchased_item != ?1")
	List<User> findUsersNoPurchase(Item item);
}
