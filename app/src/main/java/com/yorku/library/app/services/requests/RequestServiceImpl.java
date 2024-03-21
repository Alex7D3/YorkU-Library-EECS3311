package com.yorku.library.app.services.requests;
import java.net.http.HttpClient;
import java.net.HttpCookie;
import java.net.http.HttpResponse;
import java.util.List;

import com.yorku.library.app.dtos.Course;
import com.yorku.library.app.dtos.Item;
import com.yorku.library.app.dtos.User;

import java.net.http.HttpRequest;

public class RequestServiceImpl implements RequestService {
	
	private HttpClient client;
	
	public RequestServiceImpl(HttpClient client) {
		this.client = client;
	}

	public String signup(String username, String email, String password) {
		try {
			
		} catch(Exception e) {
			
		}
	}

	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public List<Item> searchItemsByTitle(String title, String category) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> searchItemsByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> getUserItems(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Notification makeBookRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getUserCourses(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
