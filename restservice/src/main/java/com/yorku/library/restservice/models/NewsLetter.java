package com.yorku.library.restservice.models;


import com.mysql.cj.jdbc.Blob;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("newsletter")
public class NewsLetter extends Item{
	
	private String source;

	public NewsLetter(String name, String description, String location, byte[] image, String source) {
		super(name, description, location, image);
		this.source = source;
		// TODO Auto-generated constructor stub
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
