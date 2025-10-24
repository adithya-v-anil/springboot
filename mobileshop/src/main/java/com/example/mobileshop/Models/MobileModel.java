package com.example.mobileshop.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity 
public class MobileModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id;
    private String name;
    private String brand;
    private Float price;
    private String type;
	
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Float getPrice() {
        return price;
    }	
    public void setPrice(Float price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}