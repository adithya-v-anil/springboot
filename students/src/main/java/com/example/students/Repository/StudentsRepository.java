package com.example.students.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import com.example.students.Models.Students;
import java.util.List;

public interface StudentsRepository extends JpaRepository<Students, Integer> {
	  @Query("SELECT s FROM Students s WHERE s.name LIKE %:keyword%")
	    List<Students> findAllByKeyword(@Param("keyword") String keyword);
}