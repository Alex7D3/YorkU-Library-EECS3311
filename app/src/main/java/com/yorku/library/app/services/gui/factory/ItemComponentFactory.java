package com.yorku.library.app.services.gui.factory;

import java.awt.Component;

import com.fasterxml.jackson.databind.JsonNode;

public class ItemComponentFactory extends LibraryComponentFactory {

	@Override
	public Component getComponent(JsonNode node) {
		node.get("");
		return null;
	}

}
