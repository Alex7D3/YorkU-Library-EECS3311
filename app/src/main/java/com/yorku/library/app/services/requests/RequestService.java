package com.yorku.library.app.services.requests;

import java.util.List;

import com.yorku.library.app.auth.UserAuth;
import com.yorku.library.app.dtos.*;

public interface RequestService {
	String signup(String username, String email, String password);
	User login(String email, String password);
	void logout();
	List<Item> searchItemsByTitle(String title, String category);
	List<Item> searchItemsByTitle(String title);
	List<Item> getUserItems(UserAuth auth);
	Notification makeBookRequest(UserAuth auth);
	List<Course> getUserCourses(UserAuth auth);
	
}
