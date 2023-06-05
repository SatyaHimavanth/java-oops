import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseTest extends Applet implements MouseMotionListener,MouseListener
{
public void init(){
addMouseListener(this);
addMouseMotionListener(this);
setVisible(true);
}
public void mouseClicked(MouseEvent e){
showStatus("Mouse clicked at "+e.getX()+","+e.getY());
}
public void mouseEntered(MouseEvent e){
showStatus("Mouse entered at "+e.getX()+","+e.getY());
}
public void mouseReleased(MouseEvent e){
showStatus("Mouse released at "+e.getX()+","+e.getY());
}
public void mouseMoved(MouseEvent e){
showStatus("Mouse moved at "+e.getX()+","+e.getY());
}
public void mouseDragged(MouseEvent e){
showStatus("Mouse dragged at "+e.getX()+","+e.getY());
}
public void mousePressed(MouseEvent e){
showStatus("Mouse pressed at "+e.getX()+","+e.getY());
}
public void mouseExited(MouseEvent e){
showStatus("Mouse exited at "+e.getX()+","+e.getY());
}
}
/*
<applet code="MouseTest.class" width=300 height=300>
</applet>
*/