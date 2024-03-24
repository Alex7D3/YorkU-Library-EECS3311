package com.yorku.library.app;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class CheckoutFrame extends JFrame {
	
	private JFrame frame;
	private JTextField tfEmail;
	private DefaultListModel<ListItems> cartModel;
	private JTextField tfCardNumber;
	private JTextField tfExpiryDate;
	private JTextField textField;
	private JTextField tfDiscount;

	
	public CheckoutFrame() {
		frame = new JFrame();
	    frame.setBounds(100, 100, 700, 585);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    
	    JLabel lblContactInformation = new JLabel("Contact Information");
	    lblContactInformation.setFont(new Font("Lucida Grande", Font.BOLD, 13));
	    lblContactInformation.setBounds(146, 83, 148, 16);
	    frame.getContentPane().add(lblContactInformation);
	    
	    JLabel lblSummary = new JLabel("Your order summary");
	    lblSummary.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    
	    cartModel = new DefaultListModel<>();
	    JList<ListItems> cartList = new JList<>(cartModel); // the List containing the Listitems
	    cartList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    cartList.setLayoutOrientation(JList.VERTICAL_WRAP);
        cartList.setFixedCellHeight(50); 
        cartList.setFixedCellWidth(230); 
        
        ItemPainter painter = new ItemPainter();
        cartList.setCellRenderer(painter);
	    
	    
        JScrollPane scrollPane = new JScrollPane(cartList);
	    scrollPane.setBounds(442, 6, 252, 315);
	    frame.getContentPane().add(scrollPane);
	    scrollPane.setColumnHeaderView(lblSummary);
	    scrollPane.setViewportView(cartList);
	    
	    tfEmail = new JTextField();
	    tfEmail.setBounds(108, 141, 209, 26);
	    frame.getContentPane().add(tfEmail);
	    tfEmail.setColumns(10);
	    
	    JLabel lblEmail = new JLabel("Email");
	    lblEmail.setBounds(115, 123, 61, 16);
	    frame.getContentPane().add(lblEmail);
	    
	    JLabel lblPayment = new JLabel("Payment");
	    lblPayment.setFont(new Font("Lucida Grande", Font.BOLD, 13));
	    lblPayment.setBounds(146, 185, 132, 16);
	    frame.getContentPane().add(lblPayment);
	    lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    tfCardNumber = new JTextField();
	    tfCardNumber.setBounds(108, 271, 209, 26);
	    frame.getContentPane().add(tfCardNumber);
	    tfCardNumber.setColumns(10);
	    
	    JLabel lblCardNumber = new JLabel("Card Number");
	    lblCardNumber.setBounds(115, 254, 138, 16);
	    frame.getContentPane().add(lblCardNumber);
	    
	    tfExpiryDate = new JTextField();
	    tfExpiryDate.setBounds(108, 336, 79, 26);
	    frame.getContentPane().add(tfExpiryDate);
	    tfExpiryDate.setColumns(10);
	    tfExpiryDate.setText("MM/YY");
	    
	    JLabel lblExpiryDate = new JLabel("Expiry Date ");
	    lblExpiryDate.setBounds(115, 309, 79, 16);
	    frame.getContentPane().add(lblExpiryDate);
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    textField.setBounds(238, 336, 79, 26);
	    frame.getContentPane().add(textField);
	    
	    JLabel lblSecurityCode = new JLabel("Security Code");
	    lblSecurityCode.setBounds(235, 309, 92, 16);
	    frame.getContentPane().add(lblSecurityCode);
	    
	    // PAY BUTTON
	    JButton btnPay = new JButton("Pay");
	    btnPay.setBounds(155, 371, 117, 29);
	    btnPay.addActionListener(e -> {
	    	frame.setVisible(false);
	    });
	    frame.getContentPane().add(btnPay);
	    
	    JLabel lblDiscount = new JLabel("Discount Code");
	    lblDiscount.setBounds(450, 347, 104, 16);
	    frame.getContentPane().add(lblDiscount);
	    
	    tfDiscount = new JTextField();
	    tfDiscount.setBounds(442, 361, 130, 26);
	    frame.getContentPane().add(tfDiscount);
	    tfDiscount.setColumns(10);
	    
	    JLabel lblTotal = new JLabel("Total");
	    lblTotal.setBounds(450, 412, 61, 16);
	    frame.getContentPane().add(lblTotal);
	    
	    JLabel lblMoney = new JLabel("$0");
	    lblMoney.setBounds(493, 412, 182, 16);
	    frame.getContentPane().add(lblMoney);
	    
	    JRadioButton rdbtnCredit = new JRadioButton("Credit");
	    rdbtnCredit.setBounds(238, 213, 79, 23);
	    frame.getContentPane().add(rdbtnCredit);
	    
	    JRadioButton rdbtnDebit = new JRadioButton("Debit");
	    rdbtnDebit.setBounds(108, 213, 72, 23);
	    frame.getContentPane().add(rdbtnDebit);
	    
	    // group the payment methods together
	    ButtonGroup paymentTypeGroup = new ButtonGroup();
	    paymentTypeGroup.add(rdbtnCredit);
	    paymentTypeGroup.add(rdbtnDebit);
	    
	    JSeparator separator = new JSeparator();
	    separator.setBounds(108, 237, 209, 12);
	    frame.getContentPane().add(separator);
	    
	    JButton btnBack = new JButton("Back");
	    btnBack.setBounds(17, 21, 72, 29);
	    btnBack.addActionListener(e -> {
	    	frame.setVisible(false);
	    });
	    frame.getContentPane().add(btnBack);
	    
	    // Add some sample items to the cart
	    cartModel.addElement(new ListItems("Book", new ImageIcon(CheckoutFrame.class.getResource("/images/book.png"))));
	    cartModel.addElement(new ListItems("No Longer Human", new ImageIcon(CheckoutFrame.class.getResource("/images/NoLongerHuman.jpeg"))));
	}
	
	public JFrame getFrame() {
		return frame;
	}

}
