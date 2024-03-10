package com.yorku.library.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yorku.library.restservice.Repositories.UserRepo;

@SpringBootApplication
public class DatabaseTester implements CommandLineRunner{
    
    @Autowired
    private UserRepo userRepo;
    
    public static void main(String[] args) {
        SpringApplication.run(DatabaseTester.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception{
        
    	userRepo.findByUsername("test").forEach(user -> System.out.println(user));
    }
}
