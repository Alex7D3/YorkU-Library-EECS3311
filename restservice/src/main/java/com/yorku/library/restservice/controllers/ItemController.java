package com.yorku.library.restservice.controllers;

import org.springframework.web.bind.annotation.RestController;


import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.repositories.ItemRepo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("item")
public class ItemController {
	
	@Autowired
    private ItemRepo itemRepo;
	
	@GetMapping("/")
	public String hello() {
		return "Home Page";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> getItemById(@PathVariable("id") Integer id) {
		return new ResponseEntity<Item>(itemRepo.findById(id).get(), HttpStatus.OK);
	}
	
	@GetMapping("/search/{title}")
	public ResponseEntity<List<Item>> getItemsByTitle(@PathVariable("title") String title) {
		return new ResponseEntity<List<Item>>(itemRepo.findByTitleContaining(title), HttpStatus.OK);
	}
	
	@GetMapping("/search/by/{type}")
	public ResponseEntity<List<Item>> getItemsByType(@PathVariable("type") String type) {
		return new ResponseEntity<List<Item>>(itemRepo.findByItemType(type), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Item>> getAllItems() {
		return new ResponseEntity<List<Item>>(itemRepo.findAll(), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Item> updateItem(@PathVariable("id") Integer id, @RequestBody Item item) throws Exception {
		Item item1 = itemRepo.findById(id).get();
		if (item1 != null) {
			item1.setTitle(item.getTitle());
			item1.setDescription(item.getDescription());
			item1.setLocation(item.getLocation());
			return new ResponseEntity<Item>(itemRepo.save(item1), HttpStatus.OK);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
}
