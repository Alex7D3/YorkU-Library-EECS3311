package com.yorku.library.app;

import java.awt.*;
import javax.swing.*;


public class CartPage extends JFrame {

	private JFrame frame;
	private DefaultListModel<ListItems> cartModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartPage window = new CartPage();
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
	public CartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
	    frame.setBounds(100, 100, 700, 585);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);

	    JButton btnCheckout = new JButton("Checkout");
	    btnCheckout.setBounds(540, 503, 117, 29);
	    frame.getContentPane().add(btnCheckout);

	    // Create a DefaultListModel to store items in the cart
	    cartModel = new DefaultListModel<>();
	    JList<ListItems> cartList = new JList<>(cartModel);
	    cartList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    cartList.setLayoutOrientation(JList.VERTICAL_WRAP);
        cartList.setFixedCellHeight(100); 
        cartList.setFixedCellWidth(668); 
        
        ItemPainter painter = new ItemPainter();
        cartList.setCellRenderer(painter);
	    
	 // Create a JButton for removing items
        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(e -> {
            int selectedIndex = cartList.getSelectedIndex();
            if (selectedIndex != -1) {
                cartModel.remove(selectedIndex);
            }
        });
        removeButton.setBounds(545, 461, 100, 30);
        frame.getContentPane().add(removeButton);

	    // Add the cart list to a JScrollPane
	    JScrollPane scrollPane = new JScrollPane(cartList);
	    
	    scrollPane.setBounds(6, 47, 688, 331);
	    frame.getContentPane().add(scrollPane);
	    
	    JLabel lblCart = new JLabel("Your Cart");
	    lblCart.setFont(new Font("Lucida Grande", Font.BOLD, 18));
	    lblCart.setBounds(281, 19, 100, 16);
	    lblCart.setHorizontalAlignment(SwingConstants.CENTER);
	    frame.getContentPane().add(lblCart);
	    
	 // Add some sample items to the cart
	    cartModel.addElement(new ListItems("Book", new ImageIcon(CartPage.class.getResource("/images/book.png"))));
	    cartModel.addElement(new ListItems("No Longer Human", new ImageIcon(CartPage.class.getResource("/images/NoLongerHuman.jpeg"))));
	    
	}	

}
