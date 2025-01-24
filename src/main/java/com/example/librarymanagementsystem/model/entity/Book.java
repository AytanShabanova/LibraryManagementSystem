package com.example.librarymanagementsystem.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String author;
    @Column(nullable = false)
    String category;
    @Column(nullable = false,unique = true)
    String isbn;
    @Column(nullable = false)
    String publisher;
    @Column(nullable = false)
    LocalDate publicationDate;
    @Column(nullable = false)
    BigDecimal price;
    @Column(nullable = false)
    Integer pageCount;
    @Column(nullable = false)
    String language;
    String description;

    Integer stockQuantity;
    String format;
    Double rating;
    String imageUrl;
}
