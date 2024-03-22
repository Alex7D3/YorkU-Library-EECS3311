package com.yorku.library.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class SearchResultsPage {

	private JFrame frame;
	private JTextField txtSearchForBooks;
	private DefaultListModel<ListItems> SearchModel;
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
        
        JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(6, 0, 888, 154);
		
		JLabel bookPlaceholder1_1 = new JLabel("");
		bookPlaceholder1_1.setBounds(627, 179, 72, 116);
		frame.getContentPane().add(bookPlaceholder1_1);
		
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
		
		JPanel panelSearch = new JPanel();
		panelSearch.setBounds(15, 214, 857, 313);
		frame.getContentPane().add(panelSearch);
		// change # of column to display
		panelSearch.setLayout(new GridLayout(0,2, 50, 50));
		
		JLabel lblSearchResult = new JLabel("Search Result");
		lblSearchResult.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblSearchResult.setBounds(19, 174, 245, 35);
		frame.getContentPane().add(lblSearchResult);
		
       
		
//		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		// Add jlabels(images) to the gridlayout
		for(int i = 0; i< 3; i++) {
			
			//example
			ImageIcon scaledIcon = scaleImageIcon(new ImageIcon(SearchResultsPage.class.getResource("/images/NoLongerHuman.jpeg")), 150, 150);
			JLabel label = new JLabel("NO LONGER HUMAN - Osamu Dazai", scaledIcon, JLabel.CENTER);
			
			// The name of the book
			label.setFont(new Font("Lucida Grande", Font.BOLD, 18));
			label.setIcon(scaledIcon);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setHorizontalTextPosition(JLabel.CENTER);

			label.setHorizontalAlignment(JLabel.CENTER);
		    label.setVerticalAlignment(JLabel.CENTER);
//		    label.setBorder(blackline);
		 
		    // Add a hover effect
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    label.setBorder(BorderFactory.createLineBorder(Color.BLUE)); 
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label.setBorder(null); 
                }
            });
			panelSearch.add(label);
		}
		
		//scroll bar
		JScrollPane spSearchResult = new JScrollPane(panelSearch);
        spSearchResult.setBounds(15, 214, 857, 313);
        spSearchResult.setViewportBorder(null);
        frame.getContentPane().add(spSearchResult);
        
        JLabel lblRelatedBooks = new JLabel("Similar Books");
        lblRelatedBooks.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        lblRelatedBooks.setBounds(19, 539, 245, 35);
        frame.getContentPane().add(lblRelatedBooks);
        frame.setVisible(true);
		
		
		//search function
        searchButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
	}
	
	//Scale icon
	public static ImageIcon scaleImageIcon(ImageIcon originalIcon, int width, int height) {
        Image image = originalIcon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
