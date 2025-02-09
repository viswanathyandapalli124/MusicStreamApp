package com.kodnest.echostream.services;

import java.util.List;

import com.kodnest.echostream.entity.Song;

public interface SongService {

	public String addSong(Song song);
	public boolean songExists(String name);
	public List<Song> fetchAllSongs();
	public void updateSong(Song s) ;
	

} 
