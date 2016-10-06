package awt_parctise;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code = "Scrollbar_Demo" height=400 width=350></applet>

public class Scrollbar_Demo extends Applet implements AdjustmentListener, MouseMotionListener{
	String msg="";
	Scrollbar vertSB, horzSB;

	public void init(){
		int width = Integer.parseInt(getParameter("WIDTH"));
		int height = Integer.parseInt(getParameter("HEIGHT"));

		// orientation, value, visible, minimum, maximum
		vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
		horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);

		add(vertSB);
		add(horzSB);

		//register to receive adjustment
		vertSB.addAdjustmentListener(this);
		horzSB.addAdjustmentListener(this);

		addMouseMotionListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae){
		repaint();
	}
	
	//Update scrollbars to reflect mouse dragging
	public void mouseDragged(MouseEvent me){
		int x = me.getX();
		int y = me.getY();
		vertSB.setValue(y);
		horzSB.setValue(x);
		repaint();
	}
	
	//necessary for mouseMotionListener
	public void mouseMoved(MouseEvent me){
	}
	
	//display current value of scrollbars
	public void paint(Graphics g){
		msg = "Vertical: " + vertSB.getValue();
		msg += ", Horizontal: " + horzSB.getValue();
		g.drawString(msg, 6, 160);
		
		//show current mouse drag position
		g.drawString("*", horzSB.getValue(), vertSB.getValue());
	}
}
