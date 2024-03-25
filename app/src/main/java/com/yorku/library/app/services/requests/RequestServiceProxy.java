package com.yorku.library.app.services.requests;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RequestServiceProxy implements RequestService {
	private RequestService realService;
	private ConcurrentMap<String, String> cache;
	
	public RequestServiceProxy(RequestService realService) {
		this.realService = realService;
		this.cache = new ConcurrentHashMap<>();
	}


	@Override
	public String getRequest(String path) {
		if(cache.containsKey(path))
			return cache.get(path);
		return realService.getRequest(path);
	}
	
	@Override
	public String postRequest(String path) {
		return realService.postRequest(path);
	}

	@Override
	public String postRequest(String body, String path) {
		return realService.postRequest(body, path);
	}

	@Override
	public String putRequest(String path) {
		return realService.putRequest(path);
	}

	@Override
	public String putRequest(String body, String path) {
		return realService.putRequest(body, path);
	}

	@Override
	public String deleteRequest(String path) {
		return realService.putRequest(path);
	}}
