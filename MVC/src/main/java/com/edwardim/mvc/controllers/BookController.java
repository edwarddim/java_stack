package com.edwardim.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edwardim.mvc.models.Book;
import com.edwardim.mvc.services.MainService;

@Controller
public class BookController {
	private final MainService mainServ;
	
	public BookController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	@GetMapping("/")
	public String index(
			Model model
	) {
		// USE THE SERVICE TO GRAB ALL BOOKS
		List<Book> allBooks = mainServ.allBooks();
		// USE THE MODEL TO PASS THAT INFO TO JSP
		model.addAttribute("books", allBooks);
		
		return "index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String oneBook(
			@PathVariable("id") Long book_id,
			Model model
	) {
		// USER THE SERVICE TO GRAB ONE BOOK
		Book oneBook = mainServ.findBook(book_id);
		// USE THE MODEL TO PASS THAT INFO TO JSP
		model.addAttribute("book", oneBook);
		
		return "book.jsp";
	}
	
}
