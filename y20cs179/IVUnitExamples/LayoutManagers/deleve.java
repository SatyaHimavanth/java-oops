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
public void MouseClicked(MouseEvent me)
{
x=10;
y=10;
msg="click";
repaint();
}
public void MouseEntered(MouseEvent me)
{
x=50;
y=50;
msg="mouse entered";
repaint();
}
public void MouseExited(MouseEvent me)
{
x=me.getx();
y=me.gety();
msg="mouse exited";
repaint();
}
public void MousePressed(MouseEvent me)
{
x=me.getx();
y=me.gety();
msg="mouse pressed";
repaint();
}
public void MouseReleased(MouseEvent me)
{
x=me.getx();
y=me.gety();
msg="mouse released";
repaint();
}
public void MouseDragged(MouseEvent me)
{
x=me.getx();
y=me.gety();
msg="mouse dragged";
repaint();
}
public void MouseMoved(MouseEvent me)
{
x=me.getx();
y=me.gety();
msg="mouse Moveing";
showStatus("mouse moveing"+x+"  "+y);
repaint();
}
}




