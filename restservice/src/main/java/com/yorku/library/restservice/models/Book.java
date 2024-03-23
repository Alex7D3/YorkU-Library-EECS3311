package com.yorku.library.restservice.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("book")
public class Book extends Item {
	private String isbn;

	public Book(Integer id, String name, String description, String location, String isbn, byte[] image) {
		super(name, description, location, image);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
