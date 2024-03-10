package com.yorku.library.restservice.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.yorku.library.restservice.Entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	List<User> findByUsername(String username);
	
}
