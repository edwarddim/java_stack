package com.edwardim.bookauthor.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.edwardim.bookauthor.models.Author;
import com.edwardim.bookauthor.models.Book;
import com.edwardim.bookauthor.repositories.AuthorRepository;
import com.edwardim.bookauthor.repositories.BookRepository;

@Service
public class MainService {
	private final AuthorRepository aRepo;
	private final BookRepository bRepo;
	
	public MainService(AuthorRepository aRepo, BookRepository bRepo) {
		this.aRepo = aRepo;
		this.bRepo = bRepo;
	}
//	------------------- AUTHOR METHODS -------------------//
//	GET ALL AUHTORS
	public List<Author> getAllAuthors(){
		return this.aRepo.findAll();
	}
//	FIND AUTHOR BY ID
	public Author findAuthorById(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
//	CREATE AN AUTHOR
	public void createAuthor(Author author) {
		this.aRepo.save(author);
	}
//	------------------- AUTHOR METHODS -------------------//
//	------------------- BOOK METHODS ---------------------//
	public void createBook(@Valid Book filledBook) {
		bRepo.save(filledBook);
	}
	
//	------------------- BOOK METHODS ---------------------//
	
}
