package com.example.students.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.students.Models.Students;
import com.example.students.Repository.StudentsRepository;

@Controller
public class StudentsController {

    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping("/create")
    public String createAction(Model model) {
        model.addAttribute("message", "Enter The Student Details");
        return "create";
    }

    @PostMapping("/create")
    public String createActionProcess(Students studentData, Model model) {
        studentsRepository.save(studentData);
        model.addAttribute("message", "The Student " + studentData.getName() + " has been created successfully");
        return "create";
    }

    @GetMapping("/all")
    public String getAllStudents(Model model, @Param("keyword") String keyword) {
        List<Students> student;
        if (keyword != null && !keyword.isEmpty()) {
            student = studentsRepository.findAllByKeyword(keyword);
        } else {
            student = studentsRepository.findAll();
        }
        model.addAttribute("students", student);
        return "list";
    }

    @GetMapping("/update/{id}")
    public String updateStudent(@PathVariable Integer id, Model model) {
        Optional<Students> optionalStudentDetails = studentsRepository.findById(id);
        if (optionalStudentDetails.isPresent()) {
            model.addAttribute("studentDetails", optionalStudentDetails.get());
            return "update";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable Integer id, Students studentData) {
        Optional<Students> optionalStudentDetails = studentsRepository.findById(id);
        if (optionalStudentDetails.isPresent()) {
            Students studentDetails = optionalStudentDetails.get();
            studentDetails.setName(studentData.getName());
            studentDetails.setStudentClass(studentData.getStudentClass());
            studentDetails.setAge(studentData.getAge());
           
            studentsRepository.save(studentDetails);
        }
        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id, Model model) {
        Optional<Students> optionalStudentDetails = studentsRepository.findById(id);
        if (optionalStudentDetails.isPresent()) {
            model.addAttribute("studentDetails", optionalStudentDetails.get());
            return "delete";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/delete/{id}")
    public String deleteStudents(@PathVariable Integer id) {
        studentsRepository.deleteById(id);
        return "redirect:/all";
    }
}