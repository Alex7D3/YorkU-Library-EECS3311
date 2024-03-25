package com.yorku.library.restservice.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private String location;
	private int stock;
	
	@Lob
	@Column(name="image", columnDefinition="LONGBLOB")
	private byte[] image;
	
	@Column(name="type", insertable = false, updatable = false)
	private String itemType;
	
	@OneToOne(mappedBy="item", cascade=CascadeType.ALL)
	private Request request;
	
	@OneToMany(mappedBy = "item")
	private Set<UserItem> useritems = new HashSet<UserItem>();
	
	public Item() {
		
	}
	
	public Item(String title, String description, String location, byte[] image) {
		this.title = title;
		this.description = description;
		this.location = location;
		this.image = image;
		this.stock = 20;
	}
	
	public void addUser(User user, Ownership owntype, Date date) throws Exception{
		if (stock < 1) {
			throw new Exception("Out Of Stock");
		}
		UserItem useritem = new UserItem(user, this, date, owntype);
		useritems.add(useritem);
		user.getItems().add(useritem);
		this.stock--;
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
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getItemType() {
		return itemType;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + title + ", description=" + description + ", location=" + location
				+ ", request=" + request + "]";
	}

}
