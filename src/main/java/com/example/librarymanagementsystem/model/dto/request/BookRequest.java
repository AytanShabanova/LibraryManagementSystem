package com.example.librarymanagementsystem.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookRequest {
    @NotBlank
    String name;
    @NotBlank
    String author;
    @NotBlank
    String category;
    @NotBlank
    String isbn;
    @NotBlank
    String publisher;
    @NonNull
    LocalDate publicationDate;
    @NonNull
    BigDecimal price;
    Integer pageCount;
    @NotBlank
    String language;
    @Size( max = 200)
    String description;
    Integer stockQuantity;
    String format;
    Double rating;
    String imageUrl;
}
