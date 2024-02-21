package com.example.tunehub1.services;

import com.example.tunehub1.entities.Users;


public interface UsersService {

	public String addUser(Users user);
    public boolean userExist(String email);
    public boolean validateUser(String email , String password);
    public String getRole(String email);
}
