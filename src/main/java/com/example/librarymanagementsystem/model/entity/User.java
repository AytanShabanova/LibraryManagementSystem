package com.example.librarymanagementsystem.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity

public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;
    @Column(name="full_name")
    String fullName;
    String email;
    String password;
    @Column(name = "active")
    Boolean isActive;
    LocalDate birthDate;



}
