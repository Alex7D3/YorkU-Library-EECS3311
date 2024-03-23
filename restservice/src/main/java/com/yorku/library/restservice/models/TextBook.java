package com.yorku.library.restservice.models;


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
	
	public TextBook(String name, String description, String location, byte[] image, Course course) {
		super(name, description, location, image);
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
