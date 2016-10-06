package awt_parctise;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="List_Demo" height=500 width=400> </applet>

public class List_Demo extends Applet implements ActionListener{

	List os, browser;
	String msg="";

	public void init(){
		os = new List(2, true);
		browser = new List(2, false);

		//add items to the os
		os.add("Windows XP");
		os.add("Windows Vista");
		os.add("Windows 10");
		os.add("MAC OS");

		//add items to the browser list
		browser.add("Mozilla Firefox");
		browser.add("Chrome");
		browser.add("Edge");
		browser.add("Safari");

		//add os and bowser lists to the window
		add(os);
		add(browser);
		
		//register to receive action events
		os.addActionListener(this);
		browser.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		repaint();
	}
	
	//display current selection
	public void paint(Graphics g){
		int idx[];
		
		msg = "Current OS: ";
		idx = os.getSelectedIndexes();
		for(int i=0;i<idx.length;i++){
			msg += os.getItem(idx[i]) + " ";
		}
		g.drawString(msg, 6, 120);
		msg = "Current Browser: ";
		msg += browser.getSelectedItem();
		g.drawString(msg, 6, 140);
	}

}
