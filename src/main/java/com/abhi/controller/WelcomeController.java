package com.abhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wel")
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "HI ABHINEET";
	}

}
