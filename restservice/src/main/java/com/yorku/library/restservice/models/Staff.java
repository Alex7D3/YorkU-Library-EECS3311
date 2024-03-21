package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("staff")
public class Staff extends User {

	public Staff(Integer id, String username, String pw, String email, Set<Item> items, Set<Request> requests) {
		super(id, username, pw, email, items, requests);
		// TODO Auto-generated constructor stub
	}
	
}
