package com.yorku.library.app;

import java.awt.*;
import javax.swing.*;

import com.yorku.library.app.LoginPage.RoundedBorder;
public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage window = new RegisterPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Email");
	    lblUsername.setBounds(454, 88, 100, 30);
	    frame.getContentPane().add(lblUsername);

	    JTextField txtEmail = new JTextField();
	    txtEmail.setBounds(454, 117, 200, 30);
	    frame.getContentPane().add(txtEmail);

	    JLabel lblPassword = new JLabel("Password");
	    lblPassword.setBounds(454, 147, 100, 30);
	    frame.getContentPane().add(lblPassword);

	    JPasswordField txtPassword = new JPasswordField();
	    txtPassword.setBounds(454, 177, 200, 30);
	    frame.getContentPane().add(txtPassword);
	    
	    JLabel lblRegister = new JLabel("REGISTER");
	    lblRegister.setFont(new Font("Lucida Grande", Font.BOLD, 18));
	    lblRegister.setBounds(466, 48, 200, 16);
	    frame.getContentPane().add(lblRegister);
	    lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    
	    JLabel lblUserType = new JLabel("User Type:");
	    lblUserType.setFont(new Font("Lucida Grande", Font.BOLD, 13));
	    lblUserType.setBounds(454, 288, 200, 16);
	    frame.getContentPane().add(lblUserType);
	    lblUserType.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    JRadioButton rdbtnStudent = new JRadioButton("Student");
	    rdbtnStudent.setBounds(454, 318, 141, 23);
	    frame.getContentPane().add(rdbtnStudent);
	    
	    JRadioButton rdbtnNonStaffFaculty = new JRadioButton("Non-Staff Faculty");
	    rdbtnNonStaffFaculty.setBounds(454, 353, 200, 23);
	    frame.getContentPane().add(rdbtnNonStaffFaculty);
	    
	    JRadioButton rdbtnFaculty = new JRadioButton("Faculty");
	    rdbtnFaculty.setBounds(454, 388, 141, 23);
	    frame.getContentPane().add(rdbtnFaculty);
	    
	    JRadioButton rdbtnVisitor = new JRadioButton("Visitor");
	    rdbtnVisitor.setBounds(454, 423, 141, 23);
	    frame.getContentPane().add(rdbtnVisitor);
	    
	    //Only one radio button can be pressed
	    ButtonGroup userTypeGroup = new ButtonGroup();
        userTypeGroup.add(rdbtnStudent);
        userTypeGroup.add(rdbtnNonStaffFaculty);
        userTypeGroup.add(rdbtnFaculty);
        userTypeGroup.add(rdbtnVisitor);
        
        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setBounds(454, 208, 200, 30);
        frame.getContentPane().add(lblConfirmPassword);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(454, 238, 200, 30);
        frame.getContentPane().add(passwordField);
        
        JButton btnRegister = new JButton("Register");
		btnRegister.setBorder(new RoundedBorder(10));
		btnRegister.setForeground(SystemColor.menu);
		btnRegister.setBackground(new Color(50, 205, 50));
		btnRegister.setOpaque(true);
		btnRegister.setBounds(491, 470, 117, 29);
		frame.getContentPane().add(btnRegister);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.blue);
		btnLogin.setBorder(null);
		btnLogin.setBounds(626, 505, 40, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblHaveAccount = new JLabel("Already have an account?");
		lblHaveAccount.setBounds(466, 511, 169, 16);
		frame.getContentPane().add(lblHaveAccount);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -13, 427, 570);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(-344, 6, 1597, 980);
		lblBackground.setIcon(new ImageIcon(RegisterPage.class.getResource("/images/redwhite.jpeg")));
		panel.add(lblBackground);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(129, 147, 1, 1);
		panel.add(layeredPane);
		
		JLabel lblRegister_1_1 = new JLabel("York University Library");
		lblRegister_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblRegister_1_1.setBounds(454, 6, 227, 30);
		frame.getContentPane().add(lblRegister_1_1);
	
	}
}