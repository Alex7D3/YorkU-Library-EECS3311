package com.yorku.library.restservice.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	private boolean verified;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy="user", fetch = FetchType.EAGER)
	private Set<Request> requests;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Set<UserItem> useritems = new HashSet<UserItem>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_courses",
			joinColumns = @JoinColumn(name="user_id", referencedColumnName="id"),
			inverseJoinColumns = @JoinColumn(name="course_id", referencedColumnName="id")
			)
	private Set<Course> courses = new HashSet<>();
	
    
	
	public User() {
		
	}
	
	public User(String username, String pw, String email, Role role) {
		super();
		this.username = username;
		this.pw = pw;
		this.email = email;
		this.role = role;
		this.verified = false;
	}

	public void addRequest(Request req) {
		this.requests.add(req);
		req.setUser(this);
	}
	
	public void removeRequest(Integer id) {
		Request request = this.requests.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		if (request != null) {
			this.requests.remove(request);
			request.setUser(null);
		}
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String pw) {
		this.pw = pw;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return role;
	}

	public Integer getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}

	public Set<Request> getRequests() {
		return requests;
	}

	public Set<UserItem> getItems() {
		return useritems;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}

	public String getUsername() {
		return username;
	}
	
	
	public String getPassword() {
		return pw;
	}
	
	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pw=" + pw + ", email=" + email + ", requests="
				+ requests + ", items=" + useritems + "]";
	}

	

	
}
