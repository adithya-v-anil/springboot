package com.example.restaurant.Controller;

import com.example.restaurant.Models.DishModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DishController {


@GetMapping("/dish/{name}/{price}")
public String getDishDetails(@PathVariable String name, @PathVariable Float price, Model model) {
   DishModel dish = new DishModel();
   dish.setName(name);
   dish.setPrice(price);
   model.addAttribute("dish", dish);
   return "dish";
}
}           