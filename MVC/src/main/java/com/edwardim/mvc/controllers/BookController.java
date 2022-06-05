package com.edwardim.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.edwardim.mvc.models.Book;
import com.edwardim.mvc.services.MainService;

@Controller
public class BookController {
	private final MainService mainServ;
	
	public BookController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	// ----------------------------------------------------//
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
	
	@GetMapping("/books/new")
	public String newBook(
			@ModelAttribute("bookObj") Book emptyBook
	) {
		return "new.jsp";
	}
	
	@PostMapping("/books/new")
	public String createBook(
			@Valid @ModelAttribute("bookObj") Book filledBook, BindingResult results
	) {
		// VALIDATIONS HAVE FAILED, DISPLAY FORM AND DISPLAY ERRORS
		if(results.hasErrors()) {
			return "new.jsp";
		}
		// VALIDATIONS HAVE PASSED, CREATE THE OBJECT IN THE DB
		else {
			mainServ.createBook(filledBook);
			return "redirect:/";
		}
//		System.out.println(filledBook.getTitle());
//		System.out.println(filledBook.getDescription());
//		System.out.println(filledBook.getLanguage());
//		System.out.println(filledBook.getNumberOfPages());
	}
	
	@GetMapping("/books/{id}/edit")
	public String edit(
			@PathVariable("id") Long book_id,
			Model model
	) {
		// GO FIND BOOK YOU WANT TO EDIT IN THE DB
		Book editBook = mainServ.findBook(book_id);
		// PASS THE BOOK OBJ TO THE JSP
		model.addAttribute("bookObj", editBook);
		
		return "edit.jsp";
	}
	
	@PutMapping("/books/{id}")
	public String update(
			@PathVariable("id") Long book_id,
			@Valid @ModelAttribute("bookObj") Book filledBook, BindingResult results
	) {
		// VALIDATIONS HAVE FAILED, DISPLAY FORM AND DISPLAY ERRORS
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		// VALIDATIONS HAVE PASSED, CREATE THE OBJECT IN THE DB
		else {
			mainServ.createBook(filledBook);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/books/{id}")
	public String delete(
			@PathVariable("id") Long book_id
	) {
		mainServ.deleteBook(book_id);
		return "redirect:/";
	}
	
	
	
	
	
	
}
