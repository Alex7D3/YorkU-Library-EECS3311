package com.yorku.library.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yorku.library.restservice.models.Item;
import com.yorku.library.restservice.models.User;
import com.yorku.library.restservice.repositories.ItemRepo;
import com.yorku.library.restservice.repositories.UserRepo;

@SpringBootApplication
public class DatabaseTester implements CommandLineRunner {
    
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ItemRepo itemRepo;
    
    public static void main(String[] args) {
        SpringApplication.run(DatabaseTester.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
    	Item item1 = itemRepo.findById(15).get();
    	User user1 = userRepo.findById(2).get();
    	item1.addUser(user1);
    	itemRepo.save(item1);
    	userRepo.save(user1);
    	userRepo.findAll().forEach(user -> System.out.println(user));
    	itemRepo.findAll().forEach(item -> System.out.println(item));
    }
}
