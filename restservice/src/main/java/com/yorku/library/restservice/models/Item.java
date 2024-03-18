package com.yorku.library.restservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String location;
	
	public Item(Integer id, String name, String desc, String location) {
		this.id = id;
		this.name = name;
		this.description = desc;
		this.location = location;
	}
	
	public Item(String name, String desc, String location) {
		this.name = name;
		this.description = desc;
		this.location = location;
	}
	
	public Item() {
		
	}
	
	public Integer getItemID() {
		return id;
	}
	public void setItemID(Integer itemID) {
		this.id = itemID;
	}
	public String getItemName() {
		return name;
	}
	public void setItemName(String itemName) {
		this.name = itemName;
	}
	public String getItemDescription() {
		return description;
	}
	public void setItemDescription(String itemDescription) {
		this.description = itemDescription;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@PostUpdate
	public void updateNotification() {
		
	}
	
	@Override
	public String toString() {
		return "Item [itemID=" + id + ", itemName=" + name + ", itemDescription=" + description
				+ ", location=" + location + "]";
	}
	
	
}
