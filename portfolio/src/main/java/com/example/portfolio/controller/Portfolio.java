package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Portfolio {

    
    @GetMapping("/start")
    public String redirectToPortfolio() {
        return "redirect:/portfolio";
    }

  
    @GetMapping("/portfolio")
    public String showPortfolio() {
        return "portfolio";
    }
}
