import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="deleve" width=1000 height=1000> 
</applet> */

public class deleve extends Applet implements MouseListener,MouseMotionListener
{
int x,y;
String msg="  ";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);  /* registration of listners */
}
public void paint(Graphics g)
{
g.drawString(msg,100,70);
}
public void mouseClicked(MouseEvent me)
{
x=10;
y=10;
msg="click";
repaint();
}
public void mouseEntered(MouseEvent me)
{
x=50;
y=50;
msg="mouse entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="mouse exited";
repaint();
}
public void mousePressed(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="mouse pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="mouse released";
repaint();
}
public void mouseDragged(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="mouse dragged";
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
}