package com.yorku.library.restservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	private Integer userID;
	private String username;
	private String pw;
	private String email;
	
	public int getUserID() {
		return userID;
	}
	public String getUsername() {
		return username;
	}
	public String getPw() {
		return pw;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", pw=" + pw + ", email=" + email + "]";
	}
	
	
	
}
