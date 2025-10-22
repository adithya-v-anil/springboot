package com.example.training;
import com.example.training.validation.GmailOnly;
import com.example.training.validation.Address;
import jakarta.validation.constraints.NotBlank;


public class UserDetails {

    @NotBlank(message = "Name is required")
    public String name;
    
    @GmailOnly(message = "Email address is not valid")
    @NotBlank(message = "Email address is required")
    public String email; 
    
    @Address(message = "Your address must contain India.")
    public String address;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
    	this.address=address;
    }
}