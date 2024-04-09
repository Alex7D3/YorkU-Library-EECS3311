package com.yorku.library.app.auth;

import java.util.HashMap;
import java.util.Map;

public class UserAuth {
    private static volatile UserAuth instance;
    private static final Object lock = new Object();
    private String username;
    private String email;
    private String role;

    private UserAuth() {}

    public static UserAuth getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new UserAuth();
                }
            }
        }
        return instance;
    }

    public synchronized void setAuthData(String username, String email, String role) {
        this.username = username;
        this.role = role;
        this.email = email;
    }

    public synchronized String getUsername() {
        return username;
    }

    public synchronized String getEmail() {
        return email;
    }

    public synchronized String getRole() {
        return role;
    }
    public synchronized void clearAuthData() {
        this.username = null;
        this.email = null;
        this.role = null;
    }
}

