package com.example.librarymanagementsystem.service.security;

import com.example.librarymanagementsystem.mapstruct.UserMapper;
import com.example.librarymanagementsystem.service.inter.UserServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
    private final UserServiceInter userServiceInter;
    private final UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userMapper.usertoUserDetails(userServiceInter.findUserByEmail(username));
    }
}
