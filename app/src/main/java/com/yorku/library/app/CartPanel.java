package com.yorku.library.app;

import java.awt.*;
import javax.swing.*;


public class CartPanel extends JPanel {

	private DefaultListModel<ListItems> cartModel;
	
	/**
	 * Create the application.
	 */
	public CartPanel() {
		
		setLayout(null);
		
	    JButton btnCheckout = new JButton("Checkout");
	    btnCheckout.setBounds(540, 503, 117, 29);
	    btnCheckout.addActionListener(e ->{
	    	CheckoutFrame checkoutPage = new CheckoutFrame();
	    	checkoutPage.getFrame().setVisible(true);
	    });
	    add(btnCheckout);

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
        add(removeButton);

	    // Add the cart list to a JScrollPane
	    JScrollPane scrollPane = new JScrollPane(cartList);
	    
	    scrollPane.setBounds(6, 47, 688, 331);
	    add(scrollPane);
	    
	    JLabel lblCart = new JLabel("Your Cart");
	    lblCart.setFont(new Font("Lucida Grande", Font.BOLD, 18));
	    lblCart.setBounds(281, 19, 100, 16);
	    lblCart.setHorizontalAlignment(SwingConstants.CENTER);
	    add(lblCart);
	    
	 // Add some sample items to the cart
	    cartModel.addElement(new ListItems("Book", new ImageIcon(CartPanel.class.getResource("/images/book.png"))));
	    cartModel.addElement(new ListItems("No Longer Human", new ImageIcon(CartPanel.class.getResource("/images/NoLongerHuman.jpeg"))));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	

}
