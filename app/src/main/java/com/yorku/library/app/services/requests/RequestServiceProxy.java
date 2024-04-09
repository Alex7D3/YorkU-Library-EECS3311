package com.yorku.library.app.services.requests;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class RequestServiceProxy implements RequestService {
	class CacheEntry {
		private final String response;
		private final long expiryTimeMillis;

		public CacheEntry(String response, Duration cacheDuration) {
			this.response = response;
			this.expiryTimeMillis = System.currentTimeMillis() + cacheDuration.toMillis();
		}

		public String getResponse() {
			return response;
		}

		public boolean isExpired(long currentTimeMillis) {
			return currentTimeMillis >= expiryTimeMillis;
		}
	}

	private RequestService realService;
	private Map<String, CacheEntry> cache;
	private ScheduledExecutorService scheduler;
	private static final Duration expiryTime = Duration.ofMinutes(1);
	private void cleanupExpiredEntries() {
		System.out.println("cache clear: " + new Date().getTime());
		long currentTimeMillis = System.currentTimeMillis();
		cache.entrySet().removeIf(entry -> entry.getValue().isExpired(currentTimeMillis));
	}
	public RequestServiceProxy(RequestService realService, ScheduledExecutorService scheduler) {
		this.realService = realService;
		this.cache = new ConcurrentHashMap<>();
		this.scheduler = scheduler;

		scheduler.scheduleAtFixedRate(this::cleanupExpiredEntries, 1, 1, TimeUnit.MINUTES);
	}

	@Override
	public CompletableFuture<String> getRequest(String path) {
		if(cache.containsKey(path))
			return CompletableFuture.supplyAsync(cache.get(path)::getResponse);
        return realService.getRequest(path)
				.thenApply(responseStr -> {
					cache.put(path, new CacheEntry(responseStr, expiryTime));
					return responseStr;
				});
	}

	@Override
	public CompletableFuture<String> postRequest(String path) {
		return realService.postRequest(path);
	}

	@Override
	public CompletableFuture<String> postRequest(String body, String path) {
		return realService.postRequest(body, path);
	}

	@Override
	public CompletableFuture<String> putRequest(String path) {
		return realService.putRequest(path);
	}

	@Override
	public CompletableFuture<String> putRequest(String body, String path) {
		return realService.putRequest(body, path);
	}

	@Override
	public CompletableFuture<String> deleteRequest(String path) {
		return realService.deleteRequest(path);
	}
}
