package com.yorku.library.restservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.yorku.library.restservice.entities.Item;
import com.yorku.library.restservice.repositories.ItemRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ItemController {
	
	@Autowired
    private ItemRepo itemRepo;
	
	@GetMapping("/")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/items") 
	public ResponseEntity<List<Item>> getAllItems() {
		
		return new ResponseEntity<>(itemRepo.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/items/id/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Integer id) throws Exception {

        Optional<Item> item = itemRepo.findById(id);
        if (item.isPresent()) {
            return new ResponseEntity<Item>(item.get(), HttpStatus.OK);
        } 
        else {
            throw new Exception("Item Doesnt Exist");
        }
	}
	
	@GetMapping("/items/{name}")
	public ResponseEntity<List<Item>> getItemsByName(@PathVariable String name) throws Exception {
		List<Item> item = itemRepo.findByName(name);
        if (item.size() != 0) {
            return new ResponseEntity<List<Item>>(item, HttpStatus.OK);
        } 
        else {
            throw new Exception("Item Doesnt Exist");
        }
	}
	
	@PostMapping(path = "items")
	public ResponseEntity<Item> addItem(@RequestParam String name, @RequestParam String desc, @RequestParam String location) {
		Item item = new Item(name, desc, location);
		itemRepo.save(item);
		return new ResponseEntity<Item>(item, HttpStatus.CREATED);
	}
	
	//idk if this is right, tentative method
	@DeleteMapping("items/delete/{id}")
	public String deleteItem(@PathVariable Integer id) {
		itemRepo.deleteById(id);
		return "User " + id + " Deleted";
	}
}
