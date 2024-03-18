package com.yorku.library.restservice;

import java.util.List;

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
    public void run(String... args) throws Exception{
    	
    	User user1 = new User("alexx", "123x4", "mail6ee"); //change email before testing
        userRepo.save(user1);
    	userRepo.findByUsername("alex").forEach(user -> System.out.println(user));
    }
}
