package com.yorku.library.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.yorku.library.app.auth.UserAuth;

public class App {
	private static UserAuth auth;
	private static AppFrame app;
	private static HomePanel home;
	private static SearchPanel search;
	private static CartPanel cart;
	private static LoginPanel login;
	private static RegisterPanel register;
	private static LoginRegisterFrame loginRegister;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {	
			initLogin();
			initApp();
		});
	}
	
	private static void initApp() {
		home = new HomePanel();
		search = new SearchPanel();
		cart = new CartPanel();
		app = new AppFrame(home, search, cart);
		app.setVisible(true);
	}
	
	private static void initLogin() {
		login = new LoginPanel();
		register = new RegisterPanel();
		loginRegister = new LoginRegisterFrame(login, register);
		loginRegister.setVisible(true);
	}
	
//	private static void loadItems(List<ItemComponent> items) {
//		DefaultTableModel tblModel = new DefaultTableModel() {
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				return false;
//			}
//			
//		};
//	}
	

}
