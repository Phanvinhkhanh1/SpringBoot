package com.example.UnitTest.Repository;

import com.example.UnitTest.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
