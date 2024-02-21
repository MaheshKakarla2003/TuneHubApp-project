package com.example.tunehub1.services;

import java.util.List;

import com.example.tunehub1.entities.Song;

public interface SongService {

	public String addSong(Song song);
	public boolean songExists(String songName);
	public List<Song> getAllSongs();
}
