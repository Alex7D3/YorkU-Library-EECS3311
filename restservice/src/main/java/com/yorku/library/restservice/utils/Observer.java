package com.yorku.library.restservice.utils;

public interface Observer<T> {
	void update(T subject);
}