package com.yorku.library.restservice.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.repositories.ItemRepo;
import com.yorku.library.restservice.repositories.UserRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ItemController {
	
	@Autowired
    private ItemRepo itemRepo;
	
	@Autowired
	private UserRepo userRepo;
	
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
	
	@GetMapping("/users/{id}/items")
	public ResponseEntity<List<Item>> getUserItems(@PathVariable Integer id) {
		List<Item> newList = new ArrayList<>();
		newList.addAll(userRepo.findById(id).get().getItems());
		return new ResponseEntity<List<Item>>(newList, HttpStatus.OK);
	}
	
	@PostMapping("/items")
	public ResponseEntity<Item> addItem(@RequestParam String name, @RequestParam String desc, @RequestParam String location) {
		Item item = new Item(name, desc, location);
		itemRepo.save(item);
		return new ResponseEntity<Item>(item, HttpStatus.CREATED);
	}
	
	@PostMapping("/users/{id}/items")
	public ResponseEntity<Item> addItemToUser(@PathVariable Integer id, @RequestBody Item item) {
		Item item1 = item;
		User user1 = userRepo.findById(id).get();
		item1.addUser(user1);
		itemRepo.save(item1);
		userRepo.save(user1);
		return new ResponseEntity<Item>(item1, HttpStatus.CREATED);
	}
	
	@PutMapping("/items/id/{id}")
	public ResponseEntity<Item> updateItem(@PathVariable Integer id, @RequestBody Item item) throws Exception {
		Item item1 = itemRepo.findById(id).get();
		if (item1 != null) {
			item1.setName(item.getItemName());
			item1.setDescription(item.getItemDescription());
			item1.setLocation(item.getLocation());
			return new ResponseEntity<Item>(itemRepo.save(item1), HttpStatus.OK);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
	//idk if this is right, tentative method
	@DeleteMapping("items/delete/{id}")
	public String deleteItem(@PathVariable Integer id) {
		itemRepo.deleteById(id);
		return "User " + id + " Deleted";
	}
}
