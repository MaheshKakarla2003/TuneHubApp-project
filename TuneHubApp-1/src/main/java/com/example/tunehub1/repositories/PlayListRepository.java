package com.example.tunehub1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub1.entities.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Integer> {

}
