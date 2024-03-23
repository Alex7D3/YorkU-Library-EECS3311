package com.yorku.library.restservice.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yorku.library.restservice.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
	
	void deleteByUsername(String username);

	List<User> findByEmail(String email);
	
	void deleteByEmail(String email);
	
}
