package com.kodnest.echostream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.echostream.entity.Song;
@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

	Song findByName(String name);

	
	
	

}
