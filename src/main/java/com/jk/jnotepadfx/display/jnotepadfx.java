package com.jk.jnotepadfx.display;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class jnotepadfx extends Application{
	
	static final Logger log = LoggerFactory.getLogger(com.jk.jnotepadfx.display.jnotepadfx.class);
	
	public static void main(String[] args){
		initialize();
		launch();
	}
	
	@Override public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 250);
        scene.setFill(Color.OLDLACE);
        
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu formatMenu = new Menu("Format");
        Menu viewMenu = new Menu("View");
        Menu helpMenu = new Menu("Help");
        Menu toolsMenu = new Menu("Tools");
        
        fileMenu.getItems().addAll(
        		stuff.getMenuItem("New")
        		,stuff.getMenuItem("Open...")
        		,stuff.getMenuItem("Save")
        		,stuff.getMenuItem("Save As")
        		,stuff.getMenuItem("Print")
        		,stuff.getMenuItem("Exit") );
        
        editMenu.getItems().addAll(
        		stuff.getMenuItem("Undo")
        		,stuff.getMenuItem("Cut")
        		,stuff.getMenuItem("Copy")
        		,stuff.getMenuItem("Paste")
        		,stuff.getMenuItem("Delete")
        		,stuff.getMenuItem("Find")
        		,stuff.getMenuItem("Find Next")
        		,stuff.getMenuItem("Replace")
        		,stuff.getMenuItem("Go To")
        		,stuff.getMenuItem("Select All")
        		,stuff.getMenuItem("DateTime") );
        
        formatMenu.getItems().addAll(
        		stuff.getMenuItem("Word Wrap")
        		,stuff.getMenuItem("Font") );
        
        viewMenu.getItems().addAll(
        		stuff.getMenuItem("Status Bar") );
        
        helpMenu.getItems().addAll(
        		stuff.getMenuItem("View Help")
        		,stuff.getMenuItem("About jnotepadFX") );
        
        toolsMenu.getItems().addAll(
        		stuff.getMenuItem("NS Lookup") );
        
        menuBar.getMenus().addAll(fileMenu, editMenu, formatMenu, viewMenu, helpMenu, toolsMenu);
        
        Text text = new Text();
        text.setX(105);
        text.setY(120);
        text.setFont(new Font(30));
        text.setText("Hello World");
        
        root.getChildren().add(menuBar);
        root.getChildren().add(text);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void btnAction(){
		
	}
	
	public static void initialize(){
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
	    log.info(lc.toString());
	}
}
