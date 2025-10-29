package com.example.signup.dto;

public class UserDto {
   
    private String email;
    private String password;
    private String fullname;
    private String lastname;
    private String address;
   
    public UserDto(String email, String password, String fullname, String lastname, String address) {
        super();
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
}