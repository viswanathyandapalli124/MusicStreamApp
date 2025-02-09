package com.kodnest.echostream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.echostream.entity.Playlist;
@Repository
public interface PlayListRepository  extends JpaRepository<Playlist, Integer>{

}
