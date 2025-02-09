package com.kodnest.echostream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.echostream.entity.Playlist;
import com.kodnest.echostream.entity.Song;
import com.kodnest.echostream.services.PlayListService;
import com.kodnest.echostream.services.SongService;

@Controller
public class PlayListController {

	@Autowired
	SongService songService;
	@Autowired
	PlayListService playListService;

	@GetMapping("/createplaylists")
	public String  createPlaylists(Model model) {
	
		List<Song>songList=songService.fetchAllSongs();
		model.addAttribute("songs",songList);
		return "createplaylists";	
	}
	@PostMapping("/addplaylist")
	public String addplaylist(@ModelAttribute Playlist playlist) {
		playListService.addplaylist(playlist);
		List<Song> songList=playlist.getSongs();
		for(Song s:songList) {
			s.getPlaylists().add(playlist);
			songService.updateSong(s);
		} 
		return "adminhome";	
	}
	
	@GetMapping("/viewplaylists")
	public String viewplaylist(Model model) {
		List<Playlist>allplaylist=playListService.fetchAllPlaylists();
		model.addAttribute("allplaylist", allplaylist);

		return "displayplaylist" ;

	}
}
