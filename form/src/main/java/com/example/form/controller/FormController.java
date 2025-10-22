package com.example.form.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController{

    @GetMapping("/form")
    public String processForm(@RequestParam(required = false) String name, @RequestParam(required = false) String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email); 
        return "userdetails";	
    }

    @GetMapping("/submit")
    public String handleFormSubmission(@RequestParam String name,@RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email); 
        return "result";
    }
}