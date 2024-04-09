package com.yorku.library.app;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

import com.yorku.library.app.services.requests.RequestService;
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
	private RequestService reqService;

	public AppFrame(HomePanel homePanel, SearchPanel searchPanel, CartPanel cartPanel) {
		
	}

	public AppFrame(RequestService reqService) {
		this.reqService = reqService;
		this.homePanel = new HomePanel();
		this.searchPanel = new SearchPanel();
		this.cartPanel = new CartPanel();
		this.coursePanel = new CourseListPanel();

		contentPanel = new JPanel(new CardLayout());
		contentPanel.add(homePanel, HOME_PANEL);
		contentPanel.add(searchPanel, SEARCH_PANEL);
		contentPanel.add(cartPanel, CART_PANEL);
		contentPanel.add(coursePanel, COURSE_PANEL);

		navMenu = new JMenuBar();
		JMenu menu = getjMenu();
		navMenu.add(menu);

		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("YorkU Library");
		setJMenuBar(navMenu);
		add(contentPanel);
	}

	private JMenu getjMenu() {
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
		return menu;
	}

	private void changePanel(String panelName) {
		((CardLayout) contentPanel.getLayout()).show(contentPanel, panelName);
//		switch(panelName) {
//			case HOME_PANEL:
//
//				reqService.getRequest("/user/id/items");
//				reqService.getRequest("/user/id/overdueitems");
//				reqService.getRequest("/user/id/courses");
//				reqService.postRequest("/user/id/addcourse/code");
//				reqService.postRequest("/user/userid/request/itemid/priority");
//				reqService.postRequest("/user/item/add/relation/id");
//				reqService.postRequest("/user/id/notifs");
//				reqService.deleteRequest("/user/id/dropcourse/code");
//				reqService.deleteRequest("/user/userid/item/delete/itemid");
//
//				break;
//			case SEARCH_PANEL:
//				SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
//					@Override
//                    protected Void doInBackground() throws Exception {
//                        searchPanel
//                        return null;
//                    }
//
//                    @Override
//                    protected void process(List<List<Item>> chunks) {
//                        // Update search panel's JTable with fetched items
//                        List<Item> itemList = chunks.get(chunks.size() - 1);
//                        searchPanel.updateTable(itemList);
//                    }
//				};
//				reqService.getRequest("/item/search/title");
//				reqService.getRequest("/item/search/by/type");
//				reqService.getRequest("/item/all");
//
//				worker.execute();
//				break;
//			case CART_PANEL:
//				reqService.getRequest("/item/id");
//				break;
//		}
	}
}

