package com.edwardim.booksdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.booksdemo.models.Book;
import com.edwardim.booksdemo.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepo;
    
    // CREATE A BOOK
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    // GET ONE BOOK
    public Book findBook(Long id) {
    	return bookRepo.findById(id).orElse(null);
//        Optional<Book> optionalBook = bookRepo.findById(id);
//        if(optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
    }
    
    // GET ALL BOOKS
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // UPDATE A BOOK
    
    // DELETE A BOOK
    
    // FIND A BOOK BY IT'S TITLE
    public List<Book> findByTitle(String watermelon){
    	return bookRepo.findByTitle(watermelon);
    }
    
    
}
