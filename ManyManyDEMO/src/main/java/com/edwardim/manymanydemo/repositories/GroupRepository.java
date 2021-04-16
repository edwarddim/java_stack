package com.edwardim.manymanydemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.manymanydemo.models.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long>{

}
