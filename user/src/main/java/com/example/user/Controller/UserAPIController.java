package com.example.user.Controller;

import com.example.user.Models.User;
import com.example.user.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserAPIController {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        user.setPassword(passwordEncoder().encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}
