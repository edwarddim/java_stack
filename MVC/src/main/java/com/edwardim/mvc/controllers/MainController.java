package com.edwardim.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.mvc.models.Book;
import com.edwardim.mvc.services.MainService;

@RestController
public class MainController {
	private final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	
	@GetMapping("/api/books")
	public List<Book> allBooks() {
		return mainServ.allBooks();
	}
	
	@GetMapping("/api/books/{id}")
	public Book oneBook(
			@PathVariable("id") Long book_id
	) {
		return mainServ.findBook(book_id);
	}
	
	@PostMapping("/api/books/new")
	public Book createBook(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("language") String language,
			@RequestParam("numPages") Integer numPages
	) {
		// GIVEN THE FORM INFO FROM USER, CREATE A NEW OBJECT
		Book newBook = new Book(title, description, language, numPages);
		// PASS THE OBJECT TO THE SERVICE FOR CREATION
		return mainServ.createBook(newBook);
	}
	
	@PutMapping("/api/books/{id}")
	public Book updateBook(
			@PathVariable("id") Long book_id,
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("language") String language,
			@RequestParam("numPages") Integer numPages		
	) {		
		return mainServ.updateBook(book_id, title, description, language, numPages);
	}
	
	@DeleteMapping("/api/books/{id}")
	public void deleteBook(
			@PathVariable("id") Long book_id
	) {
		mainServ.deleteBook(book_id);
	}
}
