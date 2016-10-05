package awt_parctise;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="ChoiceControl_Demo" width=300 height=400> </applet>
 */

public class ChoiceControl_Demo extends Applet implements ItemListener {
	Choice os, browser;
	String msg="";
	
	public void init(){
		os = new Choice();
		browser = new Choice();
		
		//add items to the os list
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
		
		//register to receive item events
		os.addItemListener(this);
		browser.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	
	//display current selection
	public void paint(Graphics g){
		msg = "Current OS : ";
		msg += os.getSelectedItem();
		g.drawString(msg, 6, 120);
		msg = "Current Browser : ";
		msg += browser.getSelectedItem();
		g.drawString(msg, 6, 140);
	}

}
