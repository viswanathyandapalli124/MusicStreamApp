package com.kodnest.echostream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.echostream.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{

	public User findByEmail(String email);

	public User findByPassword(String email);
	
}
