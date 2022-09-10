package com.example.UnitTest.Service;

import com.example.UnitTest.Entity.Book;
import com.example.UnitTest.Exception.BookNotFoundException;
import com.example.UnitTest.Repository.BookRepository;
import com.example.UnitTest.Service.Implementation.BookServiceImple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImple bookServiceImple;

    @Test
    void whenGetAll_shouldReturnList() {
        //create mock data
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            books.add(new Book((long) i));
        }

        //define behavior of BookRepository
        when(bookRepository.findAll()).thenReturn(books);

        //call Service method
        List<Book> actualBooks = bookServiceImple.getAll();

        //assert the result
        assertThat(actualBooks.size()).isEqualTo(books.size());

        verify(bookRepository).findAll();
    }

    @Test
    void whenGetInvalidOne_shouldThrowException() {
        Long invalidBookId = 7L;

        when(bookRepository.findById(any(Long.class))).thenReturn(Optional.ofNullable(null));

        assertThatThrownBy(() -> bookServiceImple.getOne(invalidBookId))
                .isInstanceOf(BookNotFoundException.class);

        verify(bookRepository).findById(any(Long.class));
    }
}
