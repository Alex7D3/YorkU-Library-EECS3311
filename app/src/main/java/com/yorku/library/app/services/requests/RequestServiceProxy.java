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
	
	private String cacheRequest(Function<>) {
		
	}
}
