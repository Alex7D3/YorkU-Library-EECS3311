package com.yorku.library.restservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String pw;
	private String email;
	
	public User(String name, String pw, String email) {
		username = name;
		this.pw = pw;
		this.email = email;
	}
	
	public User(Integer id, String name, String pw, String email) {
		this.id = id;
		username = name;
		this.pw = pw;
		this.email = email;
	}
	
	public User() {
		
	}
	
	public int getUserID() {
		return id;
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
		return "User [userID=" + id + ", username=" + username + ", pw=" + pw + ", email=" + email + "]";
	}
	
	
	
}
