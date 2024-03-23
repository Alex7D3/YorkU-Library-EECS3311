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
import jakarta.persistence.OneToMany;
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
	private String title;
	private String description;
	private String location;
	
	@OneToOne(mappedBy="item")
	private Request request;
	
	@OneToMany(mappedBy = "item")
	private Set<UserItem> useritems = new HashSet<UserItem>();
	
	
	public Item(String title, String description, String location) {
		this.title = title;
		this.description = description;
		this.location = location;
	}
	
	public void addUser(User user, Ownership owntype) {
		UserItem useritem = new UserItem(user, this, null, owntype);
		useritems.add(useritem);
		user.getItems().add(useritem);
	}
	
	public void removeUser(Integer id) {
		UserItem useritem = this.useritems.stream().filter(u -> u.getItem().getId() == id).findFirst().orElse(null);
		if (useritem != null) {
			this.useritems.remove(useritem);
			useritem.getUser().getItems().remove(useritem);
			useritem.setItem(null);
			useritem.setUser(null);
		}
	}
	
	@PostUpdate
	public void updateNotification() {
		
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getTitle() {
		return title;
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
		return "Item [id=" + id + ", name=" + title + ", description=" + description + ", location=" + location
				+ ", request=" + request + "]";
	}
	
	
	
}
