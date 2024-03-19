package com.yorku.library.restservice.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	
	@ManyToMany(mappedBy = "items", fetch = FetchType.EAGER)
	private Set<User> users = new HashSet<>();
	
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

	public String getItemName() {
		return name;
	}
	
	public String getItemDescription() {
		return description;
	}
	
	public String getLocation() {
		return location;
	}
	
	@PostUpdate
	public void updateNotification() {
		
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", location=" + location + "]";
	}
	
}
