package com.yorku.library.app.services.requests;

import java.util.List;
import java.util.concurrent.CompletableFuture;

//import com.yorku.library.app.auth.UserAuth;

public interface RequestService {
	CompletableFuture<String> getRequest(String path);
	CompletableFuture<String> postRequest(String path);
	CompletableFuture<String> postRequest(String body, String path);
	CompletableFuture<String> putRequest(String path);
	CompletableFuture<String> putRequest(String body, String path);
	CompletableFuture<String> deleteRequest(String path);
}
