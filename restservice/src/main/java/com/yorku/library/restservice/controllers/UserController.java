package com.yorku.library.restservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.repositories.UserRepo;

@RestController
public class UserController {
	
	@Autowired
    private UserRepo userRepo;
	
	@GetMapping("/lol")
	public User getUser() {
		return new User();
	}
}
