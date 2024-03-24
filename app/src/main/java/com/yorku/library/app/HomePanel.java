package com.yorku.library.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class HomePanel extends JPanel {

	private JTextField txtSearchForBooks;
	private DefaultListModel<ListItems> rentedModel;
	private DefaultListModel<String> courseModel;

	/**
	 * Create the application.
	 */
	public HomePanel() {
		// Load the original image icon
		setLayout(null);
        
        
        ImageIcon originalIcon = new ImageIcon(HomePanel.class.getResource("/images/61088.png"));
        ImageIcon bookIcon = new ImageIcon(HomePanel.class.getResource("/images/bookplaceholder.png"));
        ImageIcon yorkIcon = new ImageIcon(HomePanel.class.getResource("/images/yorku.png"));

        
        // Resize the image
        Image image = originalIcon.getImage(); 
        Image image2 = bookIcon.getImage();
        Image york = yorkIcon.getImage();

        Image newimg = image.getScaledInstance(20, 20,  Image.SCALE_SMOOTH); 
        Image newbook = image.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        Image yorkNew = york.getScaledInstance(80, 80, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(newimg); 
        ImageIcon resizedBook = new ImageIcon(newbook);
        ImageIcon resizedYork = new ImageIcon(yorkNew);
        
        txtSearchForBooks = new JTextField();
        txtSearchForBooks.setText("Search for books, textbooks, DVDs...");
        
        add(txtSearchForBooks);
        txtSearchForBooks.setColumns(10);
        
     
        
        JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(6, 0, 888, 154);
		
		JLabel YorkU = new JLabel("");
		YorkU.setIcon(resizedYork);
		YorkU.setBounds(27, 16, 80, 80);
		add(YorkU);
		
		JLabel lblYorkUniversityLibrary = new JLabel("York University Library");
		lblYorkUniversityLibrary.setBounds(119, 23, 165, 48);
		add(lblYorkUniversityLibrary);
        
		JPanel redpanel = new JPanel();
		redpanel.setBackground(new Color(241, 71, 83));
		redpanel.setBounds(6, -8, 888, 132);
		add(redpanel);
		redpanel.setLayout(null);
		
		JLabel bookPlaceholder1_1 = new JLabel("");
		bookPlaceholder1_1.setBounds(374, 18, 0, 0);
		
		redpanel.add(bookPlaceholder1_1);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 49, 59));
		panel.setBounds(6, 124, 888, 35);
		add(panel);
		
		
		// User's rented books
		rentedModel = new DefaultListModel<>();
		JList<ListItems> rentedList = new JList<>(rentedModel);
	    rentedList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    rentedList.setLayoutOrientation(JList.VERTICAL_WRAP);
	    rentedList.setFixedCellHeight(100); 
        rentedList.setFixedCellWidth(178); 
        
        ItemPainter painter = new ItemPainter();
        rentedList.setCellRenderer(painter);
        
        //sample
        rentedModel.addElement(new ListItems("No Longer Human", new ImageIcon(HomePanel.class.getResource("/images/NoLongerHuman.jpeg"))));
        rentedModel.addElement(new ListItems("No Longer Human", new ImageIcon(HomePanel.class.getResource("/images/NoLongerHuman.jpeg"))));
        rentedModel.addElement(new ListItems("No Longer Human", new ImageIcon(HomePanel.class.getResource("/images/NoLongerHuman.jpeg"))));

	    
		
		JScrollPane spRentedBooks = new JScrollPane(rentedList);
		spRentedBooks.setBounds(6, 200, 183, 516);
		add(spRentedBooks);
		
		courseModel = new DefaultListModel<>();
		JList<String> courseList = new JList<>(courseModel);
		courseList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		courseModel.addElement("EECS3000");
		courseModel.addElement("EECS3311");
		courseModel.addElement("EECS2021");

		JScrollPane spCourse = new JScrollPane();
		spCourse.setRowHeaderView(courseList); // Set the viewport view to the courseList
		spCourse.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		spCourse.setBounds(776, 200, 101, 162); // Adjust bounds as needed
		add(spCourse); 
		
		
		JLabel lblRentedBooks = new JLabel("Your rented books");
		lblRentedBooks.setBounds(39, 179, 117, 16);
		add(lblRentedBooks);
		
		JLabel lblNewLabel_1 = new JLabel("Notifcation for due items (popup)");
		lblNewLabel_1.setBounds(632, 570, 245, 132);
		add(lblNewLabel_1);
		
		JLabel lblCourses = new JLabel("Your Courses");
		lblCourses.setBounds(776, 179, 101, 16);
		add(lblCourses);
		lblCourses.setHorizontalAlignment(SwingConstants.CENTER);
	
		JButton searchButton = new JButton("Search");
        searchButton.setVerticalAlignment(SwingConstants.BOTTOM);
        
        searchButton.setFont(new Font("Apple Braille", Font.PLAIN, 13));
        searchButton.setBackground(new Color(50, 205, 50));
        searchButton.setBounds(586, 96, 117, 29);
        add(searchButton);
        
        searchButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
	}
       
}
