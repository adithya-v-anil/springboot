package com.example.welcome.dto;

public class UserDto {
   
	private String phoneNo;
    private String username;
    private String password;
   
   
    public UserDto(String phoneNo, String username, String password ) {
        super();
        this.phoneNo = phoneNo;
        this.username = username;
        this.password = password;
        
    }
   
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}