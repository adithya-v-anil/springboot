package com.example.mydata.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity 
public class ProductModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id;
    private String name;
    private String description;
    private Float price;
	
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Float getPrice() {
        return price;
    }	
    public void setPrice(Float price) {
        this.price = price;
    }
}