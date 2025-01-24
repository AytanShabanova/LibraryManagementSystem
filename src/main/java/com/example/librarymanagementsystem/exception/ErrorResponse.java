package com.example.librarymanagementsystem.exception;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ErrorResponse {
    LocalDateTime timestamp;
    int status;
    String message;
    String error;
}
