package com.yorku.library.restservice.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Embeddable
@EqualsAndHashCode
public class UserItemPrimaryKey implements Serializable {
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "item_id")
	private Integer itemId;
	
}
