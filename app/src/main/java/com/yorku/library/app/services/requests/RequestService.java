package com.yorku.library.app.services.requests;

import java.util.List;

import com.yorku.library.app.auth.UserAuth;

public interface RequestService {
	String getRequest(String path);
	String postRequest(String path);
	String postRequest(String body, String path);
	String putRequest(String path);
	String putRequest(String body, String path);
	String deleteRequest(String path);
}
