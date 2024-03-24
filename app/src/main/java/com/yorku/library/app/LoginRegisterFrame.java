package com.yorku.library.app;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LoginRegisterFrame extends JFrame {
	public static final String LOGIN_PANEL = "Login";
	public static final String REGISTER_PANEL = "Register";
	private final int FRAME_HEIGHT = 700;
	private final int FRAME_WIDTH = 900;
	private LoginPanel login;
	private RegisterPanel register;
	private JPanel contentPanel;
	private JMenuBar loginToReg;
	
	public LoginRegisterFrame(LoginPanel login, RegisterPanel register) {
		this.login = login;
		this.register = register;
		
		contentPanel = new JPanel(new CardLayout());
		contentPanel.add(login, LOGIN_PANEL);
		contentPanel.add(register, REGISTER_PANEL);
	
		loginToReg = new JMenuBar();
		JMenu menu = new JMenu("Login/Register");
		JMenuItem loginOption = new JMenuItem(LOGIN_PANEL);
		JMenuItem registerOption = new JMenuItem(REGISTER_PANEL);
		loginOption.addActionListener(e -> changePanel(LOGIN_PANEL));
		registerOption.addActionListener(e -> changePanel(REGISTER_PANEL));
		menu.add(loginOption);
		menu.add(registerOption);
		loginToReg.add(menu);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("YorkU Library");
		setBounds(100, 100, 700, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(loginToReg);
		add(contentPanel);
	}
	
	private void changePanel(String panelName) {
		((CardLayout) contentPanel.getLayout()).show(contentPanel, panelName);
	}
}
