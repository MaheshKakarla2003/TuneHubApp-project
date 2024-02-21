package com.example.tunehub1.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.tunehub1.entities.Users;
import com.example.tunehub1.repositories.UsersRepositories;

@Service
public class UsersServiceImplementation implements UsersService {
     @Autowired
	UsersRepositories repo;
	public String addUser(Users user) {
		
		repo.save(user);
		return "user is added";
		}
	
	public boolean userExist(String email) {
		if(repo.findByEmail(email)==null)
		{
			return false;
		}
		else
		{
			return true; 
		}
		
		
	}

	
	public boolean validateUser(String email , String password) {
		
		Users user = repo.findByEmail(email);
		String db_password=user.getPassword();
		if(db_password.equals(password))
		{
			return true;
		}
		
		return false;
	}

	
	public String getRole(String email) {
		
		return  repo.findByEmail(email).getRole();
	}
	
	
	
	
}
