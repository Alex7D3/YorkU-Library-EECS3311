package com.yorku.library.app.services.gui.factory;

import java.awt.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;

public abstract class LibraryComponentFactory {
	public abstract Component getComponent(JsonNode node);
}
