package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.mapstruct.BookMapper;
import com.example.librarymanagementsystem.dto.request.BookRequest;
import com.example.librarymanagementsystem.dto.response.BookResponse;
import com.example.librarymanagementsystem.exception.BookAlreadyExistException;
import com.example.librarymanagementsystem.exception.BookNotFoundException;
import com.example.librarymanagementsystem.model.entity.Book;
import com.example.librarymanagementsystem.repository.BookRepository;
import com.example.librarymanagementsystem.service.inter.BookServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class BookServiceImpl implements BookServiceInter {
    private final BookRepository bookRepository;
   private final BookMapper bookMapper;

    @Override
    public void createBook(BookRequest bookRequest) {
        Book book=bookMapper.bookRequestToBook(bookRequest);
        if (bookRepository.existsByIsbn(bookRequest.getIsbn())) {
            throw new BookAlreadyExistException("Book with this ISBN already exists");
        }

        bookRepository.save(book);
    }

    @Override
    public BookResponse updateBook(Long bookId) {

        return null;
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.findById(bookId).ifPresent(bookRepository::delete);
    }

    @Override
    public BookResponse getBook(Long bookId) {


       Optional<Book> book= bookRepository.findById(bookId);
      BookResponse bookResponse=  bookMapper
              .bookToBookResponse(book.orElseThrow(()->new BookNotFoundException("Book not found")));
        return bookResponse ;
    }

    @Override
    public List<BookResponse> getAllBooks() {
        List<Book>bookList=bookRepository.findAll();

        return bookMapper.bookListToBookResponse(bookList);
    }

    @Override
    public List<BookResponse> getBooksByAuthor(String author) {
        List<Book>books=bookRepository.findBookByAuthor(author).orElseThrow(()->new BookNotFoundException("Book not found"));


        return bookMapper.bookListToBookResponse(books);
    }

    @Override
    public BookResponse getBookByName(String name) {
        Book book=bookRepository.findBookByName(name).orElseThrow(()->new BookNotFoundException("Book not found"));

        return bookMapper.bookToBookResponse(book);
    }
}
