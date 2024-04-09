//package com.yorku.library.app.services.gui.workers;
//
//import javax.swing.SwingWorker;
//import com.yorku.library.app.HomePanel;
//
//public class HomePanelWorker extends SwingWorker<String, Void> {
//	private HomePanel homepage;
//
//	public HomePanelWorker(HomePanel homepage) {
//		this.homepage = homepage;
//	}
//
//	@Override
//    protected Void doInBackground() throws Exception {
//        // Access GUI context and update text area
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//
//        }
//        publish();
//    }
//
//    @Override
//    protected void process(List<String> chunks) {
//    	get();
//        for (String chunk : chunks) {
//
//        }
//    }
//
//    @Override
//    protected void done() {
//        get();
//    }
//
//}
