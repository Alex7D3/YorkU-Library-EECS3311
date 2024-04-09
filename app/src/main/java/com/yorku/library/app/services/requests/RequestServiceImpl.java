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

//import com.yorku.library.app.auth.UserAuth;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class RequestServiceImpl implements RequestService {
	private static HttpClient client;
	private String host = "http://localhost:8080/";	//change in production

	public RequestServiceImpl(HttpClient client) {
		this.client = client;
	}

	private URI createURI(String host, String path) {
		try {
			return new URI(host + path);
		} catch(URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private CompletableFuture<String> sendRequest(HttpRequest request, HttpResponse.BodyHandler<String> handler) {
		int count = 0;
		int maxTries = 3;
		CompletableFuture<HttpResponse<String>> response = null;
		for(;;) {
			try {
				response = client.sendAsync(request, handler);
				return response.thenApply(HttpResponse::body);
			} catch(Exception e) {
				if (++count > maxTries) {
					e.printStackTrace();
					break;
				}
			}
		}
		return null;
	}
	

	public CompletableFuture<String> getRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.GET()
				.build();
		return sendRequest(request, HttpResponse.BodyHandlers.ofString());

	}
	
	public CompletableFuture<String> postRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.POST(BodyPublishers.noBody())
				.build();
		return sendRequest(request, HttpResponse.BodyHandlers.ofString());
	}
	
	public CompletableFuture<String> postRequest(String body, String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.POST(BodyPublishers.ofString(body))
				.build();
		return sendRequest(request, HttpResponse.BodyHandlers.ofString());
	}
	
	public CompletableFuture<String> putRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.PUT(BodyPublishers.noBody())
				.build();
		return sendRequest(request, HttpResponse.BodyHandlers.ofString());
	}
	
	public CompletableFuture<String> putRequest(String body, String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.POST(BodyPublishers.ofString(body))
				.build();
		return sendRequest(request, HttpResponse.BodyHandlers.ofString());
	}
	
	public CompletableFuture<String> deleteRequest(String path) {
		HttpRequest request = HttpRequest
				.newBuilder(createURI(host, path))
				.DELETE()
				.build();
		return sendRequest(request, HttpResponse.BodyHandlers.ofString());
	}

}
