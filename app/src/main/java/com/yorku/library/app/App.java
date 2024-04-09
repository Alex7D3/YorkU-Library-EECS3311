package com.yorku.library.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

//import com.yorku.library.app.auth.UserAuth;
import com.yorku.library.app.services.requests.RequestServiceProxy;

public class App {
	//private UserAuth auth;
	private static RequestServiceProxy reqService;
	private static AppFrame app;

	private static LoginPanel login;
	private static RegisterPanel register;
	private static LoginRegisterFrame loginRegister;
	private static CourseListPanel course;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {	
			initLogin();
			initApp();
		});
	}
	
	private static void initApp() {

		course = new CourseListPanel();
		app = new AppFrame(reqService);
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
