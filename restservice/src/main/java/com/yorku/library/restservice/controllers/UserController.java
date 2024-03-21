package com.yorku.library.restservice.controllers;

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
import org.springframework.web.bind.annotation.RestController;

import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.repositories.UserRepo;

@RestController
public class UserController {

	@Autowired
    private UserRepo userRepo;
	
	@GetMapping("/users") 
	public ResponseEntity<List<User>> getAllUsers() {
	
		return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/users/id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) throws Exception {

        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return new ResponseEntity<User>(user.get(), HttpStatus.OK);
        } 
        else {
            throw new Exception("User Doesnt Exist");
        }
	}
	
	@GetMapping("/users/{name}")
	public ResponseEntity<List<User>> getUsersByName(@PathVariable String name) throws Exception {
		List<User> user = userRepo.findByUsername(name);
        if (user.size() != 0) {
            return new ResponseEntity<List<User>>(user, HttpStatus.OK);
        } 
        else {
            throw new Exception("User Doesnt Exist");
        }
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestParam String username, @RequestParam String pw, @RequestParam String email) {
		User user = new User(username, pw, email);
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@PutMapping("/users/id/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user) throws Exception{
		User user1 = userRepo.findById(id).get();
		if (user1 != null) {
			user1.setUsername(user.getUsername());
			user1.setPw(user.getPassword());
			user1.setEmail(user.getEmail());
			return new ResponseEntity<User>(userRepo.save(user1), HttpStatus.OK);
		}
		else {
			throw new Exception("Item Doesnt Exist");
		}
	}
	
	//idk if this is right, tentative method
	@DeleteMapping("users/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		userRepo.deleteById(id);
		return "User " + id + " Deleted";
	}
}
