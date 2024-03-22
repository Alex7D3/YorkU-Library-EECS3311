package com.yorku.library.restservice.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String location;
	
	@OneToOne(mappedBy="item")
	private Request request;
	
	@ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
	private Set<User> users = new HashSet<>();
	public Item(Integer id, String name, String description, String location, Set<User> users, Request request) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
		this.users = users;
		this.request = request;
	}
	
	public void addUser(User user) {
		this.users.add(user);
		user.getItems().add(this);
	}
	
	public void removeUser(Integer id) {
		User user = this.users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		if (user != null) {
			this.users.remove(user);
			user.getItems().remove(this);
		}
	}
	
	@PostUpdate
	public void updateNotification() {
		
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public Request getRequest() {
		return request;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", location=" + location
				+ ", request=" + request + "]";
	}
	
	
	
}
