package com.example.librarymanagementsystem.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ErrorResponse>handleBookNotFoundException(BookNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),HttpStatus.NOT_FOUND.value(), ex.getMessage(),"Book not found");

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler(BookAlreadyExistException.class)
    public ResponseEntity<ErrorResponse>handleBookAlreadyExistException(BookAlreadyExistException ex) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),HttpStatus.CONFLICT.value(), ex.getMessage(),"Book already exist");

        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}
