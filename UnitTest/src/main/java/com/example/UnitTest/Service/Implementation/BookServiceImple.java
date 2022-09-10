package com.example.UnitTest.Service.Implementation;

import com.example.UnitTest.Entity.Book;
import com.example.UnitTest.Exception.BookNotFoundException;
import com.example.UnitTest.Repository.BookRepository;
import com.example.UnitTest.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImple implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getOne(Long id) {
        return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
    }
}
