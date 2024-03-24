package com.yorku.library.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import com.yorku.library.app.auth.UserAuth;

public class App {
	private static UserAuth auth;
	private static AppFrame app;
	private static HomePanel home;
	private static SearchPanel search;
	private static CartPanel cart;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {	
			home = new HomePanel();
			search = new SearchPanel();
			cart = new CartPanel();
			app = new AppFrame(home, search, cart);
			app.setVisible(true);
		});
	}
	
	private void initApp() {
		home = new HomePanel();
		search = new SearchPanel();
		cart = new CartPanel();
		app = new AppFrame(home, search, cart);
		app.setVisible(true);
	}
	

}
