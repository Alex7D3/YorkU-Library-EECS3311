package com.yorku.library.restservice.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String courseTitle;
	private String courseCode;
	private Date endDate;
	//change to textbook when inheritance setup
	@OneToMany(mappedBy="course")
	private Set<Item> textbooks = new HashSet<>();
	
	@ManyToMany(mappedBy="courses", fetch = FetchType.LAZY)
	private Set<User> users = new HashSet<>();

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseTitle=" + courseTitle + ", courseCode=" + courseCode + ", endDate="
				+ endDate + ", textbooks=" + textbooks + "]";
	}
	
}
