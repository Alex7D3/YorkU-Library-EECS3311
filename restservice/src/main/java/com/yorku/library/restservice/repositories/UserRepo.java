package com.yorku.library.restservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.yorku.library.restservice.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	List<User> findByUsername(String username);
	
}
