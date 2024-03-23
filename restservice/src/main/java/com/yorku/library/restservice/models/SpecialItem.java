package com.yorku.library.restservice.models;



import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("specItem")
public class SpecialItem extends Item{
	
	private String mediaType;
	
	public SpecialItem(String name, String description, String location, byte[] image, String mediaType) {
		super(name, description, location, image);
		this.mediaType = mediaType;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	

}
