package com.example.phone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.phone.Models.Phone;
import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
    @Query("SELECT p FROM Phone p WHERE p.name LIKE %:keyword% OR p.description LIKE %:keyword%")
    List<Phone> findAllByKeyword(@Param("keyword") String keyword);
}