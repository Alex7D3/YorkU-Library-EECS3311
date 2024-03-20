package com.yorku.library.app;
import java.awt.Image;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class SearchResultsPage {

	private JFrame frame;
	private JTextField txtSearchForBooks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchResultsPage window = new SearchResultsPage();
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
	public SearchResultsPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setForeground(new Color(0, 0, 0));
        frame.setBounds(200, 200, 900, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

       

        // Load the original image icon
        ImageIcon originalIcon = new ImageIcon(SearchResultsPage.class.getResource("/images/61088.png"));
        ImageIcon bookIcon = new ImageIcon(SearchResultsPage.class.getResource("/images/bookplaceholder.png"));
        ImageIcon yorkIcon = new ImageIcon(SearchResultsPage.class.getResource("/images/yorku.png"));

        
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

        
        JLabel lblSearchImg = new JLabel("");
        lblSearchImg.setHorizontalAlignment(SwingConstants.CENTER);
        lblSearchImg.setIcon(resizedIcon);
        lblSearchImg.setBounds(166, 96, 20, 20); 
        frame.getContentPane().add(lblSearchImg);
        
        txtSearchForBooks = new JTextField();
        txtSearchForBooks.setText("Search for books, textbooks, DVDs...");
        txtSearchForBooks.setBounds(198, 96, 378, 26);
        frame.getContentPane().add(txtSearchForBooks);
        txtSearchForBooks.setColumns(10);
        
        JButton searchButton = new JButton("Search");
        searchButton.setVerticalAlignment(SwingConstants.BOTTOM);
        
        searchButton.setFont(new Font("Apple Braille", Font.PLAIN, 13));
        searchButton.setBackground(new Color(50, 205, 50));
        searchButton.setBounds(586, 96, 117, 29);
        frame.getContentPane().add(searchButton);
        
        JLabel bookPlaceholder1 = new JLabel("");
        bookPlaceholder1.setIcon(resizedBook);
        bookPlaceholder1.setBounds(45, 179, 72, 116);
        frame.getContentPane().add(bookPlaceholder1);

        JLabel bookTitle1 = new JLabel("No Longer Human");
        bookTitle1.setBounds(31, 307, 115, 16);
        frame.getContentPane().add(bookTitle1);
        
        JLabel lblNewLabel = new JLabel("Similar Books");
        lblNewLabel.setBounds(45, 425, 90, 16);
        frame.getContentPane().add(lblNewLabel);

        JLabel bookTitle2 = new JLabel("Book #2");
        bookTitle2.setBounds(249, 307, 61, 16);
        frame.getContentPane().add(bookTitle2);
        
        JLabel bookTitle3 = new JLabel("Book #3");
        bookTitle3.setBounds(443, 307, 61, 16);
        frame.getContentPane().add(bookTitle3);
        
        JLabel bookPlaceholder2 = new JLabel("");
        bookPlaceholder2.setIcon(resizedBook);
        bookPlaceholder2.setBounds(239, 179, 72, 116);
        frame.getContentPane().add(bookPlaceholder2);
        
        JLabel bookPlaceholder3 = new JLabel("");
        bookPlaceholder3.setIcon(resizedBook);
        bookPlaceholder3.setBounds(443, 179, 72, 116);
        frame.getContentPane().add(bookPlaceholder3);
        
        JLabel lblOsamuDazai = new JLabel("Osamu Dazai, 1948");
        lblOsamuDazai.setBounds(31, 335, 123, 16);
        frame.getContentPane().add(lblOsamuDazai);
        
        JButton searchButton_1 = new JButton("Search");
        searchButton_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
        searchButton_1.setBackground(new Color(50, 205, 50));
        searchButton_1.setBounds(26, 363, 117, 29);
        frame.getContentPane().add(searchButton_1);
        
        JLabel bookTitle2_1 = new JLabel("Book #2");
        bookTitle2_1.setBounds(249, 335, 61, 16);
        frame.getContentPane().add(bookTitle2_1);
        
        JLabel bookTitle2_2 = new JLabel("Book #2");
        bookTitle2_2.setBounds(443, 335, 61, 16);
        frame.getContentPane().add(bookTitle2_2);
        
        JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(6, 0, 888, 154);
	
		
		JButton searchButton_1_1 = new JButton("Search");
		searchButton_1_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_1.setBackground(new Color(50, 205, 50));
		searchButton_1_1.setBounds(221, 361, 117, 29);
		frame.getContentPane().add(searchButton_1_1);
		
		JButton searchButton_1_2 = new JButton("Search");
		searchButton_1_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_2.setBackground(new Color(50, 205, 50));
		searchButton_1_2.setBounds(419, 361, 117, 29);
		frame.getContentPane().add(searchButton_1_2);
		
		JLabel bookPlaceholder1_1 = new JLabel("");
		bookPlaceholder1_1.setBounds(627, 179, 72, 116);
		frame.getContentPane().add(bookPlaceholder1_1);
		
		JLabel bookTitle1_1 = new JLabel("No Longer Human");
		bookTitle1_1.setBounds(613, 307, 115, 16);
		frame.getContentPane().add(bookTitle1_1);
		
		JLabel lblOsamuDazai_1 = new JLabel("Osamu Dazai, 1948");
		lblOsamuDazai_1.setBounds(613, 335, 123, 16);
		frame.getContentPane().add(lblOsamuDazai_1);
		
		JButton searchButton_1_3 = new JButton("Search");
		searchButton_1_3.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_3.setBackground(new Color(50, 205, 50));
		searchButton_1_3.setBounds(608, 363, 117, 29);
		frame.getContentPane().add(searchButton_1_3);
		
		
		

		
		
		JLabel bookPlaceholder1_2 = new JLabel("");
		bookPlaceholder1_2.setBounds(50, 463, 72, 116);
		frame.getContentPane().add(bookPlaceholder1_2);
		
		JLabel bookTitle1_2 = new JLabel("No Longer Human");
		bookTitle1_2.setBounds(36, 591, 115, 16);
		frame.getContentPane().add(bookTitle1_2);
		
		JLabel lblOsamuDazai_2 = new JLabel("Osamu Dazai, 1948");
		lblOsamuDazai_2.setBounds(36, 619, 123, 16);
		frame.getContentPane().add(lblOsamuDazai_2);
		
		JButton searchButton_1_4 = new JButton("Search");
		searchButton_1_4.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_4.setBackground(new Color(50, 205, 50));
		searchButton_1_4.setBounds(31, 647, 117, 29);
		frame.getContentPane().add(searchButton_1_4);
		
		JLabel bookPlaceholder1_3 = new JLabel("");
		bookPlaceholder1_3.setBounds(240, 463, 72, 116);
		frame.getContentPane().add(bookPlaceholder1_3);
		
		JLabel bookTitle1_3 = new JLabel("No Longer Human");
		bookTitle1_3.setBounds(226, 591, 115, 16);
		frame.getContentPane().add(bookTitle1_3);
		
		JLabel lblOsamuDazai_3 = new JLabel("Osamu Dazai, 1948");
		lblOsamuDazai_3.setBounds(226, 619, 123, 16);
		frame.getContentPane().add(lblOsamuDazai_3);
		
		JButton searchButton_1_5 = new JButton("Search");
		searchButton_1_5.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_5.setBackground(new Color(50, 205, 50));
		searchButton_1_5.setBounds(221, 647, 117, 29);
		frame.getContentPane().add(searchButton_1_5);
		
		JLabel bookPlaceholder1_4 = new JLabel("");
		bookPlaceholder1_4.setBounds(438, 463, 72, 116);
		frame.getContentPane().add(bookPlaceholder1_4);
		
		JLabel bookTitle1_4 = new JLabel("No Longer Human");
		bookTitle1_4.setBounds(424, 591, 115, 16);
		frame.getContentPane().add(bookTitle1_4);
		
		JLabel lblOsamuDazai_4 = new JLabel("Osamu Dazai, 1948");
		lblOsamuDazai_4.setBounds(424, 619, 123, 16);
		frame.getContentPane().add(lblOsamuDazai_4);
		
		JButton searchButton_1_6 = new JButton("Search");
		searchButton_1_6.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_6.setBackground(new Color(50, 205, 50));
		searchButton_1_6.setBounds(419, 647, 117, 29);
		frame.getContentPane().add(searchButton_1_6);
		
		JLabel bookPlaceholder1_5 = new JLabel("");
		bookPlaceholder1_5.setBounds(627, 463, 72, 116);
		frame.getContentPane().add(bookPlaceholder1_5);
		
		JLabel bookTitle1_5 = new JLabel("No Longer Human");
		bookTitle1_5.setBounds(613, 591, 115, 16);
		frame.getContentPane().add(bookTitle1_5);
		
		JLabel lblOsamuDazai_5 = new JLabel("Osamu Dazai, 1948");
		lblOsamuDazai_5.setBounds(613, 619, 123, 16);
		frame.getContentPane().add(lblOsamuDazai_5);
		
		JButton searchButton_1_7 = new JButton("Search");
		searchButton_1_7.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		searchButton_1_7.setBackground(new Color(50, 205, 50));
		searchButton_1_7.setBounds(608, 647, 117, 29);
		frame.getContentPane().add(searchButton_1_7);
		
		JButton Login = new JButton("Sign In");
		Login.setVerticalAlignment(SwingConstants.BOTTOM);
		Login.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		Login.setBackground(new Color(50, 205, 50));
		Login.setBounds(728, 20, 90, 29);
		frame.getContentPane().add(Login);
		
		JLabel YorkU = new JLabel("");
		YorkU.setIcon(resizedYork);
		YorkU.setBounds(27, 16, 80, 80);
		frame.getContentPane().add(YorkU);
		
		JLabel lblYorkUniversityLibrary = new JLabel("York University Library");
		lblYorkUniversityLibrary.setBounds(119, 23, 165, 48);
		frame.getContentPane().add(lblYorkUniversityLibrary);
        
		JPanel redpanel = new JPanel();
		redpanel.setBackground(new Color(241, 71, 83));
		redpanel.setBounds(6, -8, 888, 132);
		frame.getContentPane().add(redpanel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 49, 59));
		panel.setBounds(6, 124, 888, 35);
		frame.getContentPane().add(panel);
		
        searchButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
	}
}
