package com.example.librarymanagementsystem.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String message) {
            super(message);
    }
}
