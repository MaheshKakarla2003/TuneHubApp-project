package com.example.tunehub1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tunehub1.entities.Song;

import com.example.tunehub1.services.SongService;


@Controller
public class SongsController {
	@Autowired
	SongService songserv;
	   @PostMapping("/addsongs")
	     public  String addSong(@ModelAttribute Song song)
		  {    
		   if(songserv.songExists(song.getSongName())==false)
		     {
			  songserv.addSong(song);
		    	return "songaddsuccessful";
		    }
		    else
		    {
		    	  return "addsongfails";
		    }  
	      }
	   @GetMapping("/getallsongs")
	   public String getAllSongs(Model model)
	   {
		   List<Song> songList = songserv.getAllSongs();
		   model.addAttribute("songList", songList);
		  
		   return "displaysongs";
	   }
	   @GetMapping("/viewsongs") 
	   public String viewSongs(Model model)
	   {   boolean primeCustomerStatus=false;
	   if(primeCustomerStatus==true)
	   {
		   List<Song> songList = songserv.getAllSongs();
		   model.addAttribute("songList", songList);
		  
		   return "displaysongs";
	   }
	   else
	   {
		   return "makepayment";
	   }
		
		  
	   }
	   
	  
}
