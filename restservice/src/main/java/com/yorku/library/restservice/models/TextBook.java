package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("textbook")
public class TextBook extends Book {

	public TextBook(Integer id, String name, String description, String location, Set<User> users, Request request,
			String isbn) {
		super(id, name, description, location, users, request, isbn);
		// TODO Auto-generated constructor stub
	}

}
