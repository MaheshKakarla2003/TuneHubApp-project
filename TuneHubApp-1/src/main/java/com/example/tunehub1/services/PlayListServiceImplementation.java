package com.example.tunehub1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tunehub1.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService {

	@Autowired
	PlayListRepository prepo;


}
