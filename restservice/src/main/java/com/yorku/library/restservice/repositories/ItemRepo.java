package com.yorku.library.restservice.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yorku.library.restservice.models.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

	List<Item> findByTitleContaining(String name);
	
	void deleteByTitle(String name);
	
	List<Item> findByItemType(String type);
	
}
