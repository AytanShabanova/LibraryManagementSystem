package com.example.librarymanagementsystem.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookResponse {
    Long id;
    String name;
    String author;
    String category;
    String isbn;
    String publisher;
    LocalDate publicationDate;
    BigDecimal price;
    Integer pageCount;
    String language;
    String description;
    Integer stockQuantity;
    String format;
    Double rating;
    String imageUrl;

}
