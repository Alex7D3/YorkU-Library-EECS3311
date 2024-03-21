package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("newsletter")
public class NewsLetter extends Item{

	public NewsLetter(Integer id, String name, String description, String location, Set<User> users, Request request) {
		super(id, name, description, location, users, request);
		// TODO Auto-generated constructor stub
	}


}
