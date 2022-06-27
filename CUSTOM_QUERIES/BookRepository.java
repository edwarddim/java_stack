package com.edwardim.booksdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.booksdemo.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    // this method retrieves all the books from the database
    List<Book> findAll();
    
    List<Book> findByTitle(String searchTitle);
    
    List<Book> findByTitleIsNot(String searchTitle);
    
    List<Book> findByNumberOfPagesIsLessThan(Integer pages);
    
    
}
