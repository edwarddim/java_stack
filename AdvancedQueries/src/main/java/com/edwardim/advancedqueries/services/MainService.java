package com.edwardim.advancedqueries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.advancedqueries.models.City;
import com.edwardim.advancedqueries.models.Country;
import com.edwardim.advancedqueries.repositories.CountryRepository;

@Service
public class MainService {
	@Autowired
	private CountryRepository countryRepo;
	
	public List<Country> testMethod(){
		return countryRepo.queryOne();
	}
	
	public List<Object[]> methodTwo(){
		return countryRepo.queryTwo();
	}
}
