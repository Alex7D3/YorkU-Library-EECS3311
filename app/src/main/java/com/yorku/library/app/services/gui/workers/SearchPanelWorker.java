//package com.yorku.library.app.services.gui.workers;
//
//import java.util.Map;
//
//import javax.accessibility.AccessibleContext;
//import javax.swing.SwingWorker;
//
//import com.yorku.library.app.SearchPanel;
//import com.yorku.library.app.services.requests.RequestService;
//
//public class SearchPanelWorker extends SwingWorker<Void, String> {
//	private SearchPanel searchPanel;
//	private RequestService reqService;
//	private static final Map<String, String> itemTypes = Map.of(
//			"", "specItem", "", "book", "", "textbook", "", "newsletter");
//	public SearchPanelWorker(SearchPanel searchPanel, RequestService reqService) {
//		this.searchPanel = searchPanel;
//		this.reqService = reqService;
//	}
//
//	@Override
//	protected Void doInBackground() throws Exception {
//		String query = searchPanel.getTextField().getText();
//		String boxChoice = (String) searchPanel.getComboBox().getSelectedItem();
//		String result;
//		if(boxChoice.equals("All Items")) {
//			result = reqService.getRequest("/item/search/" + query);
//		} else {
//			result = reqService.getRequest("/item/search/by/" + itemTypes.get(boxChoice));
//		}
//		return null;
//	}
//
//}
