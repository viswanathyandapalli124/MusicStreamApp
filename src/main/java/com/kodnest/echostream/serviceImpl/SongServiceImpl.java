package com.kodnest.echostream.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.echostream.entity.Song;
import com.kodnest.echostream.repository.SongRepository;
import com.kodnest.echostream.services.SongService;

@Service
public class SongServiceImpl implements SongService{
	@Autowired
	SongRepository songRepository;

	@Override
	public String addSong(Song song) {
		songRepository.save(song);
		return "song added successfully";
	}

	@Override
	public boolean songExists(String name) {
		Song song =songRepository.findByName(name);
		if(song==null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public List<Song> fetchAllSongs() {
		List<Song>songs=songRepository.findAll();		
		return songs;
	}	
	@Override
	public void updateSong(Song s) {
		songRepository.save(s);

	}

}