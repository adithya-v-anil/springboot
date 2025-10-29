package com.example.welcome.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.welcome.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhoneNo(String phoneNo);
}