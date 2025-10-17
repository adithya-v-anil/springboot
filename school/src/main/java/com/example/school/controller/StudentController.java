package com.example.school.controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.school.Models.Student;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class StudentController {

    @GetMapping("/student-info")
    public String studentInfo(Model model) {
        Student student = new Student(101,"Anjali Sharma", (double) 92.5);
        model.addAttribute("student", student);
        return "student-info";
    }

    @GetMapping("/student-list")
    public String studentList(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Anjali Sharma",(double) 92.5));
        students.add(new Student(102, "Rohit Mehta",(double) 85.0));
        students.add(new Student(103, "Sneha Iyer",(double) 78.6));
        model.addAttribute("students", students);
        return "student-list";
    }
}
