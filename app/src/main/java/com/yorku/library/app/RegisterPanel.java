package com.yorku.library.app;

import java.awt.*;
import javax.swing.*;

import com.yorku.library.app.services.gui.utils.RoundedBorder;
public class RegisterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JRadioButton studentBtn;
	private JRadioButton facultyBtn;
	private JRadioButton staffBtn;
	private JRadioButton visitorBtn;
	
	public RegisterPanel() {
		setLayout(null);
		
		JLabel lblUsername = new JLabel("Email");
	    lblUsername.setBounds(454, 88, 100, 30);
	    add(lblUsername);

	    JTextField txtEmail = new JTextField();
	    txtEmail.setBounds(454, 117, 200, 30);
	    add(txtEmail);

	    JLabel lblPassword = new JLabel("Password");
	    lblPassword.setBounds(454, 147, 100, 30);
	    add(lblPassword);

	    JPasswordField txtPassword = new JPasswordField();
	    txtPassword.setBounds(454, 177, 200, 30);
	    add(txtPassword);
	    
	    JLabel lblRegister = new JLabel("REGISTER");
	    lblRegister.setFont(new Font("Lucida Grande", Font.BOLD, 18));
	    lblRegister.setBounds(466, 48, 200, 16);
	    add(lblRegister);
	    lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    
	    JLabel lblUserType = new JLabel("User Type:");
	    lblUserType.setFont(new Font("Lucida Grande", Font.BOLD, 13));
	    lblUserType.setBounds(454, 288, 200, 16);
	    add(lblUserType);
	    lblUserType.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    studentBtn = new JRadioButton("Student");
	    studentBtn.setBounds(454, 318, 141, 23);
	    add(studentBtn);
	    
	    facultyBtn = new JRadioButton("Non-Staff Faculty");
	    facultyBtn.setBounds(454, 353, 200, 23);
	    add(facultyBtn);
	    
	    staffBtn = new JRadioButton("Staff");
	    staffBtn.setBounds(454, 388, 141, 23);
	    add(staffBtn);
	    
	    visitorBtn = new JRadioButton("Visitor");
	    visitorBtn.setBounds(454, 423, 141, 23);
	    add(visitorBtn);
	    
	    //Only one radio button can be pressed
	    ButtonGroup userTypeGroup = new ButtonGroup();
        userTypeGroup.add(staffBtn);
        userTypeGroup.add(staffBtn);
        userTypeGroup.add(staffBtn);
        userTypeGroup.add(visitorBtn);
        
        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setBounds(454, 208, 200, 30);
        add(lblConfirmPassword);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(454, 238, 200, 30);
        add(passwordField);
        
        JButton btnRegister = new JButton("Register");
		btnRegister.setBorder(new RoundedBorder(10));
		btnRegister.setForeground(SystemColor.menu);
		btnRegister.setBackground(new Color(50, 205, 50));
		btnRegister.setOpaque(true);
		btnRegister.setBounds(491, 470, 117, 29);
		add(btnRegister);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -13, 427, 570);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(-344, 6, 1597, 980);
		lblBackground.setIcon(new ImageIcon(RegisterPanel.class.getResource("/images/redwhite.jpeg")));
		panel.add(lblBackground);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(129, 147, 1, 1);
		panel.add(layeredPane);
		
		JLabel lblRegister_1_1 = new JLabel("York University Library");
		lblRegister_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblRegister_1_1.setBounds(454, 6, 227, 30);
		add(lblRegister_1_1);
	}

}