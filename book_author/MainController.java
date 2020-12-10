package com.edwardim.bookauthor.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.bookauthor.models.Author;
import com.edwardim.bookauthor.models.Book;
import com.edwardim.bookauthor.services.MainService;

@Controller
public class MainController {
	
//	private final MainService mainServ;
//
//	public MainController(MainService mainServ) {
//		this.mainServ = mainServ;
//	}
	@Autowired
	private MainService mainServ;

	@GetMapping("/")
	public String index(@ModelAttribute("author")Author author) {
		return "index.jsp";
	}
	
	@PostMapping("/author/new")
	public String createAuthor(@Valid @ModelAttribute("author")Author author, BindingResult results) {
//		IF ERRORS, RENDER JSP AND SHOW ERRORS
		if(results.hasErrors()) {
			return "index.jsp";
		}
//		ELSE SAVE AND REDIRECT
		mainServ.createAuthor(author);
		return "redirect:/books/new";
	}
	
	@GetMapping("/books/new")
	public String newBook(Model model, @ModelAttribute("book")Book emptyBook) {
//		GRAB ALL AUTHORS FROM MY DB
		List<Author> allAuthors = mainServ.getAllAuthors();
//		PASS ALL AUTHORS TO JSP
		model.addAttribute("allAuthors", allAuthors);
		return "newBook.jsp";
	}
	
	@PostMapping("/book/new")
	public String createBook(
		@Valid @ModelAttribute("book") Book filledBook, 
		BindingResult results, 
		Model model
	) {
		if(results.hasErrors()) {
			List<Author> allAuthors = mainServ.getAllAuthors();
			model.addAttribute("allAuthors", allAuthors);
			return "newBook.jsp";
		}
//		System.out.println(filledBook.getAuthor());
//		System.out.println(filledBook.getTitle());
//		System.out.println(filledBook.getDescription());
		mainServ.createBook(filledBook);
		return "redirect:/";
	}
	
	@GetMapping("/authors/{author_id}")
	public String viewAuthor(@PathVariable("author_id") Long author_id, Model model) {
//		RETRIEVING MY AUTHOR FROM DB USING ID FROM PATH VARIABLE
		Author oneAuthor = mainServ.findAuthorById(author_id);
//		PASSING AUTHOR TO THE JSP
		model.addAttribute("author", oneAuthor);
		return "showAuthor.jsp";
	}
	
	
	
	
}
