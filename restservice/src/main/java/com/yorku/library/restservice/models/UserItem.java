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
	
	
}