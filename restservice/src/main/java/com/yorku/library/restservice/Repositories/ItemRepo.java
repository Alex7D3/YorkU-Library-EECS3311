package com.yorku.library.restservice.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorku.library.restservice.Entities.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

	List<Item> findByName(String name);
	
}
