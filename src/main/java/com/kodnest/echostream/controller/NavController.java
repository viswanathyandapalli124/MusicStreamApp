package com.kodnest.echostream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/login")
	public String login() { 
		return "login";		
	}
	@GetMapping("/register")
	public String register() {
		return "register";		
	}
	@GetMapping("/newsong")
	public String newsong() {
		return "newsong";		
	}
	@GetMapping("/viewsong")
	public String viewsong() {
		return "viewsong";
	}

}
