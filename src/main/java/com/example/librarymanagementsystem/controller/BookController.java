package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.model.dto.request.BookRequest;
import com.example.librarymanagementsystem.model.dto.response.BookResponse;
import com.example.librarymanagementsystem.service.inter.BookServiceInter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookServiceInter bookServiceInter;


    @PostMapping

    public ResponseEntity<Void>createBook(@Valid @RequestBody BookRequest bookRequest) {
        bookServiceInter.createBook(bookRequest);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/allBooks")
    public ResponseEntity<List<BookResponse>>getAllBooks() {
        return ResponseEntity.ok(bookServiceInter.getAllBooks());
    }
    @GetMapping("{id}")

    public ResponseEntity<BookResponse> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookServiceInter.getBook(id));
    }

}
