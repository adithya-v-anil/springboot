package com.example.welcome.service;

import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.welcome.Models.User;

public class CustomUserDetail implements UserDetails {


    private User user;

    public CustomUserDetail(User user) {
        this.user = user;
    }

    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }
    

    public String getPhoneNo() {
        
        return user.getPhoneNo();
    }
    
    
    @Override
    public String getUsername() {
    	
        return user.getUsername();
    }

 
    @Override
    public String getPassword() {
    	
        return user.getPassword();
    }


   


    @Override
    public boolean isAccountNonExpired() {
   
        return true;
    }


    @Override
    public boolean isAccountNonLocked() {
   
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
   
        return true;
    }


   @Override
   public boolean isEnabled() {
	   return true;
   }
}