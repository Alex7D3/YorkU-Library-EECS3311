package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("newsletter")
public class NewsLetter extends Item{
	
	private String source;

	public NewsLetter(Integer id, String name, String description, String location, Set<User> users, Request request, String source) {
		super(id, name, description, location, users, request);
		this.source = source;
		// TODO Auto-generated constructor stub
	}


}
