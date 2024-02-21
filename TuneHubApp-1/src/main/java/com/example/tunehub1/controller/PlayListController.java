package com.example.tunehub1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.tunehub1.entities.PlayList;
import com.example.tunehub1.entities.Song;
import com.example.tunehub1.services.PlayListService;
import com.example.tunehub1.services.SongService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PlayListController {

	@Autowired
	PlayListService pservice;
	@Autowired
	SongService sserv;
	@GetMapping("/map-playlist")
	public String createSongsList(Model model)
	{
		List<Song> songList = sserv.getAllSongs();
		   model.addAttribute("songList", songList);
		  
		   return "createplaylist";
	}
	@PostMapping("/addplaylist")
	public String addPlayList(@ModelAttribute PlayList playList) {
		
		
		return "playlistsuccess";
	}
	
}
