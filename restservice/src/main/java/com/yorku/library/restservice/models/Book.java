package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("book")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "booktype")
public class Book extends Item {
	private String isbn;

	public Book(Integer id, String name, String description, String location, Set<User> users, Request request, String isbn) {
		super(id, name, description, location, users, request);
		this.isbn = isbn;
	}
	
	
}
