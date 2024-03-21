package com.yorku.library.restservice.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
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
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "coursebooks",
			joinColumns = @JoinColumn(name="course_id", referencedColumnName="id"),
			inverseJoinColumns = @JoinColumn(name="user_id", referencedColumnName="id")
			)
	private Set<Course> courses = new HashSet<>();
	
	public User() {
		
	}
	
	public User(Integer id, String username, String pw, String email, Set<Item> items, Set<Request> requests) {
		super();
		this.id = id;
		this.username = username;
		this.pw = pw;
		this.email = email;
		this.items = items;
		this.requests = requests;
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

	public Integer getId() {
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

	public Set<Request> getRequests() {
		return requests;
	}

	public Set<Item> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pw=" + pw + ", email=" + email + ", requests="
				+ requests + ", items=" + items + "]";
	}
	
}
