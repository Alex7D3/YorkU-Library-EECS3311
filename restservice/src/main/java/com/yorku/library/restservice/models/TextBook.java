package com.yorku.library.restservice.models;

import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("textbook")
public class TextBook extends Item {

	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	public TextBook(Integer id, String name, String description, String location, Set<User> users, Request request,
			Course course) {
		super(id, name, description, location, users, request);
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
