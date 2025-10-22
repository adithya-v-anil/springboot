
package com.example.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import com.example.training.UserDetails;

@Controller
public class FormController {

    @GetMapping("/form")
    public String processForm(Model model) {
        UserDetails userDetails = new UserDetails();
        model.addAttribute("userDetails", userDetails);
        return "userdetails";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("userDetails") UserDetails userDetails, BindingResult result, Model model) {
        model.addAttribute("userDetails", userDetails);
        if (result.hasErrors()) {
            return "userdetails";
        } else {
            return "success";
        }
    }
}

