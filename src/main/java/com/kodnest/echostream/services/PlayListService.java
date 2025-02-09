package com.kodnest.echostream.services;

import java.util.List;

import com.kodnest.echostream.entity.Playlist;

public interface PlayListService {

	public void addplaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

	
}
