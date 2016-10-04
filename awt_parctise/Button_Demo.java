package awt_parctise;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Button_Demo extends Applet implements ActionListener{

	String msg = "";
	Button yes, no, maybe;
	
	public void init(){
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("MayBe");
		
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	
	//@Override
	public void actionPerformed(ActionEvent ae){  //register to receive action events
		String str = ae.getActionCommand();
		if(str.equals("Yes"))
			msg="You Pressed Yes";
		else if(str.equals("No"))
			msg="You pressed NO";
		else
			msg="You pressed Undecided!";
		
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString(msg, 6, 100);
	}
}
