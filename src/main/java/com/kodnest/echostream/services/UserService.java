package com.kodnest.echostream.services;

import com.kodnest.echostream.entity.User;

public interface UserService {
	public String addUser( User user);
	public boolean emailExists(String email);
	public boolean validateUser(String email, String password);
	public String getRole(String email) ;
	public User getUser(String email);
	public void updateUser(User user);
	String validateUser(String email, String password, String role); 
}
