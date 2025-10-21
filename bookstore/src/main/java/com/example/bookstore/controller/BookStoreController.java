package com.example.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class BookStoreController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/books")
    public String books() {
    return "books";
}
    
    @GetMapping("/partials")
    public String index() {
        return "index";
    }
}









