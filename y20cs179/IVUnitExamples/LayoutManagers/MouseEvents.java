 import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="MouseEvents" width=500 height=500> 
</applet> */

public class MouseEvents extends Applet implements MouseListener,MouseMotionListener,KeyListener
{
int x,y;
String msg="  ";
public void init()
{ 
addMouseListener(this);
addMouseMotionListener(this);
addKeyListener(this);  /* registration of listners */
}
public void mouseClicked(MouseEvent me)
{
	x=me.getX();/*getX() and getY() are used to return the x and y coordinates*/
	y=me.getY();
	msg="click";
	repaint();/* applets needs to update  the information to display simply  calls reapint() */
}
public void mouseEntered(MouseEvent me)
{
	x=232;
		y=232;
	msg="mouse entered";
	showStatus("mouse entered");
setBackground(Color.red);
	repaint();
}
public void mouseExited(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	msg="mouse exited";
	showStatus("mouse exited");
	repaint();
}
public void mousePressed(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	msg="mouse pressed";
	showStatus("mouse pressed");
	repaint();
}
public void mouseReleased(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	msg="mouse released";
	showStatus("mouse released");
repaint();
}
public void mouseDragged(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="mouse dragged";
showStatus("mouse draged");
repaint();
}
public void mouseMoved(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="mouse Moveing";
showStatus("mouse moveing"+x+"  "+y);
repaint();
}
public void keyPressed(KeyEvent ke)
{
x=10;
y=20;
showStatus("key pressed");
}
public void keyReleased(KeyEvent ke)
{
x=10;
y=20;
showStatus("key released");
}
public void keyTyped(KeyEvent ke)
{
	x=10;
	y=20;
	msg+=ke.getKeyChar();
	showStatus("key typing");
	repaint();
}

public void paint(Graphics g)
{
g.drawString(msg,100,70);
}

}




