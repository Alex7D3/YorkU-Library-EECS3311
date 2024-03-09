package com.yorku.library.restservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ItemController {
	
	@GetMapping("/")
	public String hello() {
		return "hello world";
	}
}
