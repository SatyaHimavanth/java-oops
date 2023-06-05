// Demonstrate Labels
import java.awt.*;
import java.applet.*;


/*
<applet code="LabelDemo" width=300 height=200>
</applet>
*/


public class LabelDemo extends Applet 
{

public void init() 
{
Label one = new Label("K",Label.LEFT);
Label two = new Label("SIVA",Label.LEFT);
Label three = new Label("KUMAR",Label.LEFT);
Label four = new Label();

// add labels to applet window
add(one);
add(two);
add(three);
add(four);

}
}
