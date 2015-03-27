package com.jk.jnotepadfx.display;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class execute {
	
	static final Logger log = LoggerFactory.getLogger(com.jk.jnotepadfx.display.jnotepadfx.class);
	
	public static void doit(String input){
		
		if(input.equals("Exit")){
			System.exit(0);
		}else if(input.equals("")){
			
		}else{
			JOptionPane.showMessageDialog(null, "Not installed yet.");
		}
	}
}
