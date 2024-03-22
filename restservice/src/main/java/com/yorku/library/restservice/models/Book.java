package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@DiscriminatorValue("book")
public class Book extends Item {
	private String isbn;

	public Book(Integer id, String name, String description, String location, Set<User> users, Request request, String isbn) {
		super(id, name, description, location, users, request);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
