package com.example.fresher.dto;

public class UserDto {
   
	private String fullname;
	private String phoneNo;
    private String email;
    private String password;
   
   
    public UserDto(String fullname, String phoneNo, String email, String password ) {
        super();
        this.fullname = fullname;
        this.phoneNo = phoneNo;
        this.email = email;
        this.password = password;
        
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
   
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
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
}