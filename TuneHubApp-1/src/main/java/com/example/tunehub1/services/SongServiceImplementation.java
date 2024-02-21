package com.example.tunehub1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub1.entities.Song;
import com.example.tunehub1.repositories.SongsRepository;

@Service
public class SongServiceImplementation implements SongService{
	@Autowired
	SongsRepository srepo;
	
	public String addSong(Song song) {
		
		 srepo.save(song);
		return "added succcessfully";
	}

	
	public boolean songExists(String songName) {
		
		if(srepo.findBySongName(songName)==null)
		{
			return false;

		}
		else
		{
			return true;
		}
		
	}


	@Override
	public List<Song> getAllSongs() {
		
		return srepo.findAll();
	}

}
