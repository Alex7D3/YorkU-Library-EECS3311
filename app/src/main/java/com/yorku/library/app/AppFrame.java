package com.yorku.library.app;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.yorku.library.app.services.requests.RequestServiceProxy;
public class AppFrame extends JFrame {
	private final int FRAME_HEIGHT = 700;
	private final int FRAME_WIDTH = 900;
	public static final String HOME_PANEL = "Home";
	public static final String SEARCH_PANEL = "Search";
	public static final String CART_PANEL = "Cart";
	public static final String COURSE_PANEL = "Course";
	private JPanel contentPanel;
	private HomePanel homePanel;
	private SearchPanel searchPanel;
	private CartPanel cartPanel;
	private CourseListPanel coursePanel;
	private JMenuBar navMenu;
	private RequestServiceProxy reqService;

	public AppFrame(HomePanel homePanel, SearchPanel searchPanel, CartPanel cartPanel) {


	public AppFrame(HomePanel homePanel, SearchPanel searchPanel, CartPanel cartPanel, CourseListPanel coursePanel) {
		this.homePanel = homePanel;
		this.cartPanel = cartPanel;
		this.cartPanel = cartPanel;
		this.coursePanel = coursePanel;

		contentPanel = new JPanel(new CardLayout());
		contentPanel.add(homePanel, HOME_PANEL);
		contentPanel.add(searchPanel, SEARCH_PANEL);
		contentPanel.add(cartPanel, CART_PANEL);
		contentPanel.add(coursePanel, COURSE_PANEL);

		navMenu = new JMenuBar();
		JMenu menu = new JMenu("Navigate");
		JMenuItem homeOption = new JMenuItem(HOME_PANEL);
		JMenuItem searchOption = new JMenuItem(SEARCH_PANEL);
		JMenuItem cartOption = new JMenuItem(CART_PANEL);
		JMenuItem courseOption = new JMenuItem(COURSE_PANEL);
		homeOption.addActionListener(e -> changePanel(HOME_PANEL));
		searchOption.addActionListener(e -> changePanel(SEARCH_PANEL));
		cartOption.addActionListener(e -> changePanel(CART_PANEL));
		courseOption.addActionListener(e -> changePanel(COURSE_PANEL));
		menu.add(homeOption);
		menu.add(searchOption);
		menu.add(cartOption);
		menu.add(courseOption);
		navMenu.add(menu);

		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("YorkU Library");
		setJMenuBar(navMenu);
		add(contentPanel);
	}
	
	private void changePanel(String panelName) {
		((CardLayout) contentPanel.getLayout()).show(contentPanel, panelName);
		switch(panelName) {
			case HOME_PANEL:
				// home panel functions here, make requests and update the home panel
				reqService.getRequest("/user/id/items");
				reqService.getRequest("/user/id/overdueitems");
				reqService.getRequest("user/id/courses");
				
				break;
			case SEARCH_PANEL:
				break;
			case CART_PANEL:
				break;
		}
	}
}

