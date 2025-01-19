package com.example.librarymanagementsystem.service.inter;

import com.example.librarymanagementsystem.dto.request.BookRequest;
import com.example.librarymanagementsystem.dto.response.BookResponse;

import java.util.List;

public interface BookServiceInter {
    void createBook(BookRequest bookRequest);
    BookResponse updateBook(Long bookId);
    void deleteBook(Long  bookId);
    BookResponse getBook(Long  bookId);
    List<BookResponse> getAllBooks();
    List<BookResponse> getBooksByAuthor(String author);
    BookResponse getBookByName(String name);

}
