package awt_parctise;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "Checkbox_Demo" width=300 height=300></applet> */

public class Checkbox_Demo extends Applet implements ItemListener{
	String msg = "";
	Checkbox winxp, winVista, win10, mac;  //Checkbox class

	public void init(){
		winxp = new Checkbox("Windows XP", null, true);
		winVista = new Checkbox("Windows Vista");
		win10 = new Checkbox("Windows 10");
		mac = new Checkbox("Mac OS");

		add(winxp);
		add(winVista);
		add(win10);
		add(mac);

		winxp.addItemListener(this);
		winVista.addItemListener(this);
		win10.addItemListener(this);
		mac.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie){
		repaint();   //calls the paint method
	}
	//Display current state of the check boxes
	public void paint(Graphics g){
		msg = "Current state : ";
		g.drawString(msg, 6, 80);
		
		msg = "  Windows XP:  " + winxp.getState();
		g.drawString(msg, 6, 100);
		
		msg = "  Windows Vista  " + winVista.getState();
		g.drawString(msg, 6, 120);
		
		msg = "  Windows 10  " + win10.getState();
		g.drawString(msg, 6, 140);
		
		msg = "  Mac OS  " + mac.getState();
		g.drawString(msg, 6, 160);
		
	}

}
