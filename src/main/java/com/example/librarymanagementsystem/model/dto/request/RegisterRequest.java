package com.example.librarymanagementsystem.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;


public record RegisterRequest (
        @Email
        String email,
        @Size(min = 6, max = 20)
        String password
){
}
