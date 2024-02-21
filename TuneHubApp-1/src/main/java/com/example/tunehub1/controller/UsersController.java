package com.example.tunehub1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tunehub1.entities.Users;
import com.example.tunehub1.services.UsersService;

@Controller
public class UsersController {
	@Autowired
	UsersService service;

	
      @PostMapping("/register")
	  public  String addUser(@ModelAttribute Users user)
	  {	
    	 boolean userStatus = service.userExist(user.getEmail());
    	 if(userStatus == false)
    	 {
         service.addUser(user);
            return "registersuccessful";
    	 }
    	 else
    	 {
    		 return "registerfail";
    	 }
    	
    	 }
      @PostMapping("/login")
      public String validateUser(@RequestParam String email , @RequestParam String password)
      {
    	    
    	    if(service.validateUser(email,password)==true)
    	    {
    	    	if(service.getRole(email).equals("admin"))
    	    	{
    	    		return "adminhome";
    	    	}
    	    	else
    	    	{
    	    		return "customerhome";
    	    	}
    	    	
    	    	
    	    }
    	    else
    	    {
    	    	 return "loginfail";
    	    }
    	  
    	 
      }
     
}
