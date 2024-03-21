package com.yorku.library.app.dtos;


import lombok.Getter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Getter
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS,include=JsonTypeInfo.As.PROPERTY,property="@class")
public abstract class User {
	private int id;
	private String username;
	private String email;
	
	public User(int id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}
}
