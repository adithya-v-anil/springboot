package com.example.mobileshop.Controller;

import com.example.mobileshop.Models.MobileModel;
import com.example.mobileshop.Repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MobileController {

    @Autowired
    private MobileRepository mobileRepository;

    
    @GetMapping("/mobile-form")
    public String showForm(Model model) {
        model.addAttribute("mobile", new MobileModel());
        return "mobile_form";
    }


    @PostMapping("/save-mobile")
    public String saveMobile(@ModelAttribute MobileModel mobile) 
    { mobileRepository.save(mobile); 
    return "redirect:/view";
    }

 
    @GetMapping("/view")
    public String viewMobiles(Model model) {

       model.addAttribute("mobiles", mobileRepository.findNamesAndPrices());
       model.addAttribute("under20K", mobileRepository.findByMaxPrice());
       model.addAttribute("grouped", mobileRepository.findProductCountByType());
       return "view";
    }
}
