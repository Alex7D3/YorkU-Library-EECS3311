package com.yorku.library.app;

import javax.swing.ImageIcon;


// This class will 
public class ListItems {
	String name;
	ImageIcon icon;
	
	public ListItems(String name, ImageIcon icon) {
		this.name = name;
		this.icon = icon;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ImageIcon getIcon() {
		return icon;
	}
	
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
}
