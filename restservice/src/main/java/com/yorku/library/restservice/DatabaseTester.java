package com.yorku.library.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yorku.library.restservice.Entities.Item;
import com.yorku.library.restservice.Entities.User;
import com.yorku.library.restservice.Repositories.ItemRepo;
import com.yorku.library.restservice.Repositories.UserRepo;

@SpringBootApplication
public class DatabaseTester implements CommandLineRunner{
    
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ItemRepo itemRepo;
    
    public static void main(String[] args) {
        SpringApplication.run(DatabaseTester.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception{
    	
    	User user1 = new User("alex", "1234", "mail6"); //change email before testing
        userRepo.save(user1);
    	userRepo.findByUsername("alex").forEach(user -> System.out.println(user));
    	Item item1 = new Item("king4", "king is my goat", "here"); //change item name before testing
    	itemRepo.save(item1);
    	itemRepo.findByName("king4").forEach(item -> System.out.println(item));
    }
}
