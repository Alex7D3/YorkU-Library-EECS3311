package com.yorku.library.restservice.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;



@Embeddable
public class UserItemPrimaryKey implements Serializable {
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "item_id")
	private Integer itemId;
	
	public UserItemPrimaryKey() {
		
	}
	
	public UserItemPrimaryKey(Integer itemid, Integer userid) {
		this.userId = userid;
		this.itemId = itemid;
	}
	
}
