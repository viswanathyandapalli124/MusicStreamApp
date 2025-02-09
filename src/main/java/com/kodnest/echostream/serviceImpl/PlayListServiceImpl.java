package com.kodnest.echostream.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.echostream.entity.Playlist;
import com.kodnest.echostream.repository.PlayListRepository;
import com.kodnest.echostream.services.PlayListService;

@Service
public class PlayListServiceImpl implements PlayListService{
	@Autowired
	PlayListRepository playListRepository;

	@Override
	public void addplaylist(Playlist playlist) {
	 playListRepository.save(playlist);
		
	}

	@Override
	public List<Playlist> fetchAllPlaylists() {
		List<Playlist> allplaylist=playListRepository.findAll();
		return allplaylist;
	}

	

	
	
	
	
	
}
