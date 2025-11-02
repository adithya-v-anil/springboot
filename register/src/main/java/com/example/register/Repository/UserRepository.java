package com.example.register.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.register.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}