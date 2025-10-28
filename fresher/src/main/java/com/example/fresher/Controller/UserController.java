package com.example.fresher.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.fresher.Models.User;
import com.example.fresher.dto.UserDto;
import com.example.fresher.service.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
        return "register";
    }
    
    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
        User registeredUser = userService.save(userDto);
        model.addAttribute("message", "Thanks for registering, " 
            + registeredUser.getFullname() + "! You can now apply for jobs.");
        return "register";
    }
}