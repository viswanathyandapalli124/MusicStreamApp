package com.kodnest.echostream.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Song{
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	int sid;
	String name;
	String artist;
	String genre;
	String link;
	@ManyToMany
	List<Playlist> playlists;
	
	public Song(int sid, String name, String artist, String genre, String link, List<Playlist> playlists) {
		super();
		this.sid = sid;
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.link = link;
		this.playlists = playlists;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Playlist> getPlaylists() {
		return playlists;
	}
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Song [sid=" + sid + ", name=" + name + ", artist=" + artist + ", genre=" + genre + ", link=" + link
				+ ", playlists=" + playlists + "]";
	}
	
	
	
}
