



    /*
   
   * Java provides a special feature, called an adapter class, 
    that can simplify the creation of event handlers in certain situations.


   *An adapter class provides an empty implementation of all methods
    in an event listener interface.
 
   *Adapter classes are useful when you want to receive and process 
    only some of the events that are handled by a particular event listener interface.

   *You can define a new class to act as an event listener by
    extending one of the adapter classes and implementing only
    those events in which you are interested.
   
   */



// Demonstrate an adapter.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/*
<applet code="AdapterDemo" width=300 height=100>
</applet>
*/



public class AdapterDemo extends Applet 
{
public void init()
{
addMouseListener(new MyMouseAdapter(this));
addMouseMotionListener(new MyMouseMotionAdapter(this));
}
}



class MyMouseAdapter extends MouseAdapter 
{
AdapterDemo adapterDemo;

public MyMouseAdapter(AdapterDemo adapterDemo) 
{
this.adapterDemo = adapterDemo;
}

// Handle mouse clicked.

public void mouseClicked(MouseEvent me)
 {
adapterDemo.showStatus("Mouse clicked");
}
}

class MyMouseMotionAdapter extends MouseMotionAdapter 
{
AdapterDemo adapterDemo;

public MyMouseMotionAdapter(AdapterDemo adapterDemo)
 {
this.adapterDemo = adapterDemo;
}
// Handle mouse dragged.
public void mouseDragged(MouseEvent me) 
{
adapterDemo.showStatus("Mouse dragged");
}
}