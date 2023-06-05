import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=ScrollbarDemo width=500 height=500></applet>*/

public class ScrollbarDemo extends Applet implements AdjustmentListener
{
  Scrollbar s1,s2;

  public void init()
  {
    s1 = new Scrollbar();
    s2 = new Scrollbar(Scrollbar.HORIZONTAL,50,5,0,600);
    s1.setValues(10,10,0,200);
    Label l = new Label("select your weight and height");
    l.setBackground(Color.blue);
    l.setForeground(Color.white);
    add(l);
    add(s2);
    add(s1);
    s1.addAdjustmentListener(this);
    s2.addAdjustmentListener(this);
  }
  
  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
    repaint();
  }

  public void paint(Graphics g)
  {
    setBackground(Color.black);
    g.setFont(new Font("Arial",Font.BOLD,20));
    g.setColor(Color.red);
    String msg = "wt:  "+s1.getValue()+"  kgs";
    g.drawString(msg,10,100); 
    msg = "\nht: "+s2.getValue()+"  cms";
    g.drawString(msg,10,150);
    
  }
}

  
   
     
 