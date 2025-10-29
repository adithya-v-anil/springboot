package com.example.signup.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.signup.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}