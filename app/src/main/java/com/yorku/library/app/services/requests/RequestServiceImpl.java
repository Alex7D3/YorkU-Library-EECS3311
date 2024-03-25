package com.yorku.library.app.services.requests;
import java.net.http.HttpClient;

import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.yorku.library.app.auth.UserAuth;
import java.io.IOException;	

public class RequestServiceImpl implements RequestService {
	private HttpClient client;
	private String host = "https://localhost:8080/";	//change in production
	
	private URI createURI(String host, String path) {
		try {
			return new URI(host + path);
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
	

	public String getRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.GET()
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}
	
	public String postRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.POST(BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}
	
	public String postRequest(String body, String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.POST(BodyPublishers.ofString(body))
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}
	
	public String putRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.PUT(BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}
	
	public String putRequest(String body, String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.POST(BodyPublishers.ofString(body))
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}
	
	public String deleteRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.DELETE()
				.build();
		HttpResponse<String> response = sendRequest(request, null);
		return response.body();
	}

}
