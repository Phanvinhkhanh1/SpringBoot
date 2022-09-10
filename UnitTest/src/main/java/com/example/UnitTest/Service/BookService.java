package com.example.UnitTest.Service;

import com.example.UnitTest.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book getOne(Long id);
}
