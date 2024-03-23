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
	private Set<TextBook> textbooks = new HashSet<>();
	
	@ManyToMany(mappedBy="courses", fetch = FetchType.LAZY)
	private Set<User> users = new HashSet<>();
	
	public void addUser(User user) {
		this.users.add(user);
		user.getCourses().add(this);
	}
	
	public void removeUser(Integer id) {
		User user = this.users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		if (user != null) {
			this.users.remove(user);
			user.getCourses().remove(this);
		}
	}
	
	public void addBook(TextBook book) {
		this.textbooks.add(book);
		book.setCourse(this);
	}
	
	public void removeBook(Integer id) {
		TextBook book = this.textbooks.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		if (book != null) {
			this.textbooks.remove(book);
			book.setCourse(null);
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<TextBook> getTextbooks() {
		return textbooks;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseTitle=" + courseTitle + ", courseCode=" + courseCode + ", endDate="
				+ endDate + ", textbooks=" + textbooks + "]";
	}
	
}
