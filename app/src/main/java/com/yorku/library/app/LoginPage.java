package com.yorku.library.app;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.*;

public class LoginPage {

	private JFrame frame;
	private JTextField tfEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	// To make rounded components
	private static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }
	    
	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMemberLogin = new JLabel("Member Login");
		lblMemberLogin.setFont(new Font("Didot", Font.BOLD, 18));
		lblMemberLogin.setBounds(485, 178, 132, 22);
		frame.getContentPane().add(lblMemberLogin);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(new Color(0, 0, 0));
		tfEmail.setBounds(458, 240, 186, 40);
		frame.getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(458, 292, 186, 40);
		frame.getContentPane().add(passwordField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Didot", Font.PLAIN, 13));
		lblEmail.setBounds(462, 225, 61, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Didot", Font.PLAIN, 13));
		lblPassword.setBounds(462, 279, 61, 16);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorder(new RoundedBorder(10));
		btnLogin.setForeground(SystemColor.menu);
		btnLogin.setBackground(new Color(50, 205, 50));
		btnLogin.setOpaque(true);
		btnLogin.setBounds(485, 344, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblBookImage = new JLabel("");
		lblBookImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookImage.setIcon(new ImageIcon(LoginPage.class.getResource("/images/book.png")));
		lblBookImage.setBounds(54, 124, 338, 305);
		frame.getContentPane().add(lblBookImage);
		lblBookImage.setOpaque(true);
		
		JLabel lblYorkUniversityLibrary = new JLabel("York University Library");
		lblYorkUniversityLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblYorkUniversityLibrary.setFont(new Font("Didot", Font.BOLD, 50));
		lblYorkUniversityLibrary.setBounds(33, 27, 636, 61);
		frame.getContentPane().add(lblYorkUniversityLibrary);
		
		
	}
}
