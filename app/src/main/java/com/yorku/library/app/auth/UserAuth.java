package com.yorku.library.app.auth;

public class UserAuth {
	private UserAuth instance;
	private volatile Object lock = new Object();
	private UserAuth() {
		
	}
	
	public static UserAuth getInstance() {
		if(instance == null)
			return new UserAuth();
		return instance;
	}
}
