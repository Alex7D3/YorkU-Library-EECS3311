package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("specItem")
public class SpecialItem extends Item{
	
	private String mediaType;
	
	public SpecialItem(Integer id, String name, String description, String location, Set<User> users, Request request, String mediaType) {
		super(id, name, description, location, users, request);
		this.mediaType = mediaType;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	

}
