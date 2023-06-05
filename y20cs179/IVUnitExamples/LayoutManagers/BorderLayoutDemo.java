// Demonstrate BorderLayout with Insets
import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code="BorderLayoutDemo" width=400 height=200>
</applet>
*/
public class BorderLayoutDemo extends Applet { 
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("This is across the top."), BorderLayout.NORTH);
add(new Label("The footer message might go here."), BorderLayout.SOUTH);
add(new Button("Right"), BorderLayout.EAST);
add(new Button("Left"), BorderLayout.WEST);
String msg = "The Reasonable man adapts" + "himself to the world; \n" +
"the reasonable one persists in " + "trying to adapt the world to himself. \n" +
"therefore all progress depends \n \n";

add(new TextArea(msg), BorderLayout.CENTER);
}
/*public Insets getInsets() {

return new Insets(10,10,10,10);
}*/
}
