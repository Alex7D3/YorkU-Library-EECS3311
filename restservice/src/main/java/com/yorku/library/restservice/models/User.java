package com.yorku.library.restservice.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="user")
	private Set<Request> requests;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_items",
			joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id")
			)
	private Set<Item> items = new HashSet<>();
	
	public User(String name, String pw, String email) {
		this.username = name;
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
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<Item> getItems() {
		return items;
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
		return "User [id=" + id + ", username=" + username + ", pw=" + pw + ", email=" + email + ", items=" + items
				+ "]";
	}
	
	
	
	
}
