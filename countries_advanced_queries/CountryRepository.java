package com.edwardim.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.countries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	
	@Query("SELECT c.name , l.language, l.percentage "
			+ "FROM Country c "
			+ "JOIN c.languages l "
			+ "WHERE l.language IN ('Slovene') "
			+ "ORDER BY l.percentage DESC")
	List<Object[]> methodOne();
	
	@Query("SELECT c.name, COUNT(cities) AS numCities "
			+ "FROM Country c "
			+ "JOIN c.cities cities "
			+ "GROUP BY c.name "
			+ "ORDER BY numCities DESC")
	List<Object[]> methodTwo();
	
	@Query("SELECT cities.name  "
			+ "FROM Country c "
			+ "JOIN c.cities cities "
			+ "WHERE c.name IN ('Mexico') AND cities.population > 500000 ")
	List<String> methodThree();
	
	@Query("SELECT  c.name, lang.language "
			+ "FROM Country c "
			+ "JOIN c.languages lang "
			+ "WHERE lang.percentage > 89.0 "
			+ "ORDER BY lang.percentage DESC")
	List<Object[]> methodFour();
	
	@Query("SELECT c.name "
			+ "FROM Country c "
			+ "WHERE c.surface_area < 501 AND c.population > 100000")
	List<String> getCountryFilterSurfaceAreaAndPop();
	
	@Query("SELECT c.name "
			+ "FROM Country c "
			+ "WHERE c.government_form "
			+ "IN('Constitutional Monarchy') "
			+ "AND c.population > 200 "
			+ "AND c.life_expectancy > 75")
	List<String> getCountryWithCMandSAandLE();
	
	@Query("SELECT c.name, city.name, city.district, city.population "
			+ "FROM Country c JOIN c.cities city "
			+ "WHERE city.district IN('Buenos Aires') "
			+ "AND city.population > 500000")
	List<Object[]> getCityFilter7();
	
}