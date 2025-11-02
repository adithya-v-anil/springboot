package com.example.register.Controller;

import com.example.register.Models.User;
import com.example.register.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        // Encode password
        user.setPassword(passwordEncoder().encode(user.getPassword()));

 
        User savedUser = userRepository.save(user);

        class Response {
            public String firstName;
            public String email;
            Response(String firstName, String email) {
                this.firstName = firstName;
                this.email = email;
            }
        }

        Response response = new Response(savedUser.getFirstName(), savedUser.getEmail());
        return ResponseEntity.ok(response);
    }
}
