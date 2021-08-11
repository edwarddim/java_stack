package com.edwardim.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edwardim.mvc.models.Book;
import com.edwardim.mvc.repositories.BookRepository;

@Service
public class MainService {
	private final BookRepository bookRepository;
    
    public MainService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
    	return bookRepository.findById(id).orElse(null);
//        Optional<Book> optionalBook = bookRepository.findById(id);
//        if(optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
    }

	public Book updateBook(Long book_id, String title, String description, String language, Integer numPages) {
		// FIND THE BOOK
		Book editBook = this.findBook(book_id);
		// UPDATE THE BOOK OBJECT WITH NEW INFO
		editBook.setTitle(title);
		editBook.setDescription(description);
		editBook.setLanguage(language);
		editBook.setNumberOfPages(numPages);
		// SAVE THE UPDATED BOOK OBJECT INTO DB
//		return this.createBook(editBook);
		return bookRepository.save(editBook);
	}

	public void deleteBook(Long book_id) {
		bookRepository.deleteById(book_id);
	}
}
