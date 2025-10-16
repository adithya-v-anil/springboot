package com.example.movie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class MovieController {
	
	 @GetMapping("/home")
	    public String home() {
	        return "redirect:/movie";
	    }
	 
	 @GetMapping("/movie")
	    public String hello(Model model) {
	       
	        String title = "<h1>Drishyam</h1>";
	        model.addAttribute("title", title);
	        String description = "A simple family man Georgekutty lives a peaceful life with his wife and daughters.";
	        model.addAttribute("description", description);
	        boolean isLoggedIn = true;
	        model.addAttribute("isLoggedIn", isLoggedIn);
	        return "movie";
	    }
}