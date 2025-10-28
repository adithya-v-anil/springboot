package com.example.library.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}