import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="GridLayoutdemo"width=500 height=500>
</applet>*/

public class GridLayoutdemo extends Applet 
{
static final int n=4;
public void init()
{
setLayout(new GridLayout(n,n,5,5));
setFont(new Font("TimesNewRoman",Font.BOLD,24));
for(int i=1;i<=15;i++)
add(new Button(""+i));
}
}
