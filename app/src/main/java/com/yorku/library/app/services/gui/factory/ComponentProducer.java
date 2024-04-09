package com.yorku.library.app.services.gui.factory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComponentProducer {
	public static LibraryComponentFactory getFactory(JsonNode node) {
		if(node.has("itemType")) {
			return new ItemComponentFactory();
		}
		return new UserComponentFactory();
	}
}
