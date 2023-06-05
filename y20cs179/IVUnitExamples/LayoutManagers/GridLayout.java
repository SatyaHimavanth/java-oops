import java.awt.*;
import java.applet.*;
/*<applet code="gridlayout" width=500 height=500>
</applet>*/
public class gridlayout extends Applet 
{
  public void init () 
{
    setLayout(new GridLayout(2, 3));
    add(new Button("One"));
    add(new Button("Two"));
  add(new Button("Three"));
   add(new Button("Four"));
   add(new Button("Five"));
 }
}
