package com.edwardim.middlemodel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.middlemodel.models.Group;
import com.edwardim.middlemodel.models.User;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
	List<Group> findAll();
	
	@Query("SELECT g FROM Group g")
	List<Group> allGroups();
	
	@Query("SELECT g FROM Group g WHERE g.id NOT IN (SELECT ug.group FROM UserGroup ug WHERE ug.user = ?1 ) ")
	List<Group> groupsExcludingUser(User u);
}
