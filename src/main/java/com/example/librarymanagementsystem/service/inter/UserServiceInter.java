package com.example.librarymanagementsystem.service.inter;

import com.example.librarymanagementsystem.model.dto.request.RegisterRequest;
import com.example.librarymanagementsystem.model.entity.User;
import jakarta.validation.Valid;

public interface UserServiceInter {
    public User findUserByEmail(String email);

    void register(@Valid RegisterRequest registerRequest);
}
