package com.example.tunehub1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub1.entities.Users;

public interface UsersRepositories extends JpaRepository<Users, Integer>{

	public  Users findByEmail(String email);
	
}

