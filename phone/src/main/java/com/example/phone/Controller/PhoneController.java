package com.example.phone.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.phone.Models.Phone;
import com.example.phone.Repository.PhoneRepository;

@Controller
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    @GetMapping("/create")
    public String createAction(Model model) {
        model.addAttribute("message", "Enter The Phone Details");
        return "create";
    }

    @PostMapping("/create")
    public String createActionProcess(Phone phoneData, Model model) {
        phoneRepository.save(phoneData);
        model.addAttribute("message", "The Phone " + phoneData.getName() + " has been created successfully");
        return "create";
    }

    @GetMapping("/all")
    public String getAllPhones(Model model, @Param("keyword") String keyword) {
        List<Phone> phone;
        if (keyword != null && !keyword.isEmpty()) {
            phone = phoneRepository.findAllByKeyword(keyword);
        } else {
            phone = phoneRepository.findAll();
        }
        model.addAttribute("phones", phone);
        return "list";
    }

    @GetMapping("/update/{id}")
    public String updatePhone(@PathVariable Integer id, Model model) {
        Optional<Phone> optionalPhoneDetails = phoneRepository.findById(id);
        if (optionalPhoneDetails.isPresent()) {
            model.addAttribute("phoneDetails", optionalPhoneDetails.get());
            return "update";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/update/{id}")
    public String updatePhone(@PathVariable Integer id, Phone phoneData) {
        Optional<Phone> optionalPhoneDetails = phoneRepository.findById(id);
        if (optionalPhoneDetails.isPresent()) {
            Phone phoneDetails = optionalPhoneDetails.get();
            phoneDetails.setName(phoneData.getName());
            phoneDetails.setDescription(phoneData.getDescription());
            phoneDetails.setPrice(phoneData.getPrice());
           
            phoneRepository.save(phoneDetails);
        }
        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String deletePhone(@PathVariable Integer id, Model model) {
        Optional<Phone> optionalPhoneDetails = phoneRepository.findById(id);
        if (optionalPhoneDetails.isPresent()) {
            model.addAttribute("phoneDetails", optionalPhoneDetails.get());
            return "delete";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/delete/{id}")
    public String deletePhone(@PathVariable Integer id) {
        phoneRepository.deleteById(id);
        return "redirect:/all";
    }
}