package com.example.grocery.controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.grocery.Models.Product;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class ProductController {

    @GetMapping("/single-product")
    public String singleProduct(Model model) {
        Product product = new Product(101,"Sugar", (float) 55.5);
        model.addAttribute("product", product);
        return "single-product";
    }

    @GetMapping("/product-list")
    public String productList(Model model) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Sugar",(float) 55.5));
        products.add(new Product(102, "Salt",(float) 20.0));
        products.add(new Product(103, "Wheat Flour",(float) 38.75));
        model.addAttribute("products", products);
        return "product-list";
    }
}
