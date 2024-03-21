package com.yorku.library.app.services.requests;

import java.util.List;

import com.yorku.library.app.dtos.*;

public interface RequestService {
	String signup(String username, String email, String password);
	User login(String email, String password);
	void logout();
	List<Item> searchItemsByTitle(String title, String category);
	List<Item> searchItemsByTitle(String title);
	List<Item> getUserItems(User user);
	Notification makeBookRequest(User, user);
	List<Course> getUserCourses(User user);
	
}
