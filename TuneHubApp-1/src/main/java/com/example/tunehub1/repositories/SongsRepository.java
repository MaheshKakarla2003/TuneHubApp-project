package com.example.tunehub1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub1.entities.Song;


public interface SongsRepository extends JpaRepository<Song, Integer>{
             public Song findBySongName(String songName);
}
