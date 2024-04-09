package com.yorku.library.app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class CourseListPanel extends JPanel{

	private DefaultListModel<ListItems> courseModel;

	public CourseListPanel() {
		setLayout(null);
		

        ImageIcon originalIcon = new ImageIcon(CourseListPanel.class.getResource("/images/61088.png"));
        ImageIcon bookIcon = new ImageIcon(CourseListPanel.class.getResource("/images/bookplaceholder.png"));
        ImageIcon yorkIcon = new ImageIcon(CourseListPanel.class.getResource("/images/yorku.png"));

        
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
        
     
        
        JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(6, 0, 888, 154);
		
		JLabel bookPlaceholder1_1 = new JLabel("");
		bookPlaceholder1_1.setBounds(627, 179, 72, 116);
		add(bookPlaceholder1_1);
		
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 49, 59));
		panel.setBounds(6, 124, 888, 35);
		add(panel);
		
		JLabel lblcourses = new JLabel("Your Courses");
		lblcourses.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblcourses.setBounds(27, 179, 124, 16);
		add(lblcourses);
		
		courseModel = new DefaultListModel<>();
	    JList<ListItems> courseList = new JList<>(courseModel);
	    courseList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    courseList.setLayoutOrientation(JList.VERTICAL_WRAP);
        courseList.setFixedCellHeight(100); 
        courseList.setFixedCellWidth(830); 
		
        ItemPainter painter = new ItemPainter();
        courseList.setCellRenderer(painter);
        
        //samples
        courseModel.addElement(new ListItems("EECS2021", new ImageIcon(HomePanel.class.getResource("/images/NoLongerHuman.jpeg"))));  
        courseModel.addElement(new ListItems("EECS2031", new ImageIcon(HomePanel.class.getResource("/images/NoLongerHuman.jpeg"))));
        
		JScrollPane scrollPane = new JScrollPane(courseList);
		scrollPane.setBounds(27, 218, 846, 428);
		add(scrollPane);
	}

	
}
