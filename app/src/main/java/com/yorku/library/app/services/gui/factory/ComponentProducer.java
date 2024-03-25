package com.yorku.library.app.services.gui.factory;

public class ComponentProducer {
	public static LibraryComponentFactory getFactory(boolean isItem) {
		if(isItem) {
			return new ItemComponentFactory();
		}
		return new UserComponentFactory();
	}
}
