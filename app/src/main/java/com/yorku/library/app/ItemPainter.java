package com.yorku.library.app;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

@SuppressWarnings({ "rawtypes", "serial" })
// Allows me to add images to modify images and render them in Jlist
public class ItemPainter extends JLabel implements ListCellRenderer {

	public ItemPainter() {
		setOpaque(true);
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		
		ListItems item = (ListItems) value;
		ImageIcon originalIcon = item.getIcon();
        // Get the original image from the ImageIcon
        Image originalImage = originalIcon.getImage();
        // Scale the image to desired dimensions
        Image scaledImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Adjust dimensions as needed
        // Create a new ImageIcon with the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        this.setIcon(scaledIcon);
		this.setText(item.getName());
		
		if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
	
		return this;
	}
}
