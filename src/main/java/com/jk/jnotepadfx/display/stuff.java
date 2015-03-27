package com.jk.jnotepadfx.display;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;

public class stuff {
	
	static final Logger log = LoggerFactory.getLogger(com.jk.jnotepadfx.display.jnotepadfx.class);
	
	public static MenuItem getMenuItem(final String input){
		MenuItem menu = new MenuItem(input);
		
		menu.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                execute.doit(input);
            }
        });
		
		return menu;
	}
}
