package com.yorku.library.app.dtos;

import lombok.Getter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
public class Book extends Item {
	private String isbn;
	
	@JsonCreator
	public Book(
			@JsonProperty Integer id,
			@JsonProperty String name,
			@JsonProperty String description, String location, String isbn) {
		super(id, name, description, location);
		this.isbn = isbn;
	}
	
	
}
