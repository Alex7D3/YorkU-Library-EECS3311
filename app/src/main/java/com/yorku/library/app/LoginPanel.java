package com.yorku.library.app;

import java.awt.EventQueue;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.yorku.library.app.services.gui.utils.RoundedBorder;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {

	private JTextField tfEmail;
	private JPasswordField passwordField;


	/**
	 * Create the application.
	 */
	public LoginPanel() {
		setForeground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblMemberLogin = new JLabel("Member Login");
		lblMemberLogin.setFont(new Font("Didot", Font.BOLD, 18));
		lblMemberLogin.setBounds(485, 178, 132, 22);
		add(lblMemberLogin);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(new Color(0, 0, 0));
		tfEmail.setBounds(458, 240, 186, 40);
		add(tfEmail);
		tfEmail.setColumns(10);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(458, 292, 186, 40);
		add(passwordField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Didot", Font.PLAIN, 13));
		lblEmail.setBounds(462, 225, 61, 16);
		add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Didot", Font.PLAIN, 13));
		lblPassword.setBounds(462, 279, 61, 16);
		add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBorder(new RoundedBorder(10));
		btnLogin.setForeground(SystemColor.menu);
		btnLogin.setBackground(new Color(50, 205, 50));
		btnLogin.setOpaque(true);
		btnLogin.setBounds(485, 344, 117, 29);
		add(btnLogin);
		
		JLabel lblBookImage = new JLabel("");
		lblBookImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookImage.setIcon(new ImageIcon(LoginPanel.class.getResource("/images/book.png")));
		lblBookImage.setBounds(54, 124, 338, 305);
		add(lblBookImage);
		lblBookImage.setOpaque(true);
		
		JLabel lblYorkUniversityLibrary = new JLabel("York University Library");
		lblYorkUniversityLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblYorkUniversityLibrary.setFont(new Font("Didot", Font.BOLD, 50));
		lblYorkUniversityLibrary.setBounds(33, 27, 636, 61);
		add(lblYorkUniversityLibrary);
		
		
	}

	
}
