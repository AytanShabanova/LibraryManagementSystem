package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.model.dto.request.RegisterRequest;
import com.example.librarymanagementsystem.service.inter.UserServiceInter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.servlet.function.ServerResponse.ok;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceInter userServiceInter;
    @PostMapping("/register")
    public void register(@RequestBody @Valid RegisterRequest registerRequest) {

    userServiceInter.register(registerRequest);

    }



}
