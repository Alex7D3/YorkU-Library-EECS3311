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
        frame.setBounds(100, 100, 700, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblSearchImg = new JLabel("");
        lblSearchImg.setHorizontalAlignment(SwingConstants.CENTER);

        // Load the original image icon
        ImageIcon originalIcon = new ImageIcon(SearchResultsPage.class.getResource("/images/61088.png"));
        ImageIcon bookIcon = new ImageIcon(SearchResultsPage.class.getResource("images/bookplaceholder.png"));
        
        // Resize the image
        Image image = originalIcon.getImage(); // Convert to Image
        Image image2 = bookIcon.getImage();
        
        Image newimg = image.getScaledInstance(20, 20,  Image.SCALE_SMOOTH); // Scale it by width and height
        Image newbook = image.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        
        ImageIcon resizedIcon = new ImageIcon(newimg);  // Convert back to an ImageIcon
        ImageIcon resizedBook = new ImageIcon(newbook);

        // Set the resized icon to the label
        lblSearchImg.setIcon(resizedIcon);
        
        // Adjust the label bounds to fit the new image size
        lblSearchImg.setBounds(60, 46, 20, 20); // Adjusted to match the image size
        frame.getContentPane().add(lblSearchImg);
        
        txtSearchForBooks = new JTextField();
        txtSearchForBooks.setText("Search for books, textbooks, DVDs...");
        txtSearchForBooks.setBounds(92, 46, 378, 26);
        frame.getContentPane().add(txtSearchForBooks);
        txtSearchForBooks.setColumns(10);
        
        JButton searchButton = new JButton("Search");
        
        searchButton.setFont(new Font("Apple Braille", Font.PLAIN, 13));
        searchButton.setBackground(new Color(50, 205, 50));
        searchButton.setBounds(480, 46, 117, 29);
        frame.getContentPane().add(searchButton);
        
        JLabel lblNewLabel = new JLabel("Similar Books");
        lblNewLabel.setBounds(60, 345, 90, 16);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel bookPlaceholder1 = new JLabel("");
        bookPlaceholder1.setIcon(resizedBook);
        bookPlaceholder1.setBounds(60, 123, 163, 116);
        frame.getContentPane().add(bookPlaceholder1);

        JLabel bookTitle1 = new JLabel("New label");
        bookTitle1.setBounds(60, 251, 61, 16);
        frame.getContentPane().add(bookTitle1);
        
        JLabel bookPlaceholder2 = new JLabel("");
        bookPlaceholder2.setIcon(resizedBook);
        bookPlaceholder2.setBounds(264, 123, 61, 16);
        frame.getContentPane().add(bookPlaceholder2);

        JLabel bookTitle2 = new JLabel("New label");
        bookTitle2.setBounds(264, 251, 61, 16);
        frame.getContentPane().add(bookTitle2);
        
        JLabel bookTitle3 = new JLabel("New label");
        bookTitle3.setBounds(447, 251, 61, 16);
        frame.getContentPane().add(bookTitle3);
        
        JLabel bookPlaceholder3 = new JLabel("");
        bookPlaceholder3.setIcon(new ImageIcon(SearchResultsPage.class.getResource("/images/bookplaceholder.png")));
        bookPlaceholder3.setBounds(447, 123, 253, 144);
        frame.getContentPane().add(bookPlaceholder3);
        
        searchButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
	}
}
