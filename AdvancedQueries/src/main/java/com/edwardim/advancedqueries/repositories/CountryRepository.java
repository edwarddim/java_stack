package com.edwardim.advancedqueries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.advancedqueries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	// 
	// CUSTOM JPA QUERIES
	List<Country> findAll();
	List<Country> findByName(String name);
	List<Country> findByContinent(String continent);
	
	// JPQL QUERIES
	@Query("SELECT c "
			+ "FROM Country c "
			+ "JOIN c.languages lang "
			+ "WHERE lang.language IN ('Slovene') "
			+ "ORDER BY lang.percentage DESC")
	List<Country> queryOne();
	
	@Query("SELECT cities.name, cities.population, c.name "
			+ "FROM Country c "
			+ "JOIN c.cities cities "
			+ "WHERE c.name IN ('Mexico') AND "
			+ "cities.population > 500000 "
			+ "ORDER BY cities.population DESC")
	List<Object[]> queryTwo();
	
	
	
}
