package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
    Optional<Book>findBookByIsbn(String isbn);
    Optional<Book>findById(long id);
   Optional<List<Book>>findBookByAuthor(String author);
    Optional<Book>findBookByName(String bookName);
    boolean existsByIsbn(String isbn);



}
