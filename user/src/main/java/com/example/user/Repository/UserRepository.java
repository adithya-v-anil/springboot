package com.example.user.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}