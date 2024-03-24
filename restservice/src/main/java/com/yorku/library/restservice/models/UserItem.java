package com.yorku.library.restservice.models;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;




@Entity
@Table(name = "useritems")
public class UserItem {
	
	@EmbeddedId
	private UserItemPrimaryKey pk;
	
	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@MapsId("itemId")
	@JoinColumn(name = "item_id")
	private Item item;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;
	
	@Enumerated(EnumType.ORDINAL)
	private Ownership owntype;

	public UserItem() {
		
	}
	
	public UserItem(User user, Item item, Date timestamp, Ownership owntype) {
		this.user = user;
		this.item = item;
		this.timestamp = timestamp;
		this.owntype = owntype;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Ownership getOwntype() {
		return owntype;
	}

	public void setOwntype(Ownership owntype) {
		this.owntype = owntype;
	}

	public User getUser() {
		return user;
	}

	public Item getItem() {
		return item;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
