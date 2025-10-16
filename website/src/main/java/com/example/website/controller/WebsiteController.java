package com.example.website.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class WebsiteController {
	
	 @GetMapping("/home")
	    public String home() {
	        return "redirect:/hello";
	    }
	 
	 @GetMapping("/hello")
	    public String hello(Model model) {
	        String message = "Live as if you were to die tomorrow. Learn as if you were to live forever.";
	        model.addAttribute("message", message);
	        String hello = "<h1>Hello from Spring Boot!</h1>";
	        model.addAttribute("hello", hello);
	        boolean isLoggedIn = true;
	        model.addAttribute("isLoggedIn", isLoggedIn);
	        return "hello";
	    }
}