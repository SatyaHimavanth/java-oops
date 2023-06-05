import java.awt.*;
import java.applet.*;
/* <applet code=borderlayout width=500 height=500>
</applet>*/
public class borderlayout extends Applet 
{

public void init() {
   setLayout (new BorderLayout ());
   add (new Button ("NORTH"), BorderLayout.NORTH);
   add (new Button ("SOUTH"), BorderLayout.SOUTH);
   add (new Button ("EAST"), BorderLayout.EAST);
   add (new Button ("WEST"), BorderLayout.WEST);
   add (new Button ("CENTER"), BorderLayout.CENTER);
}
}