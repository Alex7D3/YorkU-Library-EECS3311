package com.yorku.library.app.services.requests;
import java.net.http.HttpClient;

import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.yorku.library.app.auth.UserAuth;
import com.yorku.library.app.dtos.Course;
import com.yorku.library.app.dtos.Item;
import com.yorku.library.app.dtos.User;
import java.io.IOException;	

public class RequestServiceImpl implements RequestService {
	
	private HttpClient client;
	private String host = "https://localhost:8080/";	//change in production
	
	private URI createURI(String host, String... path) {
		try {
			return new URI(host + String.join("/", path));
		} catch(URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private HttpResponse<String> sendRequest(HttpRequest request, HttpResponse.BodyHandler<String> handler) {
		int count = 0;
		int maxTries = 3;
		HttpResponse<String> response = null;
		for(;;) {
			try {
				response = client.send(request, handler);
				return response;
			} catch(InterruptedException e) {
				if(++count > maxTries) {
					e.printStackTrace();
					break;
				}
				continue;
			} catch(Exception e) {
				System.out.println(response.statusCode());
			}
		}
		return null;
	}
	

	public String signup(String username, String email, String pw) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, "user", username, email, pw))
				.GET()
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}

	public User login(String username, String password) {
		
		return null;
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public List<Item> searchItemsByTitle(String title, String category) {
		
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

	public Notification makeBookRequest(UserAuth auth) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getUserCourses(UserAuth auth) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
