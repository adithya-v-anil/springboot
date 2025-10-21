package com.example.school_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/product")
public String product() {
    return "product";
}
    
    @GetMapping("/partials")
    public String index() {
        return "index";
    }
}
