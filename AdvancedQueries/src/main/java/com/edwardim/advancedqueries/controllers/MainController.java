package com.edwardim.advancedqueries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.advancedqueries.models.City;
import com.edwardim.advancedqueries.models.Country;
import com.edwardim.advancedqueries.services.MainService;

@RestController
public class MainController {
	@Autowired
	private MainService mainServ;
	
	@GetMapping("")
	public List<Object[]> index() {
//		return mainServ.testMethod();
		return mainServ.methodTwo();
	}
}
