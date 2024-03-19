package com.yorku.library.restservice.services;

import org.springframework.stereotype.Service;
import com.yorku.library.restservice.utils.Observer;
import java.util.List;
import java.util.ArrayList;

@Service
public class NotificationPublisher<T> {
	private List<Observer<T>> observers = new ArrayList<>();
	
	public void subscribe(Observer<T> observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(Observer<T> observer) {
		observers.remove(observer);
	}
	
	protected void notifyObservers(T update) {
		observers.forEach(observer -> observer.update(update));
	}
}
