package com.yorku.library.app.services.gui.utils;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.yorku.library.app.services.gui.items.ItemComponent;

class StoreItemCellRenderer extends JLabel implements ListCellRenderer<ItemComponent> {
    public StoreItemCellRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends ItemComponent> list, ItemComponent value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getName() + " - $" + value.getPrice());
        setIcon(value.getImage());

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