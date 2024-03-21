package com.yorku.library.app.dtos;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;

@Getter
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS,include=JsonTypeInfo.As.PROPERTY,property="@class")
public abstract class Item {
	private Integer id;
	private String name;
	private String description;
	private String location;
	
	public Item(Integer id, String name, String description, String location) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.location = location;
	}
}
