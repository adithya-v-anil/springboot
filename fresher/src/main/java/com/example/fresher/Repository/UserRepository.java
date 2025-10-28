package com.example.fresher.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fresher.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}