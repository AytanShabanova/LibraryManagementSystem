package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.mapstruct.UserMapper;
import com.example.librarymanagementsystem.model.dto.request.RegisterRequest;
import com.example.librarymanagementsystem.model.entity.User;
import com.example.librarymanagementsystem.repository.UserRepository;
import com.example.librarymanagementsystem.service.inter.UserServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceInter {
private final UserRepository userRepository;
private final UserMapper userMapper;
private final PasswordEncoder passwordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email).orElseThrow(() -> new RuntimeException("User with email " + email + " not found"));
    }

    @Override
    public void register(RegisterRequest registerRequest) {
User user=userMapper.registerRequestToUser(registerRequest);
user.setPassword(passwordEncoder.encode(user.getPassword()));
         userRepository.save(user);

    }
}
